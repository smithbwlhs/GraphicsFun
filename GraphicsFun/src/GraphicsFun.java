import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Font;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;


/* Resources you might want to use
Graphics - https://docs.oracle.com/en/java/javase/13/docs/api/java.desktop/java/awt/Graphics.html
Font - https://docs.oracle.com/en/java/javase/13/docs/api/java.desktop/java/awt/Font.html
Intro lesson I got this from -https://cs.lmu.edu/~ray/notes/javagraphics/


 */
public class GraphicsFun extends JPanel {

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        var center = new Point(getWidth() / 2, getHeight() / 2);
        var radius = Math.min(getWidth() / 2, getHeight() / 2) - 5;
        var diameter = radius * 2;
        var innerRadius = (int)(radius * 0.9);
        var innerDiameter = innerRadius * 2;
        var barWidth = (int)(innerRadius * 1.4);
        var barHeight = (int)(innerRadius * 0.35);

        g.setColor(Color.WHITE);
        g.fillOval(center.x - radius, center.y - radius, diameter, diameter);
        g.setColor(Color.RED);
        g.fillOval(center.x - innerRadius, center.y - innerRadius, innerDiameter, innerDiameter);
        g.setColor(Color.WHITE);
        g.fillRect(center.x - barWidth/2, center.y - barHeight/2, barWidth, barHeight);

        //lets me print text on the screen

        Font myFont = new Font("SERIF",Font.ITALIC,12);
        String holidays = "Happy Holidays!";
        char[] chars = holidays.toCharArray();
        g.setFont(myFont);
        g.drawChars(chars,0,chars.length,30,20);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            var panel = new GraphicsFun();
            panel.setBackground(Color.GREEN.darker());
            var frame = new JFrame("A simple graphics program");
            frame.setSize(300, 400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.getContentPane().add(panel, BorderLayout.CENTER);
            frame.setVisible(true);
        });
    }
}
