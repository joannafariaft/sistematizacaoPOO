package sistematizacaoPOO;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaFuncionario {
    private ArrayList<Funcionario> funcionarios;

    public SistemaFuncionario() {
        funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public Funcionario buscarFuncionarioPorId(int id) {
        for (Funcionario f : funcionarios) {
            if (f.getId() == id) {
                return f;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        SistemaFuncionario sistema = new SistemaFuncionario();

        sistema.adicionarFuncionario(new Funcionario(1, "Joanna Maria", "123.456.789-01", "99999-9999", "Feminino", "joanna.maria@olaola.com", "01/01/1989", "Alergia a amendoim", "Nenhum"));
        sistema.adicionarFuncionario(new Funcionario(2, "Alex João", "987.654.321-01", "98888-8888", "Masculino", "alex.joao@olaola.com", "01/01/1991", "Alergia a camarão", "Asma"));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o ID do funcionário que deseja buscar: ");
        int id = scanner.nextInt();

        Funcionario funcionario = sistema.buscarFuncionarioPorId(id);

        if (funcionario != null) {
            System.out.println("Dados do Funcionário:");
            System.out.println(funcionario);
        } else {
            System.out.println("Funcionário com ID " + id + " não encontrado.");
        }

        scanner.close();
    }
}
