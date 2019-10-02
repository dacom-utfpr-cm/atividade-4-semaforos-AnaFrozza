/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade04.ex05;

import java.util.concurrent.Semaphore;

/**
 *
 * @author anafrozza
 */
public class Barreira {
    Semaphore semaforo;
    Semaphore mutex;

    int contador;
    int tamanho;
    int numThreads;

    int count;

    public Barreira(int numThreads, int tamanho) {
        this.contador = 0;
        this.count = 0;
        this.tamanho = tamanho;
        this.numThreads = numThreads;

        this.semaforo = new Semaphore(0);
        this.mutex = new Semaphore(1);
    }

    public void increment(String nome) {
        try {
            this.mutex.acquire();
        } catch (InterruptedException ex) {
            System.out.println("Erro: "+ex);
        }

        this.contador++;

        System.out.println("Numero de Threads: " + this.contador);

        if (this.contador >= tamanho) {
            this.semaforo.release();
        }

        this.mutex.release();

        try {
            this.semaforo.acquire();
        } catch (InterruptedException ex) {
            System.out.println("Erro: "+ex);
        }

        this.count++;
        System.out.println("Nome Thread: "+nome);
        System.out.println("Contador: " + this.count);
    }

    public void init() {
        for (int i = 0; i < this.numThreads; i++) {
            Threads thread = new Threads(this, "Thread" + i);
            thread.start();
        }
    }
}
