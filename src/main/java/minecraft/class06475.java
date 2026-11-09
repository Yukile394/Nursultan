package minecraft;

import java.util.function.Consumer;
import org.joml.Matrix3x2f;

class class06475 implements class06465 {
   private final class01054 N;
   private final class00580 y;
   private class00577 L;

   public class06475(class01054 var1) {
      super();
      this.N = var1;
      this.y = var1.N(class01065.field_63850, null);
      this.L = this.y.N();
   }

   @Override
   public boolean N(int var1, float var2, class01028 var3) {
      this.y.N(class00937.field_62009, 0, var1, this.L.y(var2), var3);
      return false;
   }

   @Override
   public void N(int var1, int var2, int var3, int var4, float var5, class03054 var6) {
      int i = class02566.N(var5, var6.i());
      this.N.N(var1, var2, var3, var4, i);
   }

   @Override
   public void N(int var1, int var2, boolean var3, class03054 var4, class03050 var5) {
   }

   @Override
   public void N(int var1, int var2, int var3, int var4, int var5) {
      this.N.N(var1, var2, var3, var4, var5);
   }

   @Override
   public void N(Consumer<Matrix3x2f> var1) {
      var1.accept(this.N.i());
      this.L = this.L.N(new Matrix3x2f(this.N.i()));
   }
}
