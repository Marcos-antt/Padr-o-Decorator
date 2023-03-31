package org.example;

public class TesteDecorarBolo {
    public static void main(String[]args){
        Produto bolo = new Bolo() {
            @Override
            public String getDescricao() {
                return getDescrica();
            }
        };
        System.out.println("Descricao " + bolo.getDescricao());
        System.out.println("Custo R$ "+ bolo.getCusto());

        Produto boloComRecheio = new Recheio(bolo);
        System.out.println("Descricao " + boloComRecheio.getDescricao());
        System.out.println("Custo R$ "+ boloComRecheio.getCusto());

        Produto boloComRecheioECobertura = new Cobertura(new Recheio(bolo));
        System.out.println("Descricao " + boloComRecheioECobertura.getDescricao());
        System.out.println("Custo R$ "+ boloComRecheioECobertura.getCusto());

    }
}

