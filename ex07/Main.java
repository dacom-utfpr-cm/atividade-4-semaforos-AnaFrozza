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

/**
 * Semáforos podem ser usadas para representar uma fila
 * Faça um código que implemente duas filas (F1 e F2) com semáforos
 * As threads colocadas na F1 só podem executar se tiver um par na F2
 * Nesse caso, ambas as threads na primeira fila são executadas.
 */

public class Main {
    public static void main(String[] args){
        Fila f = new Fila(5, 3);
        f.init();

    }
}
