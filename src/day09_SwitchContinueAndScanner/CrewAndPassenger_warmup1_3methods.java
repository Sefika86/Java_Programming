package day09_SwitchContinueAndScanner;

public class CrewAndPassenger_warmup1_3methods {
    public static void main(String[] args) {

        //1.CrewAndPassenger Task with switch statement

/*
Create a class called CrewAndPassenger, Given a people2 of people on the ship (int people2),
determine how many need to be crew members and how many can be passengers.
Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other people2 of people on the ship is not valid
 */

                 int people =50;

                 String total = "Not Valid";   // ben default suz yapmayi tercih ettim ,
                                                // as a default assign yaptim

                 switch (people){
                     case 50:
                     total = "20 crew, 30 passengers";
                     break;

                     case 75:
                     total = "25 crew, 50 passengers";
                     break;

                     case 100:
                     total = "30 crew, 70 passengers";
                     break;

                }

        System.out.println(total);  //outcome will be invalid because 55 is not one of the possible outputs


System.out.println("=================================================================");

//2.bu da  ternary ile ayni sorunun cozumu

        int people2 = 55;

        String result1 = (people2 == 50 || people2 == 75 || people2 == 100)?
                (people2 == 50)? "20 crew, 30 passengers"
                        :(people2 == 75)? "25 crew, 50 passengers"
                        : "30 crew, 70 passengers"
                :"Invalid";


        System.out.println(result1);

System.out.println("==================================================================");

//3. bu da if statement(nested if) ve switch ile mix cozumu

        int people3 = 75;

        if(people3 == 50 || people3 ==75 || people3 ==100){


            switch (people3){
                case 50:
                    System.out.println("20 crew, 30 passengers");
                    break;

                case 75:
                    System.out.println("25 crew, 50 passengers");
                    break;

                default:
                    System.out.println("30 crew, 70 passengers ");
            }

        }else{
            System.out.println("Invalid Number");
        }





    }
}
