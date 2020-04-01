package com.company;

import java.util.UUID;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Operacion {
    private UUID id;
    private String tOperacion;
    private String tipo;
    private double monto;

    public Operacion(String t, double m){
        this.id = UUID.randomUUID();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        this.tOperacion = LocalDateTime.now().format(formatter);
        this.tipo = t;
        this.monto = m;
    }

    public UUID getId() { return id; }

    public String getTipo() { return tipo; }

    public double getMonto() { return monto; }

    public String gettOperacion() { return tOperacion; }
}
