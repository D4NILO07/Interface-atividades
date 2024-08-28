/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.operacaomatematica;

/**
 *
 * @author Aluno
 */
public class Divisao implements OperacaoMatematica {

    @Override
    public double operacao() {
        
        double numUm = 2;
        double numDois = 3;
        
        double divisao = numUm /  numDois;
        
        return(divisao);
  
    }
    
}
