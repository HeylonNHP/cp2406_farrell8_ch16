import javax.swing.*;
import java.awt.*;

/**
 * Created by jc300556 on 18/10/17.
 */
public class JNestedBoxesPanel extends JPanel {
    JNestedBoxesPanel(){
        super(new FlowLayout());
        setPreferredSize(new Dimension(400,400));

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int x = 10;
        int y = 10;
        int width = 50;
        int height = 10;

        int sizeDelta = 10;

        for(width = 300, height = 300; width > 140; width -= sizeDelta*2, height -= sizeDelta*2, x += 10, y += 10){
            g.drawRect(x,y,width,height);
        }
    }

    public static void main(String[] args){
        JFrame thisIsBoring = new JFrame("Cool");
        thisIsBoring.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        thisIsBoring.add(new JNestedBoxesPanel());
        thisIsBoring.pack();
        thisIsBoring.setVisible(true);
    }
}
