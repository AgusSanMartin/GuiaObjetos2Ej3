package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

public class Cuenta {
    private UUID id;
    private double balance;
    private Cliente cliente;
    private List<Operacion> historial = new ArrayList<Operacion>();

    public Cuenta(double b, Cliente c){
        this.id = UUID.randomUUID();
        this.balance = b;
        this.cliente = c;
    }

    public double getBalance() { return balance; }

    public List<Operacion> getHistorial() { return historial; }

    public void depositar(double monto){
        this.balance = this.getBalance() + monto;

        Operacion nOP = new Operacion("deposito",monto);

        this.historial.sort(Comparator.comparing(Operacion::gettOperacion));
        if(this.historial.size()>=10){this.historial.remove(0);}
        this.historial.add(nOP);

        System.out.printf("\nEl %s, depositó %.2f, su balance es de %.2f",this.cliente.getNomYape(), monto,this.balance);
    }

    public void extraer(double monto) throws InterruptedException {
        if (balance - monto < -2000) {
            System.out.println("\nLa cuenta no posee saldo suficiente para esta extraccion");
        }else {
            this.balance = this.getBalance() - monto;
            Operacion nOP = new Operacion("extraccion",monto);
            this.historial.sort(Comparator.comparing(Operacion::gettOperacion));
            if(this.historial.size()>=10){this.historial.remove(0);}

            this.historial.add(nOP);

            System.out.printf("\nEl %s, retiro %.2f, su balance es de %.2f",this.cliente.getNomYape(), monto, this.balance);
        }
    }

    public void mostrarHistorial(){
        int i = 0;
        for(Operacion op : this.getHistorial()) {
            if (op.getTipo() == "deposito") {
                System.out.printf("\nEl Cliente : %s, depositó %.2f el: %s ID: %s.", this.cliente.getNomYape(),
                        this.historial.get(i).getMonto(),
                        this.historial.get(i).gettOperacion(),
                        this.historial.get(i).getId());
                i++;
            }else {
                System.out.printf("\nEl Cliente : %s, extrajo %.2f el: %s ID: %s.", this.cliente.getNomYape(),
                        this.historial.get(i).getMonto(),
                        this.historial.get(i).gettOperacion(),
                        this.historial.get(i).getId());
                i++;
            }
        }
    }

}
