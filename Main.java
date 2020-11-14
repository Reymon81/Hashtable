package com.company;

import java.util.Hashtable;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hashtable diccionario = new Hashtable();
        diccionario.put("perro","animal de compañia");
        diccionario.put("sonajero","juguete de niños");
        diccionario.put("coche","vehiculo de transporte");
        diccionario.put("lol","videojuego no recomendado para mayores de 20 años");
        diccionario.put("cartero","persona que reparte la correspondencia");
        System.out.println("introduce una palabra del diccionario: ");
        String palabra=sc.nextLine();
        if(diccionario.containsKey(palabra)){
            System.out.println(diccionario.get(palabra));
        }else{
            System.out.println("la palabra no existe");
        }
    }
}
