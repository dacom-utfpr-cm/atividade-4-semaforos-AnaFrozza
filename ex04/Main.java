/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade04.ex04;

/**
 *
 * @author anafrozza
 */

/**
 * Garantir acesso à seção crítica para no máximo N threads
 * Faça um código que possibilite que N threads estejam na seção crítica simultaneamente.
 */

public class Main {
    public static void main(String[] args) {
        Multiplex multiplex  = new Multiplex(3, 9);
        multiplex.init();
        
        System.out.println("Concluido!");
    }
}
