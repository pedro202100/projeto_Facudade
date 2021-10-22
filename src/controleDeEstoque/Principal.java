package controleDeEstoque;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Produto p = new Produto();
        boolean opcao = true;
        int opcao2;
        String opcao3;
        
	while (opcao == true){
            p.exibirTabela();

            System.out.println("1 - Adicionar | 2 - Remover | 3 - sair");               
            System.out.print("opção-->");
            opcao3 = sc.next();
            opcao2 =  Integer.parseInt(opcao3);
            
            System.out.print("\n");

            if(opcao2 == 1){
                System.out.print("digite o nome do produto:");
                String nome = sc.next();
                System.out.print("digite o Valor do produto:");
                double valor = Float.parseFloat(sc.next());
                System.out.print("digite a Quantidade do produto:");
                int qtd = Integer.parseInt(sc.next());
                p.adicionar(nome,valor,qtd);
            }else if(opcao2 == 2){
                p.remover();
                p.exibirTabela();
            }else if(opcao2 == 3){
                p.sair();
                opcao = false;
            }else{
                System.out.print("opçao invalida!\n");
            }              
            
        };
    }

        
}

