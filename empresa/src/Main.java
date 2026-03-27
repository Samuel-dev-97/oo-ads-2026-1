import java.util.Date;

public class Main {

    public static void main(String[] args) {
        //teste01();
        //teste02();
        teste03();
    }

    public static void teste01() {
        /* MANTENDO SEU HISTÓRICO ORIGINAL DE PESSOA E FUNCIONARIO
        Pessoa pessoa1 = new Pessoa(
            "Gervásio Gomes Garcia",
            54,
            "123.456.789-01",
            "gervasio.garcia@empresa.com.br",
            "(16) 98765-4321"
        );

        System.out.println(pessoa1.exibirDados());
        System.out.println("-".repeat(80));
        pessoa1.fazerAniversario();
        pessoa1.apresentar();
        System.out.println("-".repeat(80));

        Funcionario func1 = new Funcionario(
            "Veneranda Vieira",
            26,
            "987.654.321-09",
            "veneranda@empresa.com.br",
            "(36) 91234-5678",
            "F0123",
            "Assistente Financeiro",
            3500.00,
            "Gerência Financeira"
        );

        System.out.println(func1.exibirDados());
        System.out.println("-".repeat(80));

        Double salarioFinal = func1.calcularSalario();
        System.out.println("O salário final de Veneranda é R$ " + salarioFinal);
        */
    }

    public static void teste02() {
        // System.out.println("\nExecutando Teste 02...\n");
    }

    // contaBANCARIA
    public static void teste03() {
        System.out.println("\n" + "=".repeat(20) + " CONTAS  " + "=".repeat(20));

        /*
        ContaBancaria conta = new ContaBancaria("AJAX", 1120.0);
        conta.exibirSaldo();
        conta.depositar(209.0);
        conta.exibirSaldo();
        conta.sacar(575.0);
        conta.exibirSaldo();*/

        ContaBancaria c1 = new ContaBancaria("Assuel", 1000.0);
        ContaBancaria c2 = new ContaBancaria("Bruna", 500.0);
        ContaBancaria c3 = new ContaBancaria("Carlão", 50.0);

        // 2. Realizando saques e depósitos
        System.out.println("\n--- Movimentações ---");
        c1.depositar(250.0);
        c1.sacar(100.0);
        c2.sacar(600.0);
        c2.depositar(150.0);
        c3.depositar(1000.0);
        c3.sacar(200.0);

        // 3. Exibindo o saldo final
        c1.exibirSaldo();
        c2.exibirSaldo();
        c3.exibirSaldo();


        // --- TRÊS CONTAS ESPECIAIS ---

        // 1. contas especiais (Titular, Saldo Inicial, Limite)
        ContaEspecial ce1 = new ContaEspecial("Hobbes", 1000.0, 500.0);
        ContaEspecial ce2 = new ContaEspecial("Assis", 2000.0, 1000.0);
        ContaEspecial ce3 = new ContaEspecial("Nicolau", 500.0, 2000.0);

        // 2. Realizando saques e depósitos
        System.out.println("\n--- Movimentações (Especiais) ---");
        ce1.depositar(300.0);
        ce1.sacar(150.0);

        ce2.sacar(500.0);
        ce2.depositar(100.0);

        ce3.depositar(1000.0);
        ce3.sacar(200.0);

        // 3. Exibindo Saldos Real e com Limite
        System.out.println("\n--- Resultados Finais ---");

        System.out.println("[Conta 01]");
        ce1.exibirSaldoReal();
        ce1.exibirSaldo();

        System.out.println("\n[Conta 02]");
        ce2.exibirSaldoReal();
        ce2.exibirSaldo();

        System.out.println("\n[Conta 03]");
        ce3.exibirSaldoReal();
        ce3.exibirSaldo();
    }
}