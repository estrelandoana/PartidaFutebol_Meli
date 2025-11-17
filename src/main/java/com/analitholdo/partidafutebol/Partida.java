package com.analitholdo.partidafutebol;

import com.analitholdo.partidafutebol.Clube;
import com.analitholdo.partidafutebol.Estadio;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Partida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Clube mandante;
    @ManyToOne
    private Clube visitante;
    @ManyToOne
    private Estatio estadio;
    private String resultado;
    private LocalDateTime dataHora;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Club getMandante() {
        return mandante;
    }
    public void setMandante(Club mandante) {
        this.mandante = mandante;
    }

    public Club getVisitante() {
        return visitante;
    }
    public void setVisitante(Club visitante) {
        this.visitante = visitante;
    }

    public Estatio getEstadio() {
        return estadio;
    }
    public void setEstadio(Estatio estadio) {
        this.estadio = estadio;
    }

    public String getResultado() {
        return resultado;
    }
    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }
    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
}
