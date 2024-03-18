package lab1;
import java.io.*;

public class MyReader extends FileReader{
	File file;
	char [] constant = new char[1000];
	MyReader(File file)throws Exception
	{
		super(file);
		this.file = file;
	}
	
	MyReader (String filename) throws Exception{
		super(filename);
		file = new File(filename);
	}
	
	public String readContent() throws Exception{
		BufferedReader reader = new BufferedReader(new MyReader(file));
		String line = reader.readLine();
		while (line != null) {
		    return line;
		}
		return "There is nothing in the file.";
	}
	
	public static void main (String [] args) throws Exception
	{
		MyReader reader = new MyReader("Welcome.txt");
		System.out.println(reader.readContent());
		
		File file = new File("Welcome.txt");
		MyReader reader2 = new MyReader(file);
		System.out.println(reader2.readContent());
	}
}
