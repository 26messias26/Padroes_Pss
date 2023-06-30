package Titulo;

public class ExperienciaGestaoAcademica implements Titulo{

    private int notaMaxCargoDirecao = 15;
    private int notaMaxCordenacaoCurso = 10;
    private int pontuacao = 0;

    public ExperienciaGestaoAcademica(int semestresCargoDirecao, int semestresCoordenacaoCurso) {

        if(semestresCargoDirecao > this.notaMaxCargoDirecao ){
            this.pontuacao += notaMaxCargoDirecao;
        }else {
            this.pontuacao += semestresCargoDirecao;
        }

        if (semestresCoordenacaoCurso > this.notaMaxCordenacaoCurso) {
            this.pontuacao += notaMaxCargoDirecao;
        }else{
            this.pontuacao += semestresCoordenacaoCurso;
        }


        pontuacao = (semestresCargoDirecao + semestresCoordenacaoCurso);
    }

    @Override
    public int calcularPonto() {
        return pontuacao;
    }
}
