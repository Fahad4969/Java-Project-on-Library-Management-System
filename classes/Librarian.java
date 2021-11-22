package classes;
import java.lang.*;
import interfaces.*;
public class Librarian
{
	private String name;
	private String l_Id;
	private String pass;
	
	public void setName(String name){this.name = name;}
	public void setL_Id(String l_Id){this.l_Id = l_Id;}
	public void setPass(String pass){this.pass = pass;}
	
	public String getName(){return name;} 
	public String getL_Id(){return l_Id;}
	public String getPass(){return pass;} 
}