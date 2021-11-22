package fileio;

import java.io.FileWriter;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class FileioException
{
	private File obj1;				
	private FileWriter obj2;		
	private FileReader obj3;		
	private BufferedReader bfr;		
	
	
	public void writeInFile(String s)
	{
		
		try
		{
			obj1 = new File("C:\\Users\\HP\\Desktop\\University\\java\\Project tsukiyomi(main)\\fileio\\file.txt");
			obj1.createNewFile();
			
			obj2 = new FileWriter(obj1);
			obj2.write(s+"\n");
			
			obj2.flush();
			obj2.close();
		}
		catch(IOException e)
		{
			System.out.println("An error found");
			e.printStackTrace();
		}
	}
	
	public void readFromFile()
	{
		
		try
		{
			obj3 = new FileReader(obj1);			
			bfr = new BufferedReader(obj3);		
			String text="", temp;					
			
			while((temp=bfr.readLine())!=null)		
			{
				text=text+temp+"\n"+"\r";			
			}
			
			System.out.println(text);				
			obj3.close();							
		}
		
		
		catch(IOException e)
		{
			System.out.println("An error found");
			e.printStackTrace();
		}
	}
	
}