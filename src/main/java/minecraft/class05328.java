package minecraft;

import java.util.List;

abstract class class05328 extends class06478 {
   final class00329 N;
   private final boolean L;
   private final List<class05303> u;

   public class05328(int var1, int var2, class00329 var3, boolean var4, List<class05303> var5, List var6) {
      super(var2, var3, 24, 24, class05220.N);
      this.y = var1;
      this.u = var6;
      this.N = var4;
      this.L = var5;
   }

   protected abstract class01894 N(boolean var1);

   protected static class05303 N(int var0, int var1, List<class06584> var2) {
      return new class05303(3 + var0 * 7, 3 + var1 * 7, var2);
   }

   @Override
   public void method_47399(class03428 var1) {
      this.method_37021(var1);
   }

   @Override
   public void method_48579(class01054 var1, int var2, int var3, float var4) {
      var1.N(class08394.Na, this.N(this.L), this.method_46426(), this.method_46427(), this.field_22758, this.field_22759);
      float f = this.method_46426() + 2;
      float f1 = this.method_46427() + 2;

      for (class05303 class05303 : this.u) {
         var1.i().pushMatrix();
         var1.i().translate(f + class05303.N(), f1 + class05303.y());
         var1.i().scale(0.375F, 0.375F);
         var1.i().translate(-8.0F, -8.0F);
         var1.N(class05303.N(this.y.y.currentIndex()), 0, 0);
         var1.i().popMatrix();
      }
   }
}
