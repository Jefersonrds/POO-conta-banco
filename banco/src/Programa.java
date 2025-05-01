public class Programa {
    public static void main(String[] args) {
        
        Conta minhaConta;
        minhaConta = new Conta();

        minhaConta.dono = "Jeffonego";
        minhaConta.saldo = 1000.0;

        System.out.println("Voce tem "+minhaConta.saldo+" lulitas.");

    }
}
