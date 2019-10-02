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
public class Threads extends Thread{
    Barreira barreira;
    String nome;

    public Threads(Barreira barreira, String nome) {
        this.barreira = barreira;
        this.nome = nome;
    }

    @Override
    public void run() {
        while (true) {
            barreira.increment(nome);
            sleep(3000);
        }
    }

    public void sleep(int tempo) {
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException ex) {
            System.out.println("Erro: "+ex);
        }
    }
}
