/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchproject;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import static searchproject.SearchProject.DateBinarySearch;
import static searchproject.SearchProject.addOtherDetail;
import static searchproject.SearchProject.parseFunction;
import static searchproject.SearchProject.textSearch;
import static searchproject.SearchProject.wordOf4;
import static searchproject.SearchProject.wordSearch;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bengi
 */
public class AnaForm extends javax.swing.JFrame {

    /**
     * Creates new form AnaForm
     */
    public AnaForm() {
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

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField5 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jLabel2 = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(142, 160, 157));

        jTextField1.setText("Beginning date");

        jTextField2.setText("Final date");
        jTextField2.addActionListener((java.awt.event.ActionEvent evt) -> {
            jTextField2ActionPerformed(evt);
        });

        jTextField4.setText("Word for detail**");
        jTextField4.addActionListener((java.awt.event.ActionEvent evt) -> {
            jTextField4ActionPerformed(evt);
        });

        jButton1.setText("Search");
        jButton1.addActionListener((java.awt.event.ActionEvent evt) -> {
            try {
                jButton1ActionPerformed(evt);
            } catch (ParseException ex) {
                Logger.getLogger(AnaForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

        jTextField5.setText("Word**");

        jButton3.setText("Save File");
        jButton3.addActionListener((java.awt.event.ActionEvent evt) -> {
            try {
                jButton3ActionPerformed(evt);
            } catch (IOException ex) {
                Logger.getLogger(AnaForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(AnaForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jScrollPane1.setViewportView(jScrollPane2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(33, 33, 33)
                                                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(29, 29, 29)
                                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 985, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(259, 259, 259))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(0, 0, Short.MAX_VALUE)
                                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE)))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton1))
                                .addGap(62, 62, 62)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1062, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt)
            throws IOException, FileNotFoundException, ParseException {
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        jLabel2.setText(f.getName());
        ReadFileAndFill(content, Milliseconds);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws ParseException {

        String firstDate = jTextField1.getText();
        int baslangic = 0;
        String s = jTextField5.getText(); // getting a String value
        String word = jTextField4.getText(); // getting a String value
        int bitis = 0;
        if (isValidDate(firstDate)) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss,SSS");
            Date date = sdf.parse(firstDate);
            long millis = date.getTime();
            baslangic = DateBinarySearch(millis, Milliseconds);
        }

        String secondDate = jTextField2.getText();
        if (isValidDate(secondDate)) {
            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss,SSS");
            Date date2 = sdf2.parse(secondDate);
            long millis2 = date2.getTime();
            bitis = DateBinarySearch(millis2, Milliseconds);

        }
        if (s.equals("Word**") == false) {

            CharSequence wordForWord = s;
            wordSearch(wordForWord, content, wordIndex);
        }

        if (word.equals("Word for detail**") == false) {
            CharSequence wordForDetail = word;
            textSearch(wordForDetail, content, detailIndex);
        }
        if (isValidDate(firstDate) || isValidDate(secondDate)) {
            for (int j = baslangic; j <= bitis; ++j) {

                jTextArea1.setText(jTextArea1.getText() + " Date: " + content.get(j).getDate()
                        + " Time: " + content.get(j).getTime()
                        + " Word: " + content.get(j).getWord()
                        + " Detail: " + content.get(j).getDetail() + "\n");
            }
        }
        jTextArea1.setText(jTextArea1.getText() + "\n");

        for (int j = 0; j < wordIndex.size(); ++j) {

            jTextArea1.setText(jTextArea1.getText() + " Date: " + content.get(j).getDate()
                    + " Time: " + content.get(j).getTime()
                    + " Word: " + content.get(j).getWord()
                    + " Detail: " + content.get(j).getDetail() + "\n");
        }

        jTextArea1.setText(jTextArea1.getText() + "\n");
        for (int j = 0; j < detailIndex.size(); ++j) {

            jTextArea1.setText(jTextArea1.getText() + " Date: " + content.get(j).getDate()
                    + " Time: " + content.get(detailIndex.get(j)).getTime()
                    + " Word: " + content.get(detailIndex.get(j)).getWord()
                    + " Detail: " + content.get(detailIndex.get(j)).getDetail() + "\n");
        }
    }

    public boolean isValidDate(String dateString) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss,SSS");
        try {
            df.parse(dateString);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new AnaForm().setVisible(true);
        });
    }

    //Dosyayı satır satır okuyup parse functionın çağrılarak satırların parse 
    //edildigi ve daha sonra objelerin oluşturulup liste atıldıgı fonksiyon
    static public void ReadFileAndFill(List<Content> content, List<Long> Milliseconds) throws FileNotFoundException, IOException, ParseException {
        //-----------------------------DosyaOkuma-----------------------------
        String inputFileName, outputFileName;
        // prepare the input file

        inputFileName = jLabel2.getText();
        File file = new File(inputFileName);
        FileReader fileReader = new FileReader(file);
        BufferedReader br = new BufferedReader(fileReader);
        int choose = 0;
        String line;
        int sayac = 0;
        //----DOSYA OKUMA----
        while ((line = br.readLine()) != null) {
            ++sayac;
            if (!"".equals(line)) {
                if (wordOf4(line) == true) {
                    Content contentTempArray = new Content();
                    parseFunction(line, contentTempArray, Milliseconds);
                    content.add(contentTempArray);
                    choose++;
                } else {
                    addOtherDetail(line, content.get(choose - 1));
                }
            }
        }
        jLabel2.setText(jLabel2.getText() + "    finished parsing ✔");
    }
    private static List<Content> content = new ArrayList<>();
    private static List<Long> Milliseconds = new ArrayList<>();
    private static List<Integer> dateIndex = new ArrayList<>();
    private static List<Integer> timeIndex = new ArrayList<>();
    private static List<Integer> wordIndex = new ArrayList<>();   //INFO DEBUG ERROR kelimeleri
    private static List<Integer> detailIndex = new ArrayList<>(); //Objelerin detail kısmı
    // Variables declaration - do not modify                     
    private static javax.swing.JButton jButton1;
    private static javax.swing.JButton jButton2;
    private static javax.swing.JButton jButton3;
    private static javax.swing.JLabel jLabel1;
    private static javax.swing.JLabel jLabel2;
    private static javax.swing.JPanel jPanel1;
    private static javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JScrollPane jScrollPane2;
    private static javax.swing.JTabbedPane jTabbedPane1;
    private static javax.swing.JTextArea jTextArea1;
    private static javax.swing.JTextField jTextField1;
    private static javax.swing.JTextField jTextField2;
    private static javax.swing.JTextField jTextField4;
    private static javax.swing.JTextField jTextField5;
    // End of variables declaration                   
}
