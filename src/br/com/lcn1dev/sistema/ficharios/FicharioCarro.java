package br.com.lcn1dev.sistema.ficharios;

import br.com.lcn1dev.sistema.modelo.Carro;

import java.util.ArrayList;
import java.util.Scanner;

public class FicharioCarro implements CRUD{

    private Scanner entrada;
    private ArrayList<Carro> carros;

    public FicharioCarro(ArrayList<Carro> carros) {
        this.carros = carros;
        entrada = new Scanner(System.in);
    }

    @Override
    public void consultar() {

    }

    @Override
    public void cadastrar() {
        System.out.println("==== CADASTRO CARRO ====");
        System.out.println("Marca: ");
        String marca = entrada.nextLine();
        System.out.println("Modelo: ");
        String modelo = entrada.nextLine();
        System.out.println("Ano de Fabricação: ");
        Integer anoFabricacao = entrada.nextInt();
        System.out.println("Ano Modelo: ");
        Integer anoModelo = entrada.nextInt();
        System.out.println("Preço: ");
        Double preco = entrada.nextDouble();
        entrada.skip("\n");
        System.out.println("Chassi: ");
        String chassi = entrada.nextLine();
        System.out.println("Quantidade de Portas: ");
        Integer quantidadePortas = entrada.nextInt();
        Carro carro = new Carro(marca, modelo, anoFabricacao, anoModelo,preco, chassi, quantidadePortas);
        carros.add(carro);
    }

    @Override
    public void atualizar() {


        System.out.println("==== ALTERAR CARRO ====");
        System.out.println("Marca: ");
        String marca = entrada.nextLine();
        System.out.println("Modelo: ");
        String modelo = entrada.nextLine();
        System.out.println("Ano de Fabricação: ");
        Integer anoFabricacao = entrada.nextInt();
        System.out.println("Ano Modelo: ");
        Integer anoModelo = entrada.nextInt();
        System.out.println("Preço: ");
        Double preco = entrada.nextDouble();
        entrada.skip("\n");
        System.out.println("Chassi: ");
        String chassi = entrada.nextLine();
        System.out.println("Quantidade de Portas: ");
        Integer quantidadePortas = entrada.nextInt();
    }

    @Override
    public void remover() {

    }

    @Override
    public void relatorio(){

    }

    public Carro buscar (){
        System.out.println("==== BUSCA CARRO ====");
        System.out.println("Chassi: ");
        String chassi = entrada.nextLine();
        entrada.skip("\n");


    }
}
