package minecraft;

import java.util.function.Consumer;

public class class02057 implements class02102 {
   private int N;
   private int y;
   private final int L;
   private final int u;

   public class02057(int var1, int var2) {
      this(0, 0, var1, var2);
   }

   public class02057(int var1, int var2, int var3, int var4) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
   }

   public static class02057 y(int var0) {
      return new class02057(0, var0);
   }

   public static class02057 N(int var0) {
      return new class02057(var0, 0);
   }

   @Override
   public void method_48206(Consumer<class06478> var1) {
   }

   @Override
   public int method_46427() {
      return this.y;
   }

   @Override
   public void method_46419(int var1) {
      this.y = var1;
   }

   @Override
   public int method_46426() {
      return this.N;
   }

   @Override
   public void method_46421(int var1) {
      this.N = var1;
   }

   @Override
   public int method_25364() {
      return this.u;
   }

   @Override
   public int method_25368() {
      return this.L;
   }
}
