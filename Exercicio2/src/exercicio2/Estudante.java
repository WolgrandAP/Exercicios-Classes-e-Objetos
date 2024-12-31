package exercicio2;

public class Estudante {
    private int matricula;
    private String nome;    

    public Estudante(int matricula, String nome) {
        this.setMatricula(matricula);
        this.setNome(nome);
    }

    public void setMatricula(int mat) {
        this.matricula = mat;
    }
    public int getMatricula() {
        return this.matricula;
    }

    public void setNome(String n) {
        this.nome = n;
    }
    public String getNome() {
        return this.nome;
    }
}
