package minecraft;

import Nursultan.class10556;
import java.util.List;
import org.apache.commons.lang3.mutable.MutableInt;

public class class06112 extends class00394 {
   private static final int u = 50;
   private static final int i = 60;
   private static final int R = 60;
   private static final int M = 40;
   private static final int B = 5;
   private static final int Z = 48;
   private static final int m = 32;
   private static final int P = 48;
   private long s;
   public int N;
   public boolean y;
   public class07211 L;
   private List<class07438> T;
   private boolean b;
   private int j;

   public class06112(class07209 var1, class00500 var2) {
      super(class00404.field_16413, var1, var2);
   }

   public static void y(class07299 var0, class07209 var1, class00500 var2, class06112 var3) {
      N(var0, var1, var2, var3, class06112::N);
   }

   private static void y(class07299 var0, class07209 var1, List<class07438> var2) {
      MutableInt mutableint = new MutableInt(16700985);
      int ix = (int)var2.stream().filter(var1x -> var1.method_19769(var1x.method_73189(), 48.0)).count();
      var2.stream()
         .filter(var1x -> N(var1, var1x))
         .forEach(
            var4x -> {
               float f = 1.0F;
               double d0 = Math.sqrt(
                  (var4x.method_23317() - var1.method_10263()) * (var4x.method_23317() - var1.method_10263())
                     + (var4x.method_23321() - var1.method_10260()) * (var4x.method_23321() - var1.method_10260())
               );
               double d1 = var1.method_10263() + 0.5F + 1.0 / d0 * (var4x.method_23317() - var1.method_10263());
               double d2 = var1.method_10260() + 0.5F + 1.0 / d0 * (var4x.method_23321() - var1.method_10260());
               int jx = class04995.N((ix - 21) / -2, 3, 15);

               for (int k = 0; k < jx; k++) {
                  int l = mutableint.addAndGet(5);
                  var0.method_8406(class02329.N(class07107.t, l), d1, var1.method_10264() + 0.5F, d2, 0.0, 0.0, 0.0);
               }
            }
         );
   }

   private static boolean N(class07209 var0, class07438 var1) {
      return var1.method_5805() && !var1.method_31481() && var0.method_19769(var1.method_73189(), 48.0) && var1.method_5864().N(class01217.L);
   }

   private static void N(class07438 var0) {
      var0.method_6092(new class07055(class07047.l, 60));
   }

   @Override
   public boolean N(int var1, int var2) {
      if (var1 == 1) {
         this.N();
         this.j = 0;
         this.L = class07211.N(var2);
         this.N = 0;
         this.y = true;
         return true;
      } else {
         return super.N(var1, var2);
      }
   }

   private static void N(class07299 var0, class07209 var1, List<class07438> var2) {
      var2.stream().filter(var1x -> N(var1, var1x)).forEach(class06112::N);
   }

   public void N(class07211 var1) {
      class07209 class07209 = this.d();
      this.L = var1;
      if (this.y) {
         this.N = 0;
      } else {
         this.y = true;
      }

      this.z.method_8427(class07209, this.w().i(), 1, var1.L());
   }

   private void N() {
      class07209 class07209 = this.d();
      if (this.z.N() > this.s + 60L || this.T == null) {
         this.s = this.z.N();
         class00734 var2 = new class00734(class07209).M(48.0);
         this.T = this.z.N(class07438.class, var2);
      }

      if (!this.z.method_8608()) {
         for (class07438 class07438 : this.T) {
            if (class07438.method_5805() && !class07438.method_31481() && class07209.method_19769(class07438.method_73189(), 32.0)) {
               class07438.method_18868().N(class05378.g, this.z.N());
            }
         }
      }
   }

   private static boolean N(class07209 var0, List<class07438> var1) {
      for (class07438 class07438 : var1) {
         if (class07438.method_5805()
            && !class07438.method_31481()
            && var0.method_19769(class07438.method_73189(), 32.0)
            && class07438.method_5864().N(class01217.L)) {
            return true;
         }
      }

      return false;
   }

   private static void N(class07299 var0, class07209 var1, class00500 var2, class06112 var3, class10556 var4) {
      if (var3.y) {
         var3.N++;
      }

      if (var3.N >= 50) {
         var3.y = false;
         var3.N = 0;
      }

      if (var3.N >= 5 && var3.j == 0 && N(var1, var3.T)) {
         var3.b = true;
         var0.method_8396(null, var1, class04909.LW, class04911.field_15245, 1.0F, 1.0F);
      }

      if (var3.b) {
         if (var3.j < 40) {
            var3.j++;
         } else {
            var4.run(var0, var1, var3.T);
            var3.b = false;
         }
      }
   }

   public static void N(class07299 var0, class07209 var1, class00500 var2, class06112 var3) {
      N(var0, var1, var2, var3, class06112::y);
   }
}
