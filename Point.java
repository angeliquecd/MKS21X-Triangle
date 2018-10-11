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
  public static double distance(Point a, Point b){

  }
  public double distanceTo(Point b){
    math.sqrt ((this.point.x-b.x)*(this.point.x-b.x))
  }
}


}
