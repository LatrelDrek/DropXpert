
package UI;
import BancodeDados.AcessoBancoFornecedor;
import BancodeDados.FornecedorBanco;
import Entidades.Fornecedor;
import javax.swing.JOptionPane;
import BancodeDados.AcessoBancoUsuario;

public class Fornecedores extends javax.swing.JFrame 
{
    private Fornecedor fornecedor;
    private FornecedorBanco fornecedorbanco;

    

    public Fornecedores()
    {
        
        fornecedor = new Fornecedor();
	fornecedorbanco = new FornecedorBanco();
 
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Nomeforn = new javax.swing.JTextField();
        Cnpj = new javax.swing.JTextField();
        DataForn = new javax.swing.JTextField();
        cepp = new javax.swing.JTextField();
        Telforn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        emailforn = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        Celularforn = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Endereforn = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(870, 690));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Cadastrar Fornecedores");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 6, -1, -1));
        jPanel1.add(Nomeforn, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 197, 241, 32));
        jPanel1.add(Cnpj, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 272, 241, 32));

        DataForn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataFornActionPerformed(evt);
            }
        });
        jPanel1.add(DataForn, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 125, 241, 32));
        jPanel1.add(cepp, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 342, 241, 32));

        Telforn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelfornActionPerformed(evt);
            }
        });
        jPanel1.add(Telforn, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 197, 241, 32));

        jLabel3.setText("CNPJ/CPF");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 247, -1, -1));

        jLabel4.setText("NOME");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 175, -1, -1));

        jLabel5.setText("INSCRIÇÃO ESTADUAL");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 322, -1, -1));

        jLabel6.setText("TELEFONE");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 175, -1, -1));

        jLabel7.setText("DATA");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 103, -1, -1));

        jLabel10.setText("CELULAR");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 247, -1, -1));

        jLabel11.setText("CEP");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 322, -1, -1));

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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 550, 240, 40));

        jLabel8.setText("E-MAIL");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 400, -1, -1));
        jPanel1.add(emailforn, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 422, 241, 32));
        jPanel1.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 350, 241, 32));
        jPanel1.add(Celularforn, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 269, 241, 32));

        jLabel12.setText("ENDEREÇO");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 400, -1, -1));
        jPanel1.add(Endereforn, new org.netbeans.lib.awtextra.AbsoluteConstraints(543, 422, 241, 32));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/text_area (2).png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 540, -1, -1));

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
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 610, 150, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        String teste1= Nomeforn.getText();
        String teste2= DataForn.getText();
        String teste3= Telforn.getText();
        String teste4=Cnpj.getText();
        String teste5= Celularforn.getText();
        String teste6= jTextField16.getText();
        String teste7= cepp.getText();
        String teste8= emailforn.getText();
        String teste9= Endereforn.getText();
        if(teste1.isEmpty()||teste2.isEmpty() || teste3.isEmpty() || teste4.isEmpty()|| teste5.isEmpty() || teste6.isEmpty() || teste7.isEmpty() || teste8.isEmpty() || teste9.isEmpty())
      {
          JOptionPane.showMessageDialog(this, "Prencha Todos os campos!!");
      }
        else
        {
        fornecedor.setNomefornecedor(Nomeforn.getText());
        fornecedor.setData(DataForn.getText());
        fornecedor.setTelefone(Telforn.getText());
        fornecedor.setCnpj(Cnpj.getText());
        fornecedor.setCelular(Celularforn.getText());
        fornecedor.setInscricaoestadual(jTextField16.getText());
        fornecedor.setCep(cepp.getText());
        fornecedor.setEmail(emailforn.getText()); 
        fornecedor.setEnderecofornecedor(Endereforn.getText());
        AcessoBancoUsuario acesso = new AcessoBancoUsuario();
        AcessoBancoFornecedor acesso1 = new AcessoBancoFornecedor();
        int idempresa = acesso.Valores();
        fornecedor.setIdempresa(idempresa);
        if(acesso1.verificarAcessoFornecedor(fornecedor)==true)
        {
             JOptionPane.showMessageDialog(null,"Este Nome de Forncedor Ja existe na Base de Dados, escolha outro nome (chave)!!!","Erro",JOptionPane.INFORMATION_MESSAGE);
                         
        }
        else
        {
            if(fornecedorbanco.IncluirFornecedor(fornecedor))
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Nomeforn.setText("");
        DataForn.setText("");
        Telforn.setText("");
        Cnpj.setText("");
        Celularforn.setText("");
        jTextField16.setText("");
        cepp.setText("");
        emailforn.setText("");
        Endereforn.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void DataFornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataFornActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataFornActionPerformed

    private void TelfornActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelfornActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelfornActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Celularforn;
    private javax.swing.JTextField Cnpj;
    private javax.swing.JTextField DataForn;
    private javax.swing.JTextField Endereforn;
    private javax.swing.JTextField Nomeforn;
    private javax.swing.JTextField Telforn;
    private javax.swing.JTextField cepp;
    private javax.swing.JTextField emailforn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField16;
    // End of variables declaration//GEN-END:variables
}
