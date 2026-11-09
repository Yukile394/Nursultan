package minecraft;

public final class class02080 {
   private final int y;
   private int L;

   public class02072 L() {
      return this.N.L();
   }

   class02080(class02060 var1, int var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public class02072 y() {
      return this.N.y();
   }

   public <T extends class02102> T N(T var1, int var2, class02072 var3) {
      int i = this.L / this.y;
      int j = this.L % this.y;
      if (j + var2 > this.y) {
         i++;
         j = 0;
         this.L = class04995.i(this.L, this.y);
      }

      this.L += var2;
      return this.N.N((T)var1, i, j, 1, var2, var3);
   }

   public class02060 N() {
      return this.N;
   }

   public <T extends class02102> T N(T var1) {
      return this.N((T)var1, 1);
   }

   public <T extends class02102> T N(T var1, class02072 var2) {
      return this.N((T)var1, 1, var2);
   }

   public <T extends class02102> T N(T var1, int var2) {
      return this.N((T)var1, var2, this.L());
   }
}
