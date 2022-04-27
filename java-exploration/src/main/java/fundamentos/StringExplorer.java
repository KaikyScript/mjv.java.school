package fundamentos;

public class StringExplorer {
    public static void main(String[] args) {
        StringExplorer.explorandoMetodosSplit();
    }
    //o split separa as palavras de uma string

    static void explorandoMetodosSplit() {

        String nomeCompleto = "KAIKY MOURA MORGADO";
        String [] palavras = nomeCompleto.split(" ");

        //como percorrer um array
        for(String palavra: palavras) {
            System.out.println(palavra);
        }
        /*
         * simulando a utilização do split no contexto
         * de um ticket de passagem aérea
         */
        String lastname = palavras[palavras.length-1];

        String firstname = palavras[0];

        System.out.println(lastname.concat(" ").concat(firstname));
    }
}
