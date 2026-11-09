package minecraft;

import it.unimi.dsi.fastutil.longs.LongOpenHashSet;

public class class01867 implements class01857 {
   private final class06202 N;
   private final boolean y;
   private final boolean L;
   private static final int u = 10;

   public class01867(class06202 var1, boolean var2, boolean var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   @Override
   public void N(double var1, double var3, double var5, class00457 var7, class01383 var8, float var9) {
      class03448 class03448 = (class03448)this.N.T_3;
      class07209 class07209x = class07209.method_49637(var1, var3, var5);
      LongOpenHashSet longopenhashset = new LongOpenHashSet();

      for (class07209 class07209x : class07209.method_10097(class07209x.method_10069(-10, -10, -10), class07209x.method_10069(10, 10, 10))) {
         int i = class03448.method_8314(class00772.field_9284, class07209x);
         long j = class01296.i(class07209x.method_10063());
         if (longopenhashset.add(j)) {
            class06724.N(
               class03448.method_8398().L().N(class00772.field_9284, class01296.N(j)),
               new class06889(class01296.N(class01296.y(j), 8), class01296.N(class01296.L(j), 8), class01296.N(class01296.u(j), 8)),
               class06715.N(-65536).N(4.8F)
            );
         }

         if (i != 15 && this.L) {
            int k = class02566.N(i / 15.0F, -16776961, -16711681);
            class06724.N(String.valueOf(i), class06889.N(class07209x, 0.5, 0.25, 0.5), class06715.N(k));
         }

         if (this.y) {
            int i1 = class03448.method_8314(class00772.field_9282, class07209x);
            if (i1 != 0) {
               int l = class02566.N(i1 / 15.0F, -5636096, -256);
               class06724.N(String.valueOf(class03448.method_8314(class00772.field_9282, class07209x)), class06889.y(class07209x), class06715.N(l));
            }
         }
      }
   }
}
