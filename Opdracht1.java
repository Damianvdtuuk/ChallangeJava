import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdracht1 extends Applet {
    private int valerie = 40;
    private int jeroen = 80;
    private int hans = 60;
    TextField tv1;
    TextField tv2;
    TextField tv3;
    Label labelv;
    Label labelj;
    Label labelh;
    @Override
    public void init() {
        labelv = new Label("valerie");
        labelj = new Label("jeroen");
        labelh = new Label("hans");
        Button toon = new Button("toon");
        tv1 = new TextField(4);
        tv2 = new TextField(4);
        tv3 = new TextField(4);
        toon.addActionListener(new Klistener());

        add(labelv);
        add(tv1);
        add(labelj);
        add(tv2);
        add(labelh);
        add(tv3);
        add(toon);
    }

    public void paint(Graphics g) {
        g.drawLine(100, 60, 100, 260);
        g.drawLine(100, 260, 300, 260);
        g.drawLine(100, 140, 80, 140);
        g.drawLine(100, 160, 80, 160);
        g.drawLine(100, 180, 80, 180);
        g.drawLine(100, 200, 80, 200);
        g.drawLine(100, 220, 80, 220);
        g.drawLine(100, 240, 80, 240);
        g.drawLine(100, 260, 80, 260);
        g.drawLine(100, 260, 80, 260);
        g.setColor(Color.red);
        g.drawString("Valerie", 100, 280);
        g.fillRect(101, 260 - valerie, 25, valerie);
        g.setColor(Color.red);
        g.drawString("Jeroen", 165, 280);
        g.fillRect(160, 260 - jeroen, 25, jeroen);
        g.setColor(Color.red);
        g.drawString("Hans", 220, 280);
        g.fillRect(220, 260 - hans, 25, hans);
        g.setColor(Color.black);
        g.drawString("120", 65, 140);
        g.drawString("100", 65, 160);
        g.drawString("80", 65, 180);
        g.drawString("60", 65, 200);
        g.drawString("40", 65, 220);
        g.drawString("20", 65, 240);
        g.drawString("0", 65, 260);
    }
    class Klistener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            valerie = Integer.parseInt(tv1.getText());
            jeroen = Integer.parseInt(tv2.getText());
            hans = Integer.parseInt(tv3.getText());
            repaint();
        }
    }
}

