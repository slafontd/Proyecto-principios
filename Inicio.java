/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.trackstreetfighter;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;
import javax.swing.JDialog;
/**
 *
 * @author lafon
 */
public class Inicio extends javax.swing.JPanel {
    
    private final JDialog dialog;


    /**
     * Creates new form Inicio  
     * @param dialog
     */
    public Inicio(JDialog dialog) {
        this.dialog = dialog;
        initComponents();
        jPasswordField1.setEnabled(false); // Disable password field initially
        addEventHandlers();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        jCheckBox1.setText("Usuario");

        jCheckBox2.setText("Desarrollador");

        jButton1.setText("Inicio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addComponent(jCheckBox1)
                .addGap(129, 129, 129)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPasswordField1))
                    .addComponent(jCheckBox2))
                .addGap(168, 168, 168))
            .addGroup(layout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(114, 114, 114)
                .addComponent(jButton1)
                .addContainerGap(134, Short.MAX_VALUE))
        );
    }// </editor-fold>                        
    
    private void addEventHandlers() {
        jCheckBox1.addActionListener(e -> jCheckBox1ActionPerformed());
        jCheckBox2.addActionListener(e -> jCheckBox2ActionPerformed());
        jButton1.addActionListener(e -> jButton1ActionPerformed());
    }

    private void jCheckBox1ActionPerformed() {                                           
        if (jCheckBox1.isSelected()) {
            jCheckBox2.setSelected(false);
            jPasswordField1.setEnabled(false);
        }
    }                                          

    private void jCheckBox2ActionPerformed() {                                           
        if (jCheckBox2.isSelected()) {
            jCheckBox1.setSelected(false);
            jPasswordField1.setEnabled(true);
        } else {
            jPasswordField1.setEnabled(false);
        }
    }                                          

    private void jButton1ActionPerformed() {                                         
        if (jCheckBox2.isSelected()) {
            String password = new String(jPasswordField1.getPassword());
            if (password.equals("123456")) {
                JOptionPane.showMessageDialog(this, "Bienvenido, Desarrollador!");

                // Aquí añadimos la lógica para abrir y modificar el archivo database.txt
                try {
                    // Ruta al archivo database.txt
                    String filePath = "C:\\Users\\lafon\\OneDrive\\Documents\\NetBeansProjects\\TrackStreetFighter\\src\\main\\java\\com\\mycompany\\trackstreetfighter\\database.txt";
                    
                    // Abre el archivo en modo lectura/escritura
                    RandomAccessFile raf = new RandomAccessFile(filePath, "rw");
                    
                    // Posiciona el puntero al principio del archivo
                    raf.seek(0);
                    
                    // Escribe datos en el archivo (por ejemplo, sobreescribe los primeros 100 bytes)
                    String data = "Nuevos datos";
                    raf.write(data.getBytes());
                    
                    // Cierra el archivo
                    raf.close();
                    
                    // Notifica al usuario que el archivo ha sido modificado
                    JOptionPane.showMessageDialog(this, "Archivo database.txt modificado correctamente.");
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(this, "Error al abrir/modificar el archivo database.txt: " + e.getMessage());
                }
                
                dialog.dispose(); // Cierra el diálogo
            } else {
                JOptionPane.showMessageDialog(this, "Contraseña incorrecta. Inténtalo de nuevo.");
            }
        } else if (jCheckBox1.isSelected()) {
            JOptionPane.showMessageDialog(this, "Bienvenido, Usuario!");
            dialog.dispose(); // Close the dialog
  
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una opción.");
        }
    }
    
    

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration                   
}
