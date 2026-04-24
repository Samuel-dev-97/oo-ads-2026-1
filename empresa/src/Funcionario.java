import java.util.Date;

public class Funcionario extends Pessoa {

   private static Double taxaComissao = 10.0;

   // Atributos
   private String matricula;
   private String cargo;
   private Double salarioBase;
   private String departamento;
   private Date dataAdmissao;


    public Funcionario(
              String nome,
              Integer idade,
              String cpf,
              String email,
              String telefone,
              String matricula,
              String cargo,
              Double salarioBase,
              String departamento
    ) {
        // Chamando o construtor da classe pai (Pessoa)
        super(nome, idade, cpf, email, telefone);
        
        // Armazenando os valores via setters para manter o padrão de encapsulamento
        this.setMatricula(matricula);
        this.setCargo(cargo);
        this.setSalarioBase(salarioBase);
        this.setDepartamento(departamento);
        
        // A data é gerada aqui automaticamente, por isso não precisa estar lá em cima
        this.setDataAdmissao(new Date());
    }

   // Métodos 
   public Double calcularSalario() {
       return this.getSalarioBase() * (1 + (getTaxaComissao() / 100));
   }

   public void aumentarSalarioBase(Double percentual) {
       if(percentual == null || percentual <= 0) {
           throw new IllegalArgumentException("O percentual de aumento deve ser positivo.");
       }
       this.setSalarioBase(this.getSalarioBase() * (1 + (percentual / 100)));
       System.out.println("Salário base atualizado para R$ " + this.getSalarioBase());
   }

   public void registrarPonto() {
       System.out.println("Ponto registrado para " + this.getNome() +
               "\nMatrícula: " + this.getMatricula() +
               "\nData/hora:" + new Date()
       );
   }

   @Override
   public String exibirDados() {
       String dadosPessoa = super.exibirDados();
       return dadosPessoa +
               "\nMatricula: " + this.getMatricula() +
               "\nCargo: " + this.getCargo() +
               "\nSalário base: R$ " + this.getSalarioBase() +
               "\nDepartamento: " + this.getDepartamento() +
               "\nData de admissão: " + this.getDataAdmissao();
   }
   // GETTERS e   SETTERS
   public static Double getTaxaComissao() {
    return taxaComissao;
   }

   public static void setTaxaComissao(Double taxaComissao) {
    Funcionario.taxaComissao = taxaComissao;
   }

   public String getMatricula() {
    return matricula;
   }

   public void setMatricula(String matricula) {
    this.matricula = matricula;
   }

   public String getCargo() {
    return cargo;
   }

   public void setCargo(String cargo) {
    this.cargo = cargo;
   }

   public Double getSalarioBase() {
    return salarioBase;
   }
   
   public void setSalarioBase(Double salarioBase) {
    this.salarioBase = salarioBase;
   }

   public String getDepartamento() {
    return departamento;
   }

   public void setDepartamento(String departamento) {
    this.departamento = departamento;
   }

   public Date getDataAdmissao() {
    return dataAdmissao == null ? null : new Date(dataAdmissao.getTime());
   }

   public void setDataAdmissao(Date dataAdmissao) {
    this.dataAdmissao = dataAdmissao == null ? null : new Date(dataAdmissao.getTime());
   }
}