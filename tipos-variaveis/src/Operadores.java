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

        System.out.println(concatenacao + " Finaliza aqui os exemplos de concatenação");


        int numero = 5;

        numero = - numero; // Operação de negação
        System.out.println(numero + " Operação de negação"); 

        numero = numero * -1; // Para conveter um numero negativo para positivo
        System.out.println(numero + "Convertendo para positivo");
       

        int num = 5;

        // x repetição
        num++; // Operador de incremento. É o mesmo que: num = num + 1;
        
        //Também pode fazer desta forma:
        System.out.println(++ num);

        System.out.println(num);
    }
}
