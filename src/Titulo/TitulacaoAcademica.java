package Titulo;

public class TitulacaoAcademica implements Titulo{

    private int doutor = 25;
    private int mestre = 18;
    private int especialista = 10;

    private int pontuacao;

    public TitulacaoAcademica(String titulo){
        if (titulo.equals("doutor")) {
            pontuacao = doutor;
        } else if (titulo.equals("mestre")) {
            pontuacao = mestre;
        } else if (titulo.equals("especialista")) {
            pontuacao = especialista;
        }
    }
    @Override
    public int calcularPonto() {
        return pontuacao;
    }


}
