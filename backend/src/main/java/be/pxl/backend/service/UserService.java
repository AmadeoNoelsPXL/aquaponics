package be.pxl.backend.service;

import be.pxl.backend.domain.Role;
import be.pxl.backend.domain.User;
import be.pxl.backend.repo.UserRepository;
import be.pxl.backend.rest.resource.RegisterUserResource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository  userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public ResponseEntity<String> addUser(RegisterUserResource newUser){
        User user = new User(newUser.getFirstName(), newUser.getLastName(), newUser.getPhoneNumber(), newUser.getEmail());

        userRepository.save(user);

        return new ResponseEntity<>("User " + newUser.getFirstName() + " " + newUser.getLastName() + " werd aangemaakt", HttpStatus.CREATED);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public ResponseEntity<String> deleteUser(Long id){
        User user = userRepository.findById(id).get();
        userRepository.deleteById(user.getId());

        return new ResponseEntity<>("User " + user.getFirstName() + " " + user.getLastName() + " werd successvol verwijdert",HttpStatus.CREATED);
    }


}
