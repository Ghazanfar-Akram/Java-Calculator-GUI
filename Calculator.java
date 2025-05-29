import javax.swing.*;

public class Calculator{
    public static void main(String[] args) {
        JFrame frame = new JFrame("CASIO");
        frame.setBounds(20, 20, 330, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JTextField display = new JTextField();
        display.setBounds(30, 50, 270, 70);
        frame.add(display);

        int buttonWidth = 60;
        int buttonHeight = 70;

        // Row 1
        JButton b7 = new JButton("7");
        b7.setBounds(30, 130, buttonWidth, buttonHeight);
        frame.add(b7);

        JButton b8 = new JButton("8");
        b8.setBounds(100, 130, buttonWidth, buttonHeight);
        frame.add(b8);

        JButton b9 = new JButton("9");
        b9.setBounds(170, 130, buttonWidth, buttonHeight);
        frame.add(b9);

        JButton bDiv = new JButton("/");
        bDiv.setBounds(240, 130, buttonWidth, buttonHeight);
        frame.add(bDiv);

        // Row 2
        JButton b4 = new JButton("4");
        b4.setBounds(30, 210, buttonWidth, buttonHeight);
        frame.add(b4);

        JButton b5 = new JButton("5");
        b5.setBounds(100, 210, buttonWidth, buttonHeight);
        frame.add(b5);

        JButton b6 = new JButton("6");
        b6.setBounds(170, 210, buttonWidth, buttonHeight);
        frame.add(b6);

        JButton bMul = new JButton("*");
        bMul.setBounds(240, 210, buttonWidth, buttonHeight);
        frame.add(bMul);

        // Row 3
        JButton b3 = new JButton("3");
        b3.setBounds(30, 290, buttonWidth, buttonHeight);
        frame.add(b3);

        JButton b2 = new JButton("2");
        b2.setBounds(100, 290, buttonWidth, buttonHeight);
        frame.add(b2);

        JButton b1 = new JButton("1");
        b1.setBounds(170, 290, buttonWidth, buttonHeight);
        frame.add(b1);

        JButton bSub = new JButton("-");
        bSub.setBounds(240, 290, buttonWidth, buttonHeight);
        frame.add(bSub);

        // Row 4
        JButton b0 = new JButton("0");
        b0.setBounds(30, 370, buttonWidth, buttonHeight);
        frame.add(b0);

        JButton bDot = new JButton(".");
        bDot.setBounds(100, 370, buttonWidth, buttonHeight);
        frame.add(bDot);

        JButton bEq = new JButton("=");
        bEq.setBounds(170, 370, buttonWidth, buttonHeight);
        frame.add(bEq);

        JButton bAdd = new JButton("+");
        bAdd.setBounds(240, 370, buttonWidth, buttonHeight);
        frame.add(bAdd);

        frame.setVisible(true);
    }
}
