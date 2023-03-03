package day08_Ternary_Switch;

public class TernaryIntro2 {
    public static void main(String[] args) {

        // now let's learn how to use ternary for multi-branch if

                int number = 100;
                String result = " ";   //if I'm not sure if this variable reassigned,
                                        // beginning I can give a temp value

                if(number > 0){
                    result = "Positive";
                } else if (number < 0) {
                    result = "Negative";
                }else{
                    result = "Zero";
                }

        System.out.println(result);

  System.out.println("==================================================================");

        // now with ternary
                           //cond1                    //cond2
        String result1 = (number > 0) ? "Positive" :(number < 0)? "Negative" : "Zero";
      //  variable                   if               else -if             else


  System.out.println("==================================================================");

// the weekDays task that we did with multi branch before, now doing it with ternaries........
// when we did it with multi branch, we had 1 if , 5 else if and 1 else......
// now with the ternary we will have 1 ? , 5 :? (unhappy faces) , and 1 :

                int n = 5;
  String  day = (n == 1) ? "Monday" :(n==2)? "Tuesday" :(n==3)? "Wednesday" :(n==4)? "Thursday"
              :(n==5)? "Friday" :(n==6)? "Saturday" : "Sunday";

        System.out.println(day);

   System.out.println("==================================================================");

//MonthNames Task

        int num = 10; // 1~12
   String month = (num==1)? "January" :(num==2)? "February" :(num==3)? "March" :(num==4)? "April" :(num==5)? "May" :(num==6)? "June"
           :(num==7)? "July" :(num==8)? "August" :(num==9)? "September":(num==10)? "October" :(num==11)? "November" : "December";

        System.out.println(month);



//now we will learn how to do nested if with Ternary.






    }
}
