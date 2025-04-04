package ex06;

public class Main {
    public static void main(String[] args) {
        Hora h1 = new Hora(22,43,56);
        Hora h2 = new Hora(3,32,44);
        Hora h3 = new Hora(48,332,414);

        System.out.println(h1.formatar());
        System.out.println(h2.formatar());
        System.out.println(h3.formatar());

    }

}
