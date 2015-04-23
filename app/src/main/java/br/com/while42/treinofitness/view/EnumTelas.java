package br.com.while42.treinofitness.view;

public enum EnumTelas {
    MeusTreinos(0),
    MeusExercicios(1);

    int posicaoTela;

    EnumTelas(int posicaoTela) {
        this.posicaoTela = posicaoTela;
    }

    public static EnumTelas get(int posicaoTela) {
        for(EnumTelas t : EnumTelas.values()) {
            if (t.posicaoTela == posicaoTela){
                return t;
            }
        }
        return EnumTelas.MeusTreinos;
    }
}
