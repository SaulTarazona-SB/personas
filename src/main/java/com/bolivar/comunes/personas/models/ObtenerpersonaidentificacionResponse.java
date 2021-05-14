package com.bolivar.comunes.personas.models;

import lombok.Data;

@Data
public class ObtenerpersonaidentificacionResponse {

    private String id;
    private String nombre;
    private String numeroSeguroSocial;
    private String fechaNacimiento;

}
