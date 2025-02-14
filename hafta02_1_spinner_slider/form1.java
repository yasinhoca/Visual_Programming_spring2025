package hafta02_1_spinner_slider;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ContainerAdapter;
import java.awt.event.InputMethodListener;

public class form1 extends JFrame{
    private JPanel panel;
    private JSpinner spinner1;
    private JSlider slider1;
    private JSlider slider2;
    private JSlider slider3;
    private JSlider slider4;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JLabel labelNot;
    int vs, vo, voo, fs;
    float ort;


    form1() {
        add(panel);
        setTitle("checkbox ve radiobutton");
        setSize(700, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        spinner1.setValue(25);
        slider1.addChangeListener(new ChangeListener() {
           @Override
           public void stateChanged(ChangeEvent e) {
               voo =(int) spinner1.getValue();
               vs = slider1.getValue();
               textField1.setText(Integer.toString(vs));
               vo = slider2.getValue();
               fs = slider3.getValue();
               ortalamaHesaplaDegistir();

           }
       });

        slider2.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                voo =(int) spinner1.getValue();
                vs = slider1.getValue();
                vo = slider2.getValue();
                textField2.setText(Integer.toString(vo));
                fs = slider3.getValue();
                ortalamaHesaplaDegistir();

            }
        });

        slider3.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                voo =(int) spinner1.getValue();
                vs = slider1.getValue();
                vo = slider2.getValue();
                fs = slider3.getValue();
                textField3.setText(Integer.toString(fs));
                ortalamaHesaplaDegistir();
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


    void ortalamaHesaplaDegistir(){
        ort = (((float)vs*(100-voo)/100)/2) +(((float)vo*voo/100)/2) + (float)fs/2;
        textField4.setText(Float.toString(ort));
        slider4.setValue(Math.round(ort));

        if(Math.round(ort)<55){
            slider4.setBackground(Color.RED);
            textField4.setBackground(Color.RED);
        }else if(Math.round(ort)>=55 && Math.round(ort)<60){
            slider4.setBackground(Color.YELLOW);
            textField4.setBackground(Color.YELLOW);
        } else {
            slider4.setBackground(Color.GREEN);
            textField4.setBackground(Color.GREEN);
        }


        if(Math.round(Math.round(ort))>=90) labelNot.setText("AA");
        else if(Math.round(ort)>=85 && Math.round(ort)<90) labelNot.setText("BA");
        else if(Math.round(ort)>=80 && Math.round(ort)<85) labelNot.setText("BB");
        else if(Math.round(ort)>=70 && Math.round(ort)<80) labelNot.setText("CB");
        else if(Math.round(ort)>=60 && Math.round(ort)<70) labelNot.setText("CC");
        else if(Math.round(ort)>=55 && Math.round(ort)<60) labelNot.setText("DC");
        else if(Math.round(ort)>=50 && Math.round(ort)<55) labelNot.setText("DD");
        else if(Math.round(ort)>=40 && Math.round(ort)<50) labelNot.setText("FD");
        else if(Math.round(ort)<40) labelNot.setText("FF");
    }



}
