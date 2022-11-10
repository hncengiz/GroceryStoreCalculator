import java.util.Scanner;

public class GroceryStoreProgramming {

    public static void main(String[] args) {

    /*Manav Kasa Programı
    Java ile kullanıcıların manavdan almış oldukları ürünlerin
    kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

    Meyveler ve KG Fiyatları

    Armut : 2,14 TL
    Elma : 3,67 TL
    Domates : 1,11 TL
    Muz: 0,95 TL
    Patlıcan : 5,00 TL
    Örnek Çıktı;

    Armut Kaç Kilo ? :0
    Elma Kaç Kilo ? :1
    Domates Kaç Kilo ? :1
    Muz Kaç Kilo ? :2
    Patlıcan Kaç Kilo ? :3
    Toplam Tutar : 21.68 TL

     */


        // Declare double variables
        double pear = 2.14;
        double apple = 3.67;
        double tomatoes = 1.11;
        double banana = 0.95;
        double aubergine = 5.0;
        double p, a, t, b, au, total;

        // Create a new object
        Scanner input = new Scanner (System.in);

        // Prompt the user to input double pear, apple, tomatoes. banana, aubergine
        System.out.print( " Enter weight of pear in kilogram : ");
        p = input.nextDouble ();

        System.out.print( " Enter weight of apple in kilogram : ");
        a = input. nextDouble();

        System.out.print( " Enter weight of tomatoes in kilogram : ");
        t = input.nextDouble();

        System.out.print( " Enter weight of  in banana in kilogram : ");
        b = input.nextDouble();

        System.out.print( " Enter weight of aubergine in kilogram : ");
        au = input.nextDouble();

        // Calculate total amount

        total = ( pear * p ) + ( apple * a ) + ( tomatoes * t ) + ( banana * b ) + ( aubergine * au );

        // Display the result

        System.out.println( " Total is " + total );

    }
}