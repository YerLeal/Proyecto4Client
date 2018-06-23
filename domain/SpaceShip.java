/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

/**
 *
 * @author maikel
 */
public class SpaceShip {
    private int x,y,size;
    private Image image;
    private int life;

    public SpaceShip(int x, int y, int size, Image image,int life) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.image = image;
        this.life=life;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    
    public void draw(GraphicsContext gc){
        gc.drawImage(image, x*size, y*size,size,size);
    }
}
