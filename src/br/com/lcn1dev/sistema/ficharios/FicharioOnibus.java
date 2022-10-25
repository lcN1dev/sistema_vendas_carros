package br.com.lcn1dev.sistema.ficharios;

import br.com.lcn1dev.sistema.modelo.Onibus;

import java.util.ArrayList;
import java.util.Scanner;

public class FicharioOnibus implements CRUD{

    private ArrayList<Onibus> onibuses;
    Scanner entrada;
    public FicharioOnibus(ArrayList<Onibus> onibuses) {
        this.onibuses = onibuses;
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
