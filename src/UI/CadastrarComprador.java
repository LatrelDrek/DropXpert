
package UI;
import BancodeDados.AcessoBancoComprador;
import BancodeDados.AcessoBancoProduto;
import BancodeDados.AcessoBancoUsuario;
import BancodeDados.CompradorBanco;
import Entidades.Comprador;
import javax.swing.JOptionPane;

public class CadastrarComprador extends javax.swing.JFrame 
{
   private Comprador comprador ;
    private CompradorBanco compradorbanco;
    
    public CadastrarComprador() 
    {
        compradorbanco = new CompradorBanco();
        comprador = new Comprador();
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        Nometxt = new javax.swing.JTextField();
        Descricaotxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(560, 664));
        setPreferredSize(new java.awt.Dimension(600, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Nometxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NometxtActionPerformed(evt);
            }
        });
        jPanel1.add(Nometxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 310, 40));
        jPanel1.add(Descricaotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 310, 40));

        jButton1.setBackground(new java.awt.Color(117, 199, 251));
        jButton1.setFont(new java.awt.Font("Calibri Light", 1, 26)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Efetuar Cadastro");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 440, 240, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel2.setText("Cadastrar Comprador");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 44, -1, -1));

        jLabel3.setText("NOME COMPRADOR");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        jLabel5.setText("DESCRIÇÃO COMPRADOR");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/text_area (2).png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NometxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NometxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NometxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

       String teste=Nometxt.getText();
        String teste1=Descricaotxt.getText();
          
      if(teste.isEmpty() || teste1.isEmpty()) 
        {
        JOptionPane.showMessageDialog(this, "Prencha Todos os campos!!");
        }
      else
      {
         
       comprador.setNomecomprador(Nometxt.getText());
       comprador.setDescricaocomprador(Descricaotxt.getText());
       AcessoBancoUsuario acesso = new AcessoBancoUsuario();
       int i= acesso.Valores();
       comprador.setIdempresa(i);
       AcessoBancoComprador acessar = new AcessoBancoComprador();
        if(acessar.verificarAcessoComprador(comprador)==true)
        {
             JOptionPane.showMessageDialog(null,"Este Nome de Comprador Ja existe na Base de Dados, escolha outro nome (chave)!!!","Erro",JOptionPane.INFORMATION_MESSAGE);
                         
        }
        else
        {
            if(compradorbanco.IncluirComprador(comprador))
            {
                JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso!!!","Sucesso!!!",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Cadastro não realizado!!!","Erro",JOptionPane.INFORMATION_MESSAGE);
            } 
         
        }
      
    }//GEN-LAST:event_jButton1ActionPerformed

    
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Descricaotxt;
    private javax.swing.JTextField Nometxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
