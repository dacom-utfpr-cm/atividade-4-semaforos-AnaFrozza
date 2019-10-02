/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade04.ex01;

import java.util.concurrent.Semaphore;

/**
 *
 * @author anafrozza
 */
public class Sinalizacao {
    Semaphore semaforo;
    Threads t1;
    Threads t2;

    public Sinalizacao() {
        this.semaforo = new Semaphore(1);
        this.t1 = new Threads(this, "Thread1");
        this.t2 = new Threads(this, "Thread2");
    }

    public void sinal(String sinal) {
        try {
            this.semaforo.acquire();
        } catch (InterruptedException ex) {
            System.out.println("Erro: "+ex);
        }
    }

    public void init() {
        this.t1.start();
        this.t2.start();
    }

}
