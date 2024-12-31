package exercicio1;

public class Circulo {
    private float raio;

    public Circulo(float raio) {
        this.setRaio(raio);
    }

    public void setRaio(float r) {
        this.raio = r;
    }
    public float getRaio() {
        return this.raio;
    }

    public float getArea() {
        float area = (float) (3.14159 * Math.pow(this.getRaio(),2));

        return area;
    }

    public float getCircunferencia() {
        float circ = 2 * 3.14159f * this.getRaio();

        return circ;
    }
}
