/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade04.ex02;

import java.util.concurrent.Semaphore;

/**
 *
 * @author anafrozza
 */
public class Sinaliza {
    Semaphore semaforo;
    Trecho t1;
    Trecho t2;
    
    public Sinaliza(){
        this.semaforo = new Semaphore(1);
        this.t1 = new Trecho(this, "trecho1");
        this.t2 = new Trecho(this, "trecho2");
    }
    
    public void trecho(String trecho){
        try{
            System.out.println(trecho);
            this.semaforo.acquire();
            
        }catch(InterruptedException ex){
            System.out.println("Erro: "+ex);
        }
    }
    
    public void init(){
        this.t1.start();
        this.t2.start();
    }
    
}
