package br.com.lcn1dev.sistema;

import br.com.lcn1dev.sistema.ficharios.*;
import br.com.lcn1dev.sistema.modelo.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void menuCRUD(){
        System.out.println("==== SISTEMA VEICULOS ====");
        System.out.println("1 - CADASTRAR");
        System.out.println("2 - CONSULTAR");
        System.out.println("3 - ATUALIZAR");
        System.out.println("4 - REMOVER");
        System.out.println("5 - RELATORIO");
        System.out.println("6 - SAIR");
    }

    public static void menu(){
        System.out.println("==== SISTEMA VEICULOS ====");
        System.out.println("1 - CARRO");
        System.out.println("2 - CAMINHAO");
        System.out.println("3 - ONIBUS");
        System.out.println("4 - VENDA");
        System.out.println("5 - SAIR");
    }

    public enum enumCrudOptions {Cadastrar, Consultar, Atualizar, Remover, Relatorio};
    public enum enumOptions {Carro, Caminhao, Onibus, Venda, Sair};

    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        ArrayList<Carro> carros = new ArrayList<Carro>();
        FicharioCarro ficharioCarro = new FicharioCarro(carros);
        ArrayList<Caminhao> caminhoes = new ArrayList<Caminhao>();
        FicharioCaminhao ficharioCaminhao = new FicharioCaminhao(caminhoes);
        ArrayList<Onibus> onibuses = new ArrayList<Onibus>();
        FicharioOnibus ficharioOnibus = new FicharioOnibus(onibuses);
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        FicharioCliente ficharioCliente = new FicharioCliente(clientes);
        ArrayList<Venda> vendas = new ArrayList<Venda>();
        FicharioVenda ficharioVenda = new FicharioVenda(vendas, clientes);


        int option, optionCrud;

        do{
            menu();
            option = entrada.nextInt();
            entrada.skip("\n");
            switch (option){
                case 1:
                    do{
                        menuCRUD();
                        optionCrud = entrada.nextInt();
                        entrada.skip("\n");
                        switch (optionCrud) {
                            case 1:
                                ficharioCarro.cadastrar();
                                break;
                            case 2:
                                ficharioCarro.consultar();
                                break;
                            case 3:
                                ficharioCarro.atualizar();
                                break;
                            case 4:
                                ficharioCarro.remover();
                                break;
                            case 5:
                                ficharioCarro.relatorio();
                                break;
                            default:
                                if (optionCrud != 6) {
                                    System.out.println("Opção inválida.");
                                }
                        }
                    }while(optionCrud != 6);

                    break;
                case 2:
                    do{
                        menuCRUD();
                        optionCrud = entrada.nextInt();
                        entrada.skip("\n");
                        switch (optionCrud){
                            case 1:
                                ficharioCaminhao.cadastrar();
                                break;
                            case 2:
                                ficharioCaminhao.consultar();
                                break;
                            case 3:
                                ficharioCaminhao.atualizar();
                                break;
                            case 4:
                                ficharioCaminhao.remover();
                                break;
                            case 5:
                                ficharioCaminhao.relatorio();
                                break;
                            default:
                                if(optionCrud != 6){
                                    System.out.println("Opção inválida");
                                }
                        }
                    }while(optionCrud != 6);

                    break;
                case 3:
                    do{
                        menuCRUD();
                        optionCrud = entrada.nextInt();
                        entrada.skip("\n");
                        switch (optionCrud){
                            case 1:
                                ficharioOnibus.cadastrar();
                                break;
                            case 2:
                                ficharioOnibus.consultar();
                                break;
                            case 3:
                                ficharioOnibus.atualizar();
                                break;
                            case 4:
                                ficharioOnibus.remover();
                                break;
                            case 5:
                                ficharioOnibus.relatorio();
                                break;
                            default:
                                if (optionCrud != 6){
                                    System.out.println("Opção inválida");
                                }
                        }
                    }while (optionCrud != 6);

                    break;
                case 4:


            }

        }while(option != 6);
    }
}
