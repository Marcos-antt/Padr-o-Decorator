package org.example;

public class Recheio extends DecorarBolo {
    public Recheio(Produto produto){
        super(produto);
    }
    public String getDescricao(){
        return produto.getDescricao() + ",recheio de Morango ";

    }
    public double getCusto(){
        return produto.getCusto() + 10.00;
    }
}
