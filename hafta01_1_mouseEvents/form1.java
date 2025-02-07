package hafta01_1_mouseEvents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class form1 extends JFrame {
    private JPanel panel;
    private JButton button1;

    form1(){
        add(panel);
        setSize(500,500);
        setTitle("Mouse Events");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        button1.setBackground(Color.WHITE);


        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                button1.setBackground(Color.GREEN);
            }
        });
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                button1.setBackground(Color.WHITE);
            }
        });
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                button1.setBackground(Color.RED);

            }
        });
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                button1.setBackground(Color.BLUE);

            }
        });
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                form1 f = new form1();
                f.setVisible(true);
            }
        });
    }


}
