package minecraft;

import java.util.List;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class class04683 implements class04680 {
   private static final class01894 i = class01894.y("toast/advancement");
   public static final int N = 5000;
   private final class03711 R;
   private class04650 M = class04650.field_2209;

   public class04683(class03711 var1) {
      super();
      this.R = var1;
   }

   private boolean B() {
      Optional<class06513> optional = this.R.y().L();
      return optional.isPresent() && optional.get().i().equals(class07296.field_1250);
   }

   @Override
   public class04650 i() {
      return this.M;
   }

   @Override
   public void N(class01054 var1, class01590 var2, long var3) {
      class06513 class06513 = this.R.y().L().orElse(null);
      var1.N(class08394.Na, i, 0, 0, this.L(), this.u());
      if (class06513 != null) {
         List<class01028> list = var2.L(class06513.N(), 125);
         int ix = class06513.i() == class07296.field_1250 ? -30465 : -256;
         if (list.size() == 1) {
            var1.N(var2, class06513.i().y(), 30, 7, ix, false);
            var1.N(var2, list.get(0), 30, 18, -1, false);
         } else {
            short short1 = 1500;
            float f = 300.0F;
            if (var3 < 1500L) {
               int j = class04995.y(class04995.N((float)(1500L - var3) / 300.0F, 0.0F, 1.0F) * 255.0F);
               var1.N(var2, class06513.i().y(), 30, 11, class02566.R(j, ix), false);
            } else {
               int l = class04995.y(class04995.N((float)(var3 - 1500L) / 300.0F, 0.0F, 1.0F) * 252.0F);
               int k = this.u() / 2 - list.size() * 9 / 2;

               for (class01028 class01028 : list) {
                  var1.N(var2, class01028, 30, k, class02566.Z(l), false);
                  k += 9;
               }
            }
         }

         var1.y(class06513.L(), 8, 8);
      }
   }

   @Override
   public void N(class06086 var1, long var2) {
      if (this.R.y().L().orElse(null) == null) {
         this.M = class04650.field_2209;
      } else {
         this.M = var2 >= 5000.0 * var1.R() ? class04650.field_2209 : class04650.field_2210;
      }
   }

   @Nullable
   @Override
   public class04891 I_() {
      return this.B() ? class04909.Oa : null;
   }
}
