package day30_inheritance.phoneTask;

public class TestPhoneObjects {
    public static void main(String[] args) {


        Iphone iphone = new Iphone("IPhone 12", "Large", "Black", 1000.5);

        Samsung samsung = new Samsung("Galaxy S22", "Medium", "White", 1100);

        Nokia nokia = new Nokia("Brick", "Small", "Pink", 50);


        iphone.call(911);
        samsung.call(911);
        nokia.call(911);

        iphone.text(132345665);
        samsung.text(45698745);
        nokia.text(36985214);

        System.out.println("------------------------------------------------------------------------");

        iphone.faceTime("sefika@gmail.com");
        //samsung.faceTime();
        //nokia.faceTime();

        //iphone.freeze();
        samsung.freeze();
        //nokia.freeze();

        //iphone.selfDefence();
        //samsung.selfDefence();
        nokia.selfDefence();


        System.out.println("------------------------------------------------------------------------");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);




    }
}
