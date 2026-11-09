package minecraft;

import java.util.function.Consumer;
import org.joml.Matrix3x2f;

class class06477 implements class06465 {
   private final class00580 N;

   public class06477(class00580 var1) {
      super();
      this.N = var1;
   }

   @Override
   public boolean N(int var1, float var2, class01028 var3) {
      this.N.N(class00937.field_62009, 0, var1, var3);
      return false;
   }

   @Override
   public void N(int var1, int var2, int var3, int var4, float var5, class03054 var6) {
   }

   @Override
   public void N(int var1, int var2, boolean var3, class03054 var4, class03050 var5) {
   }

   @Override
   public void N(int var1, int var2, int var3, int var4, int var5) {
   }

   @Override
   public void N(Consumer<Matrix3x2f> var1) {
      class00577 class00577 = this.N.N();
      Matrix3x2f matrix3x2f = new Matrix3x2f(class00577.N());
      var1.accept(matrix3x2f);
      this.N.N(class00577.N(matrix3x2f));
   }
}
