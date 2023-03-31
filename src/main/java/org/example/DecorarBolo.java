package org.example;

public abstract class DecorarBolo implements Produto {
    protected Produto produto;
    public DecorarBolo(Produto produto){
        this.produto = produto;
    }

    public String getDescricao(){
        return produto.getDescricao();
    }
    public double getCusto(){
        return produto.getCusto();
    }
}
