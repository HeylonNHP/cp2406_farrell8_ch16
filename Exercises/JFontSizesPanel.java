import javax.swing.*;
import java.awt.*;

/**
 * Created by jc300556 on 18/10/17.
 */
public class JFontSizesPanel extends JPanel {
    public JFontSizesPanel(){
        super(new FlowLayout());
        setPreferredSize(new Dimension(250,500));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = 10;
        int y = 10;

        for(int fontSize = 6; fontSize < 21; fontSize++, y += fontSize){
            g.setFont(new Font("Arial",Font.PLAIN,fontSize));
            g.drawString("Hello world",x,y);
        }
    }

    public static void main(String[] args){
        JFrame frame1 = new JFrame("Font sizes");
        frame1.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame1.add(new JFontSizesPanel());
        frame1.pack();
        frame1.setVisible(true);
    }
}
