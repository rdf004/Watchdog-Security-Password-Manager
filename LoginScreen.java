import java.awt.*;
import java.awt.Color;
import java.util.*;
import javax.swing.*;   
import java.io.*;
public class LoginScreen extends JFrame 
{
    public static void main(String[] args) //Main method.  Parameter is eliminated so it can be called from another class.
    {
        new LoginScreen().setVisible(true);
    }

    public static String encrypt(String x){
        String ab = "abcdefghijklmnopqrstuvwxyz1234567890";
        String ba = "stuvwxyz1234567890abcdefghijklmnopqr";
        for(int i = 0; i < x.length(); i++){
            int indexOfCharacter = ab.indexOf(x.charAt(i));
            if(indexOfCharacter < 31){
                indexOfCharacter +=3;
                x = x.replace(x.charAt(i), ab.charAt(indexOfCharacter));
            }
            else{
                int indexOfCharacterba = ba.indexOf(x.charAt(i));
                indexOfCharacterba +=3;
                x = x.replace(x.charAt(i), ba.charAt(indexOfCharacterba));
            }

        }
        return x;
    }

    //Variables declaration
    private JButton jButton1;
    private JButton jButton2;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JPasswordField jPasswordField1;
    private JTextField jTextField1;
    public LoginScreen() //Defines the LoginScreen object
    { 
        setTitle("CFPM");
        //Objects are created
        jPasswordField1 = new JPasswordField();
        jTextField1 = new JTextField();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jButton1 = new JButton();
        jButton2 = new JButton();
      

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(1080, 720);

        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jPasswordField1ActionPerformed(evt);
                }
            });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jTextField1ActionPerformed(evt);
                }
            });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel1.setText("Username:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setText("Password:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Watchdogs Security System");

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    login(evt);
                }
            });

        jButton2.setText("Create New Account");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    createAccount(evt);
                }
            });

        
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
               .addComponent(jLabel3, 0, 660, 1000))
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, 0, 110, 200)
                    .addComponent(jLabel1, 0, 110, 200))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPasswordField1,0, 110, 200)
                        .addGap(20, 20, 20)
                        .addComponent(jButton1)
                .addGap(20, 20, 20)
                .addComponent(jButton2)
                .addContainerGap(50, 200))
        )));
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel3, 0, 70, 200)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, 0, 25, 50)
                            .addComponent(jLabel2))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, 0, 25, 50)
                            .addComponent(jPasswordField1, 0, 25, 50)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jButton1)))
                .addGap(20, 20, 20)
                .addComponent(jButton2)
                .addContainerGap(200, 800))
        );

        pack();
    }

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {

    }

    private void createAccount(java.awt.event.ActionEvent evt) //This method defines what will happen when jButton2 is clicked.
    {
        CreateAccount page = new CreateAccount(); //A CreateAccount object is created.
        String[] args = {};
        page.main(args); //The CreateAccount object is made visible through the "main method"
        dispose(); //The LoginScreen closes

    }

    private void login(java.awt.event.ActionEvent evt) 
    {    
        File file = new File("accounts.txt");
        String username = jTextField1.getText();
        String password = jPasswordField1.getText();
        File file2 = new File("temporary.txt");
        try
        {
            FileWriter out = new FileWriter(file2);
            out.write(username);
            out.close();
        }
        catch (Exception e)
        {
        }

        try
        {
            boolean correct = false;
            Scanner scan = new Scanner(file);
            while (scan.hasNextLine())
            {
                if ((encrypt(username) + "\t" + encrypt(password)).equals(scan.nextLine())){
                    correct = true;
                }

            }

            if (correct == true)
            {
                PasswordManager PM = new PasswordManager();
                String[] args = {};
                dispose();
                PM.main(args);
            }
            else
            {
                BadLogin bl = new BadLogin();
                String[] args = {};
                bl.main(args);
                dispose();
            }
        }
        catch (Exception e)
        {
        }

    }
    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {
    }
    
    

}




