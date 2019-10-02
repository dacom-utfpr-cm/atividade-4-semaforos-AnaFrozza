/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade04.ex03;

/**
 *
 * @author anafrozza
 */

/**
 * Garantir acesso exclusivo à seção crítica
 * Faça um código que possibilite que 2 ou mais threads realizem o incremento de um contador
 * Faça a exclusão mútua com semáforo.
 */

public class Main {
    public static void main(String[] args) {
        Mutex mutex = new Mutex();
        mutex.init();
        
        System.out.println("Concluido!");
    }
}
