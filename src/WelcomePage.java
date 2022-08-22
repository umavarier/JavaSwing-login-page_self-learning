import javax.swing.*;
import java.awt.*;

public class WelcomePage {

    JFrame frame = new JFrame();
    JLabel label = new JLabel("Hello ");

    WelcomePage (String userID)
    {
        label.setBounds(0,0,200,35);
        label.setFont(new Font(null,Font.PLAIN,30));
        label.setText("Hello "+userID);

        frame.add(label);
        frame.setSize(420,420);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLayout(null);

    }
}
