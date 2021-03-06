package Ejercicio1;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ivang
 */
public class Ejercicio1 extends javax.swing.JFrame {
    ListaAlfombras lista = new ListaAlfombras();
    /**
     * Creates new form Formulario
     */
    public Ejercicio1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlAlfombraNova = new javax.swing.JPanel();
        lblModelo = new javax.swing.JLabel();
        lblCor = new javax.swing.JLabel();
        btnEngadir = new javax.swing.JButton();
        txtModelo = new javax.swing.JTextField();
        txtCor = new javax.swing.JTextField();
        txtAlto = new javax.swing.JTextField();
        txtAncho = new javax.swing.JTextField();
        lblAncho = new javax.swing.JLabel();
        lblAlto = new javax.swing.JLabel();
        lblcmAlto = new javax.swing.JLabel();
        lblcmAncho = new javax.swing.JLabel();
        pnlAlfombraDisp = new javax.swing.JPanel();
        cBAlfombrasDisponibles = new javax.swing.JComboBox<>();
        btnInformacionAlfombra = new javax.swing.JButton();
        btnEliminarAlfombra = new javax.swing.JButton();
        btnEliminarTodas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlAlfombraNova.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Nova Alfombra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));

        lblModelo.setText("Modelo");

        lblCor.setText("Cor");

        btnEngadir.setText("Engadir");
        btnEngadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEngadirActionPerformed(evt);
            }
        });

        txtModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModeloActionPerformed(evt);
            }
        });

        lblAncho.setText("Ancho");

        lblAlto.setText("Alto");

        lblcmAlto.setText("(cm)");

        lblcmAncho.setText("(cm)");

        javax.swing.GroupLayout pnlAlfombraNovaLayout = new javax.swing.GroupLayout(pnlAlfombraNova);
        pnlAlfombraNova.setLayout(pnlAlfombraNovaLayout);
        pnlAlfombraNovaLayout.setHorizontalGroup(
            pnlAlfombraNovaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlfombraNovaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAlfombraNovaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblModelo)
                    .addComponent(lblCor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAlfombraNovaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAlfombraNovaLayout.createSequentialGroup()
                        .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblAncho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAncho, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcmAncho)
                        .addGap(18, 18, 18)
                        .addComponent(lblAlto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAlto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblcmAlto)
                        .addGap(0, 16, Short.MAX_VALUE))
                    .addComponent(txtModelo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEngadir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlAlfombraNovaLayout.setVerticalGroup(
            pnlAlfombraNovaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlfombraNovaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAlfombraNovaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAlfombraNovaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblModelo)
                        .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnEngadir))
                .addGap(18, 18, 18)
                .addGroup(pnlAlfombraNovaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCor)
                    .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAncho)
                    .addComponent(txtAncho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcmAncho)
                    .addComponent(lblAlto)
                    .addComponent(txtAlto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcmAlto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlAlfombraDisp.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Alfombras dispoñibles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.ABOVE_TOP));

        cBAlfombrasDisponibles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBAlfombrasDisponiblesActionPerformed(evt);
            }
        });

        btnInformacionAlfombra.setText("Información da alfombra");
        btnInformacionAlfombra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformacionAlfombraActionPerformed(evt);
            }
        });

        btnEliminarAlfombra.setText("Eliminar alfombra");
        btnEliminarAlfombra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarAlfombraActionPerformed(evt);
            }
        });

        btnEliminarTodas.setText("Eliminar todas");
        btnEliminarTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarTodasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAlfombraDispLayout = new javax.swing.GroupLayout(pnlAlfombraDisp);
        pnlAlfombraDisp.setLayout(pnlAlfombraDispLayout);
        pnlAlfombraDispLayout.setHorizontalGroup(
            pnlAlfombraDispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlfombraDispLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAlfombraDispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cBAlfombrasDisponibles, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlAlfombraDispLayout.createSequentialGroup()
                        .addComponent(btnInformacionAlfombra, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarAlfombra, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarTodas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlAlfombraDispLayout.setVerticalGroup(
            pnlAlfombraDispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAlfombraDispLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cBAlfombrasDisponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlAlfombraDispLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInformacionAlfombra)
                    .addComponent(btnEliminarAlfombra)
                    .addComponent(btnEliminarTodas))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlAlfombraNova, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlAlfombraDisp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(pnlAlfombraNova, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlAlfombraDisp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(0, 0, 583, 305);
    }// </editor-fold>//GEN-END:initComponents

    private void txtModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModeloActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtModeloActionPerformed

    private void btnInformacionAlfombraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformacionAlfombraActionPerformed
        // TODO add your handling code here:
        String s;
        s = cBAlfombrasDisponibles.getSelectedItem().toString();
        Alfombra a = getAlfombra(getModelo(s));
        JOptionPane.showMessageDialog(this,"MODELO : "+a.getMod()+"\n"
                +"COR : "+a.getColor()+"\n"
                +"ANCHO : "+a.getAlto()+"cm"+"\n"
                +"ALTO : "+a.getAlto()+"cm"
        );
    }//GEN-LAST:event_btnInformacionAlfombraActionPerformed

    private void btnEliminarAlfombraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarAlfombraActionPerformed
        // TODO add your handling code here:
        //obtener alfombra del combo
        if (cBAlfombrasDisponibles.getSelectedItem()!=null){
            String modelo = getModelo(cBAlfombrasDisponibles.getSelectedItem().toString());
            Alfombra a = lista.getAlfombra(modelo);
            lista.eliminarAlfombra(a);
            actualizarCombo();}
        else
            JOptionPane.showMessageDialog(this,"No hay modelos dispoñibles");
  

    }//GEN-LAST:event_btnEliminarAlfombraActionPerformed

    private void cBAlfombrasDisponiblesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBAlfombrasDisponiblesActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cBAlfombrasDisponiblesActionPerformed

    private void btnEngadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEngadirActionPerformed
        // TODO add your handling code here:
        Alfombra a= new Alfombra();
        if(txtModelo.getText().equals("")){
            JOptionPane.showMessageDialog(this,"ERROR : No ha introducido el modelo");
            return;
        }else{
            a.setMod(txtModelo.getText());
            if(txtCor.getText().equals("")){
                JOptionPane.showMessageDialog(this,"ERROR : no ha introducido el color");
                return;
            }
            else{
            a.setColor(txtCor.getText());
            if(isNumeric(txtAncho.getText()))
                a.setAncho(Integer.parseInt(txtAncho.getText()));
            else{
                JOptionPane.showMessageDialog(this,"ERROR : El alto introducido no es válido");return;}
            if(isNumeric(txtAlto.getText())){
                a.setAlto(Integer.parseInt(txtAlto.getText()));}
            else{
                JOptionPane.showMessageDialog(this,"ERROR : El alto introducido no es válido");return;}
            if(lista.getAlfombra(a.getMod())==null){
            lista.addAlfombra(a);
            actualizarCombo();}
            else
                JOptionPane.showMessageDialog(this,"ERRO : El modelo introducido ya existe.");}
        }
        
        
    }//GEN-LAST:event_btnEngadirActionPerformed

    private void btnEliminarTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarTodasActionPerformed
        // TODO add your handling code here:
        cBAlfombrasDisponibles.removeAllItems();
        lista.limpiarLista();
       
    }//GEN-LAST:event_btnEliminarTodasActionPerformed
  
    public void actualizarCombo(){
        //AQUI ELIMINAMOS LOS ITEMS QUE NO ESTEN EN LA LISTA
        cBAlfombrasDisponibles.removeAllItems();
        String item;
        for (int i = 0; i < lista.size(); i++) {
            item=lista.getAlfombra(i).getNombre();
            cBAlfombrasDisponibles.addItem(item);
        }

    }
    
    public Alfombra getAlfombra(String modelo){
        return lista.getAlfombra(modelo);
    }
    
    public String getModelo(String s){
        String[] rota = s.split(" ");
        return rota[1];
    }
  
    public boolean isNumeric(String s){
        try{
            Integer.parseInt(s);
            return true;
        }
        catch (NumberFormatException ex){
            return false;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarAlfombra;
    private javax.swing.JButton btnEliminarTodas;
    private javax.swing.JButton btnEngadir;
    private javax.swing.JButton btnInformacionAlfombra;
    private javax.swing.JComboBox<String> cBAlfombrasDisponibles;
    private javax.swing.JLabel lblAlto;
    private javax.swing.JLabel lblAncho;
    private javax.swing.JLabel lblCor;
    private javax.swing.JLabel lblModelo;
    private javax.swing.JLabel lblcmAlto;
    private javax.swing.JLabel lblcmAncho;
    private javax.swing.JPanel pnlAlfombraDisp;
    private javax.swing.JPanel pnlAlfombraNova;
    private javax.swing.JTextField txtAlto;
    private javax.swing.JTextField txtAncho;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtModelo;
    // End of variables declaration//GEN-END:variables
}
