import javax.swing.*;
import java.util.Scanner;
public class chatbot1{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("WELCOME TO THE CHATBOT!");
System.out.println("Press 'BYE' to exit..");
while(true){
System.out.println("You:");
String host=sc.nextLine().toLowerCase();
if(host.contains("hi")||host.contains("hello")){
System.out.println("Bot:Hello!How can I Assist you..");
}else if(host.contains("name")){
System.out.println("Bot:My name is rule based chatbot");
}else if(host.contains("ai")){
System.out.println("Bot:artificial intelligence(ai) is focused on building systems capable of performing tasks.. ");
}else if(host.contains("you")&&host.contains("ai")){
System.out.println("Bot:No,i am a rule based chatbot");
}else if(host.contains("java")){
System.out.println("Bot:java is an object-oriented programming language");
}else if(host.contains("python")){
System.out.println("Bot:python is programming language, it is very simple and easy to use..");
}else if(host.contains("love")&&host.contains("you")){
System.out.println("Bot:No i can't do that because i dont have any physical apperance");
}else if(host.contains("what can you do")){
System.out.println("Bot:i can give response to your rule based questions");
}else if(host.contains("thanks")){
System.out.println("Bot:thanks for using chatbot..");
}else if(host.contains("bye")){
System.out.println("Bot:Goodbye!");
break;
}else{
System.out.println("Bot:Sorry,I don't understand..");
}
}
sc.close();
}
}