package minecraft;

public class class02114 {
   private final class00392 N;
   private final class01590 y;
   private final int L;
   private int u = -1;
   private boolean i = true;
   private class02086 R = class02086.field_62117;

   class02114(class00392 var1, class01590 var2) {
      this(var1, var2, 4);
   }

   class02114(class00392 var1, class01590 var2, int var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   public class02114 y(int var1) {
      this.u = var1 + this.L * 2;
      return this;
   }

   public class02091 N() {
      return new class02091(this.N, this.y, this.L, this.u, this.R, this.i);
   }

   public class02114 N(class02086 var1) {
      this.R = var1;
      return this;
   }

   public class02114 N(boolean var1) {
      this.i = var1;
      return this;
   }

   public class02114 N(int var1) {
      this.u = var1;
      return this;
   }
}
