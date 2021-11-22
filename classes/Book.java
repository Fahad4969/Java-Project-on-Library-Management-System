package classes;
import java.lang.*;
import interfaces.*;
public class Book
{
	protected String bName;
	protected String writterName;
	protected String publicationName;
	
	public Book(String bName, String writterName, String publicationName)
	{
		this.bName = bName;
		this.writterName = writterName;
		this.publicationName =publicationName;
	}
	
	public void setBName(String bName){this.bName = bName;}
	public void setWritterName(String writterName){this.writterName = writterName;}
	public void setPublicationName(String publicationName){this.publicationName = publicationName;}
	
	public String getBName(){return bName;} 
	public String getWritterName(){return writterName;}
	public String getPublicationName(){return publicationName;} 
}