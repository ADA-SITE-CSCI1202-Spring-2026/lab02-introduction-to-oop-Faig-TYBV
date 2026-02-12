public class Invoice{
  private String partNumber;
  private String partDesc;
  private int quantity;
  private double price;
  public Invoice(String pN, String pD, int q, double p){
    partNumber=pN;
    partDesc=pD;
    quantity=q;
    price=p;
  }
  public String getPartNumber(){
    return partNumber;
  }
  public String getPartDesc(){
    return partDesc;
  }
  public int getQuantity(){
    return quantity;
  }
  public double getPrice(){
    return price;
  }
  public void setPartNumber(String pN){
    partNumber=pN;
  }
  public void setPartDesc(String pD){
    partDesc=pD;
  }
  public void setQuantity(int q){
    quantity=q;
    if(quantity<0) quantity=0;
  }
  public void setPrice(double p){
    price=p;
    if(price<0) price=0.0;
  }
}