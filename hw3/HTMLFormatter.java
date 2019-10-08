
public class HTMLFormatter implements InvoiceFormatter
{
	public String formatHeader()
   {
		total = 0;
	      return " <b><h1 style='color:red';align= 'center'>"+"I N V O I C E" + "</h1></b><br><br>";
		
   }

   public String formatLineItem(LineItem item)
   {
	   total += item.getPrice()*item.getQuantity();
      return "<li><p style = 'color: black'>" + item.toString() + " x" + item.getQuantity() + 
				"<p style = 'color: green'> $ " + item.getPrice() + "</p></li><br><br><br>"; }

   public String formatFooter()
   {
       return "<b><u><h3 style = 'color: black' ; align = 'center'>"
				+ "TOTAL DUE: " + total + "</h3></u></b>"; }

   private double total;
   private InvoiceTester IT = new InvoiceTester();

}
