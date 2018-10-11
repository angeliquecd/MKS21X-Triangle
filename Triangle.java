public class Triangle{
  private Point a;
  private Point b;
  private Point c;
  public Triangle(Point x, Point y, Point z){
    a=x;
    b=y;
    c=z;
  }
  public Triangle (double pointa, double pointb, double
  pointc, double pointd, double pointe, double pointf){
    a = new Point (pointa,pointb);
    b= new Point (pointc, pointd);
    c= new Point (pointe, pointf);
  }
  public double getPerimeter(){
    return a.distanceTo(b)+
    b.distanceTo(c)
    +c.distanceTo(a);
  }
  public Point getVertex(int index){
    if (index >= 0 || index<=2){
    if (index == 0){
      Point newy = new Point(a.getX(),a.getY());
      return newy;
    }
    if (index == 1){
      Point newy = new Point(b.getX(),b.getY());
      return newy;
    }
    Point newy = new Point(c.getX(),c.getY());
    return newy;
  }
  Point newy= new Point (0,0);
  return newy;
}
public void setVertex(int index, Point newP){
  if (index == 0){
     a =  newP;
  }
  if (index == 1){
     b =  newP;
  }
   c =  newP;
}
public String toString(){
  return "Triangle: A"+a+" B"+b+" C"+c;
}
}
