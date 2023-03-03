package day15_BranchingStatements_WhileLoopIntro;

public class RemoveDuplicates_ContinueStatement {
    public static void main(String[] args) {

        String str = "jjjjggggggggggddddddsssssszahl;jnhgrshhhhhhhhhh";

        String result = "";


        for (int i = 0; i < str.length(); i++) {

            if( result.contains( ""+str.charAt(i) )){ // if the character is already contained in new string
                continue; // skip it
            }

            result += str.charAt(i);

        }


        System.out.println(result);



    }


}


/*
3. Write a program that can remove the duplicated characters from a string
				Ex:
					str = "aabbbcccc"
					output:
						abc
 */
