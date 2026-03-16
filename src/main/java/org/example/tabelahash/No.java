package org.example.tabelahash;

public class No {
    private final String nome;
    private final String profissao;
    private No proximo;

    public No(String nome, String profissao) {
        this.nome = nome;
        this.profissao = profissao;
    }

    public String getNome() {
        return nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
}
