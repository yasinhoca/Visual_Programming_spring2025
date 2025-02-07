package hafta01_2_button_image;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class form1 extends JFrame{
    private JPanel panel;
    private JButton button1;
    private JLabel lbl1;
    private JLabel lbl2;
    boolean durum = true;

    form1() {
        add(panel);
        setSize(500, 500);
        setTitle("Mouse Eventler");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Image icon1 = new ImageIcon(this.getClass().getResource("/icon1.png")).getImage();
        button1.setIcon(new ImageIcon(icon1));

        Image kirmizi = new ImageIcon(this.getClass().getResource("/bkirmizi.png")).getImage();
        lbl1.setIcon(new ImageIcon(kirmizi));
        Image mavi = new ImageIcon(this.getClass().getResource("/bmavi.png")).getImage();
        Image yesil = new ImageIcon(this.getClass().getResource("/byesil.png")).getImage();

        Image onb = new ImageIcon(this.getClass().getResource("/on.png")).getImage();
        lbl2.setIcon(new ImageIcon(onb));
        Image offb = new ImageIcon(this.getClass().getResource("/off.png")).getImage();





        lbl1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                lbl1.setIcon(new ImageIcon(mavi));

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                lbl1.setIcon(new ImageIcon(yesil));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                lbl1.setIcon(new ImageIcon(kirmizi));

            }
        });
        lbl2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(durum) {
                    lbl2.setIcon(new ImageIcon(offb));
                    durum=false;
                } else{
                    lbl2.setIcon(new ImageIcon(onb));
                    durum=true;
                }
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
