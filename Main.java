/*Write a Java program that prompts the user to enter a number and determines whether the number is positive or negative. If the number is positive, the program should print "The number is positive." If the number is negative, the program should print "The number is negative."*/


import java.util.Scanner;
public class Main {
public static void main(String [] args){
Scanner s= new Scanner(System.in);
int a = s.nextInt();s.nextLine();
if(a>0)
{
System.out.println("The number is positive");
}
else
{
System.out.println("The number is negative");}}}