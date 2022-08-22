import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
public class Login implements ActionListener {




    JFrame frame= new JFrame();
    JButton loginButton=new JButton("Login");
    JButton resetButton=new JButton("Reset");
    JTextField userNameField= new JTextField();
    JPasswordField userPasswordField= new JPasswordField();
    JLabel userNameLabel= new JLabel("User Id: ");
    JLabel userPasswordLabel = new JLabel("Password: ");
    JLabel messageLabel=new JLabel();
    HashMap<String, String> loginInfo= new HashMap<String, String>();
    Login(HashMap<String,String> loginInfoOriginal){
        loginInfo= loginInfoOriginal;

        userNameLabel.setBounds(50,100,75,25);
        userPasswordLabel.setBounds(50,150,75,25);

        messageLabel.setBounds(125,250,250,35);
        messageLabel.setFont(new Font(null,Font.ITALIC,25));

        userNameField.setBounds(125,100,200,25);
        userPasswordField.setBounds(125,150,200,25);

        loginButton.setBounds(125,200,100,25);
        loginButton.setFocusable(false);
        loginButton.addActionListener(this);

        resetButton.setBounds(230,200,100,25);
        resetButton.setFocusable(false);
        resetButton.addActionListener(this);




        frame.add(userNameLabel);
        frame.add(userNameField);
        frame.add(userPasswordLabel);
        frame.add(userPasswordField);
        frame.add(loginButton);
        frame.add(resetButton);
        frame.add(messageLabel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setVisible(true);
        frame.setLayout(null);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==resetButton) {
            userNameField.setText("");
            userPasswordField.setText("");
            messageLabel.setText("");
        }
        if(e.getSource()==loginButton) {
            String userID=userNameField.getText();
            String password=String.valueOf(userPasswordField.getPassword());

            if(loginInfo.containsKey(userID)) {
                if(loginInfo.get(userID).equals(password)) {
                    messageLabel.setForeground(Color.green);
                    messageLabel.setText("Login successfull ");
                    frame.dispose();
                    WelcomePage welcomepage = new WelcomePage(userID);

                }
                else {
                    messageLabel.setForeground(Color.red);
                    messageLabel.setText("Wrong password");
                }
            }
            else {
                messageLabel.setForeground(Color.red);
                messageLabel.setText("user id not found");
            }
        }
    }
}
