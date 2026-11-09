package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class06288 extends class05765<class08041> {
   private static final int y = 200;
   public static final float N = 0.5F;
   @Nullable
   private class07209 L;
   private long u;
   private int i;
   private final List<class07209> R = Lists.newArrayList();

   protected void L(class04782 var1, class08041 var2, long var3) {
      if (this.L == null || this.L.method_19769(var2.method_73189(), 1.0)) {
         if (this.L != null && var3 > this.u) {
            class00500 class00500x = var1.method_8320(this.L);
            class00891 class00891x = class00500x.i();
            class00891 class00891x = var1.method_8320(this.L.method_10074()).i();
            if (class00891x instanceof class06772 && ((class06772)class00891x).E(class00500x)) {
               var1.N(this.L, true, var2);
            }

            if (class00500x.P() && class00891x instanceof class07208 && var2.Q()) {
               class07075 class07075 = var2.n();

               for (int ix = 0; ix < class07075.method_5439(); ix++) {
                  class06584 class06584 = class07075.method_5438(ix);
                  boolean flag = false;
                  if (!class06584.R() && class06584.N(class01226.LB)) {
                     class06581 class06581 = class06584.B();
                     if (class06581 instanceof class06918) {
                        class00500 class00500x = ((class06918)class06581).L().W();
                        var1.method_8501(this.L, class00500x);
                        var1.N(class01194.Z, this.L, class01164.N(var2, class00500x));
                        flag = true;
                     }
                  }

                  if (flag) {
                     var1.method_43128(
                        null, this.L.method_10263(), this.L.method_10264(), this.L.method_10260(), class04909.BV, class04911.field_15245, 1.0F, 1.0F
                     );
                     class06584.B(1);
                     if (class06584.R()) {
                        class07075.method_5447(ix, class06584.E);
                     }
                     break;
                  }
               }
            }

            if (class00891x instanceof class06772 && !((class06772)class00891x).E(class00500x)) {
               this.R.remove(this.L);
               this.L = this.N(var1);
               if (this.L != null) {
                  this.u = var3 + 20L;
                  var2.method_18868().N(class05378.m, new class05352(new class05744(this.L), 0.5F, 1));
                  var2.method_18868().N(class05378.P, new class05744(this.L));
               }
            }
         }

         this.i++;
      }
   }

   public class06288() {
      super(ImmutableMap.of(class05378.P, class05367.field_18457, class05378.m, class05367.field_18457, class05378.R, class05367.field_18456));
   }

   protected boolean u(class04782 var1, class08041 var2, long var3) {
      return this.i < 200;
   }

   protected void y(class04782 var1, class08041 var2, long var3) {
      var2.method_18868().y(class05378.P);
      var2.method_18868().y(class05378.m);
      this.i = 0;
      this.u = var3 + 40L;
   }

   protected boolean N(class04782 var1, class08041 var2) {
      if (!var1.method_64395().N(class07305.I)) {
         return false;
      } else if (!var2.t().y().N(class05672.M)) {
         return false;
      } else {
         class07218 class07218 = var2.method_24515().method_25503();
         this.R.clear();

         for (int ix = -1; ix <= 1; ix++) {
            for (int j = -1; j <= 1; j++) {
               for (int k = -1; k <= 1; k++) {
                  class07218.N(var2.method_23317() + ix, var2.method_23318() + j, var2.method_23321() + k);
                  if (this.N(class07218, var1)) {
                     this.R.add(new class07209(class07218));
                  }
               }
            }
         }

         this.L = this.N(var1);
         return this.L != null;
      }
   }

   private boolean N(class07209 var1, class04782 var2) {
      class00500 class00500 = var2.method_8320(var1);
      class00891 class00891x = class00500.i();
      class00891 class00891x = var2.method_8320(var1.method_10074()).i();
      return class00891x instanceof class06772 && ((class06772)class00891x).E(class00500) || class00500.P() && class00891x instanceof class07208;
   }

   @Nullable
   private class07209 N(class04782 var1) {
      return this.R.isEmpty() ? null : this.R.get(var1.method_8409().y(this.R.size()));
   }

   protected void N(class04782 var1, class08041 var2, long var3) {
      if (var3 > this.u && this.L != null) {
         var2.method_18868().N(class05378.P, new class05744(this.L));
         var2.method_18868().N(class05378.m, new class05352(new class05744(this.L), 0.5F, 1));
      }
   }
}
