import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class Login_form {
    
    JFrame frame =  new JFrame("cetpa");
    JLabel label1 = new JLabel("Enter user id ");
    JLabel label2 = new JLabel("Enter password ");

    JTextField textbox1 = new JTextField();
    JPasswordField textbox2 = new JPasswordField();
    public  Login_form()
    {
        frame.setSize(500,400);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(null);
        aDDLabels();
        aDDTextBoxes();

        
       JButton button1 = new JButton("submit");
        button1.setBounds(150,200,120,30);
        frame.add(button1);

       JButton button2 = new JButton("cancel");
       button2.setBounds(300,200,120,30);
       frame.add(button2);

       // JButton button3 = new JButton("start");
       // button3.setBounds(250,200,120,30);
       // frame.add(button3);

        frame.setVisible(true);
    }
    private void aDDLabels()
    {
        label1.setBounds(50,150,150,30);
        frame.add(label1);

        label2.setBounds(50,80,150,30);
        frame.add(label2);
    }
    private void aDDTextBoxes()
    {
        textbox1.setBounds(200,150,150,30);
        frame.add(textbox1);

        textbox2.setBounds(200,80,150,30);
        frame.add(textbox2);
    }

    public static void main(String[] args)
    {
        new Login_form();
        
    }
}

