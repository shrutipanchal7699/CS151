
import java.util.*;

public class Encoding
{
   public static Set<String> morseCodes(int m, int n)
   {
      Set<String> result = new TreeSet<>();
      if(m==0 && n==0)
       result.add("");
    
      else if (m==0 && n>0)
      {
         for (String code : morseCodes(m,n-1))
        	  result.add(code+"-");
            }
      else if (m>0 && n==0 )
      {
    	  for (String code : morseCodes(m-1,n))
    	   result.add(code+".");
      }
      else
      {
    	  for (String code : morseCodes(m,n-1))
         	  result.add(code+"-");
         
    	  for (String code : morseCodes(m-1,n))
        	  result.add(code+".");
                       }
            return result;
   }
}
