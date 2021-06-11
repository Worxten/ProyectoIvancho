package com.example.demoproyecto.services;

import com.example.demoproyecto.dtos.TeamPayloadDTO;
import com.example.demoproyecto.dtos.UserDTO;
import com.example.demoproyecto.entities.User;
import com.example.demoproyecto.repositories.UserRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public String crearUsuario(TeamPayloadDTO teamDTO){
        if(teamDTO.getIntegrantes().size()==4){
            return "sisas se creo";
        }else
            return "nocas";
    }

}
