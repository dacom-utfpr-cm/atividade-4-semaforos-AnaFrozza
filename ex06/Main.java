/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade04.ex06;

import java.util.Random;

/**
 *
 * @author anafrozza
 */
/**
 * Threds em um laço executam uma série de passos e sincronizam em uma barreira
 * a cada passo Faça um código que implemente uma barreira reusável que feche a
 * si própria após todas as threads passarem.
 */
public class Main {

    public static void main(String[] args) {
        Barreira barreira = new Barreira(5);
        barreira.init();
        
        System.out.println("Concluido!");
    }
}
