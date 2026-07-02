package CadastroPOO;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaCadastro {
    private  Scanner input = new Scanner(System.in);
    private ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    public boolean listaVazia() {
        return listaUsuarios.isEmpty();
    }

    public int lerInt(String mensagem) {
        while (true) {
            System.out.print(mensagem);
            try {
                int valor = input.nextInt();
                input.nextLine();
                return valor;
            } catch (Exception e) {
                System.out.println("Digite apenas numeros");
                input.nextLine();
            }
        }
    }

    public void cadastrarUsuario() {
        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        int idade = lerInt("Digite sua idade: ");

        System.out.print("Digite seu email: ");
        String email = input.nextLine();

        Usuario usuario = new Usuario(nome, idade, email);
        listaUsuarios.add(usuario);
    }

    public void listarUsuarios() {
        for (int i = 0; i < listaUsuarios.size(); i++) {
            Usuario u = listaUsuarios.get(i);
            System.out.println("===== USUÁRIO " + (i+1) + " =====");
            System.out.println("Nome  : " + u.getNome());
            System.out.println("Idade : " + u.getIdade());
            System.out.println("Email : " + u.getEmail());
        }
    }

    public void buscarUsucario() {
        System.out.print("Digite o nome: ");
        String bnome = input.nextLine();

        if (listaVazia()) {
            System.out.println("Nenhum usuário encontrado");
            return;
        }
        for (int i = 0; i < listaUsuarios.size(); i++) {
            Usuario u = listaUsuarios.get(i);
            if (u.getNome().equalsIgnoreCase(bnome)) {

                System.out.println("===== USUÁRIO =====");
                System.out.println("Nome: " + u.getNome());
                System.out.println("Idade: " + u.getIdade());
                System.out.println("Email: " + u.getEmail());

                return;
            }
        }
        System.out.println("Usuário não encontrado.");
    }

    public void removerUsuario() {
        System.out.println("Digite o nome: ");
        String rNome = input.nextLine();

        if (listaVazia()) {
            System.out.println("Nenhum usuário cadastrado");
            return;
        }
        for (int i = 0; i < listaUsuarios.size(); i++) {
            Usuario u = listaUsuarios.get(i);
            if (u.getNome().equalsIgnoreCase(rNome)) {

                listaUsuarios.remove(i);

                System.out.println("Usuário removido com sucesso!");
                return;
            }
        }
        System.out.println("Usuário não encontrado.");
    }

    public void alterarUsuario() {
        System.out.println("Digite o nome: ");
        String aNome = input.nextLine();

        if (listaVazia()) {
            System.out.println("Nenhum usuário cadastrado");
            return;
        }
        for (int i = 0; i < listaUsuarios.size(); i++) {
            Usuario u = listaUsuarios.get(i);
            if (u.getNome().equalsIgnoreCase(aNome)) {

                System.out.println("Digite o novo nome: ");
                String novoNome = input.nextLine();
                u.setNome(novoNome);

                int novaIdade = lerInt("Digite a nova idade: ");
                u.setIdade(novaIdade);

                System.out.println("Digite o novo email: ");
                String novoEmail = input.nextLine();
                u.setEmail(novoEmail);

                System.out.println("Usuário alterado com sucesso.");

                return;
            }
        }
        System.out.println("Usuário não encontrado.");
    }
    public void exibirMenu() {
        System.out.println("=========== MENU ===========");
        System.out.println("1 - Cadastrar usuário");
        System.out.println("2 - Listar usuários");
        System.out.println("3 - Buscar usuário");
        System.out.println("4 - Alterar usuário");
        System.out.println("5 - Remover usuário");
        System.out.println("0 - Sair");
    }

    public void executarOperacoes(int op) {
        switch (op) {
            case 0:
                break;
            case 1:
                cadastrarUsuario();
                break;
            case 2:
                listarUsuarios();
                break;
            case 3:
                buscarUsucario();
                break;
            case 4:
                alterarUsuario();
                break;
            case 5:
                removerUsuario();
                break;
            default:
                System.out.println("Opção invalida");
        }
    }
    public void iniciar(){
        int op = -1;
        do {
          exibirMenu();
          op = lerInt("Escolha opção: ");
          executarOperacoes(op);
        } while (op != 0);
    }
}
