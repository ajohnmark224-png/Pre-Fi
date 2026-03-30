import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class sub  extends JFrame {

    private JPanel main3;
    private JCheckBox ch_yes;
    private JCheckBox ch_no;
    private JButton proceedButton;

    public sub() {

        setTitle("Submission");
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setContentPane(main3);
        setLocationRelativeTo(null);

        proceedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(ch_yes.isSelected()){

                    new course().setVisible(true);
                    dispose();

                }else if(ch_no.isSelected()){

                    JOptionPane.showMessageDialog(sub.this,"Thank You for Visiting our Page");

                }else{

                    JOptionPane.showMessageDialog(sub.this,"Please Select Yes or No Before Proceeding");

                }

            }
        });
    }

    public static void main(String[] args) {

        new sub().setVisible(true);

    }

}
