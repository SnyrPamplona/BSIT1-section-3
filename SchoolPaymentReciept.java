import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SchoolPaymentReciept extends JFrame{
    private JPanel pay;
    private JTextField term1;
    private JTextField date;
    private JTextField one;
    private JTextField term2;
    private JTextField term3;
    private JLabel total;
    private JButton APPOVEDButton;


    public SchoolPaymentReciept() {
        setTitle("School Payment Reciept");
        setContentPane(pay);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        APPOVEDButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bayad();
                String oo = one.getText();
                String om = term1.getText();
                String oh = term2.getText();
                String tr = term3.getText();
                String da = date.getText();
                String er = total.getText();

                JOptionPane.showMessageDialog(SchoolPaymentReciept.this, " Window Casher " + oo + " Date " + da +
                        " Midterm " + om + " PreFinal " + oh + " Final " + tr + " Total to Pay " + er);


            }
        });
    }
        void bayad(){
            try{
                Double a =Double.parseDouble(term1.getText());
                Double b =Double.parseDouble(term2.getText());
                Double c =Double.parseDouble(term3.getText());
                Double topay= a+b+c;
                total.setText(String.valueOf(topay));
            }catch (NumberFormatException e){
                total.setText("why mahla");
            }
        }



        public static void main() {
        new SchoolPaymentReciept();
    }
}
