/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

/**
 *
 * @author maikel
 */
public class Missile extends Thread {

    private int xI, yI, xF, yF;
    private ArrayList<Image> sprites;
    private int iCont, player;

    public Missile(int xI, int yI, int xF, int yF, int player) {
        this.xI = xI;
        this.yI = yI;
        this.xF = xF;
        this.yF = yF;
        this.iCont = 0;
        this.player = player;
        this.sprites = new ArrayList<>();
        chargeSprites();
    }

    @Override
    public void run() {
        
        while (xI <= xF) {
            xI+=10;
            iCont++;

            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(Missile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void chargeSprites() {
        for (int i = 0; i < 4; i++) {
            if (player == 1) {
                this.sprites.add(new Image("/assets/mu" + i + ".png"));
            } else {
                this.sprites.add(new Image("/assets/md" + i + ".png"));
            }
        }
    }

    public int getxI() {
        return xI;
    }
    

    public void draw(GraphicsContext gc) {
        if (iCont > 3) {
            iCont = 0;
        }
        gc.drawImage(sprites.get(iCont), xI, yI+65,60,20);
    }

}
