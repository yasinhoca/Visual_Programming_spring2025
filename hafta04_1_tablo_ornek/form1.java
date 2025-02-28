package hafta04_1_tablo_ornek;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

public class form1 extends JFrame{
    private JPanel panel;
    private JTable table1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    int satir,sutun;
    ArrayList<Integer> liste;
    static int[][] m;

    DefaultTableModel model = new DefaultTableModel();

    form1() {
        add(panel);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        table1.setTableHeader(null);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                satir = Integer.parseInt(textField1.getText());
                sutun = Integer.parseInt(textField2.getText());
                model.setRowCount(satir);
                model.setColumnCount(sutun);
                table1.setModel(model);
                table1.setRowHeight(50);
                liste = Matris.listeOlustur(satir,sutun);
                System.out.println(liste);
                m = new int[satir][sutun];
                m = Matris.listeyiMatriseKir(satir,sutun,liste);
                tabloyaYazdir(m,satir,sutun);
                btn2.setEnabled(true);
                btn3.setEnabled(true);
                btn4.setEnabled(true);
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Collections.sort(liste);
                m = Matris.listeyiMatriseKir(satir,sutun,liste);
                tabloyaYazdir(m,satir,sutun);
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Collections.sort(liste);
                Collections.reverse(liste);
                m = Matris.listeyiMatriseKir(satir,sutun,liste);
                tabloyaYazdir(m,satir,sutun);
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.setRowCount(0);
                model.setColumnCount(0);
                table1.setModel(model);
                liste.clear();
                btn2.setEnabled(false);
                btn3.setEnabled(false);
                btn4.setEnabled(false);
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


    void tabloyaYazdir(int[][]m, int satir,int sutun){
        for(int i=0;i<satir;i++){
            for(int j=0;j<sutun;j++){
                table1.setValueAt(m[i][j],i,j);
            }
        }
    }

}
