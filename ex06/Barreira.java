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
public class Barreira {

    int sincronizacoes;

    public Barreira(int sincronizacoes) {
        this.sincronizacoes = sincronizacoes;
    }

    public synchronized void increment() {
        try {
            sincronizacoes--;

            if (sincronizacoes == 0) {
                this.notifyAll();
            } else {
                while (sincronizacoes > 0) {
                    this.wait();
                }
            }
        } catch (Exception ex) {
            System.out.println("Erro: " + ex);
        }
    }

    public void init() {
        Random ram = new Random();
        for (int i = 0; i < this.sincronizacoes; i++) {
            Threads thread = new Threads(this, ram.nextInt(1000));
            thread.start();
        }
    }
}
