
package UI;
import BancodeDados.AcessoBancoUsuario;

public class JanelaInicial extends javax.swing.JFrame
{
public int nivel;
    public JanelaInicial()
    {
        AcessoBancoUsuario acessar = new AcessoBancoUsuario();
         nivel = acessar.PassarNiveL();
        initComponents();
        if(nivel == 1)
        {
           
            TabelaUsuario.setVisible(false); 
            CadastrarComprador.setVisible(false);
            CadastrarFornecedor.setVisible(false); 
            CadastrarProduto.setVisible(false); 
            CadastrarUsuario.setVisible(false); 
            EditarCompradores.setVisible(false);
            EditarEntradas.setVisible(false); 
            EditarFornecedores.setVisible(false); 
            EditarProdutos.setVisible(false); 
            EditarSaidas.setVisible(false); 
            EditarUsuario.setVisible(false); 
               
            
        }
        if(nivel == 2)
        {
            CadastrarUsuario.setVisible(false); 
            TabelaUsuario.setVisible(false); 
            EditarUsuario.setVisible(false); 
        }
         
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TabelaFornecedor = new javax.swing.JButton();
        CadastrarUsuario = new javax.swing.JButton();
        Entradas = new javax.swing.JButton();
        TabelaComprador = new javax.swing.JButton();
        TabelaEntradas = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        EditarSaidas = new javax.swing.JButton();
        CadastrarProduto = new javax.swing.JButton();
        CadastrarComprador = new javax.swing.JButton();
        CadastrarFornecedor = new javax.swing.JButton();
        Saidas1 = new javax.swing.JButton();
        Estoque = new javax.swing.JButton();
        TabelaSaida = new javax.swing.JButton();
        EditarCompradores = new javax.swing.JButton();
        EditarUsuario = new javax.swing.JButton();
        EditarProdutos = new javax.swing.JButton();
        EditarFornecedores = new javax.swing.JButton();
        EditarEntradas = new javax.swing.JButton();
        TabelaUsuario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(117, 199, 251));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Group 133586.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(512, 512, 512)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1900, -1));

        TabelaFornecedor.setBackground(new java.awt.Color(117, 199, 251));
        TabelaFornecedor.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        TabelaFornecedor.setForeground(new java.awt.Color(255, 255, 255));
        TabelaFornecedor.setText("Tabela Fornecedores");
        TabelaFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TabelaFornecedorActionPerformed(evt);
            }
        });
        jPanel1.add(TabelaFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 220, 190, 60));

        CadastrarUsuario.setBackground(new java.awt.Color(117, 199, 251));
        CadastrarUsuario.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        CadastrarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        CadastrarUsuario.setText("Cadastrar Usuário");
        CadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(CadastrarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 440, 170, 60));

        Entradas.setBackground(new java.awt.Color(117, 199, 251));
        Entradas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Entradas.setForeground(new java.awt.Color(255, 255, 255));
        Entradas.setText("Entradas");
        Entradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EntradasActionPerformed(evt);
            }
        });
        jPanel1.add(Entradas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 190, 60));

        TabelaComprador.setBackground(new java.awt.Color(117, 199, 251));
        TabelaComprador.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        TabelaComprador.setForeground(new java.awt.Color(255, 255, 255));
        TabelaComprador.setText("Tabela Comprador");
        TabelaComprador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TabelaCompradorActionPerformed(evt);
            }
        });
        jPanel1.add(TabelaComprador, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 220, 170, 60));

        TabelaEntradas.setBackground(new java.awt.Color(117, 199, 251));
        TabelaEntradas.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        TabelaEntradas.setForeground(new java.awt.Color(255, 255, 255));
        TabelaEntradas.setText("Tabela Entradas");
        TabelaEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TabelaEntradasActionPerformed(evt);
            }
        });
        jPanel1.add(TabelaEntradas, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 220, 190, 60));

        jPanel3.setBackground(new java.awt.Color(117, 199, 251));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1360, 0, -1, -1));

        EditarSaidas.setBackground(new java.awt.Color(117, 199, 251));
        EditarSaidas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EditarSaidas.setForeground(new java.awt.Color(255, 255, 255));
        EditarSaidas.setText("Editar Saidas");
        EditarSaidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarSaidasActionPerformed(evt);
            }
        });
        jPanel1.add(EditarSaidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 190, 60));

        CadastrarProduto.setBackground(new java.awt.Color(117, 199, 251));
        CadastrarProduto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CadastrarProduto.setForeground(new java.awt.Color(255, 255, 255));
        CadastrarProduto.setText("Cadastrar Produto");
        CadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarProdutoActionPerformed(evt);
            }
        });
        jPanel1.add(CadastrarProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 190, 60));

        CadastrarComprador.setBackground(new java.awt.Color(117, 199, 251));
        CadastrarComprador.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CadastrarComprador.setForeground(new java.awt.Color(255, 255, 255));
        CadastrarComprador.setText("Cadastrar Comprador");
        CadastrarComprador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarCompradorActionPerformed(evt);
            }
        });
        jPanel1.add(CadastrarComprador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 190, 60));

        CadastrarFornecedor.setBackground(new java.awt.Color(117, 199, 251));
        CadastrarFornecedor.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        CadastrarFornecedor.setForeground(new java.awt.Color(255, 255, 255));
        CadastrarFornecedor.setText("Cadastrar Fornecedor");
        CadastrarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadastrarFornecedorActionPerformed(evt);
            }
        });
        jPanel1.add(CadastrarFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, 190, 60));

        Saidas1.setBackground(new java.awt.Color(117, 199, 251));
        Saidas1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        Saidas1.setForeground(new java.awt.Color(255, 255, 255));
        Saidas1.setText("Saídas");
        Saidas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Saidas1ActionPerformed(evt);
            }
        });
        jPanel1.add(Saidas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 190, 60));

        Estoque.setBackground(new java.awt.Color(117, 199, 251));
        Estoque.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Estoque.setForeground(new java.awt.Color(255, 255, 255));
        Estoque.setText("Estoque");
        Estoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstoqueActionPerformed(evt);
            }
        });
        jPanel1.add(Estoque, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 190, 60));

        TabelaSaida.setBackground(new java.awt.Color(117, 199, 251));
        TabelaSaida.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TabelaSaida.setForeground(new java.awt.Color(255, 255, 255));
        TabelaSaida.setText("Tabela Saídas");
        TabelaSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TabelaSaidaActionPerformed(evt);
            }
        });
        jPanel1.add(TabelaSaida, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 190, 60));

        EditarCompradores.setBackground(new java.awt.Color(117, 199, 251));
        EditarCompradores.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EditarCompradores.setForeground(new java.awt.Color(255, 255, 255));
        EditarCompradores.setText("Editar Compradores");
        EditarCompradores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarCompradoresActionPerformed(evt);
            }
        });
        jPanel1.add(EditarCompradores, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 330, 190, 60));

        EditarUsuario.setBackground(new java.awt.Color(117, 199, 251));
        EditarUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EditarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        EditarUsuario.setText("Editar Usuarios");
        EditarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(EditarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 440, 180, 60));

        EditarProdutos.setBackground(new java.awt.Color(117, 199, 251));
        EditarProdutos.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EditarProdutos.setForeground(new java.awt.Color(255, 255, 255));
        EditarProdutos.setText("Editar Produtos");
        EditarProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarProdutosActionPerformed(evt);
            }
        });
        jPanel1.add(EditarProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, 190, 60));

        EditarFornecedores.setBackground(new java.awt.Color(117, 199, 251));
        EditarFornecedores.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EditarFornecedores.setForeground(new java.awt.Color(255, 255, 255));
        EditarFornecedores.setText("Editar Fornecedores");
        EditarFornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarFornecedoresActionPerformed(evt);
            }
        });
        jPanel1.add(EditarFornecedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 330, 170, 60));

        EditarEntradas.setBackground(new java.awt.Color(117, 199, 251));
        EditarEntradas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        EditarEntradas.setForeground(new java.awt.Color(255, 255, 255));
        EditarEntradas.setText("Editar Entradas");
        EditarEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarEntradasActionPerformed(evt);
            }
        });
        jPanel1.add(EditarEntradas, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 330, 190, 60));

        TabelaUsuario.setBackground(new java.awt.Color(117, 199, 251));
        TabelaUsuario.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TabelaUsuario.setForeground(new java.awt.Color(255, 255, 255));
        TabelaUsuario.setText("Tabela Usuário");
        TabelaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TabelaUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(TabelaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 440, 190, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 2980, 820));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EntradasActionPerformed
     new Entradas().setVisible(true);
    }//GEN-LAST:event_EntradasActionPerformed

    private void TabelaEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TabelaEntradasActionPerformed
 new TabelaEntradas().setVisible(true);
    }//GEN-LAST:event_TabelaEntradasActionPerformed

    private void TabelaCompradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TabelaCompradorActionPerformed
 new TabelaComprador().setVisible(true);
    }//GEN-LAST:event_TabelaCompradorActionPerformed

    private void TabelaFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TabelaFornecedorActionPerformed
    new Cadastrar().setVisible(true);
    }//GEN-LAST:event_TabelaFornecedorActionPerformed

    private void CadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarUsuarioActionPerformed
        new CadastrarUsuario().setVisible(true);
    }//GEN-LAST:event_CadastrarUsuarioActionPerformed

    private void EditarSaidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarSaidasActionPerformed
    new EditarSaidas().setVisible(true); 
    }//GEN-LAST:event_EditarSaidasActionPerformed

    private void CadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarProdutoActionPerformed
       new Cadastrar1().setVisible(true);
    }//GEN-LAST:event_CadastrarProdutoActionPerformed

    private void CadastrarCompradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarCompradorActionPerformed
     new CadastrarComprador().setVisible(true);
    }//GEN-LAST:event_CadastrarCompradorActionPerformed

    private void CadastrarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadastrarFornecedorActionPerformed
     new Fornecedores().setVisible(true);
    }//GEN-LAST:event_CadastrarFornecedorActionPerformed

    private void Saidas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Saidas1ActionPerformed
        new Saidas().setVisible(true);
    }//GEN-LAST:event_Saidas1ActionPerformed

    private void EstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstoqueActionPerformed
      new TabelaProdutos().setVisible(true);
    }//GEN-LAST:event_EstoqueActionPerformed

    private void TabelaSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TabelaSaidaActionPerformed
      new TabelaSaidas().setVisible(true);     
    }//GEN-LAST:event_TabelaSaidaActionPerformed

    private void EditarCompradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarCompradoresActionPerformed
      new EditarComprador().setVisible(true);
    }//GEN-LAST:event_EditarCompradoresActionPerformed

    private void EditarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarUsuarioActionPerformed
     new EditarUsuario().setVisible(true);
    }//GEN-LAST:event_EditarUsuarioActionPerformed

    private void EditarProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarProdutosActionPerformed
      new EditarProdutos().setVisible(true);
    }//GEN-LAST:event_EditarProdutosActionPerformed

    private void EditarFornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarFornecedoresActionPerformed
      new EditarFornecedor().setVisible(true);
    }//GEN-LAST:event_EditarFornecedoresActionPerformed

    private void EditarEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarEntradasActionPerformed
       new EditarEntradas().setVisible(true);
    }//GEN-LAST:event_EditarEntradasActionPerformed

    private void TabelaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TabelaUsuarioActionPerformed
      new TabelaUsuario().setVisible(true);  
    }//GEN-LAST:event_TabelaUsuarioActionPerformed
// <editor-fold defaultstate="collapsed" desc="Generated Code">                          


    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CadastrarComprador;
    private javax.swing.JButton CadastrarFornecedor;
    private javax.swing.JButton CadastrarProduto;
    private javax.swing.JButton CadastrarUsuario;
    private javax.swing.JButton EditarCompradores;
    private javax.swing.JButton EditarEntradas;
    private javax.swing.JButton EditarFornecedores;
    private javax.swing.JButton EditarProdutos;
    private javax.swing.JButton EditarSaidas;
    private javax.swing.JButton EditarUsuario;
    private javax.swing.JButton Entradas;
    private javax.swing.JButton Estoque;
    private javax.swing.JButton Saidas1;
    private javax.swing.JButton TabelaComprador;
    private javax.swing.JButton TabelaEntradas;
    private javax.swing.JButton TabelaFornecedor;
    private javax.swing.JButton TabelaSaida;
    private javax.swing.JButton TabelaUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
