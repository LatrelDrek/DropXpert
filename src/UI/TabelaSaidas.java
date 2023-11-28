
package UI;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import BancodeDados.CategoriaBanco;
import BancodeDados.ProdutoBanco;
import Entidades.Categoria;
import Entidades.Produto;
import java.util.ArrayList;
public class TabelaSaidas extends javax.swing.JFrame {
      
    private DefaultTableModel modelo;
    private String nome;
    private int idfornecedor;
    private Produto produto;
    private ProdutoBanco produtobanco;
    public TabelaSaidas()
    {
        
       produto = new Produto();
        produtobanco = new ProdutoBanco();
        
        initComponents();
        
        modelo = (DefaultTableModel) FornecedorTabela1.getModel();
     
        preencherTabela();
    }
      private void preencherTabela() 
      {
        
        ArrayList<Produto> produtos = produtobanco.obterSaidas(); 

        
        modelo.setRowCount(0);

       
        for (Produto cat : produtos) 
        {
            modelo.addRow(new Object[]
            {
                cat.getNomeprodutosaida(), cat.getIdprodutosaida(), cat.getQuantidadesaida(), cat.getPrecosaida(),
                cat.getDatasaida(), cat.getHorasaida(), cat.getComprador()
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

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 1, 36)); // NOI18N
        jLabel1.setText("TABELA FORNECEDORES");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setText("Saídas de Produtos");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, -1, -1));

        FornecedorTabela1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "PRODUTO", "ID", "QUANTIDADE", "PREÇO", "DATA SAÍDA", "HORA SAÍDA", "COMPRADOR"
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1360, 640));

        jToggleButton1.setBackground(new java.awt.Color(255, 102, 102));
        jToggleButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jToggleButton1.setText("<-VOLTAR");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1890, 890));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

        
        dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable FornecedorTabela1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
