import java.util.ArrayList;

public class Tarefa {

        private String descricao;
        private boolean concluida;

        public Tarefa(String descricao, boolean concluida){
            this.descricao = descricao;
            this.concluida = concluida;
        }

        public void exibeTarefas(){
            System.out.printf("Tarefa: %s%n", descricao);
            if (this.concluida == true){
                System.out.println("Status: Concluído\n");
            } else {
                System.out.println("Status: Pendente\n");
            }
        }

        public void exibeTarefasV2(ArrayList<Tarefa> Lista){
            for (Tarefa t : Lista) {
                System.out.println("Tarefa: " + t.descricao);
                if (t.concluida == true){
                    System.out.println("Status: Concluído\n");
                } else {
                    System.out.println("Status: Pendente\n");
                }
            }
        }

        public void atualizaStatus(boolean novoStatus){
            this.concluida = novoStatus;
        }
}

