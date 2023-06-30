import Candidatos.Candidatos;
import Titulo.*;
import model.Candidato;

import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Candidatos candidatos = new Candidatos();
        int vagas;
        // INICIALIZANDO SISTEMA
        Scanner input = new Scanner(System.in);
        System.out.println("Iniciando sistema...");
        System.out.println("Carregando titulos...");

        System.out.println("Quantidade de vagas:");
//        QUANTIDADE DE VAGAS
        vagas = input.nextInt();

        System.out.println("O PSS (Processo seletivo simplificado) tera "+vagas+" vagas.");

        System.out.println("Deseja realizar uma apresentão automatica? (S/N)");

        String automatica = input.next().toLowerCase();

        if(automatica.equals("s")){

        // SIM
        System.out.println("Quantidade de vagas: 4");
        System.out.println("\n--==## TITULOS CONSIDERADOS ##==--\n ");
        System.out.println("TITULAÇÃO ACADEMICA:\n");
        System.out.println("Doutor <MAX - 25> \nMestre <MAX - 18> \nEspecialista <MAX - 10>");

        System.out.println("\nEXPERIÊNCAI DE ENSINO:");
        System.out.println("\nInstituto Federal <MAX - 12> \nEducação Superior <MAX - 7> \nEnsino médio <MAX - 6>");

        System.out.println("\nEXPERIENCIA DE GESTÃO ACADÊMICA:");
        System.out.println("\nDireção <MAX - 15> \nCoordeneção de curso <MAX - 10>");

        // CADASTRANDO CANDIDATOS

        System.out.println("\n--==## Cadastro de candidatos ##==--\n ");

        // -------  CANDIATO 1

        Candidato candidato = new Candidato("pedro pedra","6481265413", 80);

        // TITULAÇÃO

        CalculoNota calculoNota = new CalculoNota();
        Titulo titulacao = new TitulacaoAcademica("mestre");
        calculoNota.setPontuacao(titulacao);

        Titulo experienciaEnsino = new ExperienciaEnsino(2,5,1);
        calculoNota.setPontuacao(experienciaEnsino);

        Titulo experienciaGestao = new ExperienciaGestaoAcademica(2,4);
        calculoNota.setPontuacao(experienciaGestao);

        candidato.setPontuacaoFinal(calculoNota.getPontuacaoFinal());

        candidatos.adicionarCandidato(candidato);



        // --------  CANDIATO 2

        calculoNota = new CalculoNota();
        Candidato candidato2 = new Candidato("Vitoria Pereira","6481265413", 90);
        CalculoNota calculoNota2 = new CalculoNota();
        Titulo titulacao2 = new TitulacaoAcademica("doutor");
        calculoNota2.setPontuacao(titulacao2);

        Titulo experienciaEnsino2 = new ExperienciaEnsino(4,2,1);
        calculoNota2.setPontuacao(experienciaEnsino2);

        Titulo experienciaGestao2 = new ExperienciaGestaoAcademica(4,1);
        calculoNota2.setPontuacao(experienciaGestao2);

        candidato2.setPontuacaoFinal(calculoNota2.getPontuacaoFinal());

        candidatos.adicionarCandidato(candidato2);

        // ---------- CANDIATO 3

        Candidato candidato3 = new Candidato("Vitor lins","6481265413", 70);
        CalculoNota calculoNota3 = new CalculoNota();
        Titulo titulacao3 = new TitulacaoAcademica("especialista");
        calculoNota3.setPontuacao(titulacao3);

        Titulo experienciaEnsino3 = new ExperienciaEnsino(1,2,2);
        calculoNota3.setPontuacao(experienciaEnsino3);

        Titulo experienciaGestao3 = new ExperienciaGestaoAcademica(1,1);
        calculoNota3.setPontuacao(experienciaGestao3);

        candidato3.setPontuacaoFinal(calculoNota3.getPontuacaoFinal());

        candidatos.adicionarCandidato(candidato3);

        // ---------- CANDIATO 4

        Candidato candidato4 = new Candidato("Maria lins","6481265413", 78);
        CalculoNota calculoNota4 = new CalculoNota();
        Titulo titulacao4 = new TitulacaoAcademica("doutor");
        calculoNota4.setPontuacao(titulacao4);

        Titulo experienciaEnsino4 = new ExperienciaEnsino(1,2,2);
        calculoNota4.setPontuacao(experienciaEnsino4);

        Titulo experienciaGestao4 = new ExperienciaGestaoAcademica(1,1);
        calculoNota4.setPontuacao(experienciaGestao4);

        candidato4.setPontuacaoFinal(calculoNota4.getPontuacaoFinal());

        candidatos.adicionarCandidato(candidato4);

        // ---------- CANDIATO 3

        Candidato candidato5 = new Candidato("Flavio lins","6581265513", 86);
        CalculoNota calculoNota5 = new CalculoNota();
        Titulo titulacao5 = new TitulacaoAcademica("mestre");
        calculoNota5.setPontuacao(titulacao5);

        Titulo experienciaEnsino5 = new ExperienciaEnsino(5,3,1);
        calculoNota5.setPontuacao(experienciaEnsino5);

        Titulo experienciaGestao5 = new ExperienciaGestaoAcademica(7,2);
        calculoNota5.setPontuacao(experienciaGestao5);

        candidato5.setPontuacaoFinal(calculoNota5.getPontuacaoFinal());

        candidatos.adicionarCandidato(candidato5);

        // ---------- CANDIATO 3

        Candidato candidato6 = new Candidato("Flavia Menezes","65771265416", 73);
        CalculoNota calculoNota6 = new CalculoNota();
        Titulo titulacao6 = new TitulacaoAcademica("especialista");
        calculoNota6.setPontuacao(titulacao6);

        Titulo experienciaEnsino6 = new ExperienciaEnsino(3,1,3);
        calculoNota6.setPontuacao(experienciaEnsino6);

        Titulo experienciaGestao6 = new ExperienciaGestaoAcademica(4,2);
        calculoNota6.setPontuacao(experienciaGestao6);

        candidato6.setPontuacaoFinal(calculoNota6.getPontuacaoFinal());

        candidatos.adicionarCandidato(candidato6);

        System.out.println("Cadastrando candidatos...");

        System.out.println("Cadastro encerrado.");

        System.out.println("Cadastrando "+ candidatos.size() + " candidatos:");

        System.out.println("Calculando notas...");



        System.out.println("\n--==## LISTA DE CLASSIFIÇÃO ##==--\n ");

        Iterator iterador = candidatos.iterator();

        while (iterador.hasNext()){

            Candidato can = (Candidato) iterador.next();


            if(vagas > 0){
                System.out.println(can.getNome() + ": " + can.getPontuacaoFinal()+ " pontos [APROVADO]");
                vagas--;

            }else{
                System.out.println(can.getNome() + ": " + can.getPontuacaoFinal() + " pontos [REPROVADO]");
            }

        }

        return;

        }

        if(automatica.equals("n")){

            // NÃO
            System.out.println("Quantidade de vagas: 4");
            System.out.println("\n--==## TITULOS CONSIDERADOS ##==--\n ");
            System.out.println("TITULAÇÃO ACADEMICA:\n");
            System.out.println("Doutor <MAX - 25> \nMestre <MAX - 18> \nEspecialista <MAX - 10>");

            System.out.println("\nEXPERIÊNCAI DE ENSINO:");
            System.out.println("\nInstituto Federal <MAX - 12> \nEducação Superior <MAX - 7> \nEnsino médio <MAX - 6>");

            System.out.println("\nEXPERIENCIA DE GESTÃO ACADÊMICA:");
            System.out.println("\nDireção <MAX - 15> \nCoordeneção de curso <MAX - 10>");

            // CADASTRANDO CANDIDATOS

            System.out.println("\n--==## Cadastro de candidatos ##==--\n ");

            String continuar = "s";
            while(continuar == "s"){
                System.out.println("Nome do candidato:");
                String nome = input.next();
                System.out.println("RG:");
                String rg = input.next();
                System.out.println("Nota da prova de desempenho academico:");
                int desempenhoAcademico = input.nextInt();

                Candidato candidato = new Candidato(nome,rg,desempenhoAcademico);

                CalculoNota calculoNota = new CalculoNota();

                System.out.println("Titulação (doutro, mestre ou especialista):");

                String titulo = input.next();

                Titulo titulacao = new TitulacaoAcademica(titulo);
                calculoNota.setPontuacao(titulacao);

                System.out.println("Expericia de ensino em instutos federais:");
                int instFederais = input.nextInt();

                System.out.println("Expericia de ensino em educação superior:");
                int eduSuperior = input.nextInt();

                System.out.println("Expericia de ensino em educação medio:");
                int eduMedio = input.nextInt();

                Titulo experienciaEnsino = new ExperienciaEnsino(instFederais,eduSuperior,eduMedio);
                calculoNota.setPontuacao(experienciaEnsino);

                //  GESTÃO ACADEMICA
                System.out.println("Expericia Cargo de direção:");
                int direcao = input.nextInt();

                System.out.println("Expericia coordenação de curso:");
                int coorCurso = input.nextInt();

                Titulo experienciaGestao = new ExperienciaGestaoAcademica(direcao,coorCurso);
                calculoNota.setPontuacao(experienciaGestao);

                candidato.setPontuacaoFinal(calculoNota.getPontuacaoFinal());

                candidatos.adicionarCandidato(candidato);

                System.out.println("Cadastrar novo candidato? (s/n)");
                continuar = input.next();

            }

            System.out.println("Cadastro encerrado.");

            System.out.println("Calculando notas...");

            System.out.println("\n--==## LISTA DE CLASSIFIÇÃO ##==--\n ");

            Iterator iterador = candidatos.iterator();

            while (iterador.hasNext()){

                Candidato can = (Candidato) iterador.next();


                if(vagas > 0){
                    System.out.println(can.getNome() + ": " + can.getPontuacaoFinal() + " pontos [APROVADO]");
                    vagas--;

                }else{
                    System.out.println(can.getNome() + ": " + can.getPontuacaoFinal() + " pontos [REPROVADO]");
                }

            }

        }

    }
}
