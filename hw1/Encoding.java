import java.util.*;

public class Encoding
{
   public static Set<String> morseCodes(int m, int n)
   {
      Set<String> result = new TreeSet<>();
      if(m==0 && n==0)
       result.add("");
    
      else if (m==0 && n>=0)
      {
         for (String str : morseCodes(m,n-1))
        	  result.add(str+"-");
      }
      else if (m>=0 && n==0 )
      {
    	  for (String str : morseCodes(m-1,n))
    	   result.add(str+".");
      }
      else
      {
    	  for (String str : morseCodes(m-1,n))
          {
        	  result.add(str+".");
          }
          for (String str : morseCodes(m,n-1))
          {
        	  result.add(str+"-");
          }
      }
     return result;
   }
}
