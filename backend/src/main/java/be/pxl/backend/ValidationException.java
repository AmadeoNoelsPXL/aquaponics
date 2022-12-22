package be.pxl.backend;

import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@ControllerAdvice
public class ValidationException extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ConstraintViolationException.class)
    public ResponseEntity<Object> handleConstraintViolations(ConstraintViolationException ex){
        var constraints = ex.getConstraintViolations();
        Map<String, String> constraint = new HashMap<>();
        for (var item: constraints) {
            constraint.put(item.getPropertyPath().toString(), item.getMessage());
        }

        return new ResponseEntity<>(constraint, HttpStatus.BAD_REQUEST);
    }


}
