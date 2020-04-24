import java.io.*;
import java.util.Scanner;

public class InitXMLToObject
{
	public static void main(String[] args)
	{
		XMLToObject x = new XMLToObject();
		System.out.println("Voer een XML-productbestand (zonder XML)");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		File file = new File(s + ".xml");
		x.createRecord(file);
	}
}