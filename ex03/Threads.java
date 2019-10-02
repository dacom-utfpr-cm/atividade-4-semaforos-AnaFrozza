/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade04.ex03;

/**
 *
 * @author anafrozza
 */
public class Threads extends Thread{
    Mutex mutex;
    String nome;
    
    public Threads(Mutex m, String nome){
        this.mutex = m;
        this.nome = nome;
    }
    
    @Override
    public void run(){
        while (true) {            
            this.mutex.increment(this.nome);
            sleep(1000);
        }
    }
    
    public void sleep(int var){
        try{
            Thread.sleep(var);
        }catch(InterruptedException ex){
            System.out.println("Erro: "+ex);
        }
    }
}
