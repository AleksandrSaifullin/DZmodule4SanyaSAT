/*Создать класс преобразующий значение температуры по шкале Цельсия в значение по шкале Фаренгейта
 и в обратном направлении.*/

public class Temperature {

    public static String convertTemp(double temperature, char convertTo){
        //решение при помощи условных операторов if-else;return
        if(convertTo == 'C'){
            temperature = (temperature * 9.0/5.0 )+32.0;
            return Double.toString(temperature);
        }
        else
            temperature = (temperature - 32.0 )*5.0/9.0;
        return Double.toString(temperature);
    }
    //вывод на консоль
    public static void main(String args[]){

        System.out.println(" Temp F " + Temperature.convertTemp (1, 'F'));
        System.out.println(" Temp C " + Temperature.convertTemp(1, 'C'));
    }
}