package Model;

import java.util.Date;

public class ClienteJuridico extends Cliente {

    public ClienteJuridico(int id, Contato contato, Endereco endereco, boolean cliente, String cadastrado_em, int id1, String cnpj, String razao_social, String nome_fantasia, IndicadorInscricaoEstadual indicadorInscricaoEstadual, String inscricao_estadual, String inscricao_municipal) {
        super(id, contato, endereco, cliente, cadastrado_em);
        this.id = id1;
        this.cnpj = cnpj;
        this.razao_social = razao_social;
        this.nome_fantasia = nome_fantasia;
        this.indicadorInscricaoEstadual = indicadorInscricaoEstadual;
        this.inscricao_estadual = inscricao_estadual;
        this.inscricao_municipal = inscricao_municipal;
    }

    int id;
    String cnpj;
    String razao_social;
    String nome_fantasia;
    IndicadorInscricaoEstadual indicadorInscricaoEstadual;
    String inscricao_estadual;
    String inscricao_municipal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    public String getNome_fantasia() {
        return nome_fantasia;
    }

    public void setNome_fantasia(String nome_fantasia) {
        this.nome_fantasia = nome_fantasia;
    }

    public IndicadorInscricaoEstadual getIndicadorInscricaoEstadual() {
        return indicadorInscricaoEstadual;
    }

    public void setIndicadorInscricaoEstadual(IndicadorInscricaoEstadual indicadorInscricaoEstadual) {
        this.indicadorInscricaoEstadual = indicadorInscricaoEstadual;
    }

    public String getInscricao_estadual() {
        return inscricao_estadual;
    }

    public void setInscricao_estadual(String inscricao_estadual) {
        this.inscricao_estadual = inscricao_estadual;
    }

    public String getInscricao_municipal() {
        return inscricao_municipal;
    }

    public void setInscricao_municipal(String inscricao_municipal) {
        this.inscricao_municipal = inscricao_municipal;
    }


    @Override
    public String toString() {
        return "\nClienteJuridico: " +
                "\nid= " + id +
                "\ncnpj= " + cnpj + '\'' +
                "\nrazao_social= " + razao_social + '\'' +
                "\nnome_fantasia= " + nome_fantasia + '\'' +
                "\nindicadorInscricaoEstadual= " + indicadorInscricaoEstadual +
                "\ninscricao_estadual= " + inscricao_estadual + '\'' +
                "\ninscricao_municipal= " + inscricao_municipal + '\'' +
                "\nid= " + id +
                "\ncontato= " + contato +
                "\nendereco= " + endereco +
                "\ncliente= " + cliente +
                "\ncadastrado_em= " + cadastrado_em + '\'';
    }
}
