/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alef Santiago
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    double numa, numb;
    String sinal;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbltitulo = new javax.swing.JLabel();
        txtbarra = new javax.swing.JTextField();
        btnback = new javax.swing.JButton();
        btnce = new javax.swing.JButton();
        btnsete = new javax.swing.JButton();
        btnquatro = new javax.swing.JButton();
        btnum = new javax.swing.JButton();
        btnzero = new javax.swing.JButton();
        btnponto = new javax.swing.JButton();
        btnigual = new javax.swing.JButton();
        btnmais = new javax.swing.JButton();
        btnmenos = new javax.swing.JButton();
        btnvezes = new javax.swing.JButton();
        btndivisao = new javax.swing.JButton();
        btnoito = new javax.swing.JButton();
        btncinco = new javax.swing.JButton();
        btndois = new javax.swing.JButton();
        btnoito1 = new javax.swing.JButton();
        btnseis = new javax.swing.JButton();
        btntres = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbltitulo.setBackground(new java.awt.Color(141, 132, 142));
        lbltitulo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lbltitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbltitulo.setText("                                Calculadora");
        lbltitulo.setOpaque(true);

        btnback.setBackground(new java.awt.Color(251, 247, 247));
        btnback.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnback.setForeground(new java.awt.Color(255, 0, 0));
        btnback.setText("Backspace");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        btnce.setBackground(new java.awt.Color(251, 247, 247));
        btnce.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnce.setForeground(new java.awt.Color(255, 0, 0));
        btnce.setText("CE");
        btnce.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnceActionPerformed(evt);
            }
        });

        btnsete.setBackground(new java.awt.Color(251, 247, 247));
        btnsete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnsete.setForeground(new java.awt.Color(102, 255, 0));
        btnsete.setText("7");
        btnsete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnseteActionPerformed(evt);
            }
        });

        btnquatro.setBackground(new java.awt.Color(251, 247, 247));
        btnquatro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnquatro.setForeground(new java.awt.Color(102, 255, 0));
        btnquatro.setText("4");
        btnquatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquatroActionPerformed(evt);
            }
        });

        btnum.setBackground(new java.awt.Color(251, 247, 247));
        btnum.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnum.setForeground(new java.awt.Color(102, 255, 0));
        btnum.setText("1");
        btnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnumActionPerformed(evt);
            }
        });

        btnzero.setBackground(new java.awt.Color(251, 247, 247));
        btnzero.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnzero.setForeground(new java.awt.Color(102, 255, 0));
        btnzero.setText("0");
        btnzero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnzeroActionPerformed(evt);
            }
        });

        btnponto.setBackground(new java.awt.Color(251, 247, 247));
        btnponto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnponto.setForeground(new java.awt.Color(255, 0, 0));
        btnponto.setText(".");
        btnponto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpontoActionPerformed(evt);
            }
        });

        btnigual.setBackground(new java.awt.Color(251, 247, 247));
        btnigual.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnigual.setForeground(new java.awt.Color(255, 0, 0));
        btnigual.setText("=");
        btnigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnigualActionPerformed(evt);
            }
        });

        btnmais.setBackground(new java.awt.Color(251, 247, 247));
        btnmais.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnmais.setForeground(new java.awt.Color(255, 0, 0));
        btnmais.setText("+");
        btnmais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmaisActionPerformed(evt);
            }
        });

        btnmenos.setBackground(new java.awt.Color(251, 247, 247));
        btnmenos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnmenos.setForeground(new java.awt.Color(255, 0, 0));
        btnmenos.setText("-");
        btnmenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmenosActionPerformed(evt);
            }
        });

        btnvezes.setBackground(new java.awt.Color(251, 247, 247));
        btnvezes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnvezes.setForeground(new java.awt.Color(255, 0, 0));
        btnvezes.setText("x");
        btnvezes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvezesActionPerformed(evt);
            }
        });

        btndivisao.setBackground(new java.awt.Color(251, 247, 247));
        btndivisao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btndivisao.setForeground(new java.awt.Color(255, 0, 0));
        btndivisao.setText("÷");
        btndivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndivisaoActionPerformed(evt);
            }
        });

        btnoito.setBackground(new java.awt.Color(251, 247, 247));
        btnoito.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnoito.setForeground(new java.awt.Color(102, 255, 0));
        btnoito.setText("8");
        btnoito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnoitoActionPerformed(evt);
            }
        });

        btncinco.setBackground(new java.awt.Color(251, 247, 247));
        btncinco.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btncinco.setForeground(new java.awt.Color(102, 255, 0));
        btncinco.setText("5");
        btncinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncincoActionPerformed(evt);
            }
        });

        btndois.setBackground(new java.awt.Color(251, 247, 247));
        btndois.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btndois.setForeground(new java.awt.Color(102, 255, 0));
        btndois.setText("2");
        btndois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndoisActionPerformed(evt);
            }
        });

        btnoito1.setBackground(new java.awt.Color(251, 247, 247));
        btnoito1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnoito1.setForeground(new java.awt.Color(102, 255, 0));
        btnoito1.setText("9");
        btnoito1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnoito1ActionPerformed(evt);
            }
        });

        btnseis.setBackground(new java.awt.Color(251, 247, 247));
        btnseis.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnseis.setForeground(new java.awt.Color(102, 255, 0));
        btnseis.setText("6");
        btnseis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnseisActionPerformed(evt);
            }
        });

        btntres.setBackground(new java.awt.Color(251, 247, 247));
        btntres.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btntres.setForeground(new java.awt.Color(102, 255, 0));
        btntres.setText("3");
        btntres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbltitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnzero, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnponto, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                .addComponent(btnigual, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnquatro, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btncinco, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnseis, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnum, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btndois, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btntres, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnmais, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnmenos, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnvezes, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtbarra)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnsete, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnoito, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnce, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnoito1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btndivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lbltitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtbarra, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnce, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsete, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnoito, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnoito1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnquatro, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnvezes, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncinco, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnseis, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnum, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmenos, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndois, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btntres, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnzero, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnmais, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnigual, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnponto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnzeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnzeroActionPerformed

        txtbarra.setText(txtbarra.getText() + "0");
    }//GEN-LAST:event_btnzeroActionPerformed

    private void btnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnumActionPerformed

        txtbarra.setText(txtbarra.getText() + "1");
    }//GEN-LAST:event_btnumActionPerformed

    private void btndoisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndoisActionPerformed

        txtbarra.setText(txtbarra.getText() + "2");
    }//GEN-LAST:event_btndoisActionPerformed

    private void btntresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntresActionPerformed

        txtbarra.setText(txtbarra.getText() + "3");
    }//GEN-LAST:event_btntresActionPerformed

    private void btnquatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquatroActionPerformed

        txtbarra.setText(txtbarra.getText() + "4");
    }//GEN-LAST:event_btnquatroActionPerformed

    private void btncincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncincoActionPerformed

        txtbarra.setText(txtbarra.getText() + "5");
    }//GEN-LAST:event_btncincoActionPerformed

    private void btnseisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnseisActionPerformed

        txtbarra.setText(txtbarra.getText() + "6");
    }//GEN-LAST:event_btnseisActionPerformed

    private void btnseteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnseteActionPerformed

        txtbarra.setText(txtbarra.getText() + "7");
    }//GEN-LAST:event_btnseteActionPerformed

    private void btnoitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnoitoActionPerformed

        txtbarra.setText(txtbarra.getText() + "8");
    }//GEN-LAST:event_btnoitoActionPerformed

    private void btnoito1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnoito1ActionPerformed

        txtbarra.setText(txtbarra.getText() + "9");
    }//GEN-LAST:event_btnoito1ActionPerformed

    private void btnmaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmaisActionPerformed
        numa = Double.parseDouble(txtbarra.getText());
        txtbarra.setText("");
        sinal = "soma";
    }//GEN-LAST:event_btnmaisActionPerformed

    private void btnpontoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpontoActionPerformed

        txtbarra.setText(txtbarra.getText() + ".");
    }//GEN-LAST:event_btnpontoActionPerformed

    private void btnigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnigualActionPerformed

        numb = Double.parseDouble(txtbarra.getText());
        if (sinal == "soma") {
            txtbarra.setText(String.valueOf(numa + numb));
        }

        if (sinal == "subtração") {
            txtbarra.setText(String.valueOf(numa - numb));
        }

        if (sinal == "multiplicação") {
            txtbarra.setText(String.valueOf(numa * numb));
        }

        if (sinal == "divisão") {
            txtbarra.setText(String.valueOf(numa / numb));
        }
    }//GEN-LAST:event_btnigualActionPerformed

    private void btnmenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmenosActionPerformed
        numa = Double.parseDouble(txtbarra.getText());
        txtbarra.setText("");
        sinal = "subtração";
    }//GEN-LAST:event_btnmenosActionPerformed

    private void btnvezesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvezesActionPerformed
        numa = Double.parseDouble(txtbarra.getText());
        txtbarra.setText("");
        sinal = "multiplicação";
    }//GEN-LAST:event_btnvezesActionPerformed

    private void btndivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndivisaoActionPerformed
        numa = Double.parseDouble(txtbarra.getText());
        txtbarra.setText("");
        sinal = "divisão";
    }//GEN-LAST:event_btndivisaoActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        numa = 0;
        numb = 0;
        txtbarra.setText("0");
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnceActionPerformed
        numa = 0;
        numb = 0;
        txtbarra.setText("");
    }//GEN-LAST:event_btnceActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnce;
    private javax.swing.JButton btncinco;
    private javax.swing.JButton btndivisao;
    private javax.swing.JButton btndois;
    private javax.swing.JButton btnigual;
    private javax.swing.JButton btnmais;
    private javax.swing.JButton btnmenos;
    private javax.swing.JButton btnoito;
    private javax.swing.JButton btnoito1;
    private javax.swing.JButton btnponto;
    private javax.swing.JButton btnquatro;
    private javax.swing.JButton btnseis;
    private javax.swing.JButton btnsete;
    private javax.swing.JButton btntres;
    private javax.swing.JButton btnum;
    private javax.swing.JButton btnvezes;
    private javax.swing.JButton btnzero;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JTextField txtbarra;
    // End of variables declaration//GEN-END:variables
}
