package day05_operators;

public class UnaryOperators {
    public static void main(String[] args) {

        //pre increment/decrement

        int x = 10;
        System.out.println(++x); // console will show 11
        System.out.println(x);  // will show another 11

        int y = 100;
        System.out.println(++y); //101
        System.out.println(--y); //100

        //post increment/decrement

        int b = 35;
        System.out.println(b++); //35
        System.out.println(b);   //36 (first shows the old value it keeps in his memory)

        int w = 23;
        System.out.println(w--); //23
        System.out.println(w);  //22

        int a = 50;
        System.out.println(a++); //console will show 50. it won't increase it immediately but will keep it in the memory
        System.out.println(a--); //console will be 51. actually its expected to show 50 but it will show the old value in his memory which is 51
        System.out.println(a);

        int t = 56;
        System.out.println(t--); //56
        System.out.println(t++);  //55
        System.out.println(t); //56


        //ex
        int n =30;
        int m = n++;

        System.out.println("m = " + m);
        System.out.println("n = " + n);     // console will show m=30 and n=31    m got the memory value and n got the current value

        //ex
        int z = 60;
        int q = z--;  // q=60 and z=59

        System.out.println("q = " + q);
        System.out.println("z = " + z);  // q= 60 and z=59
    }
}
