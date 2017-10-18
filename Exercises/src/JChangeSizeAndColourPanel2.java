import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Created by jc300556 on 18/10/17.
 */
public class JChangeSizeAndColourPanel2 extends JPanel {
    int fontSize = 36;
    int x = 10;
    int y = 100;
    final String phrase = "Hello world!";
    final Color[] colours = {Color.black,Color.CYAN,Color.GREEN, Color.MAGENTA,Color.orange,Color.RED};
    int colourIndex = 0;
    Random random = new Random();
    public JChangeSizeAndColourPanel2(){
        super(new FlowLayout());
        setPreferredSize(new Dimension(250,300));
        JButton button1 = new JButton("Click me");

        button1.addActionListener((e) ->{
                repaint();
                if(colourIndex < colours.length-1){
                    colourIndex++;
                }else {
                    colourIndex = 0;
                }
                x = random.nextInt(100)+ 10;
                fontSize = random.nextInt(40) + 10;
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
        thisIsBoring.add(new JChangeSizeAndColourPanel2());
        thisIsBoring.pack();
        thisIsBoring.setVisible(true);
    }
}
