package nca_professors_fitxar;

import java.awt.Dimension;

public class NCA_professors_fitxar {
    public static void main(String[] args) {
        NCA_professors_fitxar metode = new NCA_professors_fitxar();
        metode.principal();
    }

    private void principal() {
        inici pantallaInici = new inici();
        Dimension minSize = new Dimension(500, 600);
        pantallaInici.setMinimumSize(minSize);
        pantallaInici.setTitle("Pantalla d'Inici");
        pantallaInici.setVisible(true);
    }
}
