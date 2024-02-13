abstract class Shape{
        public abstract void Noofsides();//abstract method
}

class Rectangle extends Shape
{
        public void Noofsides()
        {
                System.out.println("Rectangle has 4 Sides");
        }
}

class Triangle extends Shape
{
        public void Noofsides()
        {
                System.out.println("Triangle has 3 Sides");
        }
}

class Hexagon extends Shape
{
        public void Noofsides()
        {
                System.out.println("Hexagon has 6 Sides");
        }
}

public class AbstractShape
{
        public static void main(String[] args)
        {
                Rectangle R = new Rectangle();
                Triangle  T = new Triangle();
                Hexagon   H = new Hexagon();
                R.Noofsides();
                T.Noofsides();
                H.Noofsides();
        }
}
