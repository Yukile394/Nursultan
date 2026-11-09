package minecraft;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import org.jspecify.annotations.Nullable;

public class class04703 extends class05407 {
   private static final class01894 N = class01894.y("icon/unseen_notification");
   private static final class01894 y = class01894.y("icon/news");
   private static final class01894 L = class01894.y("icon/invite");
   private static final class01894 u = class01894.y("icon/trial_available");
   private final CompletableFuture<Boolean> i = class01888.N().thenApply(var0 -> var0.N() == class01880.field_45185);
   private class03374 R;
   @Nullable
   private class04742 M;
   private volatile int B;
   private static boolean Z;
   private static boolean z;
   private static boolean U;
   private final class04742 E = new class04692(this);
   private final class04742 W = new class04716(this);

   private boolean L() {
      return (class05096)this.field_22787.v_3 instanceof class04705;
   }

   public class04703() {
      super(class05153.N);
   }

   private boolean y() {
      return ((class05630)this.field_22787.i_7).NB().method_41753();
   }

   void y(class03400 var1, class03374 var2) {
      var2.N(var1.y, var0 -> {
         U = false;
         Iterator iterator = var0.iterator();

         while (iterator.hasNext()) {
            if (!((class03576)iterator.next()).N()) {
               U = true;
               break;
            }
         }
      });
   }

   private void N(class01054 var1) {
      int ix = this.B;
      byte b0 = 24;
      int j = this.field_22790 / 4 + 48;
      int k = this.field_22789 / 2 + 100;
      int l = j + 48 + 2;
      int i1 = k - 3;
      if (U) {
         var1.N(class08394.Na, N, i1 - 12, l + 3, 10, 10);
         i1 -= 16;
      }

      if (this.M != null && this.M.N()) {
         if (z) {
            var1.N(class08394.Na, y, i1 - 14, l + 1, 14, 14);
            i1 -= 16;
         }

         if (ix != 0) {
            var1.N(class08394.Na, L, i1 - 14, l + 1, 14, 14);
            i1 -= 16;
         }

         if (Z) {
            var1.N(class08394.Na, u, i1 - 10, l + 4, 8, 8);
         }
      }
   }

   @Nullable
   private class04742 N() {
      if (!this.L() || !this.i.getNow(false)) {
         return null;
      } else {
         return this.y() ? this.E : this.W;
      }
   }

   void N(class03400 var1, class03374 var2) {
      var2.N(var1.u, var1x -> this.B = var1x);
      var2.N(var1.i, var0 -> Z = var0);
      var2.N(var1.R, var1x -> {
         var1.B.N(var1x);
         z = var1.B.N();
      });
   }

   @Override
   public void method_25426() {
      if (this.R != null) {
         this.R.N();
      }
   }

   @Override
   public void method_49589() {
      super.method_49589();
      this.field_22787.Nd().y.N();
   }

   @Override
   public void method_25393() {
      class04742 class04742 = this.N();
      if (!Objects.equals(this.M, class04742)) {
         this.M = class04742;
         if (this.M != null) {
            this.R = this.M.N(this.field_22787.Nd());
         } else {
            this.R = null;
         }
      }

      if (this.R != null) {
         this.R.y();
      }
   }

   @Override
   public void method_25420(class01054 var1, int var2, int var3, float var4) {
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      if (this.i.getNow(false)) {
         this.N(var1);
      }
   }
}
