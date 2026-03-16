package org.example;

import org.example.tabelahash.TabelaHash;

public class Main {
    public static void main(String[] args) {
        System.out.println("ADICIONANDO CANTORES.");

        TabelaHash tabela = new TabelaHash(13);

        tabela.inserir("Roberto Carlos", "Cantor");
        tabela.inserir("Caetano Veloso", "Cantor");
        tabela.inserir("Gilberto Gil", "Cantor");
        tabela.inserir("Chico Buarque", "Cantor");

        tabela.inserir("Milton Nascimento", "Cantor");
        tabela.inserir("Jorge Ben Jor", "Cantor");
        tabela.inserir("Tim Maia", "Cantor");

        tabela.inserir("Seu Jorge", "Cantor");
        tabela.inserir("Djavan", "Cantor");
        tabela.inserir("Roberto Carlos", "Cantor");

        tabela.mostrarTabela();

        System.out.println("\n=== BUSCAS ===");
        System.out.println(tabela.buscar("Gilberto Gil"));
        System.out.println(tabela.buscar("Roberto Carlos"));
        System.out.println(tabela.buscar("Ney Matogrosso"));
        System.out.println(tabela.buscar("Djavan"));
    }
}
