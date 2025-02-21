package hafta03_1_table_giris;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class form1 extends JFrame{
    private JPanel panel;
    private JTable table1;
    private JTextField textField1;
    DefaultTableModel model = new DefaultTableModel();
    Object[] basliklar = {"Numara", "Ad", "Soyad"};




    form1() {
        add(panel);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        model.setColumnCount(3); // sütun - colon sayısı
        model.setRowCount(5); //row = satır sayısı
        model.setColumnIdentifiers(basliklar);
        table1.setModel(model);

        table1.setValueAt(10,0,0);
        table1.setValueAt("Ali",0,1);
        table1.setValueAt("Altankara",0,2);
        table1.setValueAt(20,1,0);
        table1.setValueAt("Betül",1,1);
        table1.setValueAt("Bilir",1,2);
        table1.setValueAt(30,2,0);
        table1.setValueAt("Cihan",2,1);
        table1.setValueAt("Cengiz",2,2);

        System.out.println(table1.getValueAt(0,1));


        //table1.setTableHeader(null); //table başlığını kaldırır
        table1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                textField1.setText(table1.getValueAt(table1.getSelectedRow(),table1.getSelectedColumn()).toString());
                super.mouseClicked(e);
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
