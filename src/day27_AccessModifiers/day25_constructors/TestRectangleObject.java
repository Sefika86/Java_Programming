package day27_AccessModifiers.day25_constructors;

public class TestRectangleObject {

    public static void main(String[] args) {


         /*
        Rectangle rectangle1 = new Rectangle(); //we already had no argument cons. here ==>Rectangle();
        rectangle1.setInfo(3, 4);               //then why we need to call setInfo, let the special cons method to give your arguments
        Rectangle rectangle2 = new Rectangle();
        rectangle2.setInfo(4, 5);
        Rectangle rectangle3 = new Rectangle();
        rectangle3.setInfo(5, 6);
        Rectangle rectangle4 = new Rectangle();
        rectangle4.setInfo(6, 7);
        Rectangle rectangle5 = new Rectangle();
        rectangle5.setInfo(7, 8);
       */

        //bak onceden boyle sadece compiler in gorunmez no argument constructor i varken,
        // setInfoya ihtiyac duyardik, her object icin ayri ayri setinfo method cagirirdik
        //ama artik special cons. method var, with parameters
        //bak asagidaki gibi argumentleri cons. method icinde verebiliriz, setinfoya gerek yok

        Rectangle rectangle1 = new Rectangle(3, 4);

        Rectangle rectangle2 = new Rectangle(4, 5);

        Rectangle rectangle3 = new Rectangle(5, 6);

        Rectangle rectangle4 = new Rectangle(7, 8);

        Rectangle rectangle5 = new Rectangle(10, 12);


        System.out.println(rectangle1);
        System.out.println(rectangle2);
        System.out.println(rectangle3);
        System.out.println(rectangle4);
        System.out.println(rectangle5);









    }
}
