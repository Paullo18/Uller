package br.com.unipac.uller.model.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by rogeriofontes on 8/25/15.
 */
public class Atividade implements Serializable {
    private Materia materia;
    private String tipoAtividade;
    private String descricao;
    private Date dataEntrega;
    private float valor;

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public String getTipoAtividade() {
        return tipoAtividade;
    }

    public void setTipoAtividade(String tipoAtividade) {
        this.tipoAtividade = tipoAtividade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
