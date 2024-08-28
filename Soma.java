/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.operacaomatematica;

/**
 *
 * @author Aluno
 */
public class Soma implements OperacaoMatematica {

    @Override
    public double operacao() {
        
        double numUm = 2;
        double numDois = 3;
        
        double soma = numUm +  numDois;
        
        return(soma);
  
    }
    
}
