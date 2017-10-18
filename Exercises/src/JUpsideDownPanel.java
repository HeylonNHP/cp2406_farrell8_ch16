import javax.swing.*;
import java.awt.*;

/**
 * Created by jc300556 on 18/10/17.
 */
public class JUpsideDownPanel extends JPanel{
    boolean upsideDown = false;
    final String phrase = "Whoa!";
    final int fontSize = 30;
    public JUpsideDownPanel(){
        super(new FlowLayout());
        setPreferredSize(new Dimension(300,300));
        JButton button1 = new JButton("Switch!");

        button1.addActionListener((e) -> {
            upsideDown = !upsideDown;
            repaint();
        });

        add(button1);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Font font;
        if(upsideDown){
            font = new Font("Arial",Font.PLAIN,fontSize-(fontSize*2));
        }else {
            font = new Font("Arial",Font.PLAIN,fontSize);
        }

        g.setFont(font);

        g.drawString(phrase,100,100);
    }

    public static void main(String[] args){
        JFrame thisIsBoring = new JFrame("Cool");
        thisIsBoring.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        thisIsBoring.add(new JUpsideDownPanel());
        thisIsBoring.pack();
        thisIsBoring.setVisible(true);
    }
}
