import java.awt.*;
import java.util.*;
import javax.swing.*;   
import java.io.*;
import javax.swing.table.DefaultTableModel;
public class CreditCardManager extends javax.swing.JFrame {
    public static void main(String[]args)
    {
        new CreditCardManager().setVisible(true);
    }

    // Variables declaration - do not modify                     
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JScrollPane jScrollPane2;
    private JTable jTable1;

    public CreditCardManager() 
    {

        File file = new File("temporary.txt");
        String x = new String();
        try
        {
            Scanner scan = new Scanner(file);
            x = scan.next();
        }
        catch (Exception e)
        {
        }
        ArrayList<String> content = new ArrayList<String>();
        String username = x + "cards.txt";

        File usernames = new File(username);
        try
        {
            Scanner scan = new Scanner(usernames);
            while (scan.hasNextLine())
            {
                content.add(scan.nextLine());
            }
        }
        catch (Exception e)
        {
        }
        setTitle("CFPM");
        jScrollPane2 = new JScrollPane();
        jTable1 = new JTable();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {},
                new String [] {
                    "Type", "Card Number", "Expiration Date", "Security Code"
                }
            ));

        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();

        for (int i = 1; i<=content.size()-2; i++)
        {
            if (i==1)
            {
                Object[] obj = {(content.get(i-1)), (content.get(i)), (content.get(i+1)),(content.get(i+2))};
                dtm.addRow(obj);
            }
            else if (i%4==0)
            {
                Object[] obj = {(content.get(i)), (content.get(i+1)),(content.get(i+2)), (content.get(i+3))};
                dtm.addRow(obj);
            }
            else
            {
            }
        }
        jScrollPane2.setViewportView(jTable1);
        jButton1.setText("Add Passwords");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt){
                    addAccounts(evt);
                }
            });

        jButton2.setText("Log Out");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt){
                    logOut(evt);
                }
            });

        jButton3.setText("Add Credit Card");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt){
                    addCreditCard(evt);
                }
            });

        jButton4.setText("See Passwords");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt){
                    seePasswords(evt);
                }
            });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton1)
                .addGap(0,0,0)
                .addComponent(jButton3)
                .addGap(0,0,0)
                .addComponent(jButton4)
                .addGap(0,0,0)
                .addComponent(jButton2)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addGap(5,5,5)
                    .addComponent(jButton3)
                    .addGap(30,30,30)
                    .addComponent(jButton4)

                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }               

    private void addAccounts(java.awt.event.ActionEvent evt) //This method defines what happens when jButton1 is clicked
    {
        AddAccount AM = new AddAccount();
        String[] args = {};
        AM.main(args);
        dispose();

    }

    private void logOut(java.awt.event.ActionEvent evt) //This method defines what happens when jButton1 is clicked
    {
        LoginScreen LS = new LoginScreen();
        String[] args = {};
        LS.main(args);
        dispose();
    }

    private void addCreditCard(java.awt.event.ActionEvent evt) //This method defines what happens when jButton1 is clicked
    {
        AddCreditCard acc = new AddCreditCard();
        String[] args = {};
        acc.main(args);
        dispose();
    }

    private void seePasswords(java.awt.event.ActionEvent evt) //This method defines what happens when jButton1 is clicked
    {
        PasswordManager pm = new PasswordManager();
        String[] args = {};
        pm.main(args);
        dispose();
    }
}


