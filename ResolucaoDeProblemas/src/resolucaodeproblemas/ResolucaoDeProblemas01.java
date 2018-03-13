/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucaodeproblemas;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Aluno
 */
public class ResolucaoDeProblemas01 {

    public static void main(String[] args) {

        ArrayList<String> Pessoa = new ArrayList <String> ();
        for (;;) {
            System.out.print("Digite sua Operacao:\n"
                    + "1 - Adicionar Cliente\n"
                    + "2 - Listar Clientes\n"
                    + "0 - Sair\n\n");
            Scanner p = new Scanner(System.in);
            int op = p.nextInt();
            switch(op){
                case 1:
                    System.out.println("Digite o nome:");
                    Scanner e = new Scanner(System.in);
                    Pessoa.add(e.nextLine());
                    System.out.println("\n");
                    continue;
                case 2:
                    for (int i = 0; i < Pessoa.size(); i++) {
                        System.out.println(Pessoa.get(i));
                    }
                    System.out.println("\n");
                    continue;
                case 0:
                    System.exit(0);
                default:
                    continue;
            }            
        }
    }
}
