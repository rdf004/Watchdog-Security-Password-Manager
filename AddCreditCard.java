import javax.swing.*;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.awt.*;

public class AddCreditCard extends JFrame {

    public static void main(String[] args) {

        new AddCreditCard().setVisible(true);

    }
    // Variables declaration
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;

    public AddCreditCard() //Defines the AddCreditCard object
    {

        setTitle("Watchdog Security System");

        //Objects are created
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jTextField1 = new JTextField();
        jTextField2 = new JTextField();
        jTextField3 = new JTextField();
        jTextField4 = new JTextField();
        jButton1 = new JButton();
        jLabel6 = new JLabel();
        jButton2 = new JButton();

        Image im = Toolkit.getDefaultToolkit().getImage("doberman.png");
        setIconImage(im);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Add a Credit Card");

        jLabel2.setText("Type:");

        jLabel3.setText("Card #:");

        jLabel4.setText("Expiration Date:");

        jLabel5.setText("Security Code:");

        jLabel6.setText("Please enter everything correctly!");

        jButton2.setText("Back");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                back(evt);
            }
        });

        jButton1.setText("Submit");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                submit(evt);
            }
        });

        //Formatting of the AddCreditCard object. This includes placement of JTextfields, JLabels, and JButtons.
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addGroup(layout
                        .createParallelGroup(GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup().addGap(151, 151, 151).addComponent(jButton1))
                                .addGap(2, 2, 2).addComponent(jButton2)
                                .addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout
                                        .createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(layout
                                        .createSequentialGroup()
                                        .addComponent(jLabel5).addGap(40, 40, 40).addComponent(jTextField4,
                                        GroupLayout.PREFERRED_SIZE, 124,
                                        GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addGroup(GroupLayout.Alignment.LEADING,
                                                        layout.createSequentialGroup().addGroup(layout
                                                                .createParallelGroup(
                                                                        GroupLayout.Alignment.TRAILING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(jLabel6).addGap(41, 41, 41))
                                                                .addGroup(layout.createSequentialGroup().addComponent(
                                                                        jLabel2, GroupLayout.PREFERRED_SIZE,
                                                                        68, GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(18, 18, 18)))
                                                                .addGroup(layout
                                                                        .createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                        .addComponent(jTextField1,
                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                120, Short.MAX_VALUE)
                                                                ))
                                                .addGroup(layout
                                                        .createParallelGroup(GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addGroup(GroupLayout.Alignment.TRAILING,
                                                                layout.createSequentialGroup().addComponent(jLabel4)
                                                                        .addPreferredGap(
                                                                                LayoutStyle.ComponentPlacement.RELATED,
                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                        .addComponent(jTextField3,
                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                124,
                                                                                GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(GroupLayout.Alignment.TRAILING,
                                                                layout.createSequentialGroup().addComponent(jLabel3)
                                                                        .addGap(40, 40, 40).addComponent(jTextField2,
                                                                        GroupLayout.PREFERRED_SIZE,
                                                                        122,
                                                                        GroupLayout.PREFERRED_SIZE)))))))
                        .addGroup(layout.createSequentialGroup().addContainerGap()
                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 148,
                                        GroupLayout.PREFERRED_SIZE)
                                .addGap(123, 123, 123)))
                        .addContainerGap(119, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup().addContainerGap()
                        .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 29,
                                GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 22,
                                        GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE,
                                        GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3).addComponent(jTextField2, GroupLayout.PREFERRED_SIZE,
                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4).addComponent(jTextField3, GroupLayout.PREFERRED_SIZE,
                                GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE,
                                        GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                        .addGap(50, 50, 50).addComponent(jButton1).addGap(50, 50, 50).addComponent(jButton2).addGap(5, 5, 5)
                        .addGap(61, 61, 61)));

        pack();
    }

    private void back(ActionEvent evt) //This method defines what happens when jButton2 is pressed
    {
        CreditCardManager CM = new CreditCardManager(); //User is led back to CreditCardManager page
        String[] args = {};
        CM.main(args);
        dispose();
    }

    private void submit(ActionEvent evt) //This method defines what happens when jButton1 is pressed
    {
        File file = new File("temporary.txt");
        String x = new String();
        try //The program checks to see which user is logged in at the moment
        {
            Scanner scan = new Scanner(file);
            x = scan.next();
        } catch (Exception e) {
        }

        String type = jTextField1.getText();
        String cardnumber = jTextField2.getText();
        String expdate = jTextField3.getText();
        String pinnumber = jTextField4.getText();
        String userfile = x + "cards.txt";
        if ((type != null && !type.isEmpty()) && (cardnumber != null && !cardnumber.isEmpty()) //If everything works, info is logged in
                && (expdate != null && !expdate.isEmpty()) && (pinnumber != null && !pinnumber.isEmpty())) {
            try {

                File outputFile = new File(userfile);

                BufferedWriter out = new BufferedWriter(new FileWriter(userfile, true));

                out.write((type) + "\n" + (cardnumber) + "\n" + (expdate) + "\n" + (pinnumber));
                out.newLine();
                out.close();
            } catch (Exception e) {
                File outputFile = new File("accounts.txt");
            }
            dispose();
            CreditCardManager cm = new CreditCardManager();
            String[] args = {};
            cm.main(args);

        } // Below: if something is incorrect, the user is redirected to the CreditCardManager page.
        else {
            CreditCardManager cm = new CreditCardManager();
            String[] args = {};
            cm.main(args);
            dispose();
        }
    }

}
