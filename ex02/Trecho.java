/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade04.ex02;

/**
 *
 * @author anafrozza
 */
public class Trecho extends Thread{
    Sinaliza sinal;
    String nome;
    int trecho;
    
    public Trecho(Sinaliza sinal, String nome){
        this.sinal = sinal;
        this.nome = nome;
        this.trecho = 0;
    }
    
    @Override
    public void run(){
        while (true) {            
            this.trecho++;
            sinal.trecho(this.nome+"."+this.trecho);
            this.sleep(1000);
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
