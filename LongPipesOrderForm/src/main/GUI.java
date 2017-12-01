package main;

import java.util.ArrayList;
import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author 781212, 788777, 777611, 790487
 */
public class GUI extends javax.swing.JFrame {

    //Store all pipes made by user.
    private ArrayList<Pipe> pipes = new ArrayList();
    //model used to store displayed list of ordered items.
    DefaultListModel<String> model = new DefaultListModel<String>();
    //Used for creating and validating pipes.
    private PipeFactory pipeFactory = new PipeFactory();

    //To make sure everything looks tidy!(adds formatting)
    private DecimalFormat dec = new DecimalFormat("#.00");

    //Set maximum limits on quantity, width and height. (100, 6m, 4in respectively)
    private final int maxLength = 6, maxDiameter = 4, maxQty = 100;

    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tbxDiameter = new javax.swing.JTextField();
        tbxLength = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbxGrade = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cbxColour = new javax.swing.JComboBox<>();
        cbxInsulation = new javax.swing.JCheckBox();
        cbxReinforcement = new javax.swing.JCheckBox();
        cbxChemicalResistance = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        spnQty = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        lbxOrderList = new javax.swing.JList<>();
        btnDelete = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        tbxTotal = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbxError = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Long Pipes Order Form");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("LongPipes Order Form");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Add New Pipe"));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel3.setText("Length(m)");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel2.setText("Diameter(in)");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel5.setText("Grade of plastic:");

        cbxGrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grade 1", "Grade 2", "Grade 3", "Grade 4", "Grade 5" }));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel7.setText("Colour Printer:");

        cbxColour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Colour", "1 Colour", "2 Colours" }));

        cbxInsulation.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        cbxInsulation.setText("Insulation");

        cbxReinforcement.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        cbxReinforcement.setText("Reinforcement");

        cbxChemicalResistance.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        cbxChemicalResistance.setText("Chemical resistance");
        cbxChemicalResistance.setToolTipText("");
        cbxChemicalResistance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxChemicalResistanceActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Extra options:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel12.setText("Quantity");

        btnAdd.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnAdd.setText("Add to Order");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        spnQty.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxReinforcement)
                            .addComponent(cbxInsulation)
                            .addComponent(cbxChemicalResistance)
                            .addComponent(jLabel11)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(spnQty, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tbxDiameter, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)
                                    .addComponent(tbxLength)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxGrade, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxColour, 0, 90, Short.MAX_VALUE))))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tbxLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbxDiameter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxColour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxInsulation)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxReinforcement)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxChemicalResistance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(spnQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAdd))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Current Order List"));
        jPanel2.setToolTipText("");

        btnClear.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnClear.setText("Clear order");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        lbxOrderList.setFont(new java.awt.Font("Consolas", 0, 11)); // NOI18N
        lbxOrderList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lbxOrderList.setToolTipText("");
        jScrollPane4.setViewportView(lbxOrderList);

        btnDelete.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnSubmit.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        tbxTotal.setEditable(false);
        tbxTotal.setText("0.00");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel14.setText("Total (£):");

        tbxError.setEditable(false);
        tbxError.setBackground(getBackground());
        tbxError.setColumns(20);
        tbxError.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        tbxError.setRows(5);
        jScrollPane2.setViewportView(tbxError);

        jLabel4.setText("Grade | Colours | Length | Diameter |  Insulation | Reinforcement | Resistance | Quantity | Cost");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane4)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 347, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnClear))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btnCancel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tbxTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbxTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnSubmit)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxChemicalResistanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxChemicalResistanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxChemicalResistanceActionPerformed

    //pretend the order is submitted (beyond the scope of requirements)
    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        if (pipes.size() != 0) {
            JOptionPane.showMessageDialog(null, "Thank you, your order has been submitted!", "Submitted", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Your order is empty, please add items to order!", "Error: Empty Order", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    //when the cancel button is pressed, close the application on prompt
    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        int close = JOptionPane.showConfirmDialog(null, "Do you want to exit?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (close == JOptionPane.YES_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    //When Adding a new pipe to the order:
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        //Set error variable to clear
        tbxError.setText("");
        String err = "";
        byte grade = 0;
        double length = 0;
        double diameter = 0;

        //check textboxes are valid input (non-empty and parse to double)        
        try {
            length = Double.parseDouble(tbxLength.getText());
            if (length > maxLength || length <= 0) {
                err += "Length is invalid. Must be between 0 and 6 centimeters.\n";
            } else {

            }
        } catch (NumberFormatException e) {
            //Not a number
            err += "Length is not a number. \n";
        }
        try {
            diameter = Double.parseDouble(tbxDiameter.getText());
            if (diameter > maxDiameter || diameter <= 0) {
                err += "Diameter is invalid. Must be between 0 and 4 inches.\n";
            }
        } catch (NumberFormatException e) {
            //Not a Number
            err += "Diameter is not a number. \n";
        }

        //store current grade
        grade = (byte) cbxGrade.getSelectedIndex();
        grade++;

        //test the pipe is okay.
        String testPipe = pipeFactory.ValidatePipe(grade, cbxChemicalResistance.isSelected(), length, diameter, cbxInsulation.isSelected(),
                cbxReinforcement.isSelected(), cbxColour.getSelectedIndex(), (int) spnQty.getValue());

        if (testPipe.charAt(0) != 'E' && err == "") {
            //Finally add the pipe!
            pipes.add(pipeFactory.MakePipe(grade, cbxChemicalResistance.isSelected(), length, diameter, cbxInsulation.isSelected(),
                    cbxReinforcement.isSelected(), cbxColour.getSelectedIndex(), (int) spnQty.getValue()));

            Pipe p = pipes.get(pipes.size() - 1); //get last pipe added.

            /*TIDY THIS UP*/
            //adjust the length of spacing to format correctly
            String spaceLen = "        ";
            if (p.getQty() >= 10 && p.getQty() < 100) {
                spaceLen = "       ";
            }
            if (p.getQty() == 100) {
                spaceLen = "      ";
            }

            //add the new pipe to the UI so the user can view / delete pipes they do not want
            model.addElement("   "
                    + Integer.toString(p.getGrade() + 1)
                    + "       "
                    + p.getColour()
                    + "   "
                    + dec.format(pipeFactory.convertToMeters(p.getLength()))
                    + "     "
                    + dec.format(p.getOuterDiameter())
                    + "       "
                    + p.getInnerInsulation()
                    + "          "
                    + p.getOuterReinforcement()
                    + "       "
                    + p.getChemicalResistance()
                    + spaceLen
                    + p.getQty()
                    + "  "
                    + dec.format(p.getCostTotal()));
            //end adding to element

            lbxOrderList.setModel(model);

            err += "\n Added Successfully!";
            tbxError.setForeground(Color.BLACK);
            tbxError.setText(err);
            updateTotal();
        } else {
            tbxError.setForeground(Color.RED);
            tbxError.setText("Error:\n" + err);
        }


    }//GEN-LAST:event_btnAddActionPerformed

    //delete a pipe from the order, removes both from the GUI JList and the ArrayList.
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedItem = lbxOrderList.getSelectedIndex();
        //check selected, if so remove from the model and the pipes arraylist
        if (selectedItem > -1) {
            model.remove(selectedItem);
            pipes.remove(selectedItem);
            updateTotal();
            //Select the item at the same index as the deleted, if it doesn't exist pick the previous item.
            if (selectedItem < model.size()) {
                lbxOrderList.setSelectedIndex(selectedItem);
            } else {
                lbxOrderList.setSelectedIndex(selectedItem - 1);
            }
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    //button to remove all from current order.
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        pipes.clear();
        model.clear();
        updateTotal();
    }//GEN-LAST:event_btnClearActionPerformed

    //Update total cost in tbxTotal
    private void updateTotal() {
        double total = 0;
        for (Pipe pipe : pipes) {
            total += pipe.getCostTotal();
        }
        if (total != 0) {
            tbxTotal.setText(dec.format(total));
        } else {
            tbxTotal.setText("0.00");
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the System look and feel, modified to do so.*/
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            // Set System L&F
            javax.swing.UIManager.setLookAndFeel(
                    javax.swing.UIManager.getSystemLookAndFeelClassName());

            //for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
            //    if ("Nimbus".equals(info.getName())) {
            //       javax.swing.UIManager.setLookAndFeel(info.getClassName());
            //       break;
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*PROGRAM STARTS HERE*/
 /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JCheckBox cbxChemicalResistance;
    private javax.swing.JComboBox<String> cbxColour;
    private javax.swing.JComboBox<String> cbxGrade;
    private javax.swing.JCheckBox cbxInsulation;
    private javax.swing.JCheckBox cbxReinforcement;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> lbxOrderList;
    private javax.swing.JSpinner spnQty;
    private javax.swing.JTextField tbxDiameter;
    private javax.swing.JTextArea tbxError;
    private javax.swing.JTextField tbxLength;
    private javax.swing.JTextField tbxTotal;
    // End of variables declaration//GEN-END:variables
}
