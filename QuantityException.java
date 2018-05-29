package edu.albany.SandwichShop;

class QuantityException extends Exception{

	private static final long serialVersionUID = 1L;
String s1;
   QuantityException(String s2) {
      s1 = s2;
   }
   @Override

   public String toString() {
      return (s1);
   }
}
