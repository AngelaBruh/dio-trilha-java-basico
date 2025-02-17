/*
    Estrutura do controle de fluxo for

    for (bloco de inicialização; expressão booleana de validação; bloco de atualização)
    {   
     // comando que será executado até que a 
     // expressão de validação torne-se falsa 
    } 
 */

public class ExemploFor {
    public static void main(String[] args) {

        // Estrutura 1:
		for(int carneirinhos = 1 ; carneirinhos <=20; carneirinhos ++) {
			System.out.println(carneirinhos + " - Carneirinho(s)");
		}

        System.out.println("Joãozinho dormiu");


        /*
          Estrutura 2:
          int carneirinhos = 1;
            for( ; carneirinhos <=20; ) {
            System.out.println(carneirinhos + " - Carneirinho(s)");
            carneirinhos ++;
        }
         */
	}
}
