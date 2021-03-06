
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sagar
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        super("Home Frame");
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        totalAccesories = new javax.swing.JLabel();
        welcome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        addMenu = new javax.swing.JMenuItem();
        manageMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        showItemsMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        totalAccesories.setBackground(new java.awt.Color(255, 51, 51));
        totalAccesories.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        totalAccesories.setForeground(new java.awt.Color(255, 51, 51));
        totalAccesories.setText("Total Accessories:");

        welcome.setBackground(new java.awt.Color(255, 51, 51));
        welcome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        welcome.setForeground(new java.awt.Color(255, 0, 51));
        welcome.setText("WeLcome");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/img.jpg"))); // NOI18N

        jMenuBar1.setPreferredSize(new java.awt.Dimension(64, 30));

        jMenu1.setText("ManageAccesories");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        addMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        addMenu.setBackground(new java.awt.Color(0, 204, 204));
        addMenu.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        addMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-add-22.png"))); // NOI18N
        addMenu.setText(" Add");
        addMenu.setAlignmentY(2.0F);
        addMenu.setPreferredSize(new java.awt.Dimension(131, 35));
        addMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMenuActionPerformed(evt);
            }
        });
        jMenu1.add(addMenu);

        manageMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        manageMenu.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        manageMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-edit-link-23.png"))); // NOI18N
        manageMenu.setText("Manage");
        manageMenu.setAlignmentY(2.0F);
        manageMenu.setPreferredSize(new java.awt.Dimension(170, 32));
        manageMenu.setSelected(true);
        manageMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageMenuActionPerformed(evt);
            }
        });
        jMenu1.add(manageMenu);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("All Accesories");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        showItemsMenu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        showItemsMenu.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        showItemsMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-show-password-22.png"))); // NOI18N
        showItemsMenu.setText("Show Items");
        showItemsMenu.setPreferredSize(new java.awt.Dimension(170, 32));
        showItemsMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showItemsMenuActionPerformed(evt);
            }
        });
        jMenu2.add(showItemsMenu);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(totalAccesories, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 695, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(totalAccesories, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(welcome, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addMenuActionPerformed
        // TODO add your handling code here:
        AddAccessoriesForm mf = new AddAccessoriesForm();
        mf.setVisible(true);
        mf.pack();
        mf.setLocationRelativeTo(null);
        //making sure that when the add frame is closed,everything is not closed.
        mf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_addMenuActionPerformed

    private void manageMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageMenuActionPerformed
        // TODO add your handling code here:
                    ManageAccessories mf = new ManageAccessories();
                    mf.setVisible(true);
                    mf.pack();
                    mf.setLocationRelativeTo(null);
                    mf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                    this.dispose();

    }//GEN-LAST:event_manageMenuActionPerformed

    private void showItemsMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showItemsMenuActionPerformed
                    ShowItemsForm mf = new ShowItemsForm();
                    mf.setVisible(true);
                    mf.pack();
                    mf.setLocationRelativeTo(null);
                    mf.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_showItemsMenuActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addMenu;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem manageMenu;
    private javax.swing.JMenuItem showItemsMenu;
    public static javax.swing.JLabel totalAccesories;
    public static javax.swing.JLabel welcome;
    // End of variables declaration//GEN-END:variables
}
