package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivo 
{
	private File f;
	private FileReader fr;
	private BufferedReader br;
	private FileWriter fw;
	private PrintWriter pw;
	private String line;
	
	public Archivo()
	{
		
	}
	
	public String readLog()
	{
		String str = "";
		f = new File("./docs/resources/MyTest.log");
		try 
		{
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			line = br.readLine();
			while(line != null)
			{
				str += line+"\n";
				line = br.readLine();
			}
			fr.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		return str;
	}
	
	public void saveLog(String InsertLineToSave)
	{
		f = new File("./docs/resources/MyTest.log");
		try 
		{
			fw = new FileWriter(f);
			pw = new PrintWriter(fw);
			for (int i = 0; i < 1; i++) 
			{
				pw.println(InsertLineToSave);
			}
			
			fw.close();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}
