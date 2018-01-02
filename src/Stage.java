
import jdk.nashorn.internal.ir.WhileNode;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Stage extends JFrame {
    public Stage() {
        initComp();
    }
    Timer tim;
    private ImageIcon ck = new ImageIcon("ck\\ck01.png");
    private ImageIcon car = new ImageIcon("car\\car01.png");

    private JLabel jlbck = new JLabel(ck);
    private JLabel jlbcar = new JLabel(car);


    private int sw = getToolkit().getScreenSize().width;
    private int sh = getToolkit().getScreenSize().height;
    private int fw = 1600, fh = 900;
    private int carw = 200 , carh = 166;
    private int ckw = 302 , ckh = 263;

    private void initComp() {

        this.addKeyListener(new KeyMonitor());
        this.setLayout(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(sw / 2 - fw / 2, sh / 2 - fh / 2, fw, fh);

        jlbck.setBounds(ckw,ckh,302,263);
        jlbcar.setBounds(carw,carh,200,166);
        this.add(jlbck);
        this.add(jlbcar);

        tim = new Timer(5, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

             if(carw +10 <= 100) {
                 jlbcar.setBounds(carw +=10,carh,200,166);
             }
            }
        });
    }

    private class KeyMonitor extends KeyAdapter {

        public void keyReleased(KeyEvent e) {
            int key = e.getKeyCode();
            switch (key) {
                case KeyEvent.VK_LEFT:jlbck.setBounds(ckw -= 50 , ckh , 302 , 263);
                    break;
                case KeyEvent.VK_RIGHT:jlbck.setBounds(ckw += 50 , ckh , 302 , 263);
                    break;
                case KeyEvent.VK_UP:jlbck.setBounds(ckw   , ckh-=50 , 302 , 263);
                    break;
                case KeyEvent.VK_DOWN:jlbck.setBounds(ckw  , ckh+=50 , 302 , 263);
                    break;
                case KeyEvent.VK_Z:tim.start();
                break;
            } }}




}