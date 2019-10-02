/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade04.ex01;

/**
 *
 * @author anafrozza
 */

/**
 * Enviar sinal para outra thread para indicar que um evento ocorreu
 * Faça um código que uma thread t1 e t2 são inicializadas simultaneamente, 
 * mas a t2 pode somente continuar a execução após a sinalização de t1.
 */

public class Main {
    public static void main(String[] args) {
        Sinalizacao sinal = new Sinalizacao();
        sinal.init();
        
        System.out.println("Concluido!");
    }
}
