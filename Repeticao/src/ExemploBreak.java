// Break significa quebrar, parar, frear, interromper. E é isso que se faz quando o Java encontra esse comando pela frente.
// Continue, como o nome diz, ele 'continua' o laço. O comando break interrompe o laço, já o continue interrompe somente a iteração atual.

public class ExemploBreak {
    public static void main(String[] args) {
	
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                break;
            
            System.out.println(numero);
            
        }
        //Qual a saída no console ? 2, foi interrompido no 3    

        // Exemplo de continue:
        for(int numero = 1; numero <=5; numero ++){
            if(numero==3)
                continue;
            
            System.out.println(numero);
            
        }
        //Qual a saída no console ? Não imprimiu o 3 mas continuou a execução
    }        
}
