/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package nca_professors_fitxar;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author aleix
 */
public class principal extends javax.swing.JFrame {
    File usuariLogin = new File("usuari.txt");
    
    public principal() {
        initComponents();
        
        /*
        Comprovar si hi ha un arxiu al projecte amb el nom horari i amb l'extensió xlsx o ods.
        En cas de no existir li demanarà a l'usuari que li digui on el té guardat (l'arxiu ha 
        de ser horari.xlsx/ods) i copiar i enganxarà a l'arrel del projecte.
        */
        
        horari();
        
        hores.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                ImageIcon icon = new ImageIcon("hora.png");
                hores horesPantalla = new hores();
                Dimension minSize = new Dimension(600, 700);
                horesPantalla.setMinimumSize(minSize);
                horesPantalla.setTitle("Hores - Fitxar");
                horesPantalla.setIconImage(icon.getImage());
                horesPantalla.setVisible(true);
                dispose();
            }
        });
        
        tancaSessio.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                File f = new File("usuari.txt");
                if (f.exists()) {
                    f.delete();
                }
                ImageIcon icon = new ImageIcon("hora.png");
                inici pantallaInici = new inici();
                Dimension minSize = new Dimension(500, 600);
                pantallaInici.setMinimumSize(minSize);
                pantallaInici.setTitle("Pantalla d'Inici - Fitxar");
                pantallaInici.setIconImage(icon.getImage());
                pantallaInici.setVisible(true);
                eliminarHorari();
                dispose();
            }

            private void eliminarHorari() {
                File horai1 = new File("horari.xlsx");
                File horai2 = new File("horari.ods");
                if (horai1.exists()) {
                    horai1.delete();
                } else {
                    horai2.delete();
                }
            }
        });
        
        tanca.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        fitxar = new javax.swing.JButton();
        tanca = new javax.swing.JButton();
        hores = new javax.swing.JButton();
        tancaSessio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Opcions");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        fitxar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        fitxar.setText("Fitxar");
        fitxar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fitxarActionPerformed(evt);
            }
        });

        tanca.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tanca.setText("Tanca");
        tanca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tancaActionPerformed(evt);
            }
        });

        hores.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        hores.setText("Hores");
        hores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horesActionPerformed(evt);
            }
        });

        tancaSessio.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        tancaSessio.setText("Tanca Sessió");
        tancaSessio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tancaSessioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tancaSessio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(hores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fitxar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tanca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(fitxar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(hores, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(tancaSessio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(tanca, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fitxarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fitxarActionPerformed
        try {
            FileReader fr = new FileReader(usuariLogin);    //<-|
            BufferedReader bf = new BufferedReader(fr);     //<-|
            String dni = bf.readLine();                     //<-|--> Lleguir del fitxer usuari.txt per a poder obtenir les credencials del professor
            bf.close();                                     //<-|
            fr.close();                                     //<-|
            
            LocalDateTime dataHora = LocalDateTime.now();//Obtenir l'hora y data del sistema
            
            //Donar el format de data per un cantor y el format de data i hora per un altre canto
            DateTimeFormatter dataFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            DateTimeFormatter dataHoraFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            
            if (capDeSetmana(dataFormat.format(dataHora))) {
                missatge("No es fitxa als caps de setmana.");
            } else{
                conexioBD conexio = new conexioBD();//Crear objecte conexioBD
                int aFitxat = fixarInici(conexio, dni, dataFormat.format(dataHora));//fixarInici retorne 0 (error SQL), 1 (el professor a fitxat el inici) i 2 (no a fitxat aquell dia)
                if (aFitxat == 2) {//si el professor amb el X DNI amb X data, no a fixat a X data s'insertara la data, dni i dataHroaEntrada
                    try {
                        conexio.obrirConexio();

                        conexio.ecjecutarActualitzar("INSERT INTO `dia`(`data`, `dni`, `horaDataEntrada`) VALUES ('" + dataFormat.format(dataHora) + "','" + dni + "','" + dataHoraFormat.format(dataHora) + "');");

                        conexio.tancaConexio();
                    } catch (SQLException ex){
                        missatge("A agut un error a la connexió a la Base de Dades.");
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(inici.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (aFitxat == 1) {// en cas d'aver fixat amb anterioritat el mateix dia sol savexira la dataHoraFi i les hores que a fet segons el seu horari
                    try{
                        conexio.obrirConexio();
                        ResultSet horaDataEntrada = conexio.ecjecutarConsulta("SELECT horaDataEntrada FROM dia WHERE dni LIKE \"" + dni + "\" AND data LIKE '" + dataFormat.format(dataHora) + "';");
                        conexio.tancaConexio();
                        int horesRealitzades = contarHores(horaDataEntrada, dataHoraFormat.format(dataHora));

                    } catch(SQLException ex){

                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } else {
                    missatge("A agut un error a la connexió a la Base de Dades.");
                }
            }
        } catch (IOException e){
            missatge("A agut un error en llegir les credencials guardades.");
        }
    }//GEN-LAST:event_fitxarActionPerformed

    private void horesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horesActionPerformed

    private void tancaSessioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tancaSessioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tancaSessioActionPerformed

    private void tancaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tancaActionPerformed
        
    }//GEN-LAST:event_tancaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        principal pantalla = new principal();
        pantalla.sessio();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fitxar;
    private javax.swing.JButton hores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton tanca;
    private javax.swing.JButton tancaSessio;
    // End of variables declaration//GEN-END:variables

    private void sessio() {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new principal().setVisible(true);
            }
        });
    }

    private void missatge(String missatge) {
        JOptionPane.showMessageDialog(rootPane, missatge);
    }

    private int fixarInici(conexioBD conexio, String dniString, String data) {
        try{
            conexio.obrirConexio();
            ResultSet resultat = conexio.ecjecutarConsulta("SELECT `data`, `dni` FROM `dia` WHERE data LIKE '" + data + "' AND dni LIKE '" + dniString + "'; ");
            if (resultat.next()) {
                conexio.tancaConexio();
                return 1;
            } else{
                conexio.tancaConexio();
                return 2;
            }
        } catch(SQLException ex){
            missatge("A agut un error en llegir les credencials guardades.");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conexio.tancaConexio();
        } catch (SQLException ex) {
            Logger.getLogger(principal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    private int guardarArxiuProjecte(File arxiu, String extencio) {
        Path rutaProjecte = Paths.get("horari." + extencio);
        try {
            Files.copy(arxiu.toPath(), rutaProjecte, StandardCopyOption.REPLACE_EXISTING);
            return 0;
        } catch (Exception e){
            System.out.println("A agut un error en guardar l'arxiu.");
        }
        return 1;
    }

    private void horari() {
        if (finestraSiNo("Vols canviar l'horari que hi ha guardat?")) {
            
            JFileChooser fileChooser = new JFileChooser();
            File arxiu = new File("horari.xlsx");
            if (arxiu.exists()) {
                arxiu.delete();
            }
            int seleccion = 1;
            do{
                seleccion = fileChooser.showOpenDialog(principal.this);
                if (seleccion == 0) {
                    arxiu = fileChooser.getSelectedFile();
                    //System.out.println(arxiu.getName());
                    String arxiuSplit[] = arxiu.getName().split("\\.");
                    if (arxiuSplit.length != 2) {
                        missatge("L'arxiu sol pot tenir 1 \".\", Ex.: nom.extensió");
                        seleccion = 1;
                    }else {
                        if (!arxiuSplit[0].equals("horari")) {
                            missatge("El nom de l'arxiu ha de ser \"horari\".");
                        } else {
                            switch (arxiuSplit[arxiuSplit.length - 1]){
                                case "xlsx":
                                    seleccion = guardarArxiuProjecte(arxiu, arxiuSplit[arxiuSplit.length - 1]);
                                    break;
                                default:
                                    missatge("L'arxiu ha de tenir l'extensió xlsx.");
                                    seleccion = 1;
                            }
                        }
                    }
                } else {
                    missatge("S'ha de seleccionar un arxiu.");
                }
            } while(seleccion != 0);
        }
    }

    private int contarHores(ResultSet horaDataEntrada, String dataFi) {
        String formatData = "yyyy-MM-dd  HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(formatData);
        try {
            int hores = 0;
            horaDataEntrada.next();
            Date dataFiHora = sdf.parse(dataFi);
            Date dataIniciHora = sdf.parse(horaDataEntrada.getString(WIDTH));
            Calendar calendari = Calendar.getInstance();
            int diaSetmana = calendari.get(Calendar.DAY_OF_WEEK);// 1 Diumenge, 2 Dilluns, ..., 7 Dissabte
            switch (diaSetmana){
                case Calendar.MONDAY://Dilluns
                    hores = obtenirHoresCalendari(dataIniciHora, dataFiHora, "Dilluns");
                    break;
            }
        } catch (ParseException e){
            
        } catch (SQLException ex) {
            
        }
        return 0;
    }
    
    private boolean finestraSiNo(String missatge) {
        int opcio = JOptionPane.showConfirmDialog(null, missatge, "Confirmación", JOptionPane.YES_NO_OPTION);
        if (opcio == 0) {
            return true;
        } else {
            return false;
        }
    }

    private int obtenirHoresCalendari(Date dataIniciHora, Date dataFiHora, String dia) {
        try {
            FileInputStream fis = new FileInputStream(new File("horari.xlsx"));
            //XSSFWorkbook workbook = new XSSFWorkbook(fis);
        } catch (FileNotFoundException ex) {
            missatge("Error a l'hora de llegir l'horari.");
        }
        return 0;
    }
    
    private boolean capDeSetmana(String data){
        String formatData = "yyyy-MM-dd  HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(formatData);
        try {
            Date dataFiHora = sdf.parse(data);
            Calendar calendari = Calendar.getInstance();
            int diaSetmana = calendari.get(Calendar.DAY_OF_WEEK);
            if ((diaSetmana == 1) || (diaSetmana == 7)) {
                return false;
            } else {
                return true;
            }
        } catch (ParseException ex) {
            missatge("A agut un error en les dates i no es pot realitzar l'operació.");
        }
        return false;
    }
}
