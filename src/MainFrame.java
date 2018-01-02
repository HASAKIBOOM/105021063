import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import static javax.swing.JButton.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        initComp();
    }

    private JButton jbtstart = new JButton("開始");
    private JButton jbtexit = new JButton("結束");
    private JLabel jlbtitle = new JLabel("小雞過馬路",JLabel.CENTER);

    private int sw = getToolkit().getScreenSize().width;
    private int sh = getToolkit().getScreenSize().height;
    private int fw = 750 , fh = 600;

    private void initComp() {

        this.setLayout(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(sw / 2 - fw / 2 , sh / 2 - fh / 2 , fw , fh);
        jbtstart.setBounds(fw / 2 - 250 , fh / 2 + 50 , 200 , 100);
        jbtexit.setBounds(fw / 2 + 50 , fh / 2 + 50 , 200 , 100);
        jlbtitle.setBounds(fw / 2 - 350 , fh / 2 - 235 , 700 , 200);

        jbtstart.setBackground(Color.blue);
        jbtexit.setBackground(Color.red);
        jlbtitle.setBackground(Color.white);
        jbtstart.setFont(new Font(null,0,40));
        jbtexit.setFont(new Font(null,0,40));
        jlbtitle.setFont(new Font(null,0,100));
        jbtstart.setOpaque(true);
        jbtexit.setOpaque(true);
        jlbtitle.setOpaque(true);

        this.add(jbtstart);
        this.add(jbtexit);
        this.add(jlbtitle);


        jbtexit.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        jbtstart.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Stage stage = new Stage();
                stage.setVisible(true);
                MainFrame.this.setVisible(false);
            }
        });
    }}