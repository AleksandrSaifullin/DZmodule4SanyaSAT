//Создать класс, вычисляющий площадь простых геометрических фигур: треугольника, прямоугольника и круга.

abstract class GeometricFigures {// абстрактный класс геометрическая фигура
    abstract public double area();//метод вычисления площади фигуры
}
   // Класс треугольник
class Triangle extends GeometricFigures
{
    private double a, b, c;
    public Triangle(double a, double b, double c)
    {
        this.a = a; this.b = b; this.c = c;
    }
    public double area() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p-a) * (p-b)*(p-c));
    }
}
    // Класс прямоугольник
class Rectangle extends GeometricFigures {
    private double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area() {
        return a * b;
    }
}
     // Класс круг
    class Circle extends GeometricFigures {
        private double r;

        public Circle(double r) {
            this.r = r;
        }

        public double area() {

            return Math.PI * r * r;
          }
        public static void main (String args[])
        {
            GeometricFigures f[]=new GeometricFigures[3]; // массив объектных ссылок
            f[0] = new Triangle(3, 4, 5);
            f[1] = new Rectangle(2, 3);
            f[2] = new Circle(1);
                for(int i = 0; i < f.length; ++i)
                System.out.println(f[i].area());
            }
        }
