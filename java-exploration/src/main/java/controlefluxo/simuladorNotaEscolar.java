package controlefluxo;

public class simuladorNotaEscolar {
    public static void main(String[] args) {

        simuladorNotaEscolar.simuladorNotaEscolarComposto(8.0); // Colocar a nota dentro do ()
    }
    static void simuladorNotaEscolarComposto(double nota) {

        if (nota >= 7)
            System.out.println("Aprovado");
        else if (nota >= 5 && nota < 7)
            System.out.println("Recuperação");
        else
            System.out.println("Reprovado");
    }
}

