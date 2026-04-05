package br.com.pedrohlopes;

public class Artista {
    private int id;
    private int nome;
    private String estiloMusical;
    private String cidade;
    private String linkMidia;

    public Artista(int id, int nome, String estiloMusical, String cidade, String linkMidia) {
        this.id = id;
        this.nome = nome;
        this.estiloMusical = estiloMusical;
        this.cidade = cidade;
        this.linkMidia = linkMidia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNome() {
        return nome;
    }

    public void setNome(int nome) {
        this.nome = nome;
    }

    public String getEstiloMusical() {
        return estiloMusical;
    }

    public void setEstiloMusical(String estiloMusical) {
        this.estiloMusical = estiloMusical;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getLinkMidia() {
        return linkMidia;
    }

    public void setLinkMidia(String linkMidia) {
        this.linkMidia = linkMidia;
    }
}
