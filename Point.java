public class Point{
  private double x,y;
  public Point(double X, double Y){
    x=X;
    y=Y;
  }

  public Point(Point p){
    x= p.x;
    y= p.y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }
  public double distanceTo(Point a){
    return java.lang.Math.sqrt(java.lang.Math.pow((this.getX()-a.getX()),2)+java.lang.Math.pow((this.getY()-a.getY()),2));
  }
  public static double distance(Point a, Point b){
    return java.lang.Math.sqrt(java.lang.Math.pow((a.getX()-b.getX()),2)+java.lang.Math.pow((a.getY()-b.getY()),2));
  }
  public String toString(){
    return "("+this.getX()+","+this.getY()+")";
  }
}
