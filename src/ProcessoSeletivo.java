import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String candidatos[] = {"Felipe","Marcia","Julia","Paulo","Augusto"};
        for (String candidato : candidatos) {
            entrandoEmContado(candidato);
        }

    }

    static void entrandoEmContado(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentado = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            continuarTentado = !atendeu;
            if(continuarTentado)
            tentativasRealizadas++;
            else
            System.out.println("CONTATO REALIZADO COM SUCESSO!");

        } while (continuarTentado && tentativasRealizadas < 3);

        if (atendeu)
        System.out.println("Conseguimos contato com "+ candidato + " na "+ tentativasRealizadas + " tentativa!");
        else
        System.out.println("Não conseguimos contato com " + candidato + " , numero maximo de tentativas " + tentativasRealizadas);
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprirSelecionados(){
        String candidatos[] = {"Felipe","Marcia","Julia","Paulo","Augusto"};
        
        System.out.println("Imprimindo candidatos informando o indice do elemento");

        for(int indice =0; indice < candidatos.length; indice++){
            System.out.println("O  candidato de n° " + (indice+1) + " é o " + candidatos[indice] );
        }

        System.out.println("Forma abreviada usando FOR each");
        for (String candidato : candidatos) {
            System.out.println(" O candidato selecionado foi "+ candidato);
            
        }

    }

    static void selecaoCandidato(){
        String candidatos[] = {"Felipe","Marcia","Julia","Paulo","Augusto","Monica","Fabricio","Mirela","Daniel","Jorge"};
    
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretedido();
            System.out.println("O candidato " + candidato + " Solicitou este valor de salario" + salarioPretendido);

            if (salarioBase >= salarioPretendido){
                System.out.println("O candidato "+ candidato + " Foi selecionado para a vaga!");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretedido() {
        return ThreadLocalRandom.current().nextDouble(1200.0, 2200.0);
    }


static void analizarCandidato(double salarioPretendido){
    double salarioBase = 2000.0;
    if(salarioBase > salarioPretendido) {
        System.out.println("LIGAR PARA O CANDIDATO!");
    }else if(salarioBase == salarioPretendido){
        System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA!");
    }else{
        System.out.println("SALARIO PRETENDIDO MAIOR QUE O BASE!");;
    }
}

}
