import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Usuario> usuarios = new HashMap<>();

        int opcao;

        do {
            System.out.println("\n1 - Inserir usuário");
            System.out.println("2 - Listar usuários");
            System.out.println("3 - Remover usuário");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    if (usuarios.containsKey(email)) {
                        System.out.println("Email já cadastrado!");
                    } else {
                        System.out.print("Nome: ");
                        String nome = sc.nextLine();

                        System.out.print("Senha: ");
                        String senha = sc.nextLine();

                        usuarios.put(email, new Usuario(email, nome, senha));
                        System.out.println("Usuário cadastrado!");
                    }
                    break;

                case 2:
                    for (Usuario u : usuarios.values()) {
                        System.out.println("Email: " + u.email);
                        System.out.println("Nome: " + u.nome);
                    }
                    break;

                case 3:
                    System.out.print("Email do usuário: ");
                    email = sc.nextLine();

                    if (usuarios.remove(email) != null) {
                        System.out.println("Usuário removido!");
                    } else {
                        System.out.println("Usuário não encontrado!");
                    }
                    break;
            }

        } while (opcao != 0);

        sc.close();
    }
}


