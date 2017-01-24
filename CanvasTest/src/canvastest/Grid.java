/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package canvastest;

import java.awt.Graphics;

/**
 *
 * @author Thomas
 */
public class Grid {
    private int height;
    private int width;
    
    private int cell_height;
    private int cell_width;
    
    private Cell[][] grid_data;
    
    public Grid() {
        height = 100;
        width = 100;
        cell_height = 10;
        cell_width = 10;
    }
    
    public Grid(int h, int w, int ch, int cw) {
        height = h;
        width = w;
        cell_height = ch;
        cell_width = cw;
        
        // Probably move this
        CreateGridData();
    }
    
    public void Draw(Graphics g) {
        for(int x=0; x<width/cell_width; x++) {
            for(int y=0; y<height/cell_height; y++) {
                Cell c = grid_data[x][y];
                c.position.x = x;
                c.position.y = y;
                c.size.x = cell_width;
                c.size.y = cell_height;
                c.Draw(g);
                //g.drawRect(x * cell_width, y * cell_height, cell_width, cell_height);
            }
        }
    }
    
    public int num_cells_x() {
        return width / cell_width;
    }
    
    public int num_cells_y() {
        return height / cell_height;
    }
    
    public Cell[][] CreateGridData() {
        grid_data = new Cell[num_cells_x()][num_cells_y()];
        return grid_data;
    }
    
    public Cell CellAt(int x, int y) {
        return grid_data[x][y];
    }
}
