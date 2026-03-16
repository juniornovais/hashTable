package org.example.tabelahash;

import java.util.Objects;

public class TabelaHash {
    private final int tamanho;
    private final No[] tabela;

    public TabelaHash(int tamanho) {
        this.tamanho = Math.max(1, tamanho);
        this.tabela = new No[this.tamanho];
    }

    public TabelaHash() {
        this(13);
    }

    private int funcaoHash(String nome) {
        int soma = 0;
        for (char letra : nome.toCharArray()) {
            soma += letra;
        }
        return soma % tamanho;
    }

    public void inserir(String nome, String profissao) {
        int indice = funcaoHash(nome);
        if (tabela[indice] == null) {
            tabela[indice] = new No(nome, profissao);
            System.out.printf("Inserido %s no índice %d%n", nome, indice);
            return;
        }

        No atual = tabela[indice];
        while (atual != null) {
            if (Objects.equals(atual.getNome(), nome)) {
                System.out.printf("%s já existe!%n", nome);
                return;
            }
            if (atual.getProximo() == null) {
                break;
            }
            atual = atual.getProximo();
        }

        atual.setProximo(new No(nome, profissao));
        System.out.printf("Colisão! %s adicionado na lista do índice %d%n", nome, indice);
    }

    public String buscar(String nome) {
        int indice = funcaoHash(nome);
        No atual = tabela[indice];
        while (atual != null) {
            if (Objects.equals(atual.getNome(), nome)) {
                return String.format("%s - %s", atual.getNome(), atual.getProfissao());
            }
            atual = atual.getProximo();
        }
        return "Não encontrado";
    }

    public void mostrarTabela() {
        System.out.println("\n=== TABELA HASH ===");
        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Índice %d: ", i);
            No atual = tabela[i];
            if (atual == null) {
                System.out.println("vazio");
                continue;
            }
            while (atual != null) {
                System.out.printf("%s (%s) -> ", atual.getNome(), atual.getProfissao());
                atual = atual.getProximo();
            }
            System.out.println("None");
        }
    }
}
