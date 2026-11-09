package minecraft;

import org.jspecify.annotations.Nullable;

public class class02220 {
   public static final int N = 20;
   private long y;
   @Nullable
   private class03556<class02206> L;
   private final class07209 u;
   private final class02250 i;

   public long L() {
      return this.y;
   }

   public class02220(class02250 var1, class07209 var2) {
      super();
      this.i = var1;
      this.u = var2;
   }

   private boolean u() {
      return this.y % 20L == 0L;
   }

   public void y(class07284 var1, @Nullable class00500 var2) {
      if (this.L != null) {
         if (this.L.N().N(this.y)) {
            this.N(var1, var2);
         } else {
            if (this.u()) {
               var1.N(class01194.g, this.u, class01164.N(var2));
               N(var1, this.u);
            }

            this.y++;
         }
      }
   }

   @Nullable
   public class02206 y() {
      return this.L == null ? null : this.L.N();
   }

   private static void N(class07284 var0, class07209 var1) {
      if (var0 instanceof class04782 class04782) {
         class06889 class06889 = class06889.L(var1).y(0.0, 1.2F, 0.0);
         float f = var0.method_8409().y(4) / 24.0F;
         class04782.method_65096(class07107.Ni, class06889.N(), class06889.y(), class06889.L(), 0, f, 0.0, 0.0, 1.0);
      }
   }

   public void N(class07284 var1, @Nullable class00500 var2) {
      if (this.L != null) {
         this.L = null;
         this.y = 0L;
         var1.N(class01194.I, this.u, class01164.N(var2));
         var1.N(1011, this.u, 0);
         this.i.notifyChange();
      }
   }

   public void N(class07284 var1, class03556<class02206> var2) {
      this.L = var2;
      this.y = 0L;
      int ix = var1.method_30349().L(class04227.yz).N(this.L.N());
      var1.method_8444(null, 1010, this.u, ix);
      this.i.notifyChange();
   }

   public void N(class03556<class02206> var1, long var2) {
      if (!((class02206)var1.N()).N(var2)) {
         this.L = var1;
         this.y = var2;
      }
   }

   public boolean N() {
      return this.L != null;
   }
}
