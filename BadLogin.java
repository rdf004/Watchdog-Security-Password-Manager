import javax.swing.*;
public class BadLogin extends javax.swing.JFrame {

    public static void main(String[]args) //Main method.  Parameter is eliminated so it can be called from another class.
    {
        new BadLogin().setVisible(true);
    }
    // Variables declaration                    
    private JButton jButton1;
    private JLabel jLabel1;

    public BadLogin() //Defines the LoginScreen object
    {
        setTitle("CFPM");

        //Objects are created
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    back(evt);
                }
            });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Incorrect login!  Please try again.");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(45,100)
                .addComponent(jLabel1, 0, 340, 500)
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addComponent(jButton1)
                .addContainerGap(200, 500))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1, 0, 85, 170)
                .addGap(50, 50, 50)
                .addComponent(jButton1)
                .addContainerGap(90, 200))
        );

        pack();
    }                        

    private void back(java.awt.event.ActionEvent evt) //This method describes what will happen when jButton1 is clicked
    { 
        LoginScreen ls = new LoginScreen();
        String[] args = {};
        ls.main(args);
        dispose();
    }

}



