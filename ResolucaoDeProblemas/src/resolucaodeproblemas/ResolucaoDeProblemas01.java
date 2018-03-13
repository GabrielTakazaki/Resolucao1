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
        Scanner e = new Scanner(System.in);
        ArrayList<String> Pessoa = new ArrayList <String> ();
        for (;;) {
            System.out.print("Digite sua Operacao:\n-1 Adicionar Cliente\n-2 Listar Clientes");
     
            Pessoa.add (e.nextLine());
            for (int i = 0; i < Pessoa.size(); i++) {
                System.out.println(Pessoa.get(i));
            }
        }
    }
}
