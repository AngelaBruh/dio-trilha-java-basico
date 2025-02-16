public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "Linguagem" + "Java"; // String concatenação
        System.out.println(nomeCompleto);

        String concatenacao = "?";
        
        concatenacao = 1 + 1 + 1 + "1"; // Começou com uma operação e ao final juntou com a string

        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1; // Foi visto que tem um argumento de texto entre eles, deixou realizar 
                                        //uma operação e considerou uma como uma concatenação

        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1"; // Novamente encontra-se strings entre as operações,
                                          // sendo assim feita uma concatenação

        System.out.println(concatenacao);

        concatenacao = "1" + 1 + 1 + 1; // Começou com string realizando a concatenação

        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1); // Evidência, primeiramente realizou a operação entre parenteses,
                                         // pegou o resultado e juntou com a string

        System.out.println(concatenacao);

        System.out.println("===========================================================================");


        int numero = 5;

        numero = - numero; // Operação de negação
        System.out.println(numero + " Operação de negação"); 

        numero = numero * -1; // Para conveter um numero negativo para positivo
        System.out.println(numero + " Convertendo para positivo");
       

        int num = 5;

        // x repetição
        num++; // Operador de incremento. É o mesmo que: num = num + 1;
        
        //Também pode fazer desta forma:
        System.out.println(++ num);

        //Para decrementar:
        System.out.println(num --);

        System.out.println(num);

        // Negar um expressão booleana:
        boolean variavel = true;
        System.out.println(!variavel); // Aqui a negação será momentanea

        // Para modificar definitivamente:
        variavel = !variavel;
        System.out.println(variavel);

        System.out.println("==========================================================================");

        // Operação Ternário
        int a, b;
        a = 5;
        b = 6;
        
        String resultado = a==b ?"verdadeiro" : "falso"; // Uma alternativa do if e else       
        // Aqui é uma expressão booleana

        System.out.println(resultado);

        System.out.println("=====================================================================");


        /*Operadores relacionais:
         * == verificar se é igual
         * != verificar se é diferente
         * > verificar se é maior
         * >= verificar se é maior ou igual
         * < verificar se é menor
         * <= verificar se é igual ou menor
        */

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 < numero2) {
            System.out.println("a nossa condição é verdadeira");
        }

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numeroUm é diferente de numeroDois? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("numeroUm é maior que numeroDois? " + simNao);

        System.out.println("===========================================================");
    }
}
