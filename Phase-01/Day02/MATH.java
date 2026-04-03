// page 342 problem 9.18

public class MATH{
   int count;

   public MATH() {
   }

   public static void main(String[] var0) {
      MATH var1 = new MATH();
      System.out.println(var1.factorial(5));
   }

   public int getCount() {
      return this.count;
   }

   public int factorial(int var1) {
      int var2 = 1;

      for(int var3 = 1; var3 <= var1; ++var3) {
         var2 *= var3;
      }

      return var2;
   }
}