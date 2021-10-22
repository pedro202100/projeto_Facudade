package controleDeEstoque;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Produto p = new Produto();
        int opcao = 0;
	do {
		System.out
				.println("\n\n### SCE - Sistema de Controle de Estoque###");
		System.out.println("\n                  =========================");
		System.out.println("                  |     1 - Adicionar         |");
		System.out.println("                  |     2 - Remover      |");
		System.out.println("                  |     3 - sair        |");
		System.out.println("                  =========================\n");
                
		System.out.print("opção-->");
                opcao = Integer.parseInt(sc.next()) ;
		System.out.print("\n");
		switch (opcao) {
                    case 1:
                        p.adicionar();
                        p.exibirTabela();
                        break;
                    case 2:
                        p.remover();
                        p.exibirTabela();
                    
                    case 3:
                        p.sair();
                        break;
                    case 0:
                        break;
                    default: System.out.println("Opção Inválida!");
                }
            //case3 , 4  , etc...
            	} while (opcao != 3);
}

        
}

