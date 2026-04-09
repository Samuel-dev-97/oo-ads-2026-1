public class Estudante extends Pessoa {

    // Atributos
    public String curso;
    public Double nota1 = 0.0;
    public Double nota2 = 0.0;

    // Construtor
    public Estudante(String nome, Integer idade, String cpf, String email, String telefone, String curso) {
        super(nome, idade, cpf, email, telefone);
        this.curso = curso;
    }

    // Método para calcular média
    public Double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    // Método para verificar situação
    public String verificarSituacao() {
        if (calcularMedia() >= 6.0) {
            return "APROVADO";
        } else {
            return "REPROVADO";
        }
    }

    // Sobrescrita do método exibirDados
    @Override
    public String exibirDados() {
        return super.exibirDados() +
                "\nCurso: " + this.curso +
                "\nNota 1: " + this.nota1 +
                "\nNota 2: " + this.nota2 +
                "\nMédia: " + calcularMedia() +
                "\nSituação: " + verificarSituacao();
    }
}