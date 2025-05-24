package com.duoc.semana1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Comida {

    private String id;
    private String nombre;
    private int precio;
    
}
