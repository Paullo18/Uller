package br.com.unipac.uller.model.domain;

import java.io.Serializable;

/**
 * Created by rogeriofontes on 8/25/15.
 */
public class Materia implements Serializable {
    private Professor professor;
    private String descricao;

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "professor=" + professor +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
