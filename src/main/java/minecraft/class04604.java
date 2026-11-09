package minecraft;

public class class04604 extends class01763 {
   private float W = Float.MAX_VALUE;
   private class01763 m;
   private boolean P;

   public boolean L() {
      return this.P;
   }

   public class04604(int var1, int var2, int var3) {
      super(var1, var2, var3);
   }

   public class04604(class01763 var1) {
      super(var1.N, var1.y, var1.L);
   }

   public void y() {
      this.P = true;
   }

   public static class04604 N(class00667 var0) {
      class04604 class04604 = new class04604(var0.readInt(), var0.readInt(), var0.readInt());
      N(var0, class04604);
      return class04604;
   }

   public class01763 N() {
      return this.m;
   }

   public void N(float var1, class01763 var2) {
      if (var1 < this.W) {
         this.W = var1;
         this.m = var2;
      }
   }
}
