import java.awt.Color;
import java.awt.Graphics;

public class Arc {

    private Nod start;
    private Nod end;

    public Nod getEnd() {
        return end;
    }

    public Nod getStart() {
        return start;
    }

    public Arc(Nod start, Nod end) {
        this.start=start;
        this.end=end;
    }

    public void drawArc(Graphics g)
    {
        if(start!=null)
        {
            g.setColor(Color.BLACK);
            g.drawLine(start.getCoordX()+MyPanel.NodDiam/2,start.getCoordY()+MyPanel.NodDiam/2,end.getCoordX()+MyPanel.NodDiam/2,end.getCoordY()+MyPanel.NodDiam/2);
        }
    }

    public void drawArrow(Graphics g) {
        if (start != null) {
            int heightArrow = 20;
            int widthArrow = 20;
            int xDifference = end.getCoordX() - start.getCoordX();
            int yDifference = end.getCoordY() - start.getCoordY();
            double D = Math.sqrt(xDifference * xDifference + yDifference * yDifference);
            double xm = D - heightArrow,
                    xn = xm,
                    ym = widthArrow,
                    yn = -widthArrow,
                    x;
            double sin = yDifference / D,
                    cos = xDifference / D;

            x = xm * cos - ym * sin + start.getCoordX()+MyPanel.NodDiam/2;
            ym = xm * sin + ym * cos + start.getCoordY()+MyPanel.NodDiam/2;
            xm = x;

            x = xn * cos - yn * sin + start.getCoordX()+MyPanel.NodDiam/2;
            yn = xn * sin + yn * cos + start.getCoordY()+MyPanel.NodDiam/2;
            xn = x;

            int[] xpoints = {end.getCoordX()+MyPanel.NodDiam/2, (int) xm, (int) xn};
            int[] ypoints = {end.getCoordY()+MyPanel.NodDiam/2, (int) ym, (int) yn};

            g.setColor(Color.BLACK);
            g.drawLine(start.getCoordX()+MyPanel.NodDiam/2, start.getCoordY()+MyPanel.NodDiam/2, end.getCoordX()+MyPanel.NodDiam/2, end.getCoordY()+MyPanel.NodDiam/2);
            g.fillPolygon(xpoints, ypoints, 3);
        }
    }
}
