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
    }
}
