public class Demo{
  public static void main(String[] args){
Point first = new Point (0,0);
Point second = new Point (3,4);
Point third = new Point (5,6);
Point fourth = new Point (7,8);
System.out.println("Point two is: "+second);
System.out.println("Point one is: "+first);
System.out.println(first.distanceTo(second));
System.out.println(Point.distance(first,second));
Triangle number1 = new Triangle (first,second,third);
System.out.println(number1.getPerimeter());
System.out.println(number1.getVertex(0));
number1.setVertex(0,fourth);
System.out.println(number1.getVertex(0));
System.out.println(number1);
}
}
