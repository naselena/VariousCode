package JavaRushTests;

import java.util.Scanner;

public class test {
}


class Test {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);// Создаем объект класса Scanner для ввода строк с клавиатуры
        strings = new String[6];  //присваеваем массиву strings длину 6 строк
        for(int i = 0; i < strings.length; i++) { //Запускаем цикл по всем строкам массива от нуля до конца
            strings[i] = console.nextLine(); // Каждому элементу массива присваивается значение ввденное через клавиатуру
        }

        for(int i = 0; i < strings.length; i++) { //Запускаем цикл по всем строкам массива, чтобы взять "первый" он же нулевой элемент массива.
            String iString = strings[i]; // первый элемент массива кладем в коробку/переменную iString;
            for (int j=i+1;j< strings.length;j++) { // Запускаем втрой цикл  внутри первого
//Этот цикл берет второй элемент,(строку) массива (j=i+1 или j=0+1=1=второй элемент) начальным, и идет по всем строкам массива параллельно с первым циклом.
//Опережая первый цикл на одну строку.
                if (iString == null) { // Создаем условие, если в коробке переменной iString ничего нет
                    break;} //цикл прерываем
                else if (iString.equalsIgnoreCase(strings[j])) { //если что-то есть, и сравнение по строкам переменной iString равно содержимому некст ячейки массива
                    strings[i]=null; //обнуляем первую ячейку которую мы захватили первым циклом
                    strings[j]=null; //обнуляем вторую ячейку которую мы захватили вторым циклом
                }}}
        for(int i = 0; i < strings.length; i++) { // Снова Запускаем цикл по всем строкам массива от нуля до конца
            System.out.print(strings[i] + ", "); //Выводим содержимое массива на экран
        }
    }
}

