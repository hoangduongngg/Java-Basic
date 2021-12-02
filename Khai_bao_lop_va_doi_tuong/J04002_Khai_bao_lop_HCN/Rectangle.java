package J04002_Khai_bao_lop_HCN;

/**
 *
 * @author hoangduongngg
 */
public class Rectangle {
    private double width, height;
    private String color;
    
    public Rectangle () {
        width=1;
        height=1;
    }
    public Rectangle (double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = chuanhoa(color);
    }
    private String chuanhoa (String color) {
        String first = color.substring(0, 1);
        String before = color.substring(1, color.length());
        return first.toUpperCase() + before.toLowerCase();  
    }

    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public String getColor() {
        return color;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
    public double findArea() {
        return width*height;
    }
    public double findPerimeter() {
        return (width+height)*2;
    }

    
    @Override
    public String toString() {
        if (width<=0 || height<=0) return "INVALID"; 
        return (int)findPerimeter() + " " + (int)findArea() + " " + color;
    }  
}
