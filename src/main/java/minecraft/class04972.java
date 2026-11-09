package minecraft;

import java.util.List;

public abstract class class04972<T extends class07476> extends class00277<T> {
   private final class01894 N;
   private final class01894 y;
   private final class01894 L;

   public class04972(T var1, class08044 var2, class00392 var3, class00392 var4, class01894 var5, class01894 var6, class01894 var7, List<class05322> var8) {
      super((T)var1, new class05055(var1, var4, var8), var2, var3);
      this.N = var5;
      this.y = var6;
      this.L = var7;
   }

   @Override
   protected void N(class01054 var1, float var2, int var3, int var4) {
      int i = this.T;
      int j = this.b;
      var1.N(class08394.Na, this.N, i, j, 0.0F, 0.0F, this.B, this.Z, 256, 256);
      if (this.m.s()) {
         byte b0 = 14;
         int k = class04995.u(this.m.m() * 13.0F) + 1;
         var1.N(class08394.Na, this.y, 14, 14, 0, 14 - k, i + 56, j + 36 + 14 - k, 14, k);
      }

      byte b1 = 24;
      int l = class04995.u(this.m.W() * 24.0F);
      var1.N(class08394.Na, this.L, 24, 16, 0, 0, i + 79, j + 34, l, 16);
   }

   @Override
   protected class03283 N() {
      return new class03283(this.T + 20, this.field_22790 / 2 - 49);
   }

   @Override
   public void method_25426() {
      super.method_25426();
      this.z = (this.B - this.field_22793.N(this.field_22785)) / 2;
   }
}
