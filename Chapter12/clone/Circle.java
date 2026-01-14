public class Circle implements Cloneable {
    Point point;
    int radius;

    public Circle(int x, int y, int radius){
        this.radius=radius;
        
    }
    


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Circle{");
        sb.append("point=").append(point);
        sb.append(", radius=").append(radius);
        sb.append('}');
        return sb.toString();
    }
    

}
