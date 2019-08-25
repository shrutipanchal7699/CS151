
public class Strings
{
   static final int no_chars = 256;
     public static String uniqueLetters(String str)
   {
      // length of the string
      int strLen = str.length(); 
      
      //keeps track of the count of individual character
      int[] countOfChar = new int[no_chars]; 
      
     //stores index value of character 
      int[] index = new int[no_chars]; 
       
        // Initialize counts of all characters and  
        // indexes of distinct characters. 
        for (int i = 0; i < no_chars; i++) 
        { 
            countOfChar[i] = 0; 
            index[i] = strLen; // A value more than any  
                          // index in str[] 
        } 
       
        // Traverse the input string 
        for (int i = 0; i < strLen; i++) 
        { 
           //increases the current count of character
            char x = str.charAt(i); 
            ++countOfChar[x]; 
       
            // If this is first occurrence, then set  
            // value in index as index of it. 
            if (countOfChar[x] == 1 && x !=' ') 
                index[x] = i; 
       
            // If character repeats, then remove it  
            // from index[] 
            if (countOfChar[x] >= 2) 
                index[x] = strLen; 
        } 
       
      String distinctletters ="";
      
        for (int i = 0; i < strLen ;i++) 
          { 
              char x = str.charAt(i);
               if(index[(int)x] != strLen)
                 distinctletters += x;
          }        
    return distinctletters;
   }
}
