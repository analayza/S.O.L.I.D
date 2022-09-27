package Main;

import Model.*;
import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        ClienteFisico cf1 = new ClienteFisico(234790,
                new Contato(234790, "83996784590", "geraldo@gmail.com"),
        new Endereco(234790, "589000", "PB",
                "Cajazeiras", "Centro", "Otaciano benedito", "Fafic"),
                true, "12/04/2010", 234790,"Geraldo Ferreira Lopes", "135.678.956-01",
                "4.678.01", "SSP", new Sexo(234790, "Hetero"), "1980"
    );
        System.out.println(cf1);

        ClienteJuridico cj1 = new ClienteJuridico(436572, new Contato(436572, "83997685413", "mariaferreira@gmail.com"),
                new Endereco(436572, "58925000", "PB", "Santa Helena", "Centro", "joaquim brito","Igreja"),
                true, "23/06/2013", 436572, "Maria Ferreira Oliveira", "Ajudar meio ambiente",
                "Maria reciclados",new IndicadorInscricaoEstadual(436571, "435272"),"4309485", "43583320"
                );

        System.out.println(cj1);
    }
}
