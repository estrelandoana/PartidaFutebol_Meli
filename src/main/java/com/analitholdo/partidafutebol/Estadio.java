package com.analitholdo.partidafutebol;

import jakarta.persistence.*;

@Entity
public class Estadio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Não pode ser vazio.")
    private String nomeEstadio;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeEstadio() {
        return nomeEstadio;
    }
    public void setNomeEstadio(String nomeEstadio) {
        this.nomeEstadio = nomeEstadio;
    }
}
