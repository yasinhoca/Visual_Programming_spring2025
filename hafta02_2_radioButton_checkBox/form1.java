package hafta02_2_radioButton_checkBox;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

public class form1 extends JFrame{
    private JPanel panel;
    private JCheckBox cb1;
    private JCheckBox cb2;
    private JCheckBox cb3;
    private JButton button1;
    private JRadioButton rb1;
    private JRadioButton rb2;
    private JRadioButton rb3;
    private JRadioButton rb4;
    private JButton button2;
    private JFormattedTextField formattedTextField1;
    private JPasswordField passwordField1;

    form1(){
        add(panel);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        bg.add(rb3);
        bg.add(rb4);

        //formatted textfield
        try {
            MaskFormatter mf = new MaskFormatter("(5##) UUU LL AA");
            mf.install(formattedTextField1);
            // Sadece sayı girişi için #
            // Sadece büyük harf için U  (upper)
            // Sadece küçük harf için L  (Lower)
            // Alphanumeric sayı ve harf girişi için A
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        //paswordfield şifre girişinde karakteri gizler
        //passwordField1.getText(); gettext methodu şifreyi ram üzerine açık bir şekilde alır
        passwordField1.getPassword();


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(cb1.isSelected()) System.out.println("Python seçildi!");
                if(cb2.isSelected()) System.out.println("Java seçildi!");
                if(cb3.isSelected()) System.out.println("C# seçildi!");
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(rb1.isSelected()) System.out.println("Cevap "+ rb1.getText());
                else if(rb2.isSelected()) System.out.println("Cevap "+ rb2.getText());
                else if(rb3.isSelected()) System.out.println("Cevap "+ rb3.getText());
                else if(rb4.isSelected()) System.out.println("Cevap "+ rb4.getText());

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
