package exercicio3;

public class RelogioDigital {
    private int hora;
    private int minuto;

    public RelogioDigital(int h, int m) {
        this.setHora(h);
        this.setMinuto(m);
    }

    public void setHora(int h) {
        this.hora = h;
    }
    public int getHora() {
        return this.hora;
    }

    public void setMinuto(int min) {
        this.minuto = min;
    }
    public int getMinuto() {
        return this.minuto;
    }

    public void tick() {

        this.setMinuto(this.getMinuto() + 1);

        if (this.getMinuto() == 60) {
            this.setMinuto(0);
            this.setHora(this.getHora() + 1);
        }

        if(this.getHora()==24 && this.getMinuto()==0) {
            this.setHora(0);
            this.setMinuto(0);
        }


    }

    public String mostrarHora() {
        return "Horário: " + this.getHora() + ":" + this.getMinuto();
    }

}
