package com.example.willian.myapplication;

import java.util.Scanner;

public class MainActivity {

    public static void main(String[] args) {
        byte aleatorio;
        String usuario = "", computador = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("\npedra, papel ou tesoura...");
        System.out.print("sua opção: ");
        usuario = sc.next();
        if(!usuario.equals("pedra") && !usuario.equals("papel") && !usuario.equals("tesoura")) {
            System.out.println("\nopção não válida\n");
        }
        else {
            aleatorio = (byte)(Math.random() * 3);
            switch (aleatorio) {
                case 0:
                    computador = "pedra";
                    break;
                case 1:
                    computador = "papel";
                    break;
                case 2:
                    computador = "tesoura";
                    break;
            }
            System.out.println("computador: " + computador);
            if(usuario.equals(computador)) {
                System.out.println("\nempate\n");
            }
            else {
                if((usuario.equals("Pedra") && computador.equals("Papel"))
                        || (usuario.equals("Papel") && computador.equals("Tesoura"))
                        || (usuario.equals("Tesoura") && computador.equals("Pedra"))) {
                    System.out.println("\nVocê Perdeu\n");
                }
                else {
                    System.out.println("\nVocê Ganhou\n");
                }
            }
        }
    }
}
