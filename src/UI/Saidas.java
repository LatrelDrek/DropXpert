
package UI;
import Entidades.Produto;
import Entidades.Categoria;
import BancodeDados.CategoriaBanco;
import BancodeDados.ProdutoBanco;
import BancodeDados.AcessoBancoComprador;
import BancodeDados.AcessoBancoUsuario;
import BancodeDados.AcessoBancoProduto;
import Entidades.Comprador;
import javax.swing.JOptionPane;


public class Saidas extends javax.swing.JFrame {

    private Comprador comprador;
    private Produto produto;
    private Categoria categoria;
    private ProdutoBanco produtobanco;
    
    
    public Saidas() 
    {
        comprador = new Comprador();
        produto= new Produto();
        produtobanco= new ProdutoBanco();
        categoria= new Categoria();
        initComponents();
        
    AcessoBancoProduto acessoProd = new AcessoBancoProduto();
    acessoProd.preencherComboBox(NomeTxt1);
    AcessoBancoComprador acessoBanco = new AcessoBancoComprador();
    acessoBanco.preencherComboBox(Comprador);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        quanti = new javax.swing.JTextField();
        datasaid = new javax.swing.JTextField();
        precoo = new javax.swing.JTextField();
        horasaida = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Comprador = new javax.swing.JComboBox<>();
        NomeTxt1 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Saida de Produtos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 6, -1, -1));
        jPanel1.add(quanti, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 310, 40));

        datasaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datasaidActionPerformed(evt);
            }
        });
        jPanel1.add(datasaid, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 310, 40));
        jPanel1.add(precoo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 310, 40));
        jPanel1.add(horasaida, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 310, 40));

        jLabel2.setText("NOME PRODUTO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        jLabel3.setText("QUANTIDADE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        jLabel6.setText("HORA DA SAÍDA");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 205, -1, -1));

        jLabel7.setText("DATA DE SAÍDA");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(536, 133, -1, -1));

        jLabel10.setText("COMPRADOR");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, -1, -1));

        jLabel11.setText("PREÇO");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        jButton1.setBackground(new java.awt.Color(117, 199, 251));
        jButton1.setFont(new java.awt.Font("Calibri Light", 1, 26)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Efetuar Saída");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 420, 190, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/text_area (2).png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, -1, -1));

        Comprador.setBackground(new java.awt.Color(254, 254, 254));
        Comprador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Comprador.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(140, 140, 140)));
        Comprador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompradorActionPerformed(evt);
            }
        });
        jPanel1.add(Comprador, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 310, 40));

        NomeTxt1.setBackground(new java.awt.Color(254, 254, 254));
        NomeTxt1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        NomeTxt1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(140, 140, 140)));
        NomeTxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeTxt1ActionPerformed(evt);
            }
        });
        jPanel1.add(NomeTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 310, 40));

        jButton3.setBackground(new java.awt.Color(255, 102, 102));
        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("LIMPAR CAMPOS");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 480, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 926, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      String teste= (String) NomeTxt1.getSelectedItem();
      String nomecom = (String) Comprador.getSelectedItem();
      int p=0;
      produto.setNomeprodutosaida(teste);
      produto.setDatasaida(datasaid.getText());
      produto.setHorasaida(horasaida.getText());
      produto.setQuantidadesaida(Integer.parseInt(quanti.getText()));
      produto.setPrecosaida(Double.valueOf(precoo.getText()));
      comprador.setNomecomprador(nomecom);
      categoria.setNomecategoria(teste);
      AcessoBancoComprador acesso = new AcessoBancoComprador();
      AcessoBancoProduto acesso1 = new AcessoBancoProduto();
      AcessoBancoUsuario acesso3 = new AcessoBancoUsuario();
      CategoriaBanco acesso2 = new CategoriaBanco(); 
      int incluir = acesso3.Valores();
      produto.setIdempresasaida(incluir);
      produto.setComprador(nomecom);
      if(acesso.verificarAcessoComprador(comprador) == true && acesso1.verificarAcessoProduto(categoria) && acesso2.AtualizarQuantidadeSaida(produto))
      {
          
          if(produtobanco.SaidaProduto(produto, comprador))
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
          JOptionPane.showMessageDialog(null, "Dados Informados não existem!!", "Erro", JOptionPane.ERROR_MESSAGE);
      }
      
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CompradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompradorActionPerformed

    private void NomeTxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeTxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeTxt1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        quanti.setText("");
        horasaida.setText("");
        precoo.setText("");
        datasaid.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void datasaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datasaidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datasaidActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Comprador;
    private javax.swing.JComboBox<String> NomeTxt1;
    private javax.swing.JTextField datasaid;
    private javax.swing.JTextField horasaida;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField precoo;
    private javax.swing.JTextField quanti;
    // End of variables declaration//GEN-END:variables
}
