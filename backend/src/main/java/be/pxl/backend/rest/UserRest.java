package be.pxl.backend.rest;

import be.pxl.backend.domain.User;
import be.pxl.backend.rest.resource.RegisterUserResource;
import be.pxl.backend.service.UserService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserRest {
    private UserService userService;

    public UserRest(UserService userService){
        this.userService = userService;
    }

    @CrossOrigin(origins = {"http://localhost:8082"})
    @RequestMapping(value = "user/newUser")
    public ResponseEntity<String> createNewUser(@Valid @RequestBody RegisterUserResource newUser){
        return userService.addUser(newUser);
    }

    @CrossOrigin(origins = {"http://localhost:8082"})
    @RequestMapping(value = "user/getAllUsers")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @CrossOrigin(origins = {"http://localhost:8082"})
    @RequestMapping(value = "user/deleteUser/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<String> deleteUser(@PathVariable Long id){
        return userService.deleteUser(id);
    }


}
