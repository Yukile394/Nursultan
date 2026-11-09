package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Set;
import java.util.stream.Collectors;

public class class05759 extends class05765<class08041> {
   private Set<class06581> N = ImmutableSet.of();

   protected void L(class04782 var1, class08041 var2, long var3) {
      class08041 class08041 = (class08041)var2.method_18868().L(class05378.b).get();
      if (!(var2.method_5858(class08041) > 5.0)) {
         class06293.N(var2, class08041, 0.5F, 2);
         var2.N(var1, class08041, var3);
         boolean flag = var2.t().y().N(class05672.M);
         if (var2.w() && (flag || class08041.Y())) {
            N(var2, class08041.y.keySet(), class08041);
         }

         if (flag && var2.n().N_61(class06570.bL) > class06570.bL.M() / 2) {
            N(var2, ImmutableSet.of(class06570.bL), class08041);
         }

         if (!this.N.isEmpty() && var2.n().N_13(this.N)) {
            N(var2, this.N, class08041);
         }
      }
   }

   public class05759() {
      super(ImmutableMap.of(class05378.b, class05367.field_18456, class05378.B, class05367.field_18456));
   }

   protected void u(class04782 var1, class08041 var2, long var3) {
      var2.method_18868().y(class05378.b);
   }

   protected void y(class04782 var1, class08041 var2, long var3) {
      class08041 class08041 = (class08041)var2.method_18868().L(class05378.b).get();
      class06293.N(var2, class08041, 0.5F, 2);
      this.N = N(var2, class08041);
   }

   protected boolean N(class04782 var1, class08041 var2) {
      return class06293.N(var2.method_18868(), class05378.b, class07078.ye);
   }

   protected boolean N(class04782 var1, class08041 var2, long var3) {
      return this.N(var1, var2);
   }

   private static Set<class06581> N(class08041 var0, class08041 var1) {
      ImmutableSet<class06581> immutableset = var1.t().y().N().u();
      ImmutableSet<class06581> immutableset1 = var0.t().y().N().u();
      return immutableset.stream().filter(var1x -> !immutableset1.contains(var1x)).collect(Collectors.toSet());
   }

   private static void N(class08041 var0, Set<class06581> var1, class07438 var2) {
      class07075 class07075 = var0.n();
      class06584 class06584x = class06584.E;
      int i = 0;

      while (i < class07075.method_5439()) {
         class06584 class06584x;
         class06581 class06581;
         int j;
         label28: {
            class06584x = class07075.method_5438(i);
            if (!class06584x.R()) {
               class06581 = class06584x.B();
               if (var1.contains(class06581)) {
                  if (class06584x.c() > class06584x.U() / 2) {
                     j = class06584x.c() / 2;
                     break label28;
                  }

                  if (class06584x.c() > 24) {
                     j = class06584x.c() - 24;
                     break label28;
                  }
               }
            }

            i++;
            continue;
         }

         class06584x.B(j);
         class06584x = new class06584(class06581, j);
         break;
      }

      if (!class06584x.R()) {
         class06293.N(var0, class06584x, var2.method_73189());
      }
   }
}
