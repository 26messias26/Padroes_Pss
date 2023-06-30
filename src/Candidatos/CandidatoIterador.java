package Candidatos;

import model.Candidato;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class CandidatoIterador implements Iterator<Candidato> {

    private List<Candidato> candidatos;
    private int candidatoAtual;

    public CandidatoIterador(List<Candidato> candidatos) {
        this.candidatos = new ArrayList<>(candidatos);
        this.candidatos.sort(Comparator.comparingInt(Candidato::getPontuacaoFinal).reversed());
        this.candidatoAtual = 0;
    }


    @Override
    public boolean hasNext() {

        return candidatoAtual < candidatos.size();
    }

    @Override
    public Candidato next() {
        Candidato candidato = candidatos.get(candidatoAtual);
        candidatoAtual++;
        return candidato;
    }
}
