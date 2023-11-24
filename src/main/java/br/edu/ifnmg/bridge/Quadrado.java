/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.bridge;

/**
 *
 * @author joaok
 */
public class Quadrado extends Forma {

    public Quadrado(Cor c) {
        super(c);
    }

    @Override
    public void aplicarCor() {
        System.out.print("Quadrado ");
        cor.aplicarCor();
    }
}
