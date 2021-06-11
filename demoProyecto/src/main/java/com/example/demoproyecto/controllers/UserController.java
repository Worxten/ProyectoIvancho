package com.example.demoproyecto.controllers;

import com.example.demoproyecto.dtos.TeamPayloadDTO;
import com.example.demoproyecto.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    public UserService userService;

    @PostMapping("/crear")
    public ResponseEntity getUser(@RequestBody TeamPayloadDTO teamDTO){
        return new ResponseEntity(userService.crearUsuario(teamDTO), HttpStatus.OK);
    }

}
