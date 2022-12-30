package com.example.security.repo.rest;
import com.example.security.JwtTokenUtil;
import com.example.security.model.Token;
import com.example.security.repo.rest.resource.UserDto;
import com.example.security.repo.rest.resource.CreatePasswordResource;
import com.example.security.repo.rest.resource.RegisterUserResource;
import com.example.security.repo.rest.resource.RegisterUserResponse;
import com.example.security.service.EmailService;
import com.example.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.MailSender;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserRest {
    private UserService userService;

    private EmailService emailService;


    @Autowired
    private MailSender mailSender;

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    JwtTokenUtil jwtTokenUtil;

    @Autowired
    public UserRest(UserService userService, EmailService emailService){
        this.userService = userService;
        this.emailService = emailService;
    }


    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value = "/user/registerNewUser", method = RequestMethod.POST)
    public RegisterUserResponse registerNewUser(@Valid @RequestBody RegisterUserResource registerUserResource){
        return userService.registerUser(registerUserResource);
    }

    @CrossOrigin(origins = {"http://localhost:8082"})
    @RequestMapping(value = "getAllUsers", method = RequestMethod.GET)
    public List<UserDto> getAllUsers(){
        return userService.getUserList();
    }




    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value = "user/setPassword", method = RequestMethod.PUT)
    public void test(@RequestParam(name = "token") String token,@RequestBody CreatePasswordResource createPasswordResource){
        userService.addPasswordTo(token, createPasswordResource);
    }

    @CrossOrigin(origins = {"http://localhost:8082"})
    @RequestMapping(value = "user/login", method = RequestMethod.POST)
    public ResponseEntity<?> login(@Valid @RequestBody LoginUserResource loginUserResource){
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginUserResource.getEmail(), loginUserResource.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String jwt = jwtTokenUtil.generateAccessToken(authentication);

        return ResponseEntity.ok().body(jwt);

    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value = "user/checkJwtToken", method = RequestMethod.POST)
    public ResponseEntity<?> checkJwtToken(@RequestBody Token token){

        var result = jwtTokenUtil.validateAccessToken(token.getToken());

        return ResponseEntity.ok().body(result);
    }

    @CrossOrigin(origins = {"http://localhost:8082"})
    @RequestMapping(value = "deleteUser/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteUser(@PathVariable Long id){
        return userService.deleteUser(id);
    }








}
