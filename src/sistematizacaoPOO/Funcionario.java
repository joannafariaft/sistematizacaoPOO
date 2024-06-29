package sistematizacaoPOO;

public class Funcionario {
    private int id;
    private String nome;
    private String cpf;
    private String celular;
    private String sexo;
    private String email;
    private String dataNascimento;
    private String alergias;
    private String problemasMedicos;

    public Funcionario(int id, String nome, String cpf, String celular, String sexo, String email, String dataNascimento, String alergias, String problemasMedicos) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.sexo = sexo;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.alergias = alergias;
        this.problemasMedicos = problemasMedicos;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCelular() {
        return celular;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEmail() {
        return email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getAlergias() {
        return alergias;
    }

    public String getProblemasMedicos() {
        return problemasMedicos;
    }

    public String toString() {
        return "ID: " + id + "\n" +
               "Nome: " + nome + "\n" +
               "CPF: " + cpf + "\n" +
               "Celular: " + celular + "\n" +
               "Sexo: " + sexo + "\n" +
               "Email: " + email + "\n" +
               "Data de Nascimento: " + dataNascimento + "\n" +
               "Alergias: " + alergias + "\n" +
               "Problemas Médicos: " + problemasMedicos;
    }
}

