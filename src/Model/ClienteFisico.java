package Model;


public class ClienteFisico extends Cliente {


    public ClienteFisico(int id, Contato contato, Endereco endereco, boolean cliente, String cadastrado_em, int id1, String nome, String cpf, String rg, String org_emissor, Sexo sexo, String nascimento) {
        super(id, contato, endereco, cliente, cadastrado_em);
        this.id = id1;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.org_emissor = org_emissor;
        this.sexo = sexo;
        this.nascimento = nascimento;
    }
    {
}

    int id;
    String nome;
    String cpf;
    String rg;
    String org_emissor;
    Sexo sexo;
    String nascimento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getOrg_emissor() {
        return org_emissor;
    }

    public void setOrg_emissor(String org_emissor) {
        this.org_emissor = org_emissor;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    @Override
    public String toString() {
        return "\nClienteFisico: " +
                "\nid= " + id +
                "\nnome= " + nome + '\'' +
                "\ncpf= " + cpf + '\'' +
                "\nrg= " + rg + '\'' +
                "\norg_emissor= " + org_emissor + '\'' +
                "\nsexo= " + sexo +
                "\nnascimento= " + nascimento + '\'' +
                "\nid= " + id +
                "\ncontato= " + contato +
                "\nendereco= " + endereco +
                "\ncliente= " + cliente +
                "\ncadastrado_em= " + cadastrado_em + '\'';
    }
}
