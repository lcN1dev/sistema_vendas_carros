package br.com.lcn1dev.sistema.modelo;

import java.util.ArrayList;

public class Carro extends Veiculo{
    private int quantidadePortas;

    public Carro(String marca, String modelo, int anoFabricacao, int anoModelo, double preco, String chassi, int quantidadePortas) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.quantidadePortas = quantidadePortas;
    }

    public int getQuantidadePortas() {
        return quantidadePortas;
    }

    public void setQuantidadePortas(int quantidadePortas) {
        this.quantidadePortas = quantidadePortas;
    }
}
