package Titulo;

public class ExperienciaEnsino implements Titulo{

    private int pontuacao;
    private int notaMaxInstitutosFederais = 15;
    private int notaMaxEducacaoSuperior = 10;
    private int notaMaxEnsinoMedio = 10;


    public ExperienciaEnsino(int semestresInstitutosFederais, int semestresEducacaoSuperior, int semestresEnsinoMedio) {
        if(semestresInstitutosFederais > this.notaMaxInstitutosFederais ){
            pontuacao += notaMaxInstitutosFederais;
        }else {
            pontuacao += semestresInstitutosFederais;
        }

        if (semestresEducacaoSuperior > this.notaMaxEducacaoSuperior) {
            pontuacao += notaMaxEducacaoSuperior;
        }else{
            pontuacao += semestresEducacaoSuperior;
        }

        if (semestresEnsinoMedio > this.notaMaxEnsinoMedio) {
            pontuacao += notaMaxEnsinoMedio;
        }else{
            pontuacao += semestresEnsinoMedio;
        }
    }

    @Override
    public int calcularPonto() {
        return pontuacao;
    }
}
