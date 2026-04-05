package br.com.pedrohlopes.estabelecimento;

import br.com.pedrohlopes.EstiloMusical;

public class Estabelecimento {
    private int id;
    private String nome;
    private String cidade;
    private EstiloMusical estiloMusical;
    private String descricao;
    private String contato;
    private boolean disponivel;

    public Estabelecimento(String name, String cidade, EstiloMusical estiloMusical,
                           String descricao, String contato) {
        this.nome = name;
        this.cidade = cidade;
        this.estiloMusical = estiloMusical;
        this.descricao = descricao;
        this.contato = contato;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstiloMusical(EstiloMusical estiloMusical) {
        this.estiloMusical = estiloMusical;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public EstiloMusical getEstiloMusical() {
        return estiloMusical;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getContato() {
        return contato;
    }

    public boolean isDisponivel() {
        return disponivel;
    }
}
