package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Optional;

public class class08163 extends class05765<class07633> {
   private final int N;
   private final class01328 y;
   private final float L;
   private final float u;
   private final double i;
   private final double R;
   private final class04891 Z;
   private class06889 z;
   private class06889 U;

   protected void L(class04782 var1, class07633 var2, long var3) {
      class07438 class07438x = var2.method_18868().L(class05378.s).orElseThrow();
      var2.N(class07438x, 360.0F, 360.0F);
      var2.method_18799(this.z);
      ArrayList arraylist = new ArrayList(1);
      var1.method_47575(class01128.N(class07438.class), var2.method_5829(), var3x -> this.y.N(var1, var2, var3x), arraylist, 1);
      if (!arraylist.isEmpty()) {
         class07438 class07438x = (class07438)arraylist.get(0);
         if (var2.method_5626(class07438x)) {
            return;
         }

         this.N(var1, var2, class07438x);
         this.N(var2, class07438x);
         this.u(var1, var2, var3);
      }
   }

   public class08163(int var1, class01328 var2, float var3, float var4, double var5, double var7, class04891 var9) {
      super(ImmutableMap.of(class05378.NR, class05367.field_18457, class05378.s, class05367.field_18456));
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.R = var5;
      this.i = var7;
      this.Z = var9;
      this.z = class06889.L;
      this.U = class06889.L;
   }

   protected void u(class04782 var1, class07633 var2, long var3) {
      var2.method_18868().N(class05378.NR, this.N);
      var2.method_18868().y(class05378.s);
   }

   protected void y(class04782 var1, class07633 var2, long var3) {
      class01289<?> class01289 = var2.method_18868();
      this.U = var2.method_73189();
      class06889 class06889 = class01289.L(class05378.s).get().method_73189().u(var2.method_73189()).u();
      this.z = class06889.L((double)this.L);
      if (this.N(var1, var2, var3)) {
         var2.method_43077(this.Z);
      }
   }

   protected boolean N(class04782 var1, class07633 var2) {
      return var2.method_18868().N(class05378.s);
   }

   protected boolean N(class04782 var1, class07633 var2, long var3) {
      class01289<?> class01289 = var2.method_18868();
      Optional<class07438> optional = class01289.L(class05378.s);
      if (optional.isEmpty()) {
         return false;
      } else {
         class07438 class07438 = optional.get();
         if (var2 instanceof class07453 && ((class07453)var2).NQ()) {
            return false;
         } else if (var2.method_73189().u(this.U).B() >= this.R * this.R) {
            return false;
         } else if (class07438.method_73189().u(var2.method_73189()).B() >= this.i * this.i) {
            return false;
         } else {
            return !var2.method_6057(class07438) ? false : !class01289.N(class05378.NR);
         }
      }
   }

   private void N(class04782 var1, class07633 var2, class07438 var3) {
      class07072 class07072 = var1.method_48963().y((class07438)var2);
      float f = (float)var2.method_45325(class05298.u);
      if (var3.method_64397(var1, class07072, f)) {
         class07323.N(var1, (class07049)var3, class07072);
      }
   }

   private void N(class07633 var1, class07438 var2) {
      int ix = var1.method_6059(class07047.N) ? var1.method_6112(class07047.N).i() + 1 : 0;
      int j = var1.method_6059(class07047.y) ? var1.method_6112(class07047.y).i() + 1 : 0;
      float f = 0.25F * (ix - j);
      float f1 = class04995.N(this.L * (float)var1.method_45325(class05298.l), 0.2F, 2.0F) + f;
      var1.method_75122(var2, f1 * this.u, var1.method_18798());
   }
}
