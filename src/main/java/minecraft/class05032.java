package minecraft;

class class05032 implements Appendable {
   private int N;
   private final int y;

   public class05032(int var1) {
      super();
      this.y = var1;
   }

   @Override
   public Appendable append(char var1) {
      return this.N(1);
   }

   @Override
   public Appendable append(CharSequence var1, int var2, int var3) {
      return this.N(var3 - var2);
   }

   @Override
   public Appendable append(CharSequence var1) {
      return this.N(var1.length());
   }

   private Appendable N(int var1) {
      this.N += var1;
      if (this.N > this.y) {
         throw new IllegalStateException("Character count over limit: " + this.N + " > " + this.y);
      } else {
         return this;
      }
   }
}
