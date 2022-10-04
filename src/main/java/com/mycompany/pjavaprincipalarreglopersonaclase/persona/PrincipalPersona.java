package com.mycompany.pjavaprincipalarreglopersonaclase.persona;

import java.util.Scanner;

public class PrincipalPersona {

    public static void main(String[] args) {
        Menu menu = new Menu();
        Persona[] personas = new Persona[10];
        Scanner scanner = new Scanner(System.in);
        
        int opcion;
        do {            
            menu.mostrar();
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
        } while (opcion != 6);
    }
}
