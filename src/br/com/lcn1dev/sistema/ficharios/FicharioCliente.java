package br.com.lcn1dev.sistema.ficharios;

import br.com.lcn1dev.sistema.modelo.Cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class FicharioCliente implements CRUD{

    private ArrayList<Cliente> clientes;
    Scanner entrada;
    public FicharioCliente(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
        entrada = new Scanner(System.in);
    }

    @Override
    public void consultar() {

    }

    @Override
    public void atualizar() {

    }

    @Override
    public void remover() {

    }

    @Override
    public void cadastrar() {

    }

    public void relatorio(){

    }
}
