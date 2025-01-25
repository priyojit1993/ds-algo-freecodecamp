package stacks;

import java.io.BufferedInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesisUsingStack {
    /*
    * Example
- Brackets
Problem: Given a string made up of the
following brackets: ( ) [1{}, determine
whether the brackets properly match.
[{}] - Valid
(()()) - Valid
{] - Invalid
[()]))() - Invalid
[]{}({}) -  valid
    *
    *
    * */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char openFirstBracket = '(';
        char openSecondBracket = '{';
        char openThirdBracket = '[';
        char closeFirstBracket = ')';
        char closeSecondBracket = '}';
        char closeThirdBracket = ']';
        System.out.println("Please enter a string of valid open and close parenthesis");
        String parenthesis = scanner.next();
        Stack<Character> characters = new Stack<>();
        for (char bracketCharacter : parenthesis.toCharArray()) {
            if (characters.empty()) {
                characters.push(bracketCharacter);
            } else {
                //
                if (bracketCharacter == openFirstBracket || bracketCharacter == openSecondBracket || bracketCharacter == openThirdBracket) {
                    characters.push(bracketCharacter);
                } else if (bracketCharacter == closeFirstBracket || bracketCharacter == closeSecondBracket || bracketCharacter == closeThirdBracket) {
                    if (characters.empty()) {
                        throw new RuntimeException("Invalid brackets ... ");
                    }
                    Character lastBracket = characters.pop();
                    if ((lastBracket == openFirstBracket && bracketCharacter == closeFirstBracket) || (lastBracket == openSecondBracket && bracketCharacter == closeSecondBracket) || (lastBracket == openThirdBracket && bracketCharacter == closeThirdBracket))
                        continue;
                    else
                        throw new RuntimeException("Invalid brackets..");
                } else {
                    throw new RuntimeException("Invalid characters valid characters are (,{,[,),},]");
                }
            }

        }
        if (characters.empty())
            System.out.println("Valid bracket ....");
        else
            throw new RuntimeException("Invalid brackets..");
    }


}
