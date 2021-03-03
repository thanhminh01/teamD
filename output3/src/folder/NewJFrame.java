package folder;
import tung.Data;
import phucTung.UserHome;

import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Array;
import java.util.Arrays;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nguye
 */
public class NewJFrame extends javax.swing.JFrame {
    Data newData = new Data();
    String usr;
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
        CreateFile.newFile();
        try (FileWriter fileWriter = new FileWriter("filename.txt"))
        {
            String filecontent = "0";
            fileWriter.write(filecontent);
            fileWriter.close();
        }    
        catch (IOException e){}
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrameSelfDiag1 = new javax.swing.JFrame();
        cbbseveresymptoms = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btntoframe3 = new javax.swing.JButton();
        cbfeverorchills = new javax.swing.JCheckBox();
        cbmild = new javax.swing.JCheckBox();
        cbnewcough = new javax.swing.JCheckBox();
        cblosstaste = new javax.swing.JCheckBox();
        cbsorethroat = new javax.swing.JCheckBox();
        cbvomiting = new javax.swing.JCheckBox();
        cbunexplained = new javax.swing.JCheckBox();
        cbnonesymp = new javax.swing.JCheckBox();
        jFrameAreaStatistic = new javax.swing.JFrame();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnAreaStatisticResult = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        login = new javax.swing.JFrame();
        jPasswordField1 = new javax.swing.JPasswordField();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        username = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        btnlogin = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jFrameSelfDiag1.setResizable(false);
        jFrameSelfDiag1.setSize(new java.awt.Dimension(750, 600));
        jFrameSelfDiag1.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                jFrameSelfDiag1WindowClosed(evt);
            }
        });

        cbbseveresymptoms.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Your answer.", "I am able to do normal activities like exercising.", "I can only do some daily activities like cleaning and making food.", "I can only do what's necessary such as using the bathroom or eating.", " " }));
        cbbseveresymptoms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbseveresymptomsActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Have you recently started experiencing any of these symptoms ?");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("How severe are your symptoms ?");

        btntoframe3.setText("Next");
        btntoframe3.setMaximumSize(new java.awt.Dimension(91, 23));
        btntoframe3.setMinimumSize(new java.awt.Dimension(91, 23));
        btntoframe3.setPreferredSize(new java.awt.Dimension(91, 23));
        btntoframe3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntoframe3ActionPerformed(evt);
            }
        });

        cbfeverorchills.setText("Fever or Chills");
        cbfeverorchills.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbfeverorchillsActionPerformed(evt);
            }
        });

        cbmild.setText("Mild or moderate difficulty breathing");

        cbnewcough.setText("New or worsening cough");

        cblosstaste.setText("Suddently loss of taste or smell");
        cblosstaste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cblosstasteActionPerformed(evt);
            }
        });

        cbsorethroat.setText("Sore throat");
        cbsorethroat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbsorethroatActionPerformed(evt);
            }
        });

        cbvomiting.setText("Vomiting or diarrhea");

        cbunexplained.setText("Unexplained, significant fatigue or aching throughout the body");

        cbnonesymp.setText("None of the above");

        javax.swing.GroupLayout jFrameSelfDiag1Layout = new javax.swing.GroupLayout(jFrameSelfDiag1.getContentPane());
        jFrameSelfDiag1.getContentPane().setLayout(jFrameSelfDiag1Layout);
        jFrameSelfDiag1Layout.setHorizontalGroup(
            jFrameSelfDiag1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrameSelfDiag1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jFrameSelfDiag1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jFrameSelfDiag1Layout.createSequentialGroup()
                        .addGroup(jFrameSelfDiag1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbunexplained)
                            .addGroup(jFrameSelfDiag1Layout.createSequentialGroup()
                                .addGroup(jFrameSelfDiag1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbsorethroat)
                                    .addComponent(cbfeverorchills))
                                .addGap(107, 107, 107)
                                .addGroup(jFrameSelfDiag1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbmild)
                                    .addComponent(cblosstaste))))
                        .addGap(70, 70, 70)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jFrameSelfDiag1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbvomiting)
                    .addComponent(cbnewcough)
                    .addComponent(cbnonesymp))
                .addGap(40, 40, 40))
            .addGroup(jFrameSelfDiag1Layout.createSequentialGroup()
                .addGroup(jFrameSelfDiag1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrameSelfDiag1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(cbbseveresymptoms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFrameSelfDiag1Layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jFrameSelfDiag1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btntoframe3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        jFrameSelfDiag1Layout.setVerticalGroup(
            jFrameSelfDiag1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrameSelfDiag1Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(jLabel3)
                .addGap(29, 29, 29)
                .addGroup(jFrameSelfDiag1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbfeverorchills)
                    .addGroup(jFrameSelfDiag1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbmild)
                        .addComponent(cbnewcough)))
                .addGap(32, 32, 32)
                .addGroup(jFrameSelfDiag1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbsorethroat)
                    .addGroup(jFrameSelfDiag1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cblosstaste)
                        .addComponent(cbvomiting)))
                .addGap(41, 41, 41)
                .addGroup(jFrameSelfDiag1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbunexplained)
                    .addComponent(cbnonesymp))
                .addGap(61, 61, 61)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(cbbseveresymptoms, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(btntoframe3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jFrameAreaStatistic.setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        jFrameAreaStatistic.setSize(new java.awt.Dimension(400, 400));
        jFrameAreaStatistic.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("What is your region ?");
        jLabel8.setMaximumSize(new java.awt.Dimension(112, 14));
        jLabel8.setMinimumSize(new java.awt.Dimension(112, 14));
        jLabel8.setPreferredSize(new java.awt.Dimension(112, 14));
        jFrameAreaStatistic.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 190, 20));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("What is your Location ?");
        jLabel9.setMaximumSize(new java.awt.Dimension(112, 14));
        jFrameAreaStatistic.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, -1, -1));

        btnAreaStatisticResult.setText("Check Result");
        btnAreaStatisticResult.setMaximumSize(new java.awt.Dimension(92, 23));
        btnAreaStatisticResult.setMinimumSize(new java.awt.Dimension(92, 23));
        btnAreaStatisticResult.setPreferredSize(new java.awt.Dimension(92, 23));
        btnAreaStatisticResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreaStatisticResultActionPerformed(evt);
            }
        });
        jFrameAreaStatistic.getContentPane().add(btnAreaStatisticResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 100, -1));

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jFrameAreaStatistic.getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, -1, -1));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "States", "Districts" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jFrameAreaStatistic.getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, -1));

        login.setResizable(false);
        login.setSize(new java.awt.Dimension(500, 300));

        jPasswordField1.setText("jPasswordField1");

        jFormattedTextField1.setText("jFormattedTextField1");

        username.setText("username");

        password.setText("password");

        btnlogin.setText("Login");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login.getContentPane());
        login.getContentPane().setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(password)
                    .addComponent(username))
                .addGap(34, 34, 34)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnlogin)
                    .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jFormattedTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(136, Short.MAX_VALUE))
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(username))
                .addGap(18, 18, 18)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(password))
                .addGap(44, 44, 44)
                .addComponent(btnlogin)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(300, 300));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jButton7.setText("Self Diagnosis");
        jButton7.setMaximumSize(new java.awt.Dimension(230, 23));
        jButton7.setMinimumSize(new java.awt.Dimension(230, 23));
        jButton7.setPreferredSize(new java.awt.Dimension(230, 23));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Area Statistics");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Area Regulations");
        jButton9.setMaximumSize(new java.awt.Dimension(230, 23));
        jButton9.setMinimumSize(new java.awt.Dimension(230, 23));
        jButton9.setPreferredSize(new java.awt.Dimension(230, 23));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Your account info");
        jButton10.setMaximumSize(new java.awt.Dimension(230, 23));
        jButton10.setMinimumSize(new java.awt.Dimension(230, 23));
        jButton10.setPreferredSize(new java.awt.Dimension(230, 23));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jButton1.setText("Healthcare advice");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButton8)
                .addGap(40, 40, 40)
                .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btntoframe3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntoframe3ActionPerformed
        // TODO add your handling code here:
        if (cbnonesymp.isSelected())
            System.out.println("nothin");
        else
        {
            if (cbfeverorchills.isSelected())
                AddPoint.addPoint(1);
            if (cbmild.isSelected())
                AddPoint.addPoint(1);
            if (cbnewcough.isSelected())
                AddPoint.addPoint(1);
            if (cbsorethroat.isSelected())
                AddPoint.addPoint(1);
            if (cblosstaste.isSelected())
                AddPoint.addPoint(1);            
            if (cbvomiting.isSelected())
                AddPoint.addPoint(1);            
            if (cbunexplained.isSelected())
                AddPoint.addPoint(1);
        }
        String msg = (String)cbbseveresymptoms.getSelectedItem();
        switch (msg)
        {
            case "I can only do some daily activities like cleaning and making food.":
                AddPoint.addPoint(2);
                break;
            case "I can only do what's necessary such as using the bathroom or eating.":
                AddPoint.addPoint(3);
                break;
        }
        try(FileReader fileReader = new FileReader("filename.txt")) 
        {
            int ch = fileReader.read();
            String chString = "";
            while (ch!=-1)
            {
                chString = chString + (char)ch;
                ch = fileReader.read();
            }
            ch = Integer.parseInt(chString);
            if (ch <=4)
            {
                JOptionPane.showMessageDialog(null,"Your result is : " + chString + " point(s)\n "
                        + "You have mild symptoms that may be caused by Covid-19.\n"
                        + "Take care of your health and remember to use self diagnosis again in case of getting new symptoms! ");
            }
            if (ch ==0)
            {
                JOptionPane.showMessageDialog(null,"Your result is : " + chString + " point(s)\n "
                        + "You have no covid-19 related symptoms!");
            }
            if (ch >4)
            {
                JOptionPane.showMessageDialog(null,"Your result is : " + chString + " point(s)\n "
                        + "Your symptoms are likely caused by Covid-19.\n"
                        + "You should avoid contact with others and try to get a covid-19 test as soon as possible!");
            }
            AddPoint.addPoint(Integer.parseInt(chString) * -1);
            fileReader.close();
        }
        catch (FileNotFoundException e) 
        {
            
        }
        catch (IOException e)
        {
            
        }
            
    }//GEN-LAST:event_btntoframe3ActionPerformed

    private void cbbseveresymptomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbseveresymptomsActionPerformed

    }//GEN-LAST:event_cbbseveresymptomsActionPerformed

    private void cbsorethroatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbsorethroatActionPerformed

    }//GEN-LAST:event_cbsorethroatActionPerformed

    private void cbfeverorchillsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbfeverorchillsActionPerformed

    }//GEN-LAST:event_cbfeverorchillsActionPerformed

    private void cblosstasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cblosstasteActionPerformed

    }//GEN-LAST:event_cblosstasteActionPerformed

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        // TODO add your handling code here:
                if(true);
        JOptionPane.showMessageDialog(null,"login successful");
    }//GEN-LAST:event_btnloginActionPerformed

    private void jFrameSelfDiag1WindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrameSelfDiag1WindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFrameSelfDiag1WindowClosed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void btnAreaStatisticResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaStatisticResultActionPerformed
        // TODO add your handling code here:
        //Data newData = new Data();
        String msg = (String)jComboBox4.getSelectedItem();
        switch (msg)
        {
            case "General":
                JOptionPane.showMessageDialog(null, newData.displayGeneralStats());
                break;
            case "States":
                String msg2 = (String)jComboBox2.getSelectedItem();
                JOptionPane.showMessageDialog(null, newData.displayStatesStats(msg2));
                break;
            case "Districts":
                String msg3 = (String)jComboBox2.getSelectedItem();
                JOptionPane.showMessageDialog(null, newData.displayDistrictsStats(msg3));
                break;
        }
                
    }//GEN-LAST:event_btnAreaStatisticResultActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
        String msg = (String)jComboBox4.getSelectedItem();
        switch (msg)
        {
            case "States":
                Object[] a = newData.getNames("states");
                Arrays.sort(a);
                jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(a));
                break;
            case "Districts":
                Object[] b = newData.getNames("districts");
                Arrays.sort(b);
                jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(b));
                break;
            default: jComboBox2.removeAllItems();
                
        }
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.jFrameAreaStatistic.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        JOptionPane.showMessageDialog(null, "Contact limit: \nStays in public are limited to one household and one additional person, children are being "
                + "counted as well.\n\nMask duty: \t\nIt is obligatory to wear a mouth and nose cover outside in the entire inner city area within the “Anlagenring”,\nnorth "
                + "of the railroad line in Sachsenhausen, the area of Berger Straße north of the Alleenring, Leipziger Straße and Königsteiner Straße limited to the sector between "
                + "Bolongarostraße and Kasinostraße.\nMasks are compulsory at all public events and in public facilities.\nWearing a mouth-nose-cover is mandatory in public "
                + "transportation as well as during the stay on platforms and at stops, when driving in a vehicle with persons from more than one household and in taxis.\n\nProhibition "
                + "of alcohol consumption: \t\nThe consumption of alcohol is prohibited all day in defined public places, locations and facilities. From 11:00 pm – 6:00 am the consumption "
                + "of alcohol is forbidden in all public places.\n\nLeisure events + activities: \t\nAll events that serve as entertainment are prohibited.\nGuided city tours are cancelled, "
                + "the zoo and botanical gardens as well as museums, theatres and cinemas are closed. The flea markets have been cancelled.\n\nRestaurants: \t\nRestaurants are closed. Delivery "
                + "and collection of food for consumption at home is allowed. Canteens are also allowed to open.\n\nHotels: \t\nAccommodation offers for tourist purposes are not allowed. "
                + "\nAccommodation offers will only be provided for necessary purposes such as mandatory business trips that cannot be postponed. \nA necessary professional obligation is given, "
                + "if the personal participation on site is absolutely necessary for professional reasons and the change to alternative (tele-) communication means as well as the participation on "
                + "site by a representative is not possible.\n\nMessen + Business Meetings: \t\nTrade fairs are prohibited. As a result of the course taken by the pandemic, Messe Frankfurt will not "
                + "be holding any of its own physical trade fairs at the Frankfurt exhibition grounds between January and March 2021.\nThis does not apply to guest events that are not organized by "
                + "Messe Frankfurt. The rental business continues to operate without restrictions, in compliance with the necessary hygiene and safety regulations.\nHeimtextil postponed to 04.05. - "
                + "07.05.2021\nAutomechanika postponed to 14.09. - 18.09.2021\nLight + Building cancelled, next Light + Building 13.03. - 18.03.2022\nOptatech postponed to 17.05. - 19.05.2022\nTexcare"
                + " postponed to 27.11. - 01.12.2021\nAchema postponed to 04.04. - 08.04.2022\nMeetings and events with personal participation are only permitted in the case of special public interest"
                + " and with the approval of the competent authority. \nThe number of participants in attendance must be kept as low as possible and, in order to comply with the hygiene rules and the "
                + "minimum distance, must be based, among other things, on the type and size of the venue. Wherever possible, telephone or video conferencing shall be used.");        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        dispose();
        UserHome ah = new UserHome(getUserName());
        ah.setTitle("Welcome");
        ah.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.jFrameSelfDiag1.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JOptionPane.showMessageDialog(null, "When you are well\n1. Wash your hands often with soap and water. This includes before and after eating and after going to the toilet\n2. Use alcohol-based hand sanitisers when you can’t use soap and water\n3. Avoid touching your eyes, nose and mouth clean and disinfect surfaces and objects you use often\n4. Increase the amount of fresh air by opening windows or changing air conditioning\n5. There is no evidence that alcohol-free hand rubs are effective against viruses like COVID-19.\n\nWhen you are sick\n1. As we move towards living COVIDSafe, it is important that you stay at home if you feel unwell. You should also continue to practise good hygiene.\n2. If you have cold or flu like symptoms you should seek medical advice and get tested for COVID-19. You should get tested even if your symptoms are mild.\n3. If you have COVID-19 you must isolate and follow the directions of your local Public Health Unit.");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public void setUserName(String id) {                                         
        usr = id;
    } 
    public String getUserName()
    {
        return (usr);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAreaStatisticResult;
    private javax.swing.JButton btnlogin;
    private javax.swing.JButton btntoframe3;
    private javax.swing.JComboBox<String> cbbseveresymptoms;
    private javax.swing.JCheckBox cbfeverorchills;
    private javax.swing.JCheckBox cblosstaste;
    private javax.swing.JCheckBox cbmild;
    private javax.swing.JCheckBox cbnewcough;
    private javax.swing.JCheckBox cbnonesymp;
    private javax.swing.JCheckBox cbsorethroat;
    private javax.swing.JCheckBox cbunexplained;
    private javax.swing.JCheckBox cbvomiting;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFrame jFrameAreaStatistic;
    private javax.swing.JFrame jFrameSelfDiag1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JFrame login;
    private javax.swing.JLabel password;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
int limit1=0;


}
