package com.company;

import java.util.UUID;

public class Cliente {
    private UUID id;
    private String nomYape;
    private char genero;

    public Cliente(String nYa, char g){
        this.id = UUID.randomUUID();
        this.nomYape = nYa;
        this.genero = g;
    }

    public UUID getId() { return id; }

    public String getNomYape() { return nomYape; }

    public char getGenero() { return genero; }

}
