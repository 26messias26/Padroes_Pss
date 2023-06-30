package Candidatos;

import model.Candidato;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Candidatos implements Iterable<Candidato>{

    private List<Candidato> candidatos;

    public Candidatos(){
        candidatos = new ArrayList<>();
    }

    public int size() {
        return candidatos.size();
    }
    public void adicionarCandidato(Candidato candidato) {
        candidatos.add(candidato);
    }
    public Iterator<Candidato> iterator() {
        return new CandidatoIterador(candidatos);
    }
}
