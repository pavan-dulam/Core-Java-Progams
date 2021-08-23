package level_2;

import java.util.*; 
import java.io.*;
/*
Have the function MissingDigit(str) take the str parameter,
which will be a simple mathematical formula with three numbers,
a single operator (+, -, *, or /) and an equal sign (=) and return the digit that completes the equation.
In one of the numbers in the equation, there will be an x character,
and your program should determine what digit is missing. For example, 
if str is "3x + 12 = 46" then your program should output 4. 
The x character can appear in any of the three numbers
and all three numbers will be greater than or equal to 0 and less than or equal to 1000000.

Examples
Input: "4 - 2 = x"
Output: 2
Input: "1x0 * 12 = 1200"
Output: 0
*/
class MissingDigits {

  public static String MissingDigit(String str) {
    String splitArray[]=str.split(" ");
    String interSplit[];
   // System.out.print("split="+Arrays.toString(splitArray));
    int pos=-1,interpos=-1;
    String regex="\\d+";
    if(!splitArray[0].matches(regex)){
     // System.out.print("pos=0"); 
      interSplit=splitArray[0].split("");
     // System.out.print("interSplit="+Arrays.toString(interSplit));
      
        if(interSplit.length>1)
        {
       interpos=getInterSplit(interSplit);
        }else{interpos=0;}
        //   System.out.print("interpos="+interpos); 
       
    pos=0;
    }
    else if(!splitArray[2].matches(regex)){
    //  System.out.print("pos=2"); 
       interSplit=splitArray[2].split("");
      if(interSplit.length>1)
        {
       interpos=getInterSplit(interSplit);
        }else{interpos=0;}
    //  System.out.print("interpos="+interpos); 
    pos=2;
    }
    else{
      // System.out.print("pos=4");
        interSplit=splitArray[4].split("");
        if(interSplit.length>1)
        {
       interpos=getInterSplit(interSplit);
        }else{interpos=0;}
       //System.out.print("interpos="+interpos); 
    pos=4;
    }

    if(pos==0)
    {
      //consider this eq. a+b=c
      String b,c;
      b=splitArray[2];
      c=splitArray[4];
       String a=getvalue(b,c,pos,interpos,splitArray);
      return a;
    }
    else  if(pos==2)
    {
      //consider this eq. a+b=c
      String a,c;
      a=splitArray[0];
      c=splitArray[4];
       String b=getvalue(a,c,pos,interpos,splitArray);
      return b;
    }
    else  if(pos==4)
    {
      //consider this eq. a+b=c
      String a,b;
      a=splitArray[0];
      b=splitArray[2];
      String c=getvalue(a,b,pos,interpos,splitArray);
      return c;
    }
    return null;
  }
  public static int getInterSplit(String[] interSplit){
    for(int i=0;i<interSplit.length;i++){
        if(!interSplit[i].matches("\\d")){
         // System.out.print("interSplit.length ="+interSplit.length); 
       //  System.out.print("i ="+i); 
          return i;
        }
      } 
      return -1;
  }

public static String getvalue(String b,String c,int pos,int interpos,String[] splitArray){
  String operators=splitArray[1];
  int a=0;
  if(pos==4){
    switch(operators){
    case "+":
    a=Integer.parseInt(b)+Integer.parseInt(c);
    break;

    case "-":
    a=Integer.parseInt(b)-Integer.parseInt(c);
    break;

    case "*":
    a=Integer.parseInt(b)*Integer.parseInt(c);
    break;

    case "/":
    a=Integer.parseInt(b)/Integer.parseInt(c);
    break;


  }
  }
  else{
  switch(operators){
    case "+":
    a=Integer.parseInt(c)-Integer.parseInt(b);
    break;

    case "-":
    a=Integer.parseInt(c)+Integer.parseInt(b);
    break;

    case "*":
    a=Integer.parseInt(c)/Integer.parseInt(b);
    break;

    case "/":
    a=Integer.parseInt(c)*Integer.parseInt(b);
    break;


  }
  }
  String resulString=String.valueOf(a);
  String[] splitResulStrings= resulString.split("");
  
  return splitResulStrings[interpos];
}
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(MissingDigit(s.nextLine())); 
  }

}