package br.com.pedrohlopes.estabelecimento;

import br.com.pedrohlopes.EstiloMusical;
import br.com.pedrohlopes.ValidacaoCampos;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroEstabelecimento {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Estabelecimento> estabelecimentos = new ArrayList<>();

    public void start() {
        String nome = lerCampo("Nome: ");
        String cidade = lerCampo("Cidade: ");
        EstiloMusical estiloMusical = lerEstiloMusical();
        System.out.println("Máximo de 200 palavras");
        String descricao = lerCampo("Descreva o seu trabalho: ");
        String contato = lerCampo("Contato: ");

        estabelecimentos.add(new Estabelecimento(nome, cidade, estiloMusical, descricao, contato));
    }

    private String lerCampo (String mensagem) {
        while (true) {
            System.out.print(mensagem);
            String input = scanner.nextLine();

            if (!ValidacaoCampos.campoNaoVazio(input)) {
                System.out.println("Campo não pode ser vazio");
                continue;
            }

            return input;
        }
    }

    private EstiloMusical lerEstiloMusical () {
        while (true) {
            System.out.println("OPÇÕES: ROCK, SERTANEJO, POP, JAZZ, ELETRÔNICA");
            System.out.println("Estilo Musical: ");
            String input = scanner.nextLine();

            try {
                return EstiloMusical.valueOf(input.toUpperCase());
            } catch (IllegalArgumentException e) {
                System.out.println("Opção não existe");
            }
        }
    }
}

