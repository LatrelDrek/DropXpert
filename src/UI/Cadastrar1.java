
package UI;
import BancodeDados.AcessoBancoProduto;
import BancodeDados.AcessoBancoUsuario;

import Entidades.Usuario;
import BancodeDados.CategoriaBanco;
import Entidades.Categoria;
import javax.swing.JOptionPane;

public class Cadastrar1 extends javax.swing.JFrame 
{
   private Categoria categoria ;
   private CategoriaBanco categoriabanco;
   private Usuario usuario;
    
    public Cadastrar1() 
    {
        categoriabanco = new CategoriaBanco();
        categoria = new Categoria();
        usuario = new Usuario();
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        tipo = new javax.swing.JTextField();
        Nometxt = new javax.swing.JTextField();
        Descricaotxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(560, 664));
        setPreferredSize(new java.awt.Dimension(575, 680));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 310, 40));

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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 240, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel2.setText("Cadastrar Produto");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 44, -1, -1));

        jLabel3.setText("NOME PRODUTO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, -1, -1));

        jLabel5.setText("DESCRIÇÃO PRODUTO");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        jLabel6.setText("TIPO PRODUTO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/text_area (2).png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("LIMPAR CAMPOS");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 580, 150, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NometxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NometxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NometxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

       String teste=Nometxt.getText();
        String teste1=Descricaotxt.getText();
            String teste2=tipo.getText();
            int quant=0;
      if(teste.isEmpty() || teste1.isEmpty()||teste2.isEmpty() ) 
        {
        JOptionPane.showMessageDialog(this, "Prencha Todos os campos!!");
    }
      else
      {
         
       categoria.setNomecategoria(Nometxt.getText());
       categoria.setDescricao(Descricaotxt.getText());
       categoria.setTipo(tipo.getText());
       categoria.setQuantidade(quant);
       categoria.setUnidade(quant);
       AcessoBancoUsuario acesso = new AcessoBancoUsuario();
       int id = acesso.Valores();
       categoria.setIdempresa(id);
       
        
        
            if(categoriabanco.VerrificaAcesso1(categoria) == true)
                    {
                         JOptionPane.showMessageDialog(null,"Este Nome de Produto Ja existe na Base de Dados, escolha outro nome (chave)!!!","Erro",JOptionPane.INFORMATION_MESSAGE);
                         
                    }
                else
                {
                   if(categoriabanco.IncluirCategoria(categoria))
                   {
                        JOptionPane.showMessageDialog(null,"Cadastro realizado com sucesso!!!","Sucesso!!!",JOptionPane.INFORMATION_MESSAGE);
                   }
                   else
                   {
                       JOptionPane.showMessageDialog(null,"Cadastro não realizado!!!","Erro",JOptionPane.INFORMATION_MESSAGE); 
                   }
                }
           
        
        
           
       
      }
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        tipo.setText("");
        Descricaotxt.setText("");
        Nometxt.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Descricaotxt;
    private javax.swing.JTextField Nometxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField tipo;
    // End of variables declaration//GEN-END:variables
}
