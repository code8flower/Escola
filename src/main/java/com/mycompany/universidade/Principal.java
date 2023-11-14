/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.universidade;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) throws SQLException {
        int ra_aluno, telefone_aluno, Id_aluno;
         Aluno aluno =  new Aluno();
        String nome_aluno;
        String menu = "1-Cadastrar\n 2-Atualizar\n 3-Apagar\n 4-Listar\n 0-sair";
        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcao) {
                case 1:
                    ra_aluno = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ra"));
                    telefone_aluno = Integer.parseInt(JOptionPane.showInputDialog("Digite seu telefone"));
                   nome_aluno = JOptionPane.showInputDialog("Digite seu nome");
                   
                    aluno.setRa_aluno(ra_aluno);
                    aluno.setTelefone_aluno(telefone_aluno);
                    aluno.setNome_aluno(nome_aluno);
                    aluno.inserir();
                    break;
                case 2:
               ra_aluno = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ra"));
                     telefone_aluno = Integer.parseInt(JOptionPane.showInputDialog("Digite seu telefone"));
                    nome_aluno = JOptionPane.showInputDialog("Digite seu nome");
                    Aluno aluno1 =  new Aluno();
                    aluno1.setRa_aluno(ra_aluno);
                    aluno1.setTelefone_aluno(telefone_aluno);
                    aluno1.setNome_aluno(nome_aluno);
                    aluno1.atualizar();
                    break;
                case 3:
                     Id_aluno = Integer.parseInt(JOptionPane.showInputDialog("Digite o RA do aluno")); 
                     aluno.setId_aluno(Id_aluno); 
                     aluno.apagar(); 
                     
                    break;
                case 4:
                    aluno.listar();
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        } while (opcao != 0);
    }

}