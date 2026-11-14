
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> historico = new Stack<>();

        int opcao;

        do {
            System.out.println("\n=== NAVEGADOR ===");
            System.out.println("1 - Acessar nova página");
            System.out.println("2 - Voltar à página anterior");
            System.out.println("3 - Exibir página atual");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o título da página: ");
                    String pagina = sc.nextLine();

                    historico.push(pagina);
                    System.out.println("Página acessada!");
                    break;

                case 2:
                    if (historico.size() > 1) {
                        historico.pop();
                        System.out.println("Voltando à página anterior...");
                        System.out.println("Página atual: " + historico.peek());
                    } else {
                        System.out.println("Não há página anterior!");
                    }
                    break;

                case 3:
                    if (!historico.isEmpty()) {
                        System.out.println("Página atual: " + historico.peek());
                    } else {
                        System.out.println("Nenhuma página acessada!");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando navegador...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}

