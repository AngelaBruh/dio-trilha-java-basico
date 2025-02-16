import java.util.Date;

public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500.33;
        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; // se o cep começa com zero utilize outro tipo
        long cpf = 98765432109L; // se o cpf começa com zero, utilize outro tipo
        float pi = 3.14F; // o tipo float necessita do F ou f no final, é a mesma coisa para o tipo long



        String nome = "Bruna";
        int idades = 22;
        double peso = 68.5;
        char sexo = 'F';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date(); // Tem que realizar um importe

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        final double VALOR_DE_PI = 3.14; // Constante, uma variavel que não pode ser alterada, e seu nome deve ser escrita em caixa alta
        System.out.println(VALOR_DE_PI);

        String meuNome = "Bruna";
        System.out.println(meuNome);
    }
}
