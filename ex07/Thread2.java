/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade04.ex07;

/**
 *
 * @author anafrozza
 */
public class Thread2 extends Thread{
    Fila fila;
    String nome;

    public Thread2(Fila fila, String nome) {
        this.fila = fila;
        this.nome = nome;
    }

    @Override
    public void run() {
        while (true) {
            fila.fila1(nome);
            this.sleep(4000);
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
