import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class logInForm extends JFrame{
    private JTextField one;
    private JPasswordField two;
    private JButton submitButton;
    private JPanel phuphu;


    public logInForm() {
        setContentPane(phuphu);
        setSize(400,400);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Login Form");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                log();
                String on = one.getText();
                String tw = two.getText();

                JOptionPane.showMessageDialog(logInForm.this," Full Name "+ on +" Password " +tw);
            }
        });
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               log();
            }
        });
    }

    void log(){
        try{
            String username = one.getText();
                String password = new String(two.getPassword());
                    if (username.equals("admin") && password.equals("1234")) {
                        JOptionPane.showMessageDialog(logInForm.this, "Login Succesful!");
                        new SchoolPaymentSystem();
                        this.dispose();

                    } else {
                        JOptionPane.showMessageDialog(logInForm.this, "Invalid Username or Password!");



                    }


        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Error; " + e.getMessage());

        }
    }

    static void main() {
        new logInForm();
    }
}
