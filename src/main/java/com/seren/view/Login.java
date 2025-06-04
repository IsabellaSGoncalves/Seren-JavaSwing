/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.seren.view;

import com.seren.controller.LoginController;
import com.seren.model.Usuario;
import com.seren.util.ValidadorDadosUsuarioLogin;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import com.seren.util.LembrarEmailUtil;

/**
 *
 * @author Pichau
 */
public class Login extends javax.swing.JFrame {

    private final LoginController controller = new LoginController();

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getClassLoader().getResource("images/iconLogo.png")).getImage());
        setResizable(false);
        setLocationRelativeTo(null);

//      labelLogingotoCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
//        public void mouseClicked(java.awt.event.MouseEvent evt) {
//           
//            Cadastro cadastro = new Cadastro();
//            cadastro.setVisible(true);
//            
//            setVisible(false);
//        }
//    });
//
//    
//    labelLogingotoCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        if (LembrarEmailUtil.temEmailGuardado()) {
            emailInputLogin.setText(LembrarEmailUtil.getEmailGuardado());
            jCheckBox1.setSelected(true);
        } else {
            emailInputLogin.setText("");
            jCheckBox1.setSelected(false);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cadastroButton1 = new com.seren.components.RoundedButton(30);
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        loginButton = new com.seren.components.RoundedButton(30);
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        emailInputLogin = new com.seren.components.RoundedJTextField(30);
        jLabel5 = new javax.swing.JLabel();
        senhaInputLogin = new com.seren.components.RoundedJPasswordField(20);
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Seren - Login");
        setBackground(new java.awt.Color(255, 153, 204));

        jPanel2.setBackground(new java.awt.Color(102, 102, 0));
        jPanel2.setMinimumSize(new java.awt.Dimension(920, 630));
        jPanel2.setPreferredSize(new java.awt.Dimension(920, 630));
        jPanel2.setLayout(null);

        jPanel10.setBackground(new java.awt.Color(255, 209, 196));
        jPanel10.setAlignmentX(0.0F);
        jPanel10.setAlignmentY(0.0F);
        jPanel10.setMaximumSize(new java.awt.Dimension(460, 630));
        jPanel10.setPreferredSize(new java.awt.Dimension(460, 630));

        jPanel12.setBackground(new java.awt.Color(255, 209, 196));

        jPanel11.setBackground(new java.awt.Color(255, 209, 196));
        jPanel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel11.setPreferredSize(new java.awt.Dimension(460, 190));
        jPanel11.setRequestFocusEnabled(false);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(1, 66, 158));
        jLabel6.setText("Bem-vinda de volta ao ");
        jLabel6.setToolTipText("");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel11.add(jLabel6);

        jLabel8.setFont(new java.awt.Font("Segoe Script", 0, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(1, 66, 158));
        jLabel8.setText("Seren !");
        jLabel8.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel11.add(jLabel8);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Se conecte para gerenciar sua vida profissional ");
        jLabel7.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel11.add(jLabel7);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("de forma prática e rápida");
        jLabel10.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jPanel11.add(jLabel10);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Ainda não tem uma conta?");

        cadastroButton1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        cadastroButton1.setForeground(new java.awt.Color(1, 66, 158));
        cadastroButton1.setText("Cadastre-se");
        cadastroButton1.setToolTipText("");
        cadastroButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        cadastroButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cadastroButton1.setMinimumSize(new java.awt.Dimension(200, 40));
        cadastroButton1.setPreferredSize(new java.awt.Dimension(200, 40));
        cadastroButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroButton1ActionPerformed(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LoginCadastro/LoginPlanta.png"))); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cadastroButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(101, 101, 101))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cadastroButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.add(jPanel12);

        jPanel2.add(jPanel10);
        jPanel10.setBounds(460, 0, 460, 630);

        jPanel1.setBackground(new java.awt.Color(255, 246, 248));
        jPanel1.setAlignmentX(0.0F);
        jPanel1.setAlignmentY(0.0F);
        jPanel1.setMinimumSize(new java.awt.Dimension(460, 630));
        jPanel1.setPreferredSize(new java.awt.Dimension(460, 630));

        jPanel4.setBackground(new java.awt.Color(255, 246, 248));
        jPanel4.setPreferredSize(new java.awt.Dimension(460, 200));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 66, 158));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel1)
                .addContainerGap(169, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(130, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        jPanel1.add(jPanel4);

        jPanel3.setBackground(new java.awt.Color(255, 246, 248));
        jPanel3.setMaximumSize(new java.awt.Dimension(450, 260));
        jPanel3.setMinimumSize(new java.awt.Dimension(450, 260));
        jPanel3.setPreferredSize(new java.awt.Dimension(450, 260));

        jCheckBox1.setBackground(new java.awt.Color(255, 246, 248));
        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(1, 66, 158));
        jCheckBox1.setText("Lembre de mim");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        loginButton.setBackground(new java.awt.Color(1, 66, 158));
        loginButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Entrar");
        loginButton.setToolTipText("");
        loginButton.setAlignmentY(0.0F);
        loginButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(1, 66, 158)));
        loginButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        loginButton.setPreferredSize(new java.awt.Dimension(200, 40));
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(255, 246, 248));
        jPanel5.setLayout(null);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LoginCadastro/icon/e-mail.png"))); // NOI18N
        jPanel5.add(jLabel12);
        jLabel12.setBounds(70, 34, 20, 20);

        emailInputLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        emailInputLogin.setToolTipText("");
        emailInputLogin.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        emailInputLogin.setMargin(new java.awt.Insets(0, 30, 0, 10));
        emailInputLogin.setNextFocusableComponent(senhaInputLogin);
        emailInputLogin.setPreferredSize(new java.awt.Dimension(225, 30));
        emailInputLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailInputLoginActionPerformed(evt);
            }
        });
        jPanel5.add(emailInputLogin);
        emailInputLogin.setBounds(60, 30, 225, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LoginCadastro/icon/fechadura.png"))); // NOI18N
        jLabel5.setFocusable(false);
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanel5.add(jLabel5);
        jLabel5.setBounds(70, 90, 20, 30);

        senhaInputLogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        senhaInputLogin.setMargin(new java.awt.Insets(0, 30, 0, 10));
        senhaInputLogin.setNextFocusableComponent(loginButton);
        senhaInputLogin.setPreferredSize(new java.awt.Dimension(225, 30));
        jPanel5.add(senhaInputLogin);
        senhaInputLogin.setBounds(60, 90, 225, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Senha");
        jPanel5.add(jLabel3);
        jLabel3.setBounds(60, 70, 34, 16);

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Email");
        jPanel5.add(jLabel2);
        jLabel2.setBounds(60, 10, 40, 16);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(126, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addGap(167, 167, 167))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1)
                .addGap(40, 40, 40)
                .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);

        jPanel9.setBackground(new java.awt.Color(255, 246, 248));
        jPanel9.setFocusable(false);
        jPanel9.setMaximumSize(new java.awt.Dimension(460, 160));
        jPanel9.setMinimumSize(new java.awt.Dimension(460, 160));
        jPanel9.setPreferredSize(new java.awt.Dimension(460, 160));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/LoginCadastro/LoginMenor.png"))); // NOI18N
        jLabel4.setToolTipText("");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4)
        );

        jPanel1.add(jPanel9);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(0, 0, 460, 630);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cadastroButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroButton1ActionPerformed
        // TODO add your handling code here:
        Cadastro cadastro = new Cadastro();
        cadastro.setVisible(true);

        setVisible(false);
    }//GEN-LAST:event_cadastroButton1ActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        // TODO add your handling code here:
        String email = emailInputLogin.getText();
        String senha = new String(senhaInputLogin.getPassword());

        ValidadorDadosUsuarioLogin validador = new ValidadorDadosUsuarioLogin(email, senha);
        String erro = validador.validar();

        if (erro != null) {
            JOptionPane.showMessageDialog(null, erro);
            return;
        }

        Usuario usuarioLogado = controller.loginUsuario(email, senha);

        if (usuarioLogado != null) {

            if (jCheckBox1.isSelected()) {
                LembrarEmailUtil.salvarEmail(email);
            } else {
                LembrarEmailUtil.excluirEmail();
            }

            JOptionPane.showMessageDialog(null, "Login com sucesso!");
            boolean lembrar = jCheckBox1.isSelected();
            TelaInicial paginaInicial = new TelaInicial(usuarioLogado, lembrar);
            paginaInicial.setVisible(true);
            setVisible(false);

        } else {
            JOptionPane.showMessageDialog(null, "Credenciais inválidas.");
        }
        emailInputLogin.setText("");
        senhaInputLogin.setText("");
    }//GEN-LAST:event_loginButtonActionPerformed

    private void emailInputLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailInputLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailInputLoginActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        if (!jCheckBox1.isSelected()) {
            LembrarEmailUtil.excluirEmail();
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastroButton1;
    private javax.swing.JTextField emailInputLogin;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField senhaInputLogin;
    // End of variables declaration//GEN-END:variables
}
