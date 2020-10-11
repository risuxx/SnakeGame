import javax.swing.*;

public class StartGame {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Snake");

        jFrame.add(new MainPanel());

        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setBounds(300,150,1000,600);
        jFrame.setResizable(false);

    }
}


