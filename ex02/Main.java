/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade04.ex02;

/**
 *
 * @author anafrozza
 */

/**
 * Enviar sinalização para um ponto de encontro entre threads
 * Faça um código que uma thread t1 e t2 são inicializadas e t1 espera por t2 e vice-versa
 * Exemplo:
 *      t1:
 *          trecho1
 *          trecho1.2
 *      t2:
 *          trecho2.1
 *          trecho2.2
 * 
 * thecho1.1 ocorre antes trecho2.2 e threcho2.1 ocorre antes de trecho1.2.
 */
public class Main {
    public static void main(String[] args) {
        Sinaliza rende = new Sinaliza();
        rende.init();
        
        System.out.println("Concluido!");
    }
}
