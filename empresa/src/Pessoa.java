public class Pessoa {

    //Atributos
    private String nome;
    private Integer idade;
    private String cpf;
    private String email;
    private String telefone;


    /*
         MÉTODO CONSTRUTOR
         o método construtor é sempre chamado quando se cria um novo objeto a partir da classe.
         Nele, podemos exigir que  determinados valores sejam informados para que  a  existência do  objeto seja possível.
         O método construtor tem o mesmo nome da classe e não possui tipo de retorno (nem mesmo void).
    */
    public Pessoa(
            String nome,
            Integer idade,
            String cpf,
            String email,
            String telefone
    ) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }

     //Sobrecarga do método construtor
     //Permite criar um objeto sem passar nenhum valor, ou seja, com os atributos vazios
     public Pessoa() {
     }

    //Métodos
    public void apresentar() {
        System.out.println("Olá, meu nome é " + this.getNome() + " e tenho " + this.getIdade() + " anos. ");
    }

    public void fazerAniversario() {
        this.setIdade(this.getIdade() + 1); //incrementa a idade
        System.out.println("Feliz aniversario, " + this.getNome() + "! Agora você tem " + this.getIdade() + " anos.");
    }

    public void atualizarEmail(String novoEmail) {
        this.setEmail(novoEmail);
        System.out.println("Email atualizado para: " + this.getEmail());
    }

    public String exibirDados() {
        // \n significa quebra de linha
        return "Nome: " + this.getNome() +
                "\nIdade:" + this.getIdade() +
                "\nCPF:" + this.getCpf() +
                "\nE-mail:" + this.getEmail() +
                "\nTelefone:" + this.getTelefone();

    }

    // GETTERS
    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    // SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}