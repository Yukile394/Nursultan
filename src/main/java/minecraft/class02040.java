package minecraft;

public abstract class class02040 implements class03695 {
   private int L;
   private int u;
   protected int N;
   protected int y;

   public class02040(int var1, int var2, int var3, int var4) {
      super();
      this.L = var1;
      this.u = var2;
      this.N = var3;
      this.y = var4;
   }

   @Override
   public int method_46427() {
      return this.u;
   }

   @Override
   public void method_46419(int var1) {
      this.N(var2 -> {
         int i = var2.method_46427() + (var1 - this.method_46427());
         var2.method_46419(i);
      });
      this.u = var1;
   }

   @Override
   public int method_46426() {
      return this.L;
   }

   @Override
   public void method_46421(int var1) {
      this.N(var2 -> {
         int i = var2.method_46426() + (var1 - this.method_46426());
         var2.method_46421(i);
      });
      this.L = var1;
   }

   @Override
   public int method_25364() {
      return this.y;
   }

   @Override
   public int method_25368() {
      return this.N;
   }
}
