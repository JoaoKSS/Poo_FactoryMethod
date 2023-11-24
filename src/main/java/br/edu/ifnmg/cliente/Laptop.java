/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.cliente;

/**
 *
 * @author joaok
 */
public class Laptop implements Computador {

    @Override
    public void descricao() {
        System.out.println("Notebook: AMD Ryzen 5, 8Gb Ram, 512Gb SSD");
    }
}