import java.util.Scanner;
 
class Notificacao {
    public void enviar() { 
        System.out.println("Enviando notificação genérica..."); 
    }
}
 
class SMS extends Notificacao {
    @Override
    public void enviar() { 
        System.out.println("Enviando um SMS..."); 
    }
}
 
class Email extends Notificacao {
    @Override
    public void enviar() { 
        System.out.println("Enviando um E-mail..."); 
    }
}
 
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 1 para SMS, 2 para Email:");
        int opcao = scanner.nextInt();
        Notificacao n;
        if (opcao == 1) {
            n = new SMS();
        } else if (opcao == 2) {
            n = new Email();
        } else {
            n = new Notificacao();
            System.out.println("Opção inválida. Usando notificação padrão.");
        }
        n.enviar();
        scanner.close();
    }
}