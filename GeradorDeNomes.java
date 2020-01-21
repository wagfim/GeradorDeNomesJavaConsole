import java.util.Random;
/**
 * @author Wagner Bonfim <github.com/wagfim>
 */
public class GeradorDeNomes {
    public static void main(String[] args) {
        
        String[] nomes = {"Maria", "João", "Thiago", "Cleber", "Marcos", "Pedro", "Carlos", "Osmar", "Messias", "Wagner", "Fabio", "William", "Jéssica", "Pietra", "Paola", "Luana", "Bruna", "Ana", "Thaís", "Isabela", "Lula"};
        String[] sobrenomes = {"da Silva", "de Souza", "Soares", "Bonfim", "Pereira", "Costa", "Inácio", "Bolsonaro"};         
        
        System.out.println("Gerando nomes:");
        for(int i = 0; i < 10; i++) {   
            gerarNome(nomes, sobrenomes);
        } 
    }
    
    public static void gerarNome(String[] nomes, String[] sobrenomes){
        Random gerador = new Random();
        
        int numNome = gerador.nextInt(nomes.length);
        int numSobrenome = gerador.nextInt(sobrenomes.length);
        
        String nomeSorteado = nomes[numNome] + " " + sobrenomes[numSobrenome];
        System.out.println("Nome gerado: " + nomeSorteado);
    }
}
