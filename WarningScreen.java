import javax.swing.*;
public class WarningScreen extends JFrame {

    public static void main(String[] args) //Main method.  Parameters are eliminated so that it can be called from another class.
    {
        new WarningScreen().setVisible(true);
    }
    // Variables declaration                     
    private JButton jButton1;
    private JLabel jLabel1;
    public WarningScreen() //Defines the WarningScreen object
    {
        setTitle("CFPM");

        //Objects are created
        jLabel1 = new JLabel();
        jButton1 = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Something went wrong.  Please try again!");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt){
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
                        .addGap(104, 104, 104)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jButton1)))
                .addContainerGap(150, 200))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1, 0, 100, 200)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(110, 200))
        );

        pack();
    }                       

    private void back(java.awt.event.ActionEvent evt) //This method defines what happens when jButton1 is clicked
    {
        CreateAccount asdf = new CreateAccount(); //The user is led back to the CreateAccount page
        String[] args = {};
        asdf.main(args);
        dispose();
    }

}



