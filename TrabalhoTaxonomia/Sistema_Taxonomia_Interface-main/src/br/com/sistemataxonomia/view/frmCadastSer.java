/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package br.com.sistemataxonomia.view;

import br.com.sistemataxonomia.modelo.SeresVivos;
import br.com.sistemataxonomia.rdn.serVivoRdn;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author samuel
 */
public class frmCadastSer extends javax.swing.JInternalFrame {
    
    ArrayList<SeresVivos> lstSeresVivos;
    
    boolean modoAlterarDeletar = false;
    
    String cod = "";
    
    int indiceLista = 0;
   
    public frmCadastSer() {
        lstSeresVivos = new ArrayList<SeresVivos>();
        
        initComponents();
        
        this.carregarTabela();
    }
    
    private void modoNovo() {
        txtNomeComum.setText("");
        txtReino.setText("");
        txtFilo.setText("");
        txtClasse.setText("");
        txtOrdem.setText("");
        txtFamilia.setText("");
        txtGenero.setText("");
        txtEspecie.setText("");
        
        txtNomeComum.setEnabled(false);
        txtReino.setEnabled(false);
        txtFilo.setEnabled(false);
        txtClasse.setEnabled(false);
        txtOrdem.setEnabled(false);
        txtFamilia.setEnabled(false);
        txtGenero.setEnabled(false);
        txtEspecie.setEnabled(false);
        
        btnSalvar.setEnabled(false);
        btnExcluir.setEnabled(false);
    }
    
    private void habilitarCampos() {
        txtNomeComum.setEnabled(true);
        txtReino.setEnabled(true);
        txtFilo.setEnabled(true);
        txtClasse.setEnabled(true);
        txtOrdem.setEnabled(true);
        txtFamilia.setEnabled(true);
        txtGenero.setEnabled(true);
        txtEspecie.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtReino = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtFilo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtClasse = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtOrdem = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtFamilia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEspecie = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNomeComum = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaSeresVivos = new javax.swing.JTable();
        btnSalvar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Ser Vivo");

        jLabel2.setText("Reino: ");

        jLabel1.setText("Filo:");

        jLabel3.setText("Classe:");

        jLabel4.setText("Ordem:");

        jLabel5.setText("Família: ");

        jLabel6.setText("Genero:");

        jLabel7.setText("Espécie: ");

        jLabel8.setText("Nome Comum: ");

        tabelaSeresVivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Cod. Ser Vivo", "Reino", "Filo", "Classe", "Ordem", "Família", "Genero", "Espécie", "Nome Comum"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelaSeresVivos.setShowGrid(true);
        tabelaSeresVivos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaSeresVivosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaSeresVivos);

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130)
                .addComponent(jLabel3))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtNomeComum, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(txtReino, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(txtFilo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(txtClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(txtOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(txtFamilia, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(210, 210, 210)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(btnExcluir)
                .addGap(53, 53, 53)
                .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNomeComum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtReino, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFilo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClasse, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFamilia, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvar)
                    .addComponent(btnExcluir)
                    .addComponent(btnNovo)))
        );

        setBounds(0, 0, 806, 569);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        String codSerVivo = "";
        
        if (this.modoAlterarDeletar == true) {
            codSerVivo = this.cod;
        } else {
         codSerVivo = java.util.UUID.randomUUID().toString();   
        }
        
        SeresVivos seresVivos = new SeresVivos(codSerVivo,txtReino.getText(),
               txtFilo.getText(),txtClasse.getText(),txtOrdem.getText(),txtFamilia.getText()
                ,txtGenero.getText(),txtEspecie.getText(),txtNomeComum.getText());
        
        this.modoNovo();
        
        serVivoRdn entidade = new serVivoRdn();
        
     if (this.modoAlterarDeletar == true) {
            entidade.alterarSerVivo(seresVivos);
            btnNovo.setEnabled(true);
        } else {
            entidade.inserirSerVivo(seresVivos);
        }
     
        this.modoAlterarDeletar = false;

        this.carregarTabela();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int input = JOptionPane.showConfirmDialog(null,
                "Deseja realmente excluir?", "Atenção!!!", JOptionPane.YES_NO_OPTION);

        if (input == 0) {

            //lstSeresVivos.remove(this.indiceLista);

            serVivoRdn entidade = new serVivoRdn();
            
            entidade.deletarSerVivo(this.cod);
            
            this.carregarTabela();

        }
        this.modoNovo();
        
        btnNovo.setEnabled(true);
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void tabelaSeresVivosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaSeresVivosMouseClicked
        this.modoAlterarDeletar = true;
        
        int row = this.tabelaSeresVivos.getSelectedRow();
        
        String codSeresVivos = (String) this.tabelaSeresVivos.getValueAt(row, 0);
        
        this.cod = codSeresVivos;
        
        serVivoRdn entidade = new serVivoRdn();

        SeresVivos seresVivos = entidade.obterPorCod(cod);
        
        //int indice = 0;
        
        //SeresVivos seresVivos = null;

//        for (int i = 0; i < lstSeresVivos.size(); i++) {
//
//            if (lstSeresVivos.get(i).getCodSeresVivos().equals(codSeresVivos)) {
//
//                seresVivos = lstSeresVivos.get(i);
//                indice = i;
//                break;
//            }
//        }

        //this.indiceLista = indice;
        
        txtReino.setText(seresVivos.getReino());
        txtFilo.setText(seresVivos.getFilo());
        txtClasse.setText(seresVivos.getClasse());
        txtOrdem.setText(seresVivos.getOrdem());
        txtFamilia.setText(seresVivos.getFamilia());
        txtGenero.setText(seresVivos.getGenero());
        txtEspecie.setText(seresVivos.getEspecie());
        txtNomeComum.setText(seresVivos.getNomeComum());
                
            this.habilitarCampos();
            
            btnSalvar.setEnabled(true);
            
            btnNovo.setEnabled(false);
            
            btnExcluir.setEnabled(true);
        
    }//GEN-LAST:event_tabelaSeresVivosMouseClicked

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        this.modoAlterarDeletar = false;
        
        this.modoNovo();
        
        this.carregarTabela();
        
        this.habilitarCampos();
        
        btnSalvar.setEnabled(true);
    }//GEN-LAST:event_btnNovoActionPerformed


     private void carregarTabela(){
        
         DefaultTableModel model = (DefaultTableModel) tabelaSeresVivos.getModel();
         
         model.setRowCount(0);
         
         serVivoRdn entidade = new serVivoRdn();
         
         List<SeresVivos> lstEntidade = entidade.obterSeresVivos();
         
         for(SeresVivos seresVivos : lstEntidade){
             
             model.addRow(new Object []{
                seresVivos.getCodSeresVivos(),
                seresVivos.getReino(),
                seresVivos.getFilo(),
                seresVivos.getClasse(),
                seresVivos.getOrdem(),
                seresVivos.getFamilia(),
                seresVivos.getGenero(),
                seresVivos.getEspecie(),
                seresVivos.getNomeComum()
             });
         }
         
         tabelaSeresVivos.setModel(model);
    }
     
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaSeresVivos;
    private javax.swing.JTextField txtClasse;
    private javax.swing.JTextField txtEspecie;
    private javax.swing.JTextField txtFamilia;
    private javax.swing.JTextField txtFilo;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtNomeComum;
    private javax.swing.JTextField txtOrdem;
    private javax.swing.JTextField txtReino;
    // End of variables declaration//GEN-END:variables
}
