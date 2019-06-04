/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Fernando
 */
public class Estoque {
    
    private int idestoques;
    private String descricao;
    private int qtde;
    private double valor;

    public Estoque() {
    }

    public int getIdestoques() {
        return idestoques;
    }

    public void setIdestoques(int idestoques) {
        this.idestoques = idestoques;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
}
