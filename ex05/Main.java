/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade04.ex05;

/**
 *
 * @author anafrozza
 */
/**
 * Após N threads sincronizarem em um ponto em comum, um trecho específico
 * (ponto crítico) pode ser executado por cada uma delas Faça um código que
 * possibilite barrar N threads em um ponto específico de execução e, após todas
 * alcançarem o ponto, todas devem executar o trecho de código após esse ponto.
 */
public class Main {

    public static void main(String[] args) {
        Barreira barreira = new Barreira(9, 5);
        barreira.init();

        System.out.println("Concluido!");
    }
}
