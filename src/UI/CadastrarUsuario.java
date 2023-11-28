
package UI;

import BancodeDados.AcessoBancoEmpresa;
import javax.swing.JOptionPane;
import BancodeDados.AcessoBancoUsuario;
import BancodeDados.UsuarioBanco;
import Entidades.Usuario;
import Entidades.Empresa;

public class CadastrarUsuario extends javax.swing.JFrame
{
    private Usuario usuario;
    private UsuarioBanco usubanco;
    private Empresa empresa;

    public CadastrarUsuario()
    {
        usuario = new Usuario();
	usubanco = new UsuarioBanco();
        empresa = new Empresa();
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        painel = new javax.swing.JPanel();
        Idempresatxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        SenEmpresa = new javax.swing.JPasswordField();
        SenhaNvusu = new javax.swing.JPasswordField();
        Repsenha = new javax.swing.JPasswordField();
        Nomeusu = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        NomeTxt1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        jLabel7.setText("Cadastro Usuário");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 90, -1, -1));

        painel.setBackground(new java.awt.Color(255, 255, 255));
        painel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Idempresatxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdempresatxtActionPerformed(evt);
            }
        });
        painel.add(Idempresatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 240, 40));

        jLabel2.setText("SENHA EMPRESA");
        painel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, -1, -1));

        jLabel3.setText("NOME DE LOGIN EMPRESA");
        painel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel4.setText("NIVEL USUARIO");
        painel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, -1, -1));

        jLabel5.setText("SENHA");
        painel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        jLabel6.setText("REPITA A SENHA");
        painel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, -1, -1));

        jButton1.setBackground(new java.awt.Color(117, 199, 251));
        jButton1.setFont(new java.awt.Font("Calibri Light", 1, 26)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Efetuar Registro");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        painel.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 370, 240, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/text_area (2).png"))); // NOI18N
        painel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, -1, -1));

        jLabel9.setText("NOME USUARIO");
        painel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));
        painel.add(SenEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 240, 40));
        painel.add(SenhaNvusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 240, 40));
        painel.add(Repsenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 240, 40));

        Nomeusu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeusuActionPerformed(evt);
            }
        });
        painel.add(Nomeusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 240, 40));

        jToggleButton1.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jToggleButton1.setText("<-VOLTAR");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        painel.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        NomeTxt1.setBackground(new java.awt.Color(254, 254, 254));
        NomeTxt1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        NomeTxt1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(140, 140, 140)));
        NomeTxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeTxt1ActionPerformed(evt);
            }
        });
        painel.add(NomeTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 240, 40));

        getContentPane().add(painel, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, 630, 430));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Registro (1).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IdempresatxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdempresatxtActionPerformed
      
    }//GEN-LAST:event_IdempresatxtActionPerformed

    private void NomeusuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeusuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeusuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String senhaempresa= SenEmpresa.getText();
        String senha= SenhaNvusu.getText();
        String rep=jLabel1.getText();
        String pegar = (String) NomeTxt1.getSelectedItem();
        int nivel = Integer.parseInt(pegar);
       

        usuario.setNomeusuario(Nomeusu.getText());
        usuario.setSenha(senha);
        usuario.setNivel(nivel);
        usuario.setLogar(Nomeusu.getText());
        empresa.setEmail(Idempresatxt.getText());
        empresa.setSenhaempresa(senhaempresa);
        
        AcessoBancoEmpresa acesso = new AcessoBancoEmpresa();
         AcessoBancoUsuario acesso1 = new AcessoBancoUsuario();
        int teste = acesso1.Valores();
        usuario.setIdempresa(teste);
        
        if(acesso.verificarAcessoEmp1(empresa) == true && acesso1.VerrificaAcesso1(usuario) == false )
{
    
        
    
        if(usubanco.IncluirUsuario(usuario))
        {
            JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso!!!","Sucesso!!!",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Cadastro não realizado!!!","Erro",JOptionPane.INFORMATION_MESSAGE);
        }
      
}
        else
        {
            JOptionPane.showMessageDialog(null,"Email ou Senha da Empresa Incorreto!!!","Erro",JOptionPane.INFORMATION_MESSAGE);
        }

       

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

        
        dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void NomeTxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeTxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeTxt1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Idempresatxt;
    private javax.swing.JComboBox<String> NomeTxt1;
    private javax.swing.JTextField Nomeusu;
    private javax.swing.JPasswordField Repsenha;
    private javax.swing.JPasswordField SenEmpresa;
    private javax.swing.JPasswordField SenhaNvusu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPanel painel;
    // End of variables declaration//GEN-END:variables
}
