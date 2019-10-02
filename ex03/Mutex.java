/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade04.ex03;

import java.util.concurrent.Semaphore;

/**
 *
 * @author anafrozza
 */
public class Mutex {
    Semaphore semaforo;
    Threads t1;
    Threads t2;
    Threads t3;
    int count;
    
    public Mutex(){
        this.count = 0;
        this.semaforo = new Semaphore(1);
        this.t1 = new Threads(this, "thread1");
        this.t2 = new Threads(this, "thread2");
        this.t3 = new Threads(this, "thread3");
    }
    
    public void increment(String nome){
        try {
            this.semaforo.acquire();
        } catch (InterruptedException ex) {
            System.out.println("Erro: "+ex);
        }
        
        this.count++;
        System.out.println("Nome Thread: "+nome);
        System.out.println("Contador: " + this.count);
        this.semaforo.release();
    }
    
    public void init(){
        this.t1.start();
        this.t2.start();
        this.t3.start();
    }
}
