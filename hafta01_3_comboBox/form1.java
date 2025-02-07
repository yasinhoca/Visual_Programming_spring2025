package hafta01_3_comboBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class form1 extends JFrame{
    private JPanel panel;
    private JComboBox comboBox1;
    private JComboBox rcombo;
    private JComboBox gcombo;
    private JComboBox bcombo;
    private JButton button1;
    DefaultComboBoxModel rmodel = new DefaultComboBoxModel();
    DefaultComboBoxModel gmodel = new DefaultComboBoxModel();
    DefaultComboBoxModel bmodel = new DefaultComboBoxModel();
    int r,g,b;


    form1() {
        add(panel);
        setSize(500, 500);
        setTitle("Mouse Eventler");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        int i = 0;
        for(i=0;i<=255;i++) rmodel.addElement(i);
        rcombo.setModel(rmodel);
        for(i=0;i<=255;i++) gmodel.addElement(i);
        gcombo.setModel(gmodel);
        for(i=0;i<=255;i++) bmodel.addElement(i);
        bcombo.setModel(bmodel);

        rcombo.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                r = rcombo.getSelectedIndex();
                g = gcombo.getSelectedIndex();
                b = bcombo.getSelectedIndex();
                button1.setBackground(new Color(r,g,b));

            }
        });


        gcombo.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                r = rcombo.getSelectedIndex();
                g = gcombo.getSelectedIndex();
                b = bcombo.getSelectedIndex();
                button1.setBackground(new Color(r,g,b));

            }
        });

        bcombo.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                r = rcombo.getSelectedIndex();
                g = gcombo.getSelectedIndex();
                b = bcombo.getSelectedIndex();
                button1.setBackground(new Color(r,g,b));

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
