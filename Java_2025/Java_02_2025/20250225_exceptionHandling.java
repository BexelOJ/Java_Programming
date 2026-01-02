import java.io.IOException;

public class ExceptionHandlingExample 
{
    public static void main(String[] args) 
    {
        try 
        {
            int result = 10 / 0;  // ArithmeticException
        } 
        
        catch (ArithmeticException e) 
        {
            System.out.println("Error: Cannot divide by zero");
        } 
        
        finally 
        {
            System.out.println("This will always run.");
        }

        try 
        {
            readFile();  // Will throw IOException
        } 
        
        catch (IOException e) 
        {
            System.out.println("File read error: " + e.getMessage());
        }
    }

    public static void readFile() throws IOException 
    {
        throw new IOException("File not found");
    }
}

