package exercicio6;

public class Linha {
    private PontoInicio inicio;
    private PontoFim fim;

    public Linha(PontoInicio inicio, PontoFim fim) {
        this.setInicio(inicio);
        this.setFim(fim);
    }

    public PontoInicio getInicio() {
        return this.inicio;
    }
    public void setInicio(PontoInicio inicio) {
        this.inicio = inicio;
    }

    public PontoFim getFim() {
        return this.fim;
    }
    public void setFim(PontoFim fim) {
        this.fim = fim;
    }

    public double getComprimento() {
        return Math.sqrt((fim.getX() - inicio.getX()) + (fim.getY() - inicio.getY()));
    }

}
