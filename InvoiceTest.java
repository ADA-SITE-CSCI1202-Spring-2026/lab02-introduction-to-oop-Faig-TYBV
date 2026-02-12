public class InvoiceTest{
  public static void main(String[] args) {
      Invoice in=new Invoice("eminem", "rapGod", 1, 999999);
      System.err.println(in.getInvoiceAmount());
      in.setPrice(2);
      System.err.println(in.getPrice());
  }
}