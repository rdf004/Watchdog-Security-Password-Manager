import java.util.*;
import javax.swing.*;
import java.io.*;
public class CreateAccount extends JFrame{
    public static void main(String[] args) //Main method.  Parameter is eliminated so it can be called from another class.
    {
        new CreateAccount().setVisible(true);
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
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JPasswordField jPasswordField1;
    private JPasswordField jPasswordField2;
    private JTextField jTextField1;    
    private JButton jButton2;
    public CreateAccount() //Defines the CreateAccount object
    {
        setTitle("CFPM");  
        //Objects are created
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jTextField1 = new JTextField();
        jPasswordField1 = new JPasswordField();
        jPasswordField2 = new JPasswordField();
        jButton1 = new JButton();
        jButton2 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); 
        jLabel1.setText("Create Account");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        jLabel2.setText("Username:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        jLabel3.setText("Password:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); 
        jLabel4.setText("Confirm Password:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jTextField1ActionPerformed(evt);
                }
            });

        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jPasswordField2ActionPerformed(evt);
                }
            });

        jButton1.setText("Submit Information");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt){
                    create(evt);
                }
            });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    back(evt);
                }
            });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.CENTER)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                    .addComponent(jButton1)
                    .addGap(20,20,20)
                    .addComponent(jButton2, 0, 75, 140)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, true)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(114, 114, 114)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel4)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jPasswordField2))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                                .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jPasswordField1))
                                .addGroup(GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextField1))))))
                .addContainerGap(100, 2000))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, 0, 25, 40))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField1, 0, 25, 40))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jPasswordField2, 0, 25, 40))
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addGap(0,5,10)
                .addComponent(jButton2)
                .addContainerGap(60, 1000))
        );

        pack();
    }                        

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {    
    }                                           

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {                                               

    }                             

    private void create(java.awt.event.ActionEvent evt) //This method defines what happens when jButton1 is clicked
    {
        String username = jTextField1.getText();
        String password2 = jPasswordField2.getText();
        String password1 = jPasswordField1.getText();
        File file = new File("accounts.txt");
        try{
            Scanner scan = new Scanner(file);
            boolean correct = true;
            while (scan.hasNextLine()){
                if (scan.nextLine().contains(encrypt(username)))
                {
                    correct = false;
                }
            }
            //Below: if everything entered is correct, the information is logged into the Username and Password text files.
            if (correct== true && password1.equals(password2) && (username!=null&& !username.isEmpty()) && (password1!=null && !password1.isEmpty()) && (password2!=null && !password2.isEmpty()) )
            {
                try{

                    File outputFile = new File("accounts.txt");

                    BufferedWriter out = new BufferedWriter(new FileWriter("accounts.txt", true));

                    out.write(encrypt(username) + "\t" + encrypt(password1));
                    out.newLine();
                    out.close();
                }
                catch (Exception e)
                {
                    File outputFile = new File("accounts.txt");
                }
                dispose();
                AfterCreation after = new AfterCreation();
                String[] args = {};
                after.main(args);

            }
            //Below: if something is incorrect, a WarningScreen object is created and the CreateAccount object closes.
            else if (correct == false && (username!=null) && (!username.isEmpty()))
            {
                Duplication popup = new Duplication();
                String[] args = {};
                popup.main(args);
                dispose();

            }
            else
            {
                WarningScreen WS = new WarningScreen();
                String[] args = {};
                WS.main(args);
                dispose();
            }
        }
        catch (Exception e)
        {
        }
    }

    private void back(java.awt.event.ActionEvent evt) //This method describes what happens when jButton2 is clicked
    {
        LoginScreen back = new LoginScreen(); //A LoginScreen object is created
        String[] args = {};
        back.main(args); //This object's "main method" is called and makes it visible
        dispose(); //The CreateAccount closes
    }

}


