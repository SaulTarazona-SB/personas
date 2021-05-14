package com.bolivar.comunes.personas.models;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;

@Data
public class ObtenerpersonaResponse {

    private String nombre;
    private String numeroSeguroSocial;
    private Date fechaNacimiento;
    private ObtenerdireccionResponse obtenerdireccionResponse;
    private ObtenerdireccionResponse oficina;
    private ObtenerpersonaResponse pareja;
    private ArrayList<String> colorFavorito;
    private long edad;

}
