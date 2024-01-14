import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

    JTextField jTextField, jd;
    JButton login;

    Login() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(700, 400);
        setBackground(Color.white);
        setLocation(200, 50);
        setVisible(true);
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JLabel jLabel = new JLabel("Username");
        jLabel.setBounds(100, 70, 100, 70);
        add(jLabel);

        JLabel jl = new JLabel("Password");
        jl.setBounds(100, 100, 100, 70);
        add(jl);

        jTextField = new JTextField();
        jTextField.setBounds(200, 70, 100, 50);
        add(jTextField);

        jd = new JPasswordField();
        jd.setBounds(200, 120, 100, 50);
        add(jd);

        login = new JButton("Login");
        login.setBounds(200, 200, 100, 50);
        add(login);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);


        ImageIcon i1 = new ImageIcon("icons/Second.jpg");
        Image i2 = i1.getImage().getScaledInstance(300, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400, 100, 300, 100);
        add(image);
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==login) {
            String username = jTextField.getText();
            String password = jd.getText();
            if (username.equals("Admin") && password.equals("12345")) {
                setVisible(false);
                new Home();
            } else {
                JOptionPane.showMessageDialog(null, "Invalid username or password");
            }
        }
    }



    public static void main(String[] args) {
        new Login();


    }
}
