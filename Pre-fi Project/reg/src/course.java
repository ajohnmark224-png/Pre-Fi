import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class course extends JFrame {
    private JPanel main1;
    private JTextField txt_fullname;
    private JLabel lbl_full;
    private JLabel lbl_age;
    private JTextField txt_age;
    private JTextField txt_sex;
    private JTextField txt_add;
    private JButton btn_proceed;
    private JLabel lbl_sex;
    private JLabel lbl_add;

    public course() {

        setTitle("Course");
        setSize(400,400);
        setContentPane(main1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        btn_proceed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String fullname = txt_fullname.getText();
                String age = txt_age.getText();
                String sex = txt_sex.getText();
                String add = txt_add.getText();

                String message = "Proceed To Enrollment: " + "\n"
                        + "Full Name: " + fullname + "\n"
                        + "Age: " + age + "\n"
                        + "Sex: " + sex + "\n"
                        + "Add: " + add;

                int confirm = JOptionPane.showConfirmDialog(null, message,"Do You Want To Proceed?",
                        JOptionPane.YES_NO_OPTION);

                if (confirm == JOptionPane.YES_OPTION) {

                    new reg().setVisible(true);
                    dispose();

                }else if(confirm == JOptionPane.NO_OPTION){

                    JOptionPane.showMessageDialog(course.this,"Thank You For Visiting!");

                }
            }

        });
    }

    public static void main(String[] args) {

        new  course().setVisible(true);

    }

}
