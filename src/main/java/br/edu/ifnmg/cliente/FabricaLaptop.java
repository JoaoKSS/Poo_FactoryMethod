/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.cliente;

/**
 *
 * @author joaok
 */
public class FabricaLaptop implements FabricaComputador {

    @Override
    public Computador criarComputador() {
        return new Laptop();
    }
}
