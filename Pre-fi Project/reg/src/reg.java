import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class reg extends JFrame {

    private JPanel main2;
    private JRadioButton rb_mech;
    private JRadioButton rb_chem;
    private JRadioButton rb_comp;
    private JRadioButton rb_civil;
    private JRadioButton rb_comsci;
    private JRadioButton rb_it;
    private JButton button1;

    public reg() {

        setTitle("Course Selection");
        setSize(800,800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setContentPane(main2);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



                if(rb_mech.isSelected()){

                    String mech = rb_mech.getText();
                    String message1 = "Do You Want to Proceed to Submission?" + "\n"
                            +"Course: " + mech + "\n";

                    int confirm1 = JOptionPane.showConfirmDialog(null, message1, "You Want to Proceed?",
                            JOptionPane.YES_NO_OPTION);
                    if(confirm1==JOptionPane.YES_OPTION){

                        new sub().setVisible(true);
                        dispose();

                    }

                }else if (rb_chem.isSelected()){

                    String chem = rb_chem.getText();
                    String message1 = "Do You Want to Proceed to Submission?" + "\n"
                            +"Course: " + chem + "\n";

                    int confirm1 = JOptionPane.showConfirmDialog(null, message1, "You Want to Proceed?",
                            JOptionPane.YES_NO_OPTION);
                    if(confirm1==JOptionPane.YES_OPTION){

                        new sub().setVisible(true);
                        dispose();

                    }

                }else if (rb_comp.isSelected()){

                    String comp = rb_comp.getText();
                    String message1 = "Do You Want to Proceed to Submission?" + "\n"
                            +"Course: " + comp + "\n";

                    int confirm1 = JOptionPane.showConfirmDialog(null, message1, "You Want to Proceed?",
                            JOptionPane.YES_NO_OPTION);
                    if(confirm1==JOptionPane.YES_OPTION){

                        new sub().setVisible(true);
                        dispose();

                    }
                } else if (rb_civil.isSelected()){

                    String civil = rb_civil.getText();
                    String message1 = "Do You Want to Proceed to Submission?" + "\n"
                            +"Course: " + civil + "\n";

                    int confirm1 = JOptionPane.showConfirmDialog(null, message1, "You Want to Proceed?",
                            JOptionPane.YES_NO_OPTION);
                    if(confirm1==JOptionPane.YES_OPTION){

                        new sub().setVisible(true);
                        dispose();

                    }
                }else if (rb_comsci.isSelected()){

                    String comsci = rb_comsci.getText();
                    String message1 = "Do You Want to Proceed to Submission?" + "\n"
                            +"Course: " + comsci + "\n";

                    int confirm1 = JOptionPane.showConfirmDialog(null, message1, "You Want to Proceed?",
                            JOptionPane.YES_NO_OPTION);
                    if(confirm1==JOptionPane.YES_OPTION){

                        new sub().setVisible(true);
                        dispose();

                    }
                }else if (rb_it.isSelected()){

                    String it = rb_it.getText();
                    String message1 = "Do You Want to Proceed to Submission?" + "\n"
                            +"Course: " + it + "\n";

                    int confirm1 = JOptionPane.showConfirmDialog(null, message1, "You Want to Proceed?",
                            JOptionPane.YES_NO_OPTION);
                    if(confirm1==JOptionPane.YES_OPTION){

                        new sub().setVisible(true);
                        dispose();

                    }
                }else{

                    JOptionPane.showMessageDialog(null, "Please Select Your Course");

                }

            }
        });
    }

    public static void main(String[] args) {

        new reg().setVisible(true);

    }

}
