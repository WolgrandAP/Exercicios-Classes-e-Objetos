package exercicio5;

public class Funcionario {
    private String nome;
    private String sobrenome;
    private float salario;

    public Funcionario(String nome, String sobrenome, float salario) {
        this.setNome(nome);
        this.setSobrenome(sobrenome);
        this.setSalario(salario);
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public float getSalario() {
        return this.salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getSalarioAnual() {
        return 12 * this.getSalario();
    }

    public void concederAumento(float valor) {
        this.setSalario(this.getSalario() + valor);
    }


    public String dados() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
