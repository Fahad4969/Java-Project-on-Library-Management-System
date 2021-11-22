package interfaces;
import classes.*;
public interface BookOperations
{
	void insertBook1(Book b);
	void insertBook2(Book b);
	void removeBook(Book b);
	Book getBook(String bName , String writterName , String publicationName);
	//void showAllEmployees();
}