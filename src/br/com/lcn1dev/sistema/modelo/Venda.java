package br.com.lcn1dev.sistema.modelo;

import java.time.LocalDate;

public class Venda {
    private Veiculo veiculo;
    private Cliente cliente;
    private LocalDate data;
    private  double preco;

    public Venda(Veiculo veiculo, Cliente cliente, LocalDate data, double preco) {
        this.veiculo = veiculo;
        this.cliente = cliente;
        this.data = data;
        this.preco = preco;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
