

import Palindrome.IsPalindrome;


import java.util.Random;
import java.util.Scanner;

import static SymbolOccurance.FindSymbolOccurance.findSymbolOccurance;
import static WordPosition.FindWordPosition.findWordPosition;
import static Reversed.StringReverse.reverseString;
import static Palindrome.IsPalindrome.isPalindrome;
public class Main {
    public static void main(String[] args) {

        //                      SymbolOccurance
        String str = "Hello, World!";
        char symbol = 'l';
        int result = findSymbolOccurance(str,symbol);
        System.out.println("В тексте: "+str +" символов: "+symbol+ " найдено: "+ result);
        System.out.println("------------------------------");

        //                       WordPosition
        String source = "Apollo";
        String target = "pollo";
        int result1 = findWordPosition(source,target);
        System.out.printf("Source: %s  \nTarget: %s \nResult: %d",source,target,result1);
        System.out.println("\n------------------------------");

        //                        String Reverse
        String str1 = "Hello";
        String result2 = reverseString(str1);
        System.out.println(str1+ " -> " + result2);
        System.out.println("------------------------------");

        //                         Palindrome
        String str2 = "level";
        boolean result3 = IsPalindrome.isPalindrome(str2);
        System.out.println(result3);
        System.out.println("------------------------------");

        //                             Guess Word
        System.out.println("-----------Guess Word---------");
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado" , "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                " pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println("* Угадай слово загаданное компьютером *");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String randomWord = words[random.nextInt(words.length)];
        int wordLength = randomWord.length();
        String word;
       // System.out.println(randomWord);
        do {
            System.out.print("Введите слово:  ");
           word = scanner.nextLine().toLowerCase();
            if(word.equals(randomWord)){
                System.out.println(" ٩(｡•́‿•̀｡)۶ Вы угадали! ٩(｡•́‿•̀｡)۶");
                break;
            }else{
                StringBuilder stringBuilder = new StringBuilder("###############");
                int minLength = Math.min(wordLength,word.length());
                boolean letterMatch = false;
                for (int i = 0; i<minLength;i++){
                    if(word.charAt(i)== randomWord.charAt(i)){
                        stringBuilder.setCharAt(i,randomWord.charAt(i));
                      letterMatch = true;
                    }
                }
                if (letterMatch){
                System.out.println("Вы открыли букву: ");
                System.out.println(stringBuilder.toString());
            }else {
                    System.out.println("Вы не угадали. Попробуйте еще!");
                }
            }
        } while (true);
        scanner.close();
    }
}