/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.bridge;

/**
 *
 * @author joaok
 */
public abstract class Forma {

    protected Cor cor;

    public Forma(Cor c) {
        this.cor = c;
    }

    public abstract void aplicarCor();
}
