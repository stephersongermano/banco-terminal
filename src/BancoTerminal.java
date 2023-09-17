public class BancoTerminal {
    public static void main(String[] args) {
        double saldo, valorSolicitado;

        saldo = 15;
        valorSolicitado = 22;

        if (saldo > valorSolicitado) {
            saldo = saldo - valorSolicitado;
            System.out.println("Valor do saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente \nSaldo : " + saldo);
        }

    }
}
