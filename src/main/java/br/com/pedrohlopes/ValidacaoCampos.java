package br.com.pedrohlopes;

public class ValidacaoCampos {
    public static boolean campoNaoVazio (String campo) {
        return campo != null && !campo.trim().isEmpty();
    }
}
