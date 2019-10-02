/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade04.ex04;

/**
 *
 * @author anafrozza
 */
public class Threads extends Thread{
    Multiplex multiplex;
    String nome;

    public Threads(Multiplex multiplex, String nome) {
        this.multiplex = multiplex;
        this.nome = nome;
    }

    @Override
    public void run() {
        while (true) {
            this.multiplex.increments(this.nome);
            sleep(3000);
        }
    }

    public void sleep(int val) {
        try {
            Thread.sleep(val);
        } catch (InterruptedException ex) {
            System.out.println("Erro: "+ex);
        }
    }
}
