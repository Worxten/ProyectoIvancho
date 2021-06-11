package com.example.demoproyecto.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeamPayloadDTO {
    private ArrayList<UserDTO> integrantes;
}
