/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package br.edu.ifnmg.cliente;

/**
 *
 * @author joaok
 */
public class Cliente {

    public static void main(String[] args) {
        FabricaComputador fabricaDesktop = new FabricaDesktop();
        Computador desktop = fabricaDesktop.criarComputador();

        FabricaComputador fabricaLaptop = new FabricaLaptop();
        Computador laptop = fabricaLaptop.criarComputador();

        desktop.descricao();
        laptop.descricao();
    }
}
