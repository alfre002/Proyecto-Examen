/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alfredomartin1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class AlfredoMartin1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner reader = new Scanner(System.in);
System.out.println("Introduzca un número");
int numero = reader.nextInt();
if(numero%2==0) {
System.out.println("El número es par");
} else {
System.out.println("El número es impar");
}
reader.close();
    }

}