package exercicio3;

public class Main {
    public static void main(String[] args) {

        //Caso teste
        RelogioDigital r = new RelogioDigital(23,59);
        System.out.println(r.mostrarHora());
        r.tick();
        System.out.println(r.mostrarHora());

    }
}
