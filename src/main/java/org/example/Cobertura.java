package org.example;

public class Cobertura extends DecorarBolo {
    public Cobertura(Produto produto){
        super(produto);
    }
    public String getDescricao(){
        return produto.getDescricao() + ",cobertura de Menta ";

    }
    public double getCusto(){
        return produto.getCusto() + 20.00;
    }
}
