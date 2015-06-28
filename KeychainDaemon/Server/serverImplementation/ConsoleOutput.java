package serverImplementation;

import serverInterface.IConsoleOutput;

import java.io.*;

public class ConsoleOutput implements IConsoleOutput {

	
	private void outputPage (File file) throws FileNotFoundException, IOException
	{
		try (BufferedReader br = new BufferedReader(new FileReader(file))) 
		{
		    String line;
		    while ((line = br.readLine()) != null) {
		       System.out.println(line);
		    }
		}
	}
	
	public void initPage() throws FileNotFoundException, IOException 
	{
		//TODO: Create Proper Exception Handling
		
		File file = new File("C:/Users/Fawaz/Projects/Trunk/Keychain/KeychainDaemon/Server/InitPage.txt");

		outputPage(file);
		
		Authentication authReq = new Authentication();
		authReq.requestAuthentication();
	}

	@Override
	public void optionsPage() throws FileNotFoundException, IOException {
		// TODO  Create Proper Exception Handling
		
		File file = new File("C:/Users/Fawaz/Projects/Trunk/Keychain/KeychainDaemon/Server/SelectionPage.txt");

		outputPage(file);
	}
}
