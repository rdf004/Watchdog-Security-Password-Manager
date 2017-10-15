import javax.swing.*;
public class Duplication extends javax.swing.JFrame {

    
    public Duplication() {
        initComponents();
    }                         
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("The username that you entered has already been taken");

        JButton1.setLabel("Back");
        JButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel1, 0, 350, 600))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(JButton1, 0, 40, 80)))
                .addContainerGap(30, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1, 0, 80, 160)
                .addGap(19, 19, 19)
                .addComponent(JButton1, 0, 30, 50)
                .addContainerGap(110, 150))
        );

        pack();
    }// </editor-fold>                        

    private void back(java.awt.event.ActionEvent evt) {                                        
        CreateAccount CA = new CreateAccount();
        String[] args = {};
        CA.main(args);
        dispose();
    }                                       
    public static void main(String args[]) {
        
                new Duplication().setVisible(true);
        
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton JButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration                   
}



