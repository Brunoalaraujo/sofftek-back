package softtekback;

import softtekback.models.Ticket;
import softtekback.models.User;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final Map<Integer, Ticket> tickets = new HashMap<>();
    private static final Map<Integer, User> users = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;

        do {
            menu();
            op = sc.nextInt();

            switch (op) {
                case 1:
                    registerUser(sc);
                    break;
                case 2:
                    registerTicket(sc);
                    break;
                case 3:
                    listUsers();
                    break;
                case 4:
                    listTickets();
                    break;
                case 0:
                    System.out.println("Sistema finalizado!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (op != 0);
        sc.close();
    }

    private static void registerUser(Scanner sc) {
        System.out.print("Digite o nome do usuário: ");
        String name = sc.next();
        System.out.print("Digite o email: ");
        String email = sc.next();
        System.out.print("Digite a senha: ");
        String password = sc.next();
        System.out.print("Digite o tipo do usuário: (1-ADMIN/2-DEFAULT): ");
        int role = sc.nextInt();
        sc.nextLine();

        var user = new User();
        var parsedRole = user.getRoleName(role);

        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        user.setRole(parsedRole);

        users.put(user.getCdUser(), user);
        System.out.println("Usuário cadastrado com sucesso!");
    }

    private static void registerTicket(Scanner sc) {
        System.out.print("Digite o ID do usuário que criará o ticket: ");
        int cdIssuer = sc.nextInt();
        System.out.print("Digite um título: ");
        String title = sc.next();
        System.out.print("Digite uma descrição: ");
        String description = sc.next();
        System.out.print("Digite a prioridade (1-HIGH/2-MEDIUM/3-LOW): ");
        int priority = sc.nextInt();
        sc.nextLine();

        var ticket = new Ticket(cdIssuer);
        var parsedPriority = ticket.getPriorityName(priority);

        ticket.setTitle(title);
        ticket.setDescription(description);
        ticket.setPriority(parsedPriority);

        System.out.println("Ticket cadastrado com sucesso!");
    }

    private static void listUsers() {
        if (users.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
        } else {
            System.out.println("Lista de Usuários:");
            for (User user : users.values()) {
                System.out.println(user);
            }
        }
    }

    private static void listTickets() {
        if (tickets.isEmpty()) {
            System.out.println("Nenhum ticket cadastrado.");
        } else {
            System.out.println("Lista de Tickets:");
            for (Ticket ticket : tickets.values()) {
                System.out.println(ticket);
            }
        }
    }

    private static void menu() {
        System.out.println("\n-----TICKET SYSTEM-----\n");
        System.out.println("Escolha uma opção: \n");
        System.out.println("1 - Cadastrar Usuário");
        System.out.println("2 - Cadastrar Ticket");
        System.out.println("3 - Listar Usuários");
        System.out.println("4 - Listar Tickets");
        System.out.println("0 - Sair");
    }
}