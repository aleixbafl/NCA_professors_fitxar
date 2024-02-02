package nca_professors_fitxar;

import java.awt.Dimension;
import javax.swing.ImageIcon;

public class NCA_professors_fitxar {
    public static void main(String[] args) {
        NCA_professors_fitxar metode = new NCA_professors_fitxar();
        metode.principal();
    }

    private void principal() {
        ImageIcon icon = new ImageIcon("hora.png");
        inici pantallaInici = new inici();
        Dimension minSize = new Dimension(500, 600);
        pantallaInici.setMinimumSize(minSize);
        pantallaInici.setTitle("Pantalla d'Inici");
        pantallaInici.setIconImage(icon.getImage());
        pantallaInici.setVisible(true);
        do {
            System.out.println(pantallaInici.metodeSegonaPantalla());
            if (pantallaInici.metodeSegonaPantalla()) {
                pantallaInici.dispose();
                principal principalPantalla = new principal();
                principalPantalla.setMinimumSize(minSize);
                principalPantalla.setTitle("Pantalla principal");
                principalPantalla.setIconImage(icon.getImage());
                principalPantalla.setVisible(true);
            }
        } while (!pantallaInici.metodeSegonaPantalla());
    }
}
