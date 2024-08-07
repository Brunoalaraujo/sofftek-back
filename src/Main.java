import sofftekback.models.Role;
import sofftekback.models.User;
import sofftekback.models.Incident;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        Incident incident = new Incident();
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.println("Escolha uma opção: \n1-Cadastrar Usuário; \n2-Cadastrar Inicidente \n3-Buscar Usuário \n4-Buscar Incidente \n0-Sair");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Digiete o código do Usuário: ");
                    user.setCdUser(sc.nextInt());
                    System.out.println("Digite o nome do Usuário: ");
                    user.setName(sc.next() + sc.nextLine());
                    System.out.println("Digite o email do Usuário: ");
                    user.setEmail(sc.next());
                    System.out.println("Digite a senha do Usuário: ");
                    user.setPassword(sc.next());
                    System.out.println("Digite o tipo do Usuário: (ADMIN/DEFAULT");
                    user.setRole(Role.valueOf(sc.next()));
                    break;
                case 2:
                    System.out.println("Digiete o código do Incidente: ");
                    incident.setCdIncident(sc.nextInt());
                    System.out.println("Digiete o código do Usuário: ");
                    incident.setCdUserIncident(sc.nextInt());
                    System.out.println("Digite uma descrição: ");
                    incident.setDescription(sc.next() + sc.nextLine());
                    System.out.println("Digite o status: ");
                    incident.setStatus(sc.next());
                    System.out.println("Digite a prioridade: ");
                    incident.setPriority(sc.next());
                    System.out.println("Digite algum comentário:");
                    incident.setComments(sc.next() + sc.nextLine());
                    incident.setCreatedAt(LocalDateTime.now());
                    break;
                case 3:
                    user.getUser();
                    break;
                case 4:
                    incident.getIncident();
                    break;
                case 0:
                    System.out.println("Sistema finalizado!");
                default:
                    System.out.println("Opção invalida");
            }
        } while (op != 0);
        sc.close();
    }
}