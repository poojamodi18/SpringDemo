package org.springApp;

import java.util.List;

public class Square {
    private List<Point> squarePoints;

    public List<Point> getSquarePoints() {
        return squarePoints;
    }

    public void setSquarePoints(List<Point> squarePoints) {
        this.squarePoints = squarePoints;
    }

    public void drawSquare(){
        for (Point point : squarePoints) {
            System.out.println("Point: X="+point.getX()+" Y="+point.getY());
        }
    }
}
