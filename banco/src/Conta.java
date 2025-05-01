public class Conta {

    int conta;
    String dono;
    double saldo;
    double limite;

    // ... Outros atributos ... //

    //metodo sacar
    void sacar(double quantidade){

        //nova variavel
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }
}