package com.example.security.service;


import com.example.security.JwtTokenUtil;
import com.example.security.repo.UserRepository;
import com.example.security.model.User;
import com.example.security.repo.rest.LoginUserResource;
import com.example.security.repo.rest.resource.CreatePasswordResource;
import com.example.security.repo.rest.resource.RegisterUserResource;
import com.example.security.repo.rest.resource.RegisterUserResponse;
import com.example.security.repo.rest.resource.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    JwtTokenUtil tokenUtil;

    @Autowired
    private MailSender mailSender;




    public RegisterUserResponse registerUser(RegisterUserResource registerUserResource){
        User newRegisteredUser = new User();
        newRegisteredUser.setFirstname(registerUserResource.getFirstname());
        newRegisteredUser.setSurname(registerUserResource.getSurname());
        newRegisteredUser.setPhonenumber(registerUserResource.getPhoneNumber());
        newRegisteredUser.setEmail(registerUserResource.getEmail());

        userRepository.save(newRegisteredUser);

        var token = tokenUtil.generateRegisterToken(registerUserResource.getEmail());

        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("noels.amadeo@gmail.com");
        message.setTo("noels.amadeo@gmail.com");
        message.setSubject("test");
        message.setText("<a src='http://localhost:8081/user/setPassword?token="+token+"</a>");
        mailSender.send(message);

        return new RegisterUserResponse("De user werd correct aangemaakt");
    }

    public List<UserDto> getUserList(){
        return userRepository.findAll().stream().map((user -> {
            UserDto dto = new UserDto(user.getFirstname(), user.getSurname(), user.getEmail(),user.getPhonenumber(), "ADMIN", user.isLocked());
            dto.setId(user.getId());
            return dto;
        })).collect(Collectors.toList());
    }

    public RegisterUserResponse addPasswordTo(String token, CreatePasswordResource createPasswordResource) {
        var claims = tokenUtil.decodeToken(token);
        if (claims != null){
            BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
            User user = userRepository.findByEmail(claims.getSubject()).get();
            user.setPassword(encoder.encode(createPasswordResource.getPassword()));
            user.setLocked(false);
            userRepository.saveAndFlush(user);
            return new RegisterUserResponse("Registratie succesvol");
        }
        return new RegisterUserResponse("Registratie unsuccesfull");
    }

    public void login(LoginUserResource loginUserResource) {

    }

    public ResponseEntity<?> deleteUser(Long id){
        User user = userRepository.findById(id).get();

        userRepository.delete(user);

        return new ResponseEntity<>("user is successfully deleted", HttpStatus.OK);
    }
}
