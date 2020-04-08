package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        //Ejercicio 3:

        System.out.println("Ejercicio 3: ");

        Cliente cli = new Cliente("Agustin San Martin", 'M');

        System.out.printf("\ncliente[id = %s, nombre y apellido = %s, sexo = %c]", cli.getId(),
                                                                                    cli.getNomYape(),
                                                                                    cli.getGenero());



        Cuenta c1 = new Cuenta(10000,cli);
        c1.depositar(2000);
        Thread.sleep(1000);
        c1.extraer(500);
        Thread.sleep(1000);
        c1.extraer(200);
        Thread.sleep(1000);
        c1.depositar(300);
        Thread.sleep(1000);
        c1.extraer(9700);
        Thread.sleep(1000);
        c1.depositar(300);
        Thread.sleep(1000);
        c1.depositar(300);
        Thread.sleep(1000);
        c1.depositar(300);
        Thread.sleep(1000);
        c1.depositar(300);
        Thread.sleep(1000);
        c1.depositar(300);
        Thread.sleep(1000);
        c1.depositar(150);
        Thread.sleep(1000);
        c1.depositar(150);
        Thread.sleep(1000);
        System.out.print("\n\nHistorial: \n ");
        c1.mostrarHistorial();

        c1.depositar(20);

        System.out.print("\n\nHistorial: \n ");
        c1.mostrarHistorial();
    }
}
