
package com.mycompany.trackstreetfighter;

/**
 *
 * @author Projects by ADZ
 */
import java.io.IOException;
import java.util.*;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
public class front extends javax.swing.JFrame {

    /**
     * Creates new form front
     */
    public front() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        indCBox1 = new javax.swing.JComboBox<>();
        indCBox2 = new javax.swing.JComboBox<>();
        numTxt1 = new javax.swing.JTextField();
        numTxt2 = new javax.swing.JTextField();
        searchRutesBttn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAdvice = new javax.swing.JTextArea();
        cleanBttn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        indCBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un Indicador", "Calle", "Carrera", "Avenida", " " }));
        indCBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indCBox1ActionPerformed(evt);
            }
        });

        indCBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un Indicador", "Calle", "Carrera", "Avenida", " ", " " }));
        indCBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indCBox2ActionPerformed(evt);
            }
        });

        searchRutesBttn.setText("Buscar rutas");
        searchRutesBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchRutesBttnActionPerformed(evt);
            }
        });

        txtAdvice.setColumns(20);
        txtAdvice.setRows(5);
        jScrollPane1.setViewportView(txtAdvice);

        cleanBttn.setText("Limpiar buscador");
        cleanBttn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleanBttnActionPerformed(evt);
            }
        });

        jLabel1.setText("Planea tu ruta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(indCBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(indCBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(numTxt1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numTxt2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1)))
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(searchRutesBttn)
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cleanBttn)
                        .addGap(78, 78, 78))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indCBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numTxt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indCBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numTxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(searchRutesBttn)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cleanBttn)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void indCBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        
    }                                        

    private void indCBox2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void cleanBttnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
        numTxt1.setText("");
        numTxt2.setText("");
        txtAdvice.setText("");
        indCBox1.setSelectedIndex(0);
        indCBox2.setSelectedIndex(0);
        //falta reiniciar los comboBox
    }                                         

    private void searchRutesBttnActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
        try {
            txtAdvice.setText("");
            List<Ruta> recs = new ArrayList<>();
            String nameNumberString;//fila de la base de datos
            int num1=Integer.parseInt(numTxt1.getText());
            int num2=Integer.parseInt(numTxt2.getText());
            String Ind1=indCBox1.getSelectedItem().toString();
            String Ind2=indCBox2.getSelectedItem().toString();
            String ruta_a_tomar;
            //la siguiente linea incluye la hora actual, convertida en String, al momento que se toca el boton
            LocalTime now = LocalTime.now();

        // Formatear la hora en el formato hh:mm
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
            String hora_actual = now.format(formatter);
            System.out.print(hora_actual+"\n");
            // Using file pointer creating the file->debe ser modificada 
            File file = new File("C:\\Users\\lafon\\OneDrive\\Documents\\NetBeansProjects\\TrackStreetFighter\\src\\main\\java\\com\\mycompany\\trackstreetfighter\\database.txt");

            if (!file.exists()) {
 
                // Create a new file if not exists.
                file.createNewFile();
            }
            if(Ind1.equals(Ind2)){
                txtAdvice.setText("");
                txtAdvice.setText(String.format("No hay rutas que pasen por una %s con %s, por favor "
                        + "ingresa una direccion valida",Ind1,Ind2));
            
            }else{
                RandomAccessFile raf = new RandomAccessFile(file, "rw");
                // Traversing the file
                // getFilePointer() give the current offset
                // value from start of the file.
                while (raf.getFilePointer() < raf.length()) {

                    // reading line from the file.
                    nameNumberString = raf.readLine();

                    // splitting the string to get name and
                    // number
                    String[] lineSplit = nameNumberString.split(";");
                    //puedo crear una lista con todas las horas, y recorrer esa lista para comparar con
                    List<String> subList = Arrays.asList(lineSplit).subList(6, 26);
                    if(lineSplit[1].equals(Ind1) && Integer.parseInt(lineSplit[2])==num1){//si la primera columna es igual al primer indicador
                        //casi que todo lo que sigue en adelante, es versatil al resto de else if
                        ruta_a_tomar=lineSplit[0];
                        for(String element : subList){
                            LocalTime time1 = LocalTime.parse(hora_actual, formatter);
                            LocalTime time2 = LocalTime.parse(element, formatter);
                            if(element.equals(hora_actual) || time1.isBefore(time2)){
                                recs.add(new Ruta(num1,Ind1,element,ruta_a_tomar));
                                break;
                            } 
                        }
                        
                    }else if(lineSplit[1].equals(Ind2) && Integer.parseInt(lineSplit[2])==num2){
                        ruta_a_tomar=lineSplit[0];
                        for(String element : subList){
                            LocalTime time1 = LocalTime.parse(hora_actual, formatter);
                            LocalTime time2 = LocalTime.parse(element, formatter);
                            if(element.equals(hora_actual) || time1.isBefore(time2)){
                                recs.add(new Ruta(num2,Ind2,element,ruta_a_tomar));
                                break;
                            } 
                        }
                    }else if(lineSplit[3].equals(Ind1) && Integer.parseInt(lineSplit[4])==num1){//si la primera columna es igual al primer indicador
                        ruta_a_tomar=lineSplit[0];
                        for(String element : subList){
                            LocalTime time1 = LocalTime.parse(hora_actual, formatter);
                            LocalTime time2 = LocalTime.parse(element, formatter);
                            if(element.equals(hora_actual) || time1.isBefore(time2)){
                                recs.add(new Ruta(num1,Ind1,element,ruta_a_tomar));
                                break;
                            } 
                        }
                        
                    }else if(lineSplit[3].equals(Ind2) && Integer.parseInt(lineSplit[4])==num2){
                        ruta_a_tomar=lineSplit[0];
                        for(String element : subList){
                            LocalTime time1 = LocalTime.parse(hora_actual, formatter);
                            LocalTime time2 = LocalTime.parse(element, formatter);
                            if(element.equals(hora_actual) || time1.isBefore(time2)){
                                recs.add(new Ruta(num2,Ind2,element,ruta_a_tomar));
                                break;
                            } 
                        }
                        
                    }
                }
                raf.close();
                if(!recs.isEmpty()){
                    for(Ruta rec: recs  ){
                        txtAdvice.append(rec.imprimirDetalles());
                    }
                }else{
                    txtAdvice.setText("");
                    txtAdvice.setText("No se encontro una ruta para llegar a la direccion que has indicado.");
                }
            }           
        }
        catch (IOException ioe)
        {
            System.out.println(ioe);
        }
        catch (NumberFormatException nef)
        {
            System.out.println(nef);
        }
        catch (DateTimeParseException e) {
            System.out.println("Formato de hora inválido: " + e.getMessage());
        }
    }                                               

    

    // Variables declaration - do not modify                     
    private javax.swing.JButton cleanBttn;
    private javax.swing.JComboBox<String> indCBox1;
    private javax.swing.JComboBox<String> indCBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField numTxt1;
    private javax.swing.JTextField numTxt2;
    private javax.swing.JButton searchRutesBttn;
    private javax.swing.JTextArea txtAdvice;
    // End of variables declaration                   
}
