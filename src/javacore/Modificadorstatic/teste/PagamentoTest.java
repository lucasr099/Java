package javacore.Modificadorstatic.teste;

import javacore.Modificadorstatic.dominio.Pagamento;

public class PagamentoTest {
    public static void main(String[] args) {
        Pagamento f1 = new Pagamento("Lucas", 2000);
        Pagamento f2 = new Pagamento("Tainan", 2900);
        Pagamento f3 = new Pagamento("Sandra", 4900);
        Pagamento f4 = new Pagamento("Luiz", 6980);
        Pagamento f5 = new Pagamento("REIs", 1518);
        Pagamento f6 = new Pagamento("Carmo", 1500);

        f1.imprimi();
        f2.imprimi();
        f3.imprimi();
        f4.imprimi();
        f5.imprimi();
        f6.imprimi();

    }
}
