/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade04.ex06;

/**
 *
 * @author anafrozza
 */
public class Threads extends Thread {

    Barreira barreira;
    int tempo;

    Threads(Barreira barreira, int tempo) {
        this.barreira = barreira;
        this.tempo = tempo;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Esperando");
            barreira.increment();
            sleep(tempo);
        }
    }

    public void sleep(int tempo) {
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException ex) {
            System.out.println("Erro: " + ex);
        }
    }
}
