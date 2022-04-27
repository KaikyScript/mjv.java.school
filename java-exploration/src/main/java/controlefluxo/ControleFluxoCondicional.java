package controlefluxo;

public class ControleFluxoCondicional {
    public static void main(String[] args) {
        ControleFluxoCondicional.simuladorCaixaEletronicoFluxoSimples(15.0, 7.0);
        ControleFluxoCondicional.simuladorCaixaEletronicoFluxoSimples(7.0,9.0);
    }
    static void simuladorCaixaEletronicoFluxoSimples(double saldo, double valorSolicitado) {

        if(valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
        }

        System.out.println(saldo);
        System.out.println("FIM");
    }
}
