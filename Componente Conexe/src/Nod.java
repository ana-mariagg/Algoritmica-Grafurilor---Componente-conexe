//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Vector;

public class Nod {
    private int coordX;
    private int coordY;
    private int number;
    public Nod predecesor = null;

    public Nod(int coordX, int coordY, int number) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.number = number;
    }

    public int getCoordX() {
        return this.coordX;
    }



    public void setCoordX(int coordX) {
        this.coordX = coordX;
    }

    public int getCoordY() {
        return this.coordY;
    }

    public void setCoordY(int coordY) {
        this.coordY = coordY;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void drawNod(Graphics g, int node_diam) {
        g.setColor(Color.RED);
        g.fillOval(this.coordX, this.coordY, node_diam, node_diam);
        g.setFont(new Font("TimesRoman", 1, 13));
        g.setColor(Color.BLACK);
        g.drawOval(this.coordX, this.coordY, node_diam, node_diam);
        if (this.number < 10) {
            g.drawString(Integer.valueOf(this.number).toString(), this.coordX + 13, this.coordY + 20);
        } else {
            g.drawString(Integer.valueOf(this.number).toString(), this.coordX + 8, this.coordY + 20);
        }

    }

    public void drawConnectedComponentNod(Graphics g, int node_diam, int nr) {
        switch (nr) {
            case 0:
                g.setColor(Color.RED);
                g.fillOval(this.coordX, this.coordY, node_diam, node_diam);
                break;
            case 1:
                g.setColor(Color.GREEN);
                g.fillOval(this.coordX, this.coordY, node_diam, node_diam);
                break;
            case 2:
                g.setColor(Color.BLUE);
                g.fillOval(this.coordX, this.coordY, node_diam, node_diam);
                break;
            case 3:
                g.setColor(Color.CYAN);
                g.fillOval(this.coordX, this.coordY, node_diam, node_diam);
                break;
            case 4:
                g.setColor(Color.MAGENTA);
                g.fillOval(this.coordX, this.coordY, node_diam, node_diam);
                break;
            case 5:
                g.setColor(Color.YELLOW);
                g.fillOval(this.coordX, this.coordY, node_diam, node_diam);
                break;
            case 6:
                g.setColor(Color.PINK);
                g.fillOval(this.coordX, this.coordY, node_diam, node_diam);
                break;
            case 7:
                g.setColor(Color.ORANGE);
                g.fillOval(this.coordX, this.coordY, node_diam, node_diam);
                break;
            case 8:
                g.setColor(Color.green);
                g.fillOval(this.coordX, this.coordY, node_diam, node_diam);
        }

        g.setFont(new Font("TimesRoman", 1, 13));
        g.setColor(Color.BLACK);
        g.drawOval(this.coordX, this.coordY, node_diam, node_diam);
        if (this.number < 10) {
            g.drawString(Integer.valueOf(this.number).toString(), this.coordX + 13, this.coordY + 20);
        } else {
            g.drawString(Integer.valueOf(this.number).toString(), this.coordX + 8, this.coordY + 20);
        }

    }
}
