
public class Strings
{
   static final int no_chars = 256; 
     public static String uniqueLetters(String str)
   {
      int[] countOfChar = new int[no_chars];  //count of individual letters
      int[] index = new int[no_chars];      //index of letters 
             
        for (int i = 0; i < no_chars; i++) 
        { 
            countOfChar[i] = 0; // Initial count of all letters  
            index[i] = str.length();  // indexes of distinct characters.
        } 
      
        for (int i = 0; i < str.length(); i++) 
        { 
           char x = str.charAt(i); 
            ++countOfChar[x]; //increases the current count of letter
       
            if (countOfChar[x] == 1 && x !=' ') 
                index[x] = i; 
       
            // repetition more than once    
            if (countOfChar[x] >= 2) 
                index[x] = str.length(); 
        } 
       
      String distinctletters ="";
         
      // storing uniqueletters only
        for (int i = 0; i < str.length() ;i++) 
          { 
              char x = str.charAt(i);
               if(index[(int)x] != str.length())
                distinctletters += x;
          }
     return distinctletters;
   }
}
