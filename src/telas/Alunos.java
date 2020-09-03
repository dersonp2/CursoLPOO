
package telas;

import java.util.ArrayList;

public class Alunos {

    public static void main(String[] args) {
       
//        Criar uma lista de alunos
          
        ArrayList<String> alunos = new ArrayList<>();
//        Adicionar alunos

        alunos.add("Anderson");
        alunos.add("Jose");
        alunos.add("Luis");
        alunos.add("Maria");
        
        
        System.out.println(alunos);
        System.out.println("Removendo o luis...");
//        Remover
        alunos.remove("Luis");
        
        System.out.println("\nLista atualizada");
        System.out.println(alunos);
        
        System.out.println("Adicionando o segundo aluno");
        alunos.add(1, "Jubileu");
        
        System.out.println("Lista atualizada");
        System.out.println(alunos);
        
        
        System.out.println("Atualizando o nome do Jubileu");
        alunos.set(1, "Jubileu da Silva");
        
        System.out.println("\nLista atualizada");
        System.out.println(alunos);
                
        System.out.println("\nVerificando a existencia do anderson");
        
        if (alunos.contains("Anderson")){
            System.out.println("O anderson ta aqui");
        } else{
            System.out.println("O anderson saiu");
        }
        
        System.out.println("\nApagando anderson");
        alunos.remove("Anderson");
        
        System.out.println("\nVerificando novamente a  existencia do anderson");
        
        if (alunos.contains("Anderson")){
            System.out.println("O anderson ta aqui");
        } else{
            System.out.println("O anderson saiu");
        }
        
        
//        System.out.println("Apagar todos");
//        alunos.clear();
        
        System.out.println("\nLista atualizada");
        System.out.println(alunos);
        
        System.out.println("\n--- Percorrendo um ArrayList---");
        
        int n = alunos.size();
        
        for (int i = 0; i < n; i++){
            System.out.println("\nAluno: " + alunos.get(i));
        
        }
        
        alunos.add("Priscila");
        
        System.out.println("\n--- Percorrendo um ArrayList---");
        
        
        for (int i = 0; i < alunos.size(); i++){
            System.out.println("\nAluno: " + alunos.get(i));
        
        }
        
        
        
    }
    
}
