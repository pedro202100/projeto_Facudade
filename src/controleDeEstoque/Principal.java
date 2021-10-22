package controleDeEstoque;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args){
        Produto pp = new Produto();
        
        
        int opcao = Integer.parseInt(JOptionPane.showInputDialog(null,"digite 1 para adicionar um produto \n2 para remover o produto digite \n3 para vizualizar"));
        if(opcao == 1){
            pp.adicionar();
            
        }else if(opcao == 2){
           pp.remover();
            
        }else if(opcao == 3){
           pp.exibirTabela();
            
        }
            
        
    }
}
