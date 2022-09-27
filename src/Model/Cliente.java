package Model;

import java.util.Date;

public class Cliente{


    public Cliente(int id, Contato contato, Endereco endereco, boolean cliente, String cadastrado_em) {
        this.id = id;
        this.contato = contato;
        this.endereco = endereco;
        this.cliente = cliente;
        this.cadastrado_em = cadastrado_em;
    }

    int id;
    Contato contato;
    Endereco endereco;
    boolean cliente;
    String cadastrado_em;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public boolean isCliente() {
        return cliente;
    }

    public void setCliente(boolean cliente) {
        this.cliente = cliente;
    }

    public String getCadastrado_em() {
        return cadastrado_em;
    }

    public void setCadastrado_em(String cadastrado_em) {
        this.cadastrado_em = cadastrado_em;
    }
}
