import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SchoolPaymentSystem extends JFrame{
    private JTextField oe;
    private JTextField two;
    private JTextField teer;
    private JTextField four;
    private JTextField five;
    private JTextField six;
    private JTextField seven;
    private JButton button1;
    private JLabel total;
    private JPanel pii;
    private JButton nextButton;


    public SchoolPaymentSystem() {
        setTitle("jfdskfdsk");
        setContentPane(pii);
        setLocationRelativeTo(null);
        setSize(200,200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pay();
            String aa = oe.getText();
            String ww = two.getText();
            String qq = teer.getText();
            String ee = four.getText();
            String dd = five.getText();
            String cc = six.getText();
            String pp = seven.getText();
            String to = total.getText();

            JOptionPane.showMessageDialog(SchoolPaymentSystem.this, "School ID" +aa +"full name" +ww +"program"+
                    qq +"course "+ee +"tuitionn" +dd +"ssem to pay" + cc +" bak acc"+ pp +"total topay" +to);

            }
        });
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SchoolPaymentReciept().setVisible(true);
            }
        });
    }

    void pay(){
        try{
            Double dd =Double.parseDouble(five.getText());
            Double ccd =Double.parseDouble(six.getText());
            Double p= Double.parseDouble(seven.getText());
            Double we = dd - ccd +p ;
            total.setText(String.valueOf(we));

        } catch (NumberFormatException e){
            total.setText("invlid");
        }
    }

    static void main() {
        new SchoolPaymentSystem();

    }
}
