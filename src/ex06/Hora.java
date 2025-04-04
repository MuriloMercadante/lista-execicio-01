package ex06;



public class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    public Hora(int horas, int minutos, int segundos) {
        this.horas = validarHora(horas);
        this.minutos = ValidarMinuto(minutos);
        this.segundos = validarSegundo(segundos);
    }

    public int validarSegundo(int segundos) {
        return ValidarMinuto(segundos);
    }

    public int ValidarMinuto(int minutos) {
        return (minutos >= 0 && minutos <=59 ?minutos : 0);
    }

    public int validarHora(int horas) {
        return (horas >= 0 && horas <=23 ?horas : 0);

    }

    public String formatar(){
        return String.format("%02d:%02d:%02d",horas,minutos,segundos);
    }

}
