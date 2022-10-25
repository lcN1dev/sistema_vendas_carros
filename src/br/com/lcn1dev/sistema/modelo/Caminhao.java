package br.com.lcn1dev.sistema.modelo;

public class Caminhao extends Veiculo{
    private float capacidadeCarga;

    public Caminhao(String marca, String modelo, int anoFabricacao, int anoModelo, double preco, String chassi, float capacidadeCarga){
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.preco = preco;
        this.capacidadeCarga = capacidadeCarga;
    }

    public float getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(float capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
}


//devprogspeed
//felipez08