package controlefluxo;

public class OperadorTernario {
    public static void main(String[] args) {
        OperadorTernario.OperadorTernarioSalario();
    }
    static void OperadorTernarioSalario() {

        double salario = 1500;
        // Operador Ternário
        double bonus = salario * (salario > 1500 ? 0.10 : 0.15);

        System.out.println("Parabéns você recebeu um bônus de salário este mês: " + bonus + " R$");

    }

}
