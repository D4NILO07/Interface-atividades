/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.novacoisa;

/**
 *
 * @author Aluno
 */
public class Main {

    public static void main(String[] args) {
        
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();
        Galo galo = new Galo();
        Pato pato = new Pato();
        
        System.out.println("===CACHORRO===");
        System.out.println(cachorro.emitirSom());
        System.out.println(cachorro.Comer());
        System.out.println("===GATO===");
        System.out.println(gato.emitirSom());
        System.out.println(gato.Comer());
        System.out.println("===GALO===");
        System.out.println(galo.emitirSom());
        System.out.println(galo.Comer());
        System.out.println("===PATO===");
        System.out.println(pato.emitirSom());
        System.out.println(pato.Comer());
        
        
        
    }
}
