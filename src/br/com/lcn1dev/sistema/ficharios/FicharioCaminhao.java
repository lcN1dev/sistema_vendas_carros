package br.com.lcn1dev.sistema.ficharios;

import br.com.lcn1dev.sistema.modelo.Caminhao;

import java.util.ArrayList;
import java.util.Scanner;

public class FicharioCaminhao implements CRUD{
    Scanner entrada;
    private ArrayList<Caminhao> caminhoes;
    public FicharioCaminhao(ArrayList<Caminhao> caminhoes) {
        this.caminhoes = caminhoes;
        entrada = new Scanner(System.in);
    }

    @Override
    public void consultar() {

    }

    @Override
    public void atualizar() {

    }

    @Override
    public void cadastrar() {

    }

    @Override
    public void remover() {

    }

    public void relatorio(){

    }
}
