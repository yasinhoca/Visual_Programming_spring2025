package hafta06__1_textPanes;

import javax.swing.*;

public class form1 extends JFrame{
    private JPanel panel;
    private JTextArea textArea1;
    private JTextPane textPane1;
    private JEditorPane editorPane1;


    form1(){



        add(panel);
        setSize(500,500);
        setTitle("Text Panes");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        textArea1.setText("Mazinde \n bir \n tarih \n yatar.");
        System.out.println(textArea1.getText());

        textPane1.setText("Text Pane");

        editorPane1.setText("Editor Pane");




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
