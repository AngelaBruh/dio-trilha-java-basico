public class ExemploFor2 {
    
    public static void main(String[] args) {

        // For interagindo com arrays e coleções:

        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };
    
        for (int x=0; x<alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " é " + alunos[x]);
        }

        System.out.println("==========================================================");
    
        // Forma abreviada:
        String alunos2 [] =  {"FELIPE","JONAS","JULIA","MARCOS"};
	
        //Forma abreviada
        for(String aluno : alunos2) {
        System.out.println(aluno);
        }
    }
}
