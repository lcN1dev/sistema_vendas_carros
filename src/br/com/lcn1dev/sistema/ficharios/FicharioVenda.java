package br.com.lcn1dev.sistema.ficharios;

import br.com.lcn1dev.sistema.modelo.Cliente;
import br.com.lcn1dev.sistema.modelo.Venda;

import java.util.ArrayList;
import java.util.Scanner;

public class FicharioVenda implements CRUD{
    private ArrayList<Venda> vendas;
    private ArrayList<Cliente> clientes;
    Scanner entrada;
    public FicharioVenda(ArrayList<Venda> vendas, ArrayList<Cliente> clientes) {
        this.vendas = vendas;
        this.clientes = clientes;
        entrada = new Scanner(System.in);
    }

    @Override
    public void consultar() {

    }

    @Override
    public void cadastrar() {

    }

    @Override
    public void atualizar() {

    }

    @Override
    public void remover() {

    }

    public void relatorio(){

    }
}
