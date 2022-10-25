package br.com.lcn1dev.sistema.modelo;

public class Onibus extends Veiculo{
    private int quantidadePassageiros;
    private int quantidadeEixos;

    public Onibus(String marca, String modelo, int anoFabricacao, int anoModelo, double preco, String chassi, int quantidadePassageiros, int quantidadeEixos){
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.preco = preco;
        this.quantidadePassageiros = quantidadePassageiros;
        this.quantidadeEixos = quantidadeEixos;
    }

    public int getQuantidadePassageiros() {
        return quantidadePassageiros;
    }

    public void setQuantidadePassageiros(int quantidadePassageiros) {
        this.quantidadePassageiros = quantidadePassageiros;
    }

    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }

    public void setQuantidadeEixos(int quantidadeEixos) {
        this.quantidadeEixos = quantidadeEixos;
    }
}
