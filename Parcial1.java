/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;

import java.util.Scanner;

/**
 *
 * @author Computadora
 */
public class Parcial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner  tec= new Scanner (System.in);
        int Opcion=0;
        boolean condicion=true;
int id;
String name;
String email;
String addres;
String speciality;
String phonenumber;
String Birthday;
Double Weigth;
Double Heigth;
String blood;
while(condicion) {
        System.out.println("----------MENU----------");
        System.out.println("[1] Doctor");
        System.out.println("[2] Enfermera");
        System.out.println("[3] Paciente");
        System.out.println("[0] Salir");
        System.out.println("------------------------");
        System.out.println("Opción: ");
        Opcion= tec.nextInt();
switch (Opcion){
        case 1:
        System.out.println("----OPCION 1 Doctor ----");
        tec.nextLine();
        System.out.println("Ingrese su Id");
        id=tec.nextInt();
        tec.nextLine();
        System.out.println("Ingrese su Nombre");
        name = tec.nextLine();
        tec.nextLine();
        System.out.println("Ingrese su Email");
        email = tec.nextLine();
        System.out.println("Ingrese su Dirección");
        addres = tec.nextLine();
        System.out.println("Ingrese su Especialidad");
        speciality = tec.nextLine();
        System.out.println("Ingrese su Numero telefonico");
        phonenumber= tec.nextLine();
        break;
       case 2:
        System.out.println("----OPCION 2 Enfermera ----");
        tec.nextLine();
        System.out.println("Ingrese su Id");
        id=tec.nextInt();
        tec.nextLine();
        System.out.println("Ingrese su Nombre");
        name = tec.nextLine();
        tec.nextLine();
        System.out.println("Ingrese su Email");
        email = tec.nextLine();
        System.out.println("Ingrese su Dirección");
        addres = tec.nextLine();
        System.out.println("Ingrese su Especialidad");
        speciality = tec.nextLine();
        System.out.println("Ingrese su Numero telefonico");
        phonenumber= tec.nextLine(); 
        break;
        case 3:
        System.out.println("----OPCION 3 Paciente----");
        tec.nextLine();
        System.out.println("Ingrese su Id");
        id=tec.nextInt();
        tec.nextLine();
        System.out.println("Ingrese su Nombre");
        name = tec.nextLine();
        tec.nextLine();
        System.out.println("Ingrese su Email");
        email = tec.nextLine();
        System.out.println("Ingrese su Dirección");
        addres = tec.nextLine();
        System.out.println("Ingrese su Numero telefonico");
        phonenumber= tec.nextLine(); 
        System.out.println("Ingrese fecha nacimiento");
        Birthday=tec.nextLine();
        System.out.println("Ingrese su peso"); 
        Weigth=tec.nextDouble();
        System.out.println("Ingrese su estatura");
        Heigth=tec.nextDouble();
        System.out.println("Ingrese su tipo de sangre");
        blood=tec.nextLine();
        break;
        case 0:
         condicion=false;
            System.out.println("Saliste");
        break;
        default:
        System.out.println("Opcion no encontrada");
    }
  }       

    }
    

    }
    

