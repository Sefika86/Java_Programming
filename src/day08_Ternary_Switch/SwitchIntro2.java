package day08_Ternary_Switch;

public class SwitchIntro2 {
    public static void main(String[] args) {
       // please do this task with switch statement, not with if statements or ternaries.

        int n = 8;   //1~7 we will compare 7 cases
        String day = " ";

        switch (n) {                     //if we remove all these breaks, we see all 7 days on the console
          case 1:
          day = "Monday";
          break;

          case 2:
              day = "Tuesday";
              break;

          case 3:
              day = "Wednesday";
              break;

          case 4:
              day = "Thursday";
              break;

          case 5:
              day = "Friday";
              break;

          case 6:
              day = "Saturday";
              break;

          case 7:
              day = "Sunday";
              break;

          default:
                day = "No Such A Day";   //or we can declare a default at the top like
                                        // String day = "No Such A Day" instead of using default

        }
            System.out.println(day);





    }
}
