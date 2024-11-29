import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class chessGameUI {

    JFrame frame = new JFrame("Chess");
    JButton[][] bt = new JButton[8][8];

    public chessGameUI() {
        frame.setSize(900, 600);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(null);
        addButtons();
        frame.setVisible(true);
       
    }

    public void addButtons() {
        GridLayout layout = new GridLayout(8, 8);
        frame.setLayout(layout);
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                bt[i][j] = new JButton();
                frame.add(bt[i][j]);
            }
        }
    }

    public static void main(String[] args) {
        new chessGameUI();
    }

}
