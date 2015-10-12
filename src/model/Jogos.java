/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Higor
 */
public class Jogos {
    private String nome;
    private int ano;
    private String nota;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }
    
    
    public void setAno(int ano) {
       
        if (this.ano >= 1950 || this.ano <= 2200){
            this.ano = ano;
            
        } else {
            System.out.println("Ano Inválido");
        }
    }



    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

  
    
    
}
