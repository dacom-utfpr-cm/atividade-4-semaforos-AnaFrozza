/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade04.ex07;

import java.util.concurrent.Semaphore;

/**
 *
 * @author anafrozza
 */
public class Fila extends Thread{
    Semaphore mantem1;
    Semaphore mantem2;
    int numThreads01;
    int numThreads02;
    String concat;
    boolean isThread;

    public Fila(int numThreads01, int numThreads02) {
        this.mantem1 = new Semaphore(0);
        this.mantem2 = new Semaphore(0);
        this.numThreads01 = numThreads01;
        this.numThreads02 = numThreads02;
        this.isThread = false;
    }

    public void fila1(String message) {
        this.mantem2.release();
        try {
            this.mantem1.acquire();
        } catch (InterruptedException ex) {
            System.out.println("Erro: "+ex);
        }

        System.out.println(message+"|"+this.concat);
        this.concat = "";

    }

    public void fila2(String message) {
        this.mantem1.release();
        try {
            this.mantem2.acquire();
        } catch (InterruptedException ex) {
            System.out.println("Erro: "+ex);
        }

        this.concat = message;
    }


    public void init() {
        for (int i = 0; i < this.numThreads01; i++) {
            Thread1 thread01 = new Thread1(this, "Fila01(id:"+i+")");
            thread01.start();
        }

        for (int i = 0; i < this.numThreads02; i++) {
            Thread2 thread02 = new Thread2(this, "Fila02(id:"+i+")");
            thread02.start();
        }
    }
}
