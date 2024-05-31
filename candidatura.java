public class candidatura {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo seletivo");
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase= 2000.0;
        if (salarioBase > salarioPretendido){
            System.out.println("Ligue para o candidato");
        }else if (salarioBase == salarioPretendido)
            System.out.println("Outra proposta");
            else{
                System.out.println("aguardando resposta");
            }
                    }
                
}
