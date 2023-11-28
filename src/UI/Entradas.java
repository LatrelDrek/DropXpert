
package UI;
import BancodeDados.CategoriaBanco;
import BancodeDados.AcessoBancoFornecedor;
import BancodeDados.AcessoBancoUsuario;
import BancodeDados.AcessoBancoProduto;
import Entidades.Produto;
import Entidades.Categoria;
import Entidades.Fornecedor;
import BancodeDados.ProdutoBanco;
import javax.swing.JOptionPane;
public class Entradas extends javax.swing.JFrame 
{
    private Produto produto;
    private ProdutoBanco bancoproduto;
    private Categoria categoria;
    private Fornecedor fornecedor;
public Entradas() {
    categoria = new Categoria();
    produto = new Produto();
    bancoproduto = new ProdutoBanco();
    fornecedor = new Fornecedor();

    initComponents(); 
    
    AcessoBancoProduto acessoProd = new AcessoBancoProduto();
    acessoProd.preencherComboBox(NomeTxt);
    AcessoBancoFornecedor acessoBanco = new AcessoBancoFornecedor();
    acessoBanco.preencherComboBox(fornecedortext1);
}


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        preco = new javax.swing.JTextField();
        horachegada = new javax.swing.JTextField();
        datachegada = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        quantidade1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        fornecedortext1 = new javax.swing.JComboBox<>();
        NomeTxt = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Entrada de Produtos");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 6, -1, -1));

        jLabel3.setText("PREÇO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        jLabel6.setText("HORA DE CHEGADA");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, -1, -1));

        jLabel7.setText("NOME PRODUTO");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        jLabel10.setText("DATA DA CHEGADA");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, -1, -1));

        jButton2.setBackground(new java.awt.Color(117, 199, 251));
        jButton2.setFont(new java.awt.Font("Calibri Light", 1, 26)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Efetuar Cadastro");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 460, -1, -1));
        jPanel1.add(preco, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 310, 40));

        horachegada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horachegadaActionPerformed(evt);
            }
        });
        jPanel1.add(horachegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 160, 310, 40));
        jPanel1.add(datachegada, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 310, 40));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/text_area (2).png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 450, -1, -1));

        jLabel12.setText("FORNCEDOR");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, -1, -1));
        jPanel1.add(quantidade1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 310, 40));

        jLabel4.setText("QUANTIDADE");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        fornecedortext1.setBackground(new java.awt.Color(254, 254, 254));
        fornecedortext1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        fornecedortext1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(140, 140, 140)));
        fornecedortext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fornecedortext1ActionPerformed(evt);
            }
        });
        jPanel1.add(fornecedortext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 310, 40));

        NomeTxt.setBackground(new java.awt.Color(254, 254, 254));
        NomeTxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        NomeTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(140, 140, 140)));
        NomeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeTxtActionPerformed(evt);
            }
        });
        jPanel1.add(NomeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, 310, 40));

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
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 520, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     int unu = 0;
       String teste= (String) NomeTxt.getSelectedItem();
        String teste1=horachegada.getText();
       String teste2=datachegada.getText();
       String teste4= (String) fornecedortext1.getSelectedItem();
      if(teste.isEmpty() || teste1.isEmpty()||teste2.isEmpty() || teste4.isEmpty()) 
        {
        JOptionPane.showMessageDialog(this, "Prencha Todos os campos!!");
        }
      else
      {
       CategoriaBanco acesso2 = new CategoriaBanco();   
       AcessoBancoProduto acesso = new AcessoBancoProduto();
       AcessoBancoFornecedor acesso1 = new AcessoBancoFornecedor();
       produto.setHoraentrada(horachegada.getText());
       produto.setNomeproduto(teste);
       produto.setDataentrada(datachegada.getText());
       produto.setUnidade(unu);
       produto.setQuantidade(Integer.parseInt(quantidade1.getText()));
       produto.setPreco(Double.valueOf(preco.getText()));
       categoria.setNomecategoria(teste);
       fornecedor.setNomefornecedor(teste4);
       produto.setFornecedor(teste4);
       AcessoBancoUsuario banco = new AcessoBancoUsuario();
       int idd= banco.Valores();
       produto.setIdempresaentrada(idd);
       
          System.out.println(""+teste4);
          
        if(acesso1.verificarAcessoFornecedor(fornecedor) == true && acesso.verificarAcessoProduto(categoria) == true && acesso2.AtualizarQuantidade(produto))
        {
           
		 
					   if(bancoproduto.IncluirProduto(produto))
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

      
      }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void fornecedortext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fornecedortext1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fornecedortext1ActionPerformed

    private void horachegadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horachegadaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horachegadaActionPerformed

    private void NomeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeTxtActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        quantidade1.setText("");
        horachegada.setText("");
        preco.setText("");
        datachegada.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> NomeTxt;
    private javax.swing.JTextField datachegada;
    private javax.swing.JComboBox<String> fornecedortext1;
    private javax.swing.JTextField horachegada;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField preco;
    private javax.swing.JTextField quantidade1;
    // End of variables declaration//GEN-END:variables
}
