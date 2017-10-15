import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import javax.swing.*;
public class AddAccount extends JFrame {
    public static void main(String[] args) {

        new AddAccount().setVisible(true);

    }
    // Variables declaration
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
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
    public AddAccount() {
        initComponents();
    }

    private void initComponents() {

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
        jButton3 = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Add an Account");

        jLabel2.setText("Website:");

        jLabel3.setText("Username:");

        jLabel4.setText("Password:");

        jLabel5.setText("Confirm Password:");

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    back(evt);
                }
            });

        jButton1.setText("Submit");  
        jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    add(evt);
                }
            });

        jButton3.setText("Generate a password for me!");  
        jButton3.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    randomlyGenerate(evt);
                }
            });

        jLabel6.setText("Please enter everything correctly!");
          GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup().addGroup(layout
                    .createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup().addGap(151, 151, 151).addComponent(jButton1))
                        .addGap(2, 2, 2).addComponent(jButton2)
                        .addGap(2, 2, 2).addComponent(jButton3)
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
                .addGap(50, 50, 50).addComponent(jButton1).addGap(50, 50, 50).addComponent(jButton2).addGap(5,5,5).addComponent(jButton3)
                .addGap(61, 61, 61)));

        pack();
    }// </editor-fold>

    private void back(java.awt.event.ActionEvent evt) {
        PasswordManager PM = new PasswordManager();
        String[] args = {};
        PM.main(args);
        dispose();
    }

    private void randomlyGenerate(java.awt.event.ActionEvent evt) {
        ArrayList<String> randompassword = new ArrayList<String>();
        int a = 8;
        for(int i = 0; i < a; i++){
            boolean t = Math.random() < 0.5;
            if(t == true){
                int x = (int) ((Math.random())*10);
                randompassword.add(Integer.toString(x));    
            }
            else{
                String ab = "abcdefghijklmnopqrstuvwxyz";
                int x = (int)(Math.random()*26);
                randompassword.add(Character.toString(ab.charAt(x)));
            }
        }
        String password = "";
        for(int y = 0; y < randompassword.size(); y++){
            password += randompassword.get(y);
        }
        jTextField3.setText(password);
        jTextField4.setText(password);
    }

    private void add(java.awt.event.ActionEvent evt) {
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

        String website = jTextField1.getText();
        String username = jTextField2.getText();
        String password1 = jTextField3.getText();
        String password2 = jTextField4.getText();
        String userfile = x + "accounts.txt";
        if (password1.equals(password2) && (username != null && !username.isEmpty()) && (password1 != null && !password1.isEmpty())
        && (password2 != null && !password2.isEmpty())) {
            try {

                File outputFile = new File(userfile);

                BufferedWriter out = new BufferedWriter(new FileWriter(userfile, true));

                out.write((website) + "\n" + (username) + "\n" + (password1));
                out.newLine();
                out.close();
            } catch (Exception e) {
                File outputFile = new File("accounts.txt");
            }
            dispose();
            PasswordManager pm = new PasswordManager();
            String[] args = {};
            pm.main(args);

        }
        // Below: if something is incorrect, a WarningScreen object is created
        // and the CreateAccount object closes.
        else {
            PasswordManager pm = new PasswordManager();
            String[] args = {};
            pm.main(args);
            dispose();
        }
    }

}


