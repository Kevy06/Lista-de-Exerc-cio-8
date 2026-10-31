class Relogio {

    public String formatarHora(int hora, int minuto) {
        return String.format("%02d:%02d", hora, minuto);
    }
}

class RelogioDigital extends Relogio {

 
    public String formatarHora(int hora, int minuto) {
        return String.format(
                "Relógio digital: %02d:%02d",
                hora,
                minuto
        );
    }
}

public class Questao1 {

    public static void main(String[] args) {
        Relogio relogio = new RelogioDigital();

        System.out.println(relogio.formatarHora(9, 5));
    }
}