package com.example.volumecalc;

public class Model {
    int ShapeImg;
    String shapeName;

    public Model(int shapeImg, String shapeName) {
        this.ShapeImg = shapeImg;
        this.shapeName = shapeName;
    }

    public int getShapeImg() {
        return ShapeImg;
    }

    public void setShapeImg(int shapeImg) {
        ShapeImg = shapeImg;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }
}
