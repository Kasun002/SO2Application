/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controler.ApplicationControler;
import Model.ApplicationModel;
import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author abayw
 */
public class Application3 extends javax.swing.JFrame {

    /**
     * Creates new form Application3
     */
    public Application3() {
        initComponents();
        setLocationRelativeTo(null);
    }
    ArrayList<String> application1;
    ArrayList<String> application2;
    int marks;
    int temp = 0;
    ArrayList<String> application3 = new ArrayList<String>();
    
    public Application3(ArrayList<String> application1, ArrayList<String> application2, int marks) {
        initComponents();
        setLocationRelativeTo(null);
        this.application1 = application1;
        this.application2 = application2;
        lblSerialNo.setText(application1.get(0));
        this.marks = marks;
        this.temp = marks;
        radioYes.setSelected(true);
        setResizable(false);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblSerialNo = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        cmbSport = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        cmbSociety = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        cmbLeadership = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        cmbLeadershipDetails = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        radioYes = new javax.swing.JRadioButton();
        radioNo = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        cmbPerformDetails = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOtherDetails = new javax.swing.JTextArea();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        btnCalculateMarks = new javax.swing.JButton();
        lblTotelMarks = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnFinish = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("S2O Appplicant Details");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("SNO");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 102, 102));
        jLabel12.setText("Other Qualification ");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Sports");

        cmbSport.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No", "School Level", "District Level", "Provisional Level", "Island Level", "National level" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Societies & Associations");

        cmbSociety.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No", "1 Society", "2 Societies", "3 Societies", "4 or more Societies" }));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Leadership Abilities ");

        cmbLeadership.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "No", "1 Leadership", "2 Leaderships", "3 Leaderships", "4 or more Leaderships" }));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Details");

        cmbLeadershipDetails.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Prefect", "Band", "Scout", "Other " }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Performing Abilities");

        radioYes.setText("Yes");
        radioYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioYesActionPerformed(evt);
            }
        });

        radioNo.setText("No");
        radioNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioNoActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Details");

        cmbPerformDetails.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dancing", "Arts ", "Music", "Other" }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Other Details");

        txtOtherDetails.setColumns(20);
        txtOtherDetails.setRows(5);
        jScrollPane1.setViewportView(txtOtherDetails);

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 51, 51));
        jLabel27.setText("Total Marks %");

        btnCalculateMarks.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCalculateMarks.setText("Calculate Marks");
        btnCalculateMarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateMarksActionPerformed(evt);
            }
        });

        lblTotelMarks.setBackground(new java.awt.Color(204, 204, 204));
        lblTotelMarks.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotelMarks.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(lblTotelMarks, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCalculateMarks))
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(13, Short.MAX_VALUE))
                    .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCalculateMarks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTotelMarks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnFinish.setText("Finish");
        btnFinish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinishActionPerformed(evt);
            }
        });

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jSeparator2)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cmbLeadership, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbSport, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbSociety, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbLeadershipDetails, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbPerformDetails, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(radioYes)
                                .addGap(18, 18, 18)
                                .addComponent(radioNo))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnExit)
                                .addGap(18, 18, 18)
                                .addComponent(btnFinish))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblSerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSerialNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbSport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbSociety, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbLeadership, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(cmbLeadershipDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioYes)
                            .addComponent(radioNo)
                            .addComponent(jLabel8)
                            .addComponent(cmbPerformDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFinish)
                            .addComponent(btnExit)))
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalculateMarksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateMarksActionPerformed
        marks = temp;
        double newMarks = 0;
        String newMarks1 = null;
        application3.add(cmbSport.getSelectedItem().toString());
        if (marks > 0) {
            if (cmbSport.getSelectedItem().toString() == "No") {
                marks += 0;
            } else if (cmbSport.getSelectedItem().toString() == "School Level") {
                marks += 5;
            } else if (cmbSport.getSelectedItem().toString() == "District Leve") {
                marks += 6;
            } else if (cmbSport.getSelectedItem().toString() == "Provisional Level") {
                marks += 7;
            } else if (cmbSport.getSelectedItem().toString() == "Island Level") {
                marks += 8;
            } else if (cmbSport.getSelectedItem().toString() == "National level") {
                marks += 10;
            }
        }
        
        application3.add(cmbSociety.getSelectedItem().toString());
        if (marks > 0) {
            if (cmbSport.getSelectedItem().toString() == "No") {
                marks += 0;
            } else if (cmbSociety.getSelectedItem().toString() == "1 Society") {
                marks += 5;
            } else if (cmbSociety.getSelectedItem().toString() == "2 Societies") {
                marks += 6;
            } else if (cmbSociety.getSelectedItem().toString() == "3 Societies") {
                marks += 8;
            } else if (cmbSociety.getSelectedItem().toString() == "4 or more Societies") {
                marks += 10;
            }
        }
        application3.add(cmbLeadership.getSelectedItem().toString());
        if (marks > 0) {
            if (cmbLeadership.getSelectedItem().toString() == "No") {
                marks += 0;
            } else if (cmbLeadership.getSelectedItem().toString() == "1 Leadership") {
                marks += 5;
            } else if (cmbLeadership.getSelectedItem().toString() == "2 Leaderships") {
                marks += 7;
            } else if (cmbLeadership.getSelectedItem().toString() == "3 Leaderships") {
                marks += 8;
            } else if (cmbLeadership.getSelectedItem().toString() == "4 or more Leaderships") {
                marks += 10;
            }
        }
        application3.add(cmbLeadershipDetails.getSelectedItem().toString());
        if (radioYes.isSelected()) {
            application3.add(cmbPerformDetails.getSelectedItem().toString());
            if (marks > 0) {
                marks += 5;
            }
        } else {
            marks += 0;
            application3.add("No");
        }
        if(application2.get(13)!="Undergraguate"){
            if(application2.get(4)!="Pending"){
                newMarks=((double)marks/112)*100;
            }else{
                newMarks=((double)marks/72)*100;
            }
        }else{
            lblTotelMarks.setText("0.0");
        }
        if(!txtOtherDetails.getText().equals("")){
        application3.add(txtOtherDetails.getText());
        }else{
            application3.add("No");
        }
        DecimalFormat df = new DecimalFormat("###.##");
        newMarks1=df.format(newMarks);
        lblTotelMarks.setText(newMarks1);
        application3.add(lblTotelMarks.getText());
        System.err.println(application3);
        
    }//GEN-LAST:event_btnCalculateMarksActionPerformed
    
    private void radioYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioYesActionPerformed
        // TODO add your handling code here:
        radioNo.setSelected(false);
        cmbPerformDetails.setVisible(true);
        
    }//GEN-LAST:event_radioYesActionPerformed
    
    private void radioNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioNoActionPerformed
        // TODO add your handling code here:
        radioYes.setSelected(false);
        cmbPerformDetails.setVisible(false);
    }//GEN-LAST:event_radioNoActionPerformed
    
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed
    
    private void btnFinishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinishActionPerformed
        // TODO add your handling code here:
        if (!lblTotelMarks.getText().equals("")) {
            ApplicationModel app = new ApplicationModel();
            app.setSerial_no(application1.get(0));
            System.out.println("1");
            app.setName_init(application1.get(1));
            System.out.println("2");
            app.setName_call(application1.get(2));
            System.out.println("3");
            app.setProvince(application1.get(3));
            System.out.println("4");
            app.setDistric(application1.get(4));
            System.out.println("5");
            app.setHome_town(application1.get(5));
            System.out.println("6");
            app.setSex(application1.get(6));
            System.out.println("7");
            app.setNic(application1.get(7));
            System.out.println("8");
            app.setDOB(application1.get(8));
            System.out.println("9");
            app.setAddress(application1.get(9));
            System.out.println("10");
            app.setAddress_temp(application1.get(10));
            System.out.println("11");
            app.setMobile_no(application1.get(11));
            System.out.println("12");
            app.setHome_no(application1.get(12));
            System.out.println("13");
            app.setOther_no(application1.get(13));
            System.out.println("14");
            app.setEmail_1(application1.get(14));
            System.out.println("15");
            if(!application1.get(15).equals("")){
                app.setEmail_2(application1.get(15));
                System.out.println("16");
            }else{
                app.setEmail_2("No");
                System.out.println("16.2");
            }
            //app.setEmail_2(application1.get(15));
            app.setOl_summary(application2.get(0));
            System.out.println("17");
            app.setOl_sinhala(application2.get(1));
            System.out.println("18");
            app.setOl_math(application2.get(2));
            System.out.println("19");
            app.setOl_english(application2.get(3));
            System.out.println("20");
            app.setAl_status(application2.get(4));
            System.out.println("21");
            app.setAl_streame(application2.get(5));
            System.out.println("22");
            app.setAl_s1(application2.get(6));
            System.out.println("23");
            app.setAl_s2(application2.get(7));
            System.out.println("24");
            app.setAl_s3(application2.get(8));
            System.out.println("25");
            app.setAl_english(application2.get(9));
            System.out.println("26");
            app.setAl_zscore(application2.get(10));
            System.out.println("27");
            if(!application2.get(11).equals("")){
            app.setDiploma(application2.get(11));
            System.out.println("28");
            }else{
                app.setDiploma("No");
                System.out.println("28.2");
            }
            if(!application2.get(12).equals("")){
            app.setSetificate(application2.get(12));
            System.out.println("29");
            }else{
               app.setSetificate("No"); 
               System.out.println("29.2");
            }
            if(!application2.get(13).equals("")){
            app.setUniversity(application2.get(13));
            System.out.println("30");
            }else{
                app.setUniversity("No");
                System.out.println("30.2");
            }
            app.setOther_prof_qulification(application2.get(14));
            System.out.println("31");
            if(!application3.get(0).equals("")){
                app.setOther_prof_qulification(application3.get(0));
                System.out.println("32");
            }else{
                app.setOther_prof_qulification("No");
                System.out.println("32.2");
            }
            if(!application3.get(1).equals("")){
                app.setSport(application3.get(1));
                System.out.println("33");
            }else{
                app.setSport("No");
                System.out.println("33.2");
            }
            if(!application3.get(2).equals("")){
                app.setSociety(application3.get(2));
                System.out.println("34");
            }else{
                app.setSociety("No");
                System.out.println("34.2");
            }
            if(!application3.get(3).equals("")){
                app.setLeadership(application3.get(3));
                System.out.println("35");
            }else{
                app.setLeadership("No");
                System.out.println("35.2");
            }
            if(!application3.get(4).equals("")){
                app.setLeadership_detail(application3.get(4));
                System.out.println("36");
            }else{
                app.setLeadership_detail("No");
                System.out.println("36.2");
            }
            
            if(!application3.get(5).equals("")){
                app.setOther_detail(application3.get(5));
                System.out.println("37");
            }else{
                app.setOther_detail("No");
                System.out.println("37.2");
            }
            
            app.setMarks(application3.get(6));
            if (marks > 0) {
                app.setStatus("Qulified");
                System.out.println("38");
            } else {
                app.setStatus("Dis Qualified");
                System.out.println("38.2");
            }
            ApplicationControler.addDetail(app);
            System.out.println("39");
            
            this.dispose();
            new Search().setVisible(true);
        }
    }//GEN-LAST:event_btnFinishActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new Search().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Application3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Application3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Application3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Application3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Application3().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalculateMarks;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFinish;
    private javax.swing.JComboBox cmbLeadership;
    private javax.swing.JComboBox cmbLeadershipDetails;
    private javax.swing.JComboBox cmbPerformDetails;
    private javax.swing.JComboBox cmbSociety;
    private javax.swing.JComboBox cmbSport;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblSerialNo;
    private javax.swing.JLabel lblTotelMarks;
    private javax.swing.JRadioButton radioNo;
    private javax.swing.JRadioButton radioYes;
    private javax.swing.JTextArea txtOtherDetails;
    // End of variables declaration//GEN-END:variables
}
