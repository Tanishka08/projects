
public class ShirtTest
{
  int shirtId;
  char shirtColor;
  double shirtPrice;
  public static void main(String[] args)
  {
  ShirtTest myShirt=new ShirtTest();
  ShirtTest yourShirt=new ShirtTest();
  myShirt.displayShirtInformation();
  yourShirt.displayShirtInformation();
  myShirt.shirtColor='R';
  yourShirt.shirtColor='G';
  myShirt.displayShirtInformation();
  yourShirt.displayShirtInformation();
  }
 
}