package minecraft;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

public class class03635<E extends class07438 & class04391> extends class05765<E> {
   private static final int N = 3;
   private static final int y = 60;
   private final Function<class07438, Optional<class05779>> L;
   private final float u;

   @Override
   protected void L(class04782 var1, E var2, long var3) {
      Optional<class05779> optional = this.L.apply(var2);
      if (!optional.isEmpty()) {
         class05779 class05779 = optional.get();
         if (class05779.N().R(var2.method_33571()) < 3.0) {
            class06584 class06584 = ((class04391)var2).n().method_5434(0, 1);
            if (!class06584.R()) {
               N(var2, class06584, N(class05779));
               if (var2 instanceof class03630) {
                  class03645.N((class07438)((class03630)var2)).ifPresent(var3x -> this.N(class05779, class06584, var3x));
               }

               var2.method_18868().N(class05378.yN, 60);
            }
         }
      }
   }

   public class03635(Function<class07438, Optional<class05779>> var1, float var2, int var3) {
      super(Map.of(class05378.P, class05367.field_18458, class05378.m, class05367.field_18458, class05378.yN, class05367.field_18458), var3);
      this.L = var1;
      this.u = var2;
   }

   @Override
   protected void u(class04782 var1, E var2, long var3) {
      this.L.apply(var2).ifPresent(var2x -> class06293.N(var2, var2x, this.u, 3));
   }

   private boolean y(E var1) {
      return ((class04391)var1).n().method_5442() ? false : this.L.apply(var1).isPresent();
   }

   private static class06889 N(class05779 var0) {
      return var0.N().y(0.0, 1.0, 0.0);
   }

   public static void N(class07438 var0, class06584 var1, class06889 var2) {
      class06889 class06889 = new class06889(0.2F, 0.3F, 0.2F);
      class06293.N(var0, var1, var2, class06889, 0.2F);
      class07299 class07299 = var0.method_73183();
      if (class07299.N() % 7L == 0L && class07299.field_9229.U() < 0.9) {
         float f = class07536.<Float>N_77(class03630.u, class07299.method_8409());
         class07299.method_43129(null, var0, class04909.M, class04911.field_15254, 1.0F, f);
      }
   }

   private void N(class05779 var1, class06584 var2, class04770 var3) {
      class07209 class07209 = var1.y().method_10074();
      class06912.NL.N(var3, class07209, var2);
   }

   @Override
   protected boolean N(class04782 var1, E var2, long var3) {
      return this.y((E)var2);
   }

   @Override
   protected boolean N(class04782 var1, E var2) {
      return this.y((E)var2);
   }
}
