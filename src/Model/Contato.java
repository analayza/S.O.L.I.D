package Model;

import java.util.UUID;

public class Contato {

    public Contato(int id, String contato, String email) {
        this.id = id;
        this.contato = contato;
        this.email = email;
    }
    int id;
    String contato;
    String email;

    public void setId(int id) {
        this.id = id;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getContato() {
        return contato;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "\nContato: " +
                "\nid= " + id +
                "\ncontato= " + contato + '\'' +
                "\nemail= " + email + '\'' ;
    }
}
