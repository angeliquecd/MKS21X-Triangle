public class Point{
  private double x,y;
<<<<<<< HEAD

=======
>>>>>>> 9a8606a665c744760f1da3da449935ad9290be85
  public Point(double X, double Y){
    x=X;
    y=Y;
  }

<<<<<<< HEAD

=======
>>>>>>> 9a8606a665c744760f1da3da449935ad9290be85
  public Point(Point p){
    x= p.x;
    y= p.y;
  }

<<<<<<< HEAD

=======
>>>>>>> 9a8606a665c744760f1da3da449935ad9290be85
  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }
<<<<<<< HEAD
  public static double distance(Point a, Point b){

  }
  public double distanceTo(Point b){
    math.sqrt ((this.point.x-b.x)*(this.point.x-b.x))
  }
}


}
=======
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
>>>>>>> 9a8606a665c744760f1da3da449935ad9290be85
