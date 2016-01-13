/*Создать класс вычисляющий расстояние между двумя точками,
 представленными координатами в двумерном пространстве (x1, y1), (x2, y2).
 */
public class Distance {
      //перечисление координат
    public double calcDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)); // формула вычисляющая расстояние отрезка
    }
      // создал метод (main)
    public static void main(String[] args) {
        Distance distance = new Distance();// создал обьект Distance
        double result = distance.calcDistance(10.0,5.0,7.0,8.0);// создал переменную  ( double result)
     // вывел на консоль переменную с записанными в неё значениями.
        System.out.println(result);
    }
}