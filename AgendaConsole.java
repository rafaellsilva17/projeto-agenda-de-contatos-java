import java.util.Scanner;

public class AgendaConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();
        boolean sair = false;

        while (!sair) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Remover Contato");
            System.out.println("3. Listar Contatos");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do contato: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o telefone do contato: ");
                    String telefone = scanner.nextLine();
                    Contato novoContato = new Contato(nome, telefone);
                    agenda.adicionarContato(novoContato);
                    System.out.println("Contato adicionado com sucesso!");
                    break;
                case 2:
                    System.out.print("Digite o nome do contato a ser removido: ");
                    nome = scanner.nextLine();
                    agenda.removerContato(nome);
                    System.out.println("Contato removido com sucesso!");
                    break;
                case 3:
                    System.out.println("Lista de Contatos:");
                    for (Contato c : agenda.listarContatos()) {
                        System.out.println(c);
                    }
                    break;
                case 4:
                    sair = true;
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        scanner.close();
    }
}
