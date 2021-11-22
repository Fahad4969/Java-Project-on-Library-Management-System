package classes;
import java.lang.*;
import interfaces.*;
public class Records extends Book
{

		private String name;
		private String id;
		private String issueDate;
		private String lastDate;
		
		public Records(String name, String id, String bName, String writterName, String publicationName, String issueDate, String lastDate)
		{
			super(bName, writterName, publicationName);
			this.name = name;
			this.id = id;
			this.issueDate = issueDate;
			this.lastDate = lastDate;
			
		}
		
		public void setName(String name)
		{
			this.name = name;
		}
		public void setId(String id)
		{
			this.id = id;
		}
		public void setBookName(String bName)
		{
			this.bName = bName;
		}
		public void setBookWriter(String writterName)
		{
			this.writterName = writterName;
		}
		public void setPublication(String publicationName)
		{
			this.publicationName = publicationName;
		}
		public void setIssueDate(String issueDate)
		{
			this.issueDate = issueDate;
		}
		public void setLastDate(String lastDate)
		{
			this.lastDate = lastDate;
		}
		
		
		
	public String getName(){return name;}
	public String getId(){return id;}	
	public String getBookName(){return bName;}	
	public String getBookWriter(){return writterName;}	
	public String getPublication(){return publicationName;}	
	public String getIssueDate(){return issueDate;}	
	public String getLastDate(){return lastDate;}	
}