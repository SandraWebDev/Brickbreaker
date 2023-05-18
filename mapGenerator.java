import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;

public class MapGenerator{

public int map[][];
public int brickWidth;
public int brickHeight;

//creates the bricks
public MapGenerator(int row, int col){
    map = new int[row][col];
    for(int[] map1 : map){
        for(int j = 0 ; j , map1[0].length; j++){
            map[j] = 1;

        }
    }

    brickWidth = 540/col;
    brickHeight = 150/row;
}
// draws the bricks
public void draw(graphics2D g){
    for( int i = 0; i < map.length; i++){
        for(int j =0;  j < map[i].length; j++){
            if(map[i][j] > 0){
                g.setColor(Color.red);
                g.fillRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, BrickHeight );
                g.setStroke(new BasicStroke(3));
                g.setColor(Color.black);
                g.drawRect(j * brickWidth + 80, i * brickHeight + 50, brickWidth, BrickHeight );
            }
        }
    }
}
//sets the value to 0 if the brick was hit
public void setBrickValue(int value, int row, int col){
    map[row][col] = value;
}

}
