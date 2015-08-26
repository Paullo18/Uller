package br.com.unipac.uller.model.domain;

/**
 * Created by rogeriofontes on 8/25/15.
 */
public enum TipoAtividade {
    A2("Prova A2"),
    A3("Prova A3"),
    SEMINARIO("SEMINARIO"),
    TRABALHO("TRABALHO");

    private String tipoAtividade;

    private TipoAtividade(String tipoAtividade) {
        this.tipoAtividade = tipoAtividade;
    }

    public String getTipoAtividade() {
        return tipoAtividade;
    }

    public void setTipoAtividade(String tipoAtividade) {
        this.tipoAtividade = tipoAtividade;
    }
}
