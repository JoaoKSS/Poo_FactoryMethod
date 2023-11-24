/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package br.edu.ifnmg.bridge;

/**
 *
 * @author joaok
 */
public class Bridge {

    public static void main(String[] args) {
        Forma quadrado = new Quadrado(new CorAzul());
        quadrado.aplicarCor();

        Forma circulo = new Circulo(new CorVermelha());
        circulo.aplicarCor();
    }
}
