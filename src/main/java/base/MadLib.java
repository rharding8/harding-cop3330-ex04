package base;

import java.util.Scanner;

public class MadLib {
  Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    MadLib myLib = new MadLib();
    String noun = myLib.nounInput();
    String verb = myLib.verbInput();
    String adj = myLib.adjInput();
    String adverb = myLib.adverbInput();
    System.out.println(myLib.storyOutput(noun, verb, adj, adverb));
  }

  public String nounInput(){
    System.out.print("Enter a Noun to Proceed: ");
    return input.nextLine();
  }

  public String verbInput(){
    System.out.print("Enter a Verb to Proceed: ");
    return input.nextLine();
  }

  public String adjInput(){
    System.out.print("Enter an Adjective to Proceed: ");
    return input.nextLine();
  }

  public String adverbInput(){
    System.out.print("Enter an Adverb to Proceed: ");
    return input.nextLine();
  }

  public String storyOutput(String noun, String verb, String adj, String adverb){
    return String.format("So the man in %s shall %s the %s %s. And the world will never be the same.", adj, verb, noun, adverb);
  }
}
