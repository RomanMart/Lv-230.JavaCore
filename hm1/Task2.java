import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class WhoAreYou {

	public static void main(String[] args) throws IOException {
		String name;
		String adress;
		int age;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Hello, what is your name?");
name = br.readLine();
System.out.println("Where are you from " + name + "?");
adress = br.readLine();
System.out.println("How old are you?");
age = Integer.parseInt(br.readLine());
System.out.println(name + " is from " + adress + "."  + " He is " + age + ".");


	}

}
