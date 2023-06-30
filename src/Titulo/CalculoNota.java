package Titulo;

public class CalculoNota {

    int pontuacaoFinal = 0;

    public void setPontuacao(Titulo estrategia) {
        pontuacaoFinal += estrategia.calcularPonto();
    }
    public int getPontuacaoFinal(){
        return pontuacaoFinal;
    }
}
