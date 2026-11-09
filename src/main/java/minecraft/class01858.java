package minecraft;

import org.jspecify.annotations.Nullable;

public abstract class class01858 extends class05362 {
   protected final class01883 N;
   protected final int y;
   protected final int L;

   public class01858(
      int var1, int var2, class00392 var3, int var4, int var5, class01883 var6, class05361 var7, @Nullable class00392 var8, @Nullable class05341 var9
   ) {
      super(0, 0, var1, var2, var3, var7, var9 == null ? field_40754 : var9);
      if (var8 != null) {
         this.method_47400(class04141.N(var8));
      }

      this.y = var4;
      this.L = var5;
      this.N = var6;
   }

   protected void N(class01054 var1, int var2, int var3) {
      var1.N(class08394.Na, this.N.N(this.method_37303(), this.method_25367()), var2, var3, this.y, this.L, this.field_22765);
   }

   public static class01875 N(class00392 var0, class05361 var1, boolean var2) {
      return new class01875(var0, var1, var2);
   }
}
