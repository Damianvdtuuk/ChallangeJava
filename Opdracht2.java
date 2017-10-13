import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht2 extends Applet {
    TextField tv1;
    Label label1;
    Button Button1;
    int invoer;
    int higher;
    String output;
    int lowest;


    @Override
    public void init() {
        tv1 = new TextField(5);
        Button1 = new Button("Toon Tijden");
        label1 = new Label("Voer een uur in");
        add(label1);
        add(tv1);
        add(Button1);
        Button1.addActionListener(new KnopListener());
    }

    class KnopListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String invoer = tv1.getText();
            int input = Integer.parseInt(invoer);
            if (input > 23) {
                output = "Ongeldige invoer.";
            }
            if (input < lowest || (lowest == 0)) {
                lowest = input;
            }
            repaint();
        }
    }
}
