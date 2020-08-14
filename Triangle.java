/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perimeter;

/**
 *
 * @author philipfynn
 */
public class Triangle {
      int a,b,c;
  public double getArea(){
    double p = (a+b+c)/2.0;
    return Math.round(Math.pow((p*(p-a)*(p-b)*(p-c)),.2));
  }
  public double getPerimeter(){
    return (a+b+c);
  }
}

class Ans{
  public static void main(String[] args){
    Triangle t = new Triangle();
    t.a = 3;
    t.b = 4;
    t.c = 5;
    System.out.println("The Area of the Triangle is: "+t.getArea()+".");
    System.out.println("The Perimeter of the Triangle is: "+t.getPerimeter()+".");
    // Formula for calculating are of a triangle in java: (Ax(By -Cy) + Bx(Cy -Ay) + Cx(Ay - By))/2
    // Formula for calculating the perimeter of the traingle is simply: a + b + c = result

  }
}

    