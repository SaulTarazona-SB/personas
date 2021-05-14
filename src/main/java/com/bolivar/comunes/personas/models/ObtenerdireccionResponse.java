package com.bolivar.comunes.personas.models;

import lombok.Data;

@Data
public class ObtenerdireccionResponse {

    private String calle;
    private String ciudad;
    private String estado;
    private String zip;

}
