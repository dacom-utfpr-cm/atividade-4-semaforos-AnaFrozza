/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade04.ex04;

import java.util.concurrent.Semaphore;

/**
 *
 * @author anafrozza
 */
public class Multiplex {
    Semaphore semaphore;
    int numThreads;
    int count;

    public Multiplex(int tamanho, int numThreads) {
        this.semaphore = new Semaphore(tamanho);
        this.numThreads = numThreads;
        this.count = 0;
    }

    public void increments(String nome) {
        try {
            this.semaphore.acquire();
        } catch (InterruptedException ex) {
            System.out.println("Erro: "+ex);
        }

        this.count++;
        System.out.println("Nome Thread: "+nome);
        System.out.println("Contador: " + this.count);

        this.semaphore.release();
    }

    public void init() {
        for (int i = 0; i < this.numThreads; i++) {
            Threads thread = new Threads(this, "Thread" + i);
            thread.start();
        }
    }
}
