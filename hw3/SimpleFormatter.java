/**
   A simple invoice formatter.
*/
public class SimpleFormatter implements InvoiceFormatter
{
   public String formatHeader()
   {
      total = 0;
      return "     I N V O I C E\n\n\n";
     // return <html><body><p> "I N V O I C E\\n\\n\\n"</p></body></html>;
   }

   public String formatLineItem(LineItem item)
   {
      total += item.getPrice()*item.getQuantity();
      return (String.format(
            "%s: $%.2f\n",item.toString()+" X"+item.getQuantity(),item.getPrice()));
   }

   public String formatFooter()
   {
      return (String.format("\n\nTOTAL DUE: $%.2f\n", total));
   }

   private double total;
}
