import javax.swing.*;
public class AfterCreation extends JFrame {

    public static void main(String[]args) //Main method.  Parameter is eliminated so it can be called from another class.
    {

        new AfterCreation().setVisible(true);

    }

    // Variables declaration                     
    private JButton jButton1;
    private JLabel jLabel1;
    public AfterCreation() //Defines the AfterCreation object
    {
        setTitle("CFPM");

        //Objects are created
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Thank you for creating an account!");

        jButton1.setText("Return to Main Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    back(evt);
                }
            });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140)
                        .addComponent(jButton1)))
                .addContainerGap(125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1, 55,56,57)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(165, 166))
        );

        pack();
    }                       

    private void back(java.awt.event.ActionEvent evt) {                                         
        LoginScreen asdf = new LoginScreen();
        String[] args = {};
        asdf.main(args);
        dispose();
    }                                        

}



