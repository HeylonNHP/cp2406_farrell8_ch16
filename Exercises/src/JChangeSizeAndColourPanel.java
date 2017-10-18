import javax.swing.*;
import java.awt.*;

/**
 * Created by jc300556 on 18/10/17.
 */
public class JChangeSizeAndColourPanel extends JPanel {
    int fontSize = 36;
    int x = 10;
    int y = 50;
    final String phrase = "Hello world!";
    final Color[] colours = {Color.black,Color.CYAN,Color.GREEN};
    int colourIndex = 0;
    int buttonClicks = 0;
    public JChangeSizeAndColourPanel(){
        super(new FlowLayout());
        setPreferredSize(new Dimension(250,300));
        JButton button1 = new JButton("Click me");

        button1.addActionListener((e) ->{
            if (buttonClicks < 3) {
                repaint();
                if(colourIndex < colours.length-1){
                    colourIndex++;
                }else {
                    colourIndex = 0;
                }
                buttonClicks++;
                x += 10;
                fontSize -= 5;
            }else {
                button1.setEnabled(false);
            }
        });
        add(button1);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setFont(new Font("Arial", Font.PLAIN,fontSize));
        g.setColor(colours[colourIndex]);

        g.drawString(phrase,x,y);

    }

    public static void main(String[] args){
        JFrame thisIsBoring = new JFrame("Cool");
        thisIsBoring.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        thisIsBoring.add(new JChangeSizeAndColourPanel());
        thisIsBoring.pack();
        thisIsBoring.setVisible(true);
    }
}
