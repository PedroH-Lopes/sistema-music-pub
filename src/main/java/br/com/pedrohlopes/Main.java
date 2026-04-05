package br.com.pedrohlopes;

import br.com.pedrohlopes.estabelecimento.CadastroEstabelecimento;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class MainProgram {
    static void main(String[] args) {
        CadastroEstabelecimento cadastroEstabelecimento = new CadastroEstabelecimento();

        cadastroEstabelecimento.start();
    }
}



