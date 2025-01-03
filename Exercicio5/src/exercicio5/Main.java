package exercicio5;

public class Main {
    public static void main(String[] args) {
        Funcionario f[] = new Funcionario[2];

        f[0] = new Funcionario("João","Alves",1800f);

        f[1] = new Funcionario("Ana","Maria",1950.50f);

        f[0].concederAumento(100.50f);

        System.out.println(f[0].dados());
        System.out.println(f[0].getSalarioAnual());

        System.out.println(f[1].dados());
        System.out.println(f[1].getSalarioAnual());

    }
}
