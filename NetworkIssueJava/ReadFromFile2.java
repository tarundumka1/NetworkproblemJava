import java.io.*;
public class ReadFromFile2
{
  public static void main(String[] args)throws Exception
  {
  File file = new File("C:\\Users\\tarun\\Desktop\\one.txt");
  
  BufferedReader br = new BufferedReader(new FileReader(file));
  
  String st;
  while ((st = br.readLine()) != null)
  {
  
    int i=Integer.parseInt(st);
   
  }
   int num = i, reversed = 0;

    // run loop until num becomes 0
    while(num != 0) {
    
      // get last digit from num
      int digit = num % 10;
      reversed = reversed * 10 + digit;

      // remove the last digit from num
      num /= 10;
    }
    
 
        // Define the file name of the file
        Path fileName = Path.of("/Users/tarun/Desktop/two.txt");
 
        // Write into the file
        Files.writeString(two.txt,reversed);
 

  }