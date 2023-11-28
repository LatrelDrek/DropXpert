
package UI;
import BancodeDados.AcessoBancoProduto;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import BancodeDados.CategoriaBanco;
import Entidades.Categoria;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
public class EditarProdutos extends javax.swing.JFrame {
      
    private DefaultTableModel modelo;
    private String nome;
    private int idfornecedor;
    private Categoria categoria;
    private CategoriaBanco categoriabanco;
    public EditarProdutos()
    {
        
          categoria = new Categoria();
        categoriabanco = new CategoriaBanco();
        
        initComponents();
        AcessoBancoProduto acessoProd = new AcessoBancoProduto();
        acessoProd.preencherComboBox(NomeTxt1);
        acessoProd.preencherComboBox(nomeproduto);
        modelo = (DefaultTableModel) FornecedorTabela1.getModel();
     
        preencherTabela();
    }
      private void preencherTabela() 
      {
        
        ArrayList<Categoria> categorias = categoriabanco.obterCategorias(); 

        
        modelo.setRowCount(0);

       
        for (Categoria cat : categorias) 
        {
            modelo.addRow(new Object[]
            {
                cat.getNomecatedoria(), cat.getIdcategoria(), cat.getDescricao(), cat.getTipo(),
                cat.getQuantidade() 
            });
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        FornecedorTabela1 = new javax.swing.JTable();
        jToggleButton1 = new javax.swing.JToggleButton();
        nomeproduto = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        descricao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nome1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tipo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        NomeTxt1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        jLabel1.setText("TABELA FORNECEDORES");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Excluir Produto");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 350, -1, -1));

        FornecedorTabela1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "PRODUTO", "ID", "DESCRIÇÃO", "TIPO", "QUANTIDADE"
            }
        ));
        FornecedorTabela1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        FornecedorTabela1.setGridColor(new java.awt.Color(117, 199, 251));
        FornecedorTabela1.setOpaque(false);
        FornecedorTabela1.setRowHeight(30);
        FornecedorTabela1.setRowMargin(2);
        FornecedorTabela1.setSelectionForeground(new java.awt.Color(255, 0, 0));
        FornecedorTabela1.setShowGrid(true);
        jScrollPane1.setViewportView(FornecedorTabela1);
        FornecedorTabela1.getAccessibleContext().setAccessibleDescription("");

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 680, 620));

        jToggleButton1.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jToggleButton1.setText("<-VOLTAR");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        nomeproduto.setBackground(new java.awt.Color(254, 254, 254));
        nomeproduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        nomeproduto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(140, 140, 140)));
        nomeproduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeprodutoActionPerformed(evt);
            }
        });
        jPanel1.add(nomeproduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 430, 150, 40));

        jLabel3.setText("NOVA DESCRIÇÃO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 190, -1, -1));
        jPanel1.add(descricao, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 210, 160, 40));

        jLabel4.setText("NOME PRODUTO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 410, -1, -1));
        jPanel1.add(nome1, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 140, 160, 40));

        jLabel5.setText("NOVO NOME");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 120, -1, -1));
        jPanel1.add(tipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 210, 160, 40));

        jLabel6.setText("NOVO TIPO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel7.setText("Editar Produto");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, -1, -1));

        NomeTxt1.setBackground(new java.awt.Color(254, 254, 254));
        NomeTxt1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        NomeTxt1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(140, 140, 140)));
        NomeTxt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeTxt1ActionPerformed(evt);
            }
        });
        jPanel1.add(NomeTxt1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, 150, 40));

        jLabel8.setText("NOME PRODUTO");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 120, -1, -1));

        jButton2.setBackground(new java.awt.Color(117, 199, 251));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Efetuar ");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 270, 150, 30));

        jButton3.setBackground(new java.awt.Color(117, 199, 251));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Efetuar ");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 500, 150, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1890, 890));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

        
        dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void nomeprodutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeprodutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeprodutoActionPerformed

    private void NomeTxt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeTxt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeTxt1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      String t = (String) NomeTxt1.getSelectedItem();
        categoria.setNomecategoria(nome1.getText());
        categoria.setDescricao(descricao.getText());
        categoria.setTipo(tipo.getText());
        categoria.setNome(t);
        if(categoriabanco.atualizarCategoria(categoria) == true)
        {
            JOptionPane.showMessageDialog(null,"Atualização realizada com sucesso!!!","Sucesso!!!",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Atualização não realizado!!!","Erro",JOptionPane.INFORMATION_MESSAGE);
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    String teste = (String) nomeproduto.getSelectedItem();
    categoria.setNome(teste);
       if(categoriabanco.deletarCategoria(categoria) == true)
        {
            JOptionPane.showMessageDialog(null,"Exclusão realizado com sucesso!!!","Sucesso!!!",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Exclusão não realizada!!!","Erro",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable FornecedorTabela1;
    private javax.swing.JComboBox<String> NomeTxt1;
    private javax.swing.JTextField descricao;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTextField nome1;
    private javax.swing.JComboBox<String> nomeproduto;
    private javax.swing.JTextField tipo;
    // End of variables declaration//GEN-END:variables
}
