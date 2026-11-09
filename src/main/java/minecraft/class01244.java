package minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

class class01244 implements class01262 {
   private final class00502 N;
   private final Supplier<class01631> y;
   private final List<class03458> L;

   private class01244(class00502 var1, List<class03458> var2, Supplier<class01631> var3) {
      super();
      this.N = var1;
      this.L = var2;
      this.y = var3;
   }

   @Override
   public void N(class01054 var1, float var2, float var3) {
      Integer integer = this.N.P().i();
      if (integer != null) {
         float f = (integer >> 16 & 0xFF) / 255.0F;
         float f1 = (integer >> 8 & 0xFF) / 255.0F;
         float f2 = (integer & 0xFF) / 255.0F;
         var1.N(1, 1, 15, 15, class02566.N(var3, f * var2, f1 * var2, f2 * var2));
      }

      class03933.N(var1, this.y.get(), 2, 2, 12, class02566.N(var3, var2, var2, var2));
   }

   @Override
   public void N(class05973 var1) {
      var1.N(new class01264(this.L));
   }

   public static Optional<class01262> N(class06202 var0, class00502 var1) {
      ArrayList arraylist = new ArrayList();

      for (String s : var1.B()) {
         class03458 class03458x = var0.NE().N(s);
         if (class03458x != null && class03458x.i() != class07282.field_9219) {
            arraylist.add(class03458x);
         }
      }

      if (arraylist.isEmpty()) {
         return Optional.empty();
      } else {
         class03458 class03458 = (class03458)arraylist.get(class06069.u().y(arraylist.size()));
         return Optional.of(new class01244(var1, arraylist, class03458::M));
      }
   }

   @Override
   public class00392 aw_() {
      return this.N.u();
   }

   @Override
   public boolean ax_() {
      return true;
   }
}
