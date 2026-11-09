package minecraft;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class class01334 extends class05765<class08041> {
   private static final int N = 80;
   private long y;
   private long L;
   private int u;
   private Optional<class07209> i = Optional.empty();

   protected void L(class04782 var1, class08041 var2, long var3) {
      var2.method_5673(class07085.field_6173, class06584.E);
      this.L = var2.field_6012;
   }

   public class01334() {
      super(ImmutableMap.of(class05378.P, class05367.field_18457, class05378.m, class05367.field_18457));
   }

   protected void u(class04782 var1, class08041 var2, long var3) {
      class07209 class07209 = this.i.get();
      if (var3 >= this.y && class07209.method_19769(var2.method_73189(), 1.0)) {
         class06584 class06584x = class06584.E;
         class07075 class07075 = var2.n();
         int ix = class07075.method_5439();

         for (int j = 0; j < ix; j++) {
            class06584 class06584x = class07075.method_5438(j);
            if (class06584x.N(class06570.vQ)) {
               class06584x = class06584x;
               break;
            }
         }

         if (!class06584x.R() && class06944.N(class06584x, var1, class07209)) {
            var1.N(1505, class07209, 15);
            this.i = this.y(var1, var2);
            this.N(var2);
            this.y = var3 + 40L;
         }

         this.u++;
      }
   }

   private Optional<class07209> y(class04782 var1, class08041 var2) {
      class07218 class07218 = new class07218();
      Optional optional = Optional.empty();
      int ix = 0;

      for (int j = -1; j <= 1; j++) {
         for (int k = -1; k <= 1; k++) {
            for (int l = -1; l <= 1; l++) {
               class07218.N(var2.method_24515(), j, k, l);
               if (this.N(class07218, var1)) {
                  if (var1.field_9229.y(++ix) == 0) {
                     optional = Optional.of(class07218.method_10062());
                  }
               }
            }
         }
      }

      return optional;
   }

   protected void y(class04782 var1, class08041 var2, long var3) {
      this.N(var2);
      var2.method_5673(class07085.field_6173, new class06584(class06570.vQ));
      this.y = var3;
      this.u = 0;
   }

   protected boolean N(class04782 var1, class08041 var2) {
      if (var2.field_6012 % 10 == 0 && (this.L == 0L || this.L + 160L <= var2.field_6012)) {
         if (var2.n().N_61(class06570.vQ) <= 0) {
            return false;
         } else {
            this.i = this.y(var1, var2);
            return this.i.isPresent();
         }
      } else {
         return false;
      }
   }

   private boolean N(class07209 var1, class04782 var2) {
      class00500 class00500 = var2.method_8320(var1);
      class00891 class00891 = class00500.i();
      return class00891 instanceof class06772 && !((class06772)class00891).E(class00500);
   }

   private void N(class08041 var1) {
      this.i.ifPresent(var1x -> {
         class05744 class05744 = new class05744(var1x);
         var1.method_18868().N(class05378.P, class05744);
         var1.method_18868().N(class05378.m, new class05352(class05744, 0.5F, 1));
      });
   }

   protected boolean N(class04782 var1, class08041 var2, long var3) {
      return this.u < 80 && this.i.isPresent();
   }
}
