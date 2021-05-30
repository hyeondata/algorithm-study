package exam;
import java.io.*;
import java.io.BufferedWriter;
import java.util.*;
import java.util.StringTokenizer;

public class Main {

    
  public static void main(String[] args) throws IOException{
       BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
	   BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(bf.readLine());
	   int result =0;
	   int a = Integer.parseInt(st.nextToken());
	   int b = Integer.parseInt(st.nextToken());
	   int c = Integer.parseInt(st.nextToken());
	   
	   if(b>=c)
	       System.out.println("-1");
	       else
	       System.out.println(a/(c-b)+1);
       
       
	   
  }
}
