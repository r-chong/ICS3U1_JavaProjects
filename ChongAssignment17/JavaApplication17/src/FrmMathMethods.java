/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author s201076119
 */
public class FrmMathMethods extends javax.swing.JFrame {

    /**
     * Creates new form FrmMathMethods
     */
    public FrmMathMethods() {
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
        jEditorPane1 = new javax.swing.JEditorPane();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCubeRoot = new javax.swing.JTextField();
        btnCubeRoot = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtDegrees = new javax.swing.JTextField();
        btnDegrees = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtPowerNum1 = new javax.swing.JTextField();
        btnPower = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtAbsolute = new javax.swing.JTextField();
        btnAbsolute = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnHypotenuse = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtSquareRoot = new javax.swing.JTextField();
        btnSquareRoot = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtRadians = new javax.swing.JTextField();
        btnRadians = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtNaturalLog = new javax.swing.JTextField();
        btnNaturalLog = new javax.swing.JButton();
        txtPowerNum2 = new javax.swing.JTextField();
        txtHypotenuseNum1 = new javax.swing.JTextField();
        txtHypotenuseNum2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblOutputCubeRoot = new javax.swing.JLabel();
        lblOutputDegrees = new javax.swing.JLabel();
        lblOutputPower = new javax.swing.JLabel();
        lblOutputAbsolute = new javax.swing.JLabel();
        lblOutputHypotenuse = new javax.swing.JLabel();
        lblOutputSquareRoot = new javax.swing.JLabel();
        lblOutputRadians = new javax.swing.JLabel();
        lblOutputNaturalLog = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jEditorPane1);

        jLabel15.setText("Answer:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Enter an integer. The program will display the CUBE ROOT of the integer.");

        btnCubeRoot.setText("CUBE ROOT");
        btnCubeRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCubeRootActionPerformed(evt);
            }
        });

        jLabel2.setText(" Enter an angle in radians. The program will display the angle in DEGREES.");

        btnDegrees.setText("DEGREES");
        btnDegrees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDegreesActionPerformed(evt);
            }
        });

        jLabel3.setText("Enter two numbers. The program will display the first number to the power of the second number.");

        btnPower.setText("POWER");
        btnPower.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPowerActionPerformed(evt);
            }
        });

        jLabel4.setText("Enter a number. The program will display the ABSOLUTE VALUE of the number.");

        btnAbsolute.setText("ABSOLUTE VALUE");
        btnAbsolute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbsoluteActionPerformed(evt);
            }
        });

        jLabel5.setText("Enter the length of a right angle triangle. The program will display the HYPOTENUSE of the triangle.");

        btnHypotenuse.setText("HYPOTENUSE");
        btnHypotenuse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHypotenuseActionPerformed(evt);
            }
        });

        jLabel6.setText("Enter a positive integer. The program will display the SQUARE ROOT of the integer.");

        btnSquareRoot.setText("SQUARE ROOT");
        btnSquareRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSquareRootActionPerformed(evt);
            }
        });

        jLabel7.setText("Enter an angle in degrees. The program will display the angle in RADIANS.");

        btnRadians.setText("RADIANS");
        btnRadians.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRadiansActionPerformed(evt);
            }
        });

        jLabel8.setText("Enter a positive number. The program will display the NATURAL LOGARITHM of the NUMBER.");

        btnNaturalLog.setText("NATURAL LOG");
        btnNaturalLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNaturalLogActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(180, 54, 100));
        jLabel9.setText("MAGICAL MATH METHODS");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/molly.gif"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/molly.gif"))); // NOI18N

        lblOutputCubeRoot.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 11)); // NOI18N
        lblOutputCubeRoot.setForeground(new java.awt.Color(180, 54, 100));

        lblOutputDegrees.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 11)); // NOI18N
        lblOutputDegrees.setForeground(new java.awt.Color(180, 54, 100));

        lblOutputPower.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 11)); // NOI18N
        lblOutputPower.setForeground(new java.awt.Color(180, 54, 100));

        lblOutputAbsolute.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 11)); // NOI18N
        lblOutputAbsolute.setForeground(new java.awt.Color(180, 54, 100));

        lblOutputHypotenuse.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 11)); // NOI18N
        lblOutputHypotenuse.setForeground(new java.awt.Color(180, 54, 100));

        lblOutputSquareRoot.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 11)); // NOI18N
        lblOutputSquareRoot.setForeground(new java.awt.Color(180, 54, 100));

        lblOutputRadians.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 11)); // NOI18N
        lblOutputRadians.setForeground(new java.awt.Color(180, 54, 100));

        lblOutputNaturalLog.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 11)); // NOI18N
        lblOutputNaturalLog.setForeground(new java.awt.Color(180, 54, 100));

        jLabel10.setText("Answer:");

        jLabel12.setText("Answer:");

        jLabel14.setText("Answer:");

        jLabel17.setText("Answer:");

        jLabel18.setText("Answer:");

        jLabel19.setText("Answer:");

        jLabel20.setText("Answer:");

        jLabel21.setText("Answer:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDegrees, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(btnDegrees))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCubeRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(btnCubeRoot))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtAbsolute, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(btnAbsolute))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHypotenuseNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtHypotenuseNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(54, 54, 54)
                                .addComponent(btnHypotenuse))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtSquareRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(btnSquareRoot))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtRadians, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(btnRadians))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNaturalLog, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(btnNaturalLog))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPowerNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(btnPower)))
                        .addGap(134, 134, 134)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel21)
                            .addComponent(jLabel14)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lblOutputCubeRoot)
                            .addComponent(lblOutputDegrees)
                            .addComponent(lblOutputPower)
                            .addComponent(lblOutputAbsolute)
                            .addComponent(lblOutputHypotenuse)
                            .addComponent(lblOutputSquareRoot)
                            .addComponent(lblOutputRadians)
                            .addComponent(lblOutputNaturalLog))
                        .addGap(79, 79, 79))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel11)
                                .addGap(80, 80, 80)
                                .addComponent(jLabel9)
                                .addGap(80, 80, 80)
                                .addComponent(jLabel13))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(txtPowerNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel1)))
                        .addGap(16, 16, 16)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel11))
                        .addGap(37, 37, 37))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCubeRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCubeRoot)
                    .addComponent(lblOutputCubeRoot)
                    .addComponent(jLabel10))
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDegrees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDegrees)
                    .addComponent(lblOutputDegrees)
                    .addComponent(jLabel12))
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPowerNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPower)
                    .addComponent(lblOutputPower)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPowerNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAbsolute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAbsolute)
                    .addComponent(lblOutputAbsolute)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtHypotenuseNum1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtHypotenuseNum2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOutputHypotenuse)
                            .addComponent(jLabel17))
                        .addComponent(btnHypotenuse)))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSquareRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSquareRoot)
                    .addComponent(lblOutputSquareRoot)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRadians, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRadians)
                    .addComponent(lblOutputRadians)
                    .addComponent(jLabel19))
                .addGap(27, 27, 27)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNaturalLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNaturalLog)
                    .addComponent(lblOutputNaturalLog)
                    .addComponent(jLabel20))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCubeRootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCubeRootActionPerformed
        double inputCubeRoot = Double.parseDouble(txtCubeRoot.getText());
        double cubeRoot = Math.cbrt(inputCubeRoot);
        lblOutputCubeRoot.setText(String.valueOf(cubeRoot));
    }//GEN-LAST:event_btnCubeRootActionPerformed

    private void btnDegreesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDegreesActionPerformed
        double inputDegrees = Double.parseDouble(txtDegrees.getText());
        double degrees = Math.toDegrees(inputDegrees);
        lblOutputDegrees.setText(String.valueOf(degrees));
    }//GEN-LAST:event_btnDegreesActionPerformed

    private void btnPowerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPowerActionPerformed
        double PowerNum1 = Double.parseDouble(txtPowerNum1.getText());
        double PowerNum2 = Double.parseDouble(txtPowerNum2.getText());
        double Power = Math.pow(PowerNum1,PowerNum2);
        lblOutputPower.setText(String.valueOf(Power));
    }//GEN-LAST:event_btnPowerActionPerformed

    private void btnAbsoluteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbsoluteActionPerformed
        double inputAbsolute = Double.parseDouble(txtAbsolute.getText());
        double Absolute = Math.abs(inputAbsolute);
        lblOutputAbsolute.setText(String.valueOf(Absolute));
    }//GEN-LAST:event_btnAbsoluteActionPerformed

    private void btnHypotenuseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHypotenuseActionPerformed
        double HypotenuseNum1 = Double.parseDouble(txtHypotenuseNum1.getText());
        double HypotenuseNum2 = Double.parseDouble(txtHypotenuseNum2.getText());
        double Hypotenuse = Math.hypot(HypotenuseNum1,HypotenuseNum2);
        lblOutputHypotenuse.setText(String.valueOf(Hypotenuse));
    }//GEN-LAST:event_btnHypotenuseActionPerformed

    private void btnSquareRootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSquareRootActionPerformed
        double inputSquareRoot = Double.parseDouble(txtSquareRoot.getText());
        double SquareRoot = Math.sqrt(inputSquareRoot);
        lblOutputSquareRoot.setText(String.valueOf(SquareRoot));
    }//GEN-LAST:event_btnSquareRootActionPerformed

    private void btnRadiansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRadiansActionPerformed
        double inputRadians = Double.parseDouble(txtRadians.getText());
        double Radians = Math.toRadians(inputRadians);
        lblOutputRadians.setText(String.valueOf(Radians));
    }//GEN-LAST:event_btnRadiansActionPerformed

    private void btnNaturalLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNaturalLogActionPerformed
        double inputNaturalLog = Double.parseDouble(txtCubeRoot.getText());
        double NaturalLog = Math.log(inputNaturalLog);
        lblOutputNaturalLog.setText(String.valueOf(NaturalLog));
    }//GEN-LAST:event_btnNaturalLogActionPerformed

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
            java.util.logging.Logger.getLogger(FrmMathMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMathMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMathMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMathMethods.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMathMethods().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbsolute;
    private javax.swing.JButton btnCubeRoot;
    private javax.swing.JButton btnDegrees;
    private javax.swing.JButton btnHypotenuse;
    private javax.swing.JButton btnNaturalLog;
    private javax.swing.JButton btnPower;
    private javax.swing.JButton btnRadians;
    private javax.swing.JButton btnSquareRoot;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblOutputAbsolute;
    private javax.swing.JLabel lblOutputCubeRoot;
    private javax.swing.JLabel lblOutputDegrees;
    private javax.swing.JLabel lblOutputHypotenuse;
    private javax.swing.JLabel lblOutputNaturalLog;
    private javax.swing.JLabel lblOutputPower;
    private javax.swing.JLabel lblOutputRadians;
    private javax.swing.JLabel lblOutputSquareRoot;
    private javax.swing.JTextField txtAbsolute;
    private javax.swing.JTextField txtCubeRoot;
    private javax.swing.JTextField txtDegrees;
    private javax.swing.JTextField txtHypotenuseNum1;
    private javax.swing.JTextField txtHypotenuseNum2;
    private javax.swing.JTextField txtNaturalLog;
    private javax.swing.JTextField txtPowerNum1;
    private javax.swing.JTextField txtPowerNum2;
    private javax.swing.JTextField txtRadians;
    private javax.swing.JTextField txtSquareRoot;
    // End of variables declaration//GEN-END:variables
}
