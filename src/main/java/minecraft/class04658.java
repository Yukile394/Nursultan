package minecraft;

import java.util.ArrayList;
import java.util.List;

public class class04658 implements class04680 {
   private static final class01894 N = class01894.y("toast/recipe");
   private static final long i = 5000L;
   private static final class00392 R = class00392.L("recipe.toast.title");
   private static final class00392 M = class00392.L("recipe.toast.description");
   private final List<class04666> B = new ArrayList<>();
   private long Z;
   private boolean z;
   private class04650 U = class04650.field_2209;
   private int E;

   private class04658() {
      super();
   }

   @Override
   public class04650 i() {
      return this.U;
   }

   @Override
   public void N(class01054 var1, class01590 var2, long var3) {
      var1.N(class08394.Na, N, 0, 0, this.L(), this.u());
      var1.N(var2, R, 30, 7, -11534256, false);
      var1.N(var2, M, 30, 18, -16777216, false);
      class04666 class04666 = this.B.get(this.E);
      var1.i().pushMatrix();
      var1.i().scale(0.6F, 0.6F);
      var1.y(class04666.N(), 3, 3);
      var1.i().popMatrix();
      var1.y(class04666.y(), 8, 8);
   }

   public static void N(class06086 var0, class00265 var1) {
      class04658 class04658 = var0.N(class04658.class, y);
      if (class04658 == null) {
         class04658 = new class04658();
         var0.N(class04658);
      }

      class00311 class00311 = class00282.N((class03448)var0.i().T_3);
      class06584 class06584x = var1.i().y(class00311);
      class06584 class06584x = var1.u().y(class00311);
      class04658.N(class06584x, class06584x);
   }

   private void N(class06584 var1, class06584 var2) {
      this.B.add(new class04666(var1, var2));
      this.z = true;
   }

   @Override
   public void N(class06086 var1, long var2) {
      if (this.z) {
         this.Z = var2;
         this.z = false;
      }

      if (this.B.isEmpty()) {
         this.U = class04650.field_2209;
      } else {
         this.U = var2 - this.Z >= 5000.0 * var1.R() ? class04650.field_2209 : class04650.field_2210;
      }

      this.E = (int)(var2 / Math.max(1.0, 5000.0 * var1.R() / this.B.size()) % this.B.size());
   }
}
