package model;
public class Candidato {
    private String nome;
    private String rg;
    private int notaDesempenho;
    private int pontuacaoFinal;

    public Candidato(String nome, String rg, int notaDesempenho){
        this.nome = nome;
        this.rg = rg;
        this.notaDesempenho = notaDesempenho;
    }
    public String getNome() {
        return nome;
    }

    public String getRg() {
        return rg;
    }

    public int getNotaDesempenho() {
        return notaDesempenho;
    }

    public int getPontuacaoFinal() {
        return pontuacaoFinal;
    }

    public void setPontuacaoFinal(int pontuacaoFinal) {
        this.pontuacaoFinal = pontuacaoFinal + this.notaDesempenho;
    }
}
