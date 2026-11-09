package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class class00399 extends class07000 {
   public static final MapCodec<class00399> y = y(class00399::new);
   @Nullable
   private static class06649 R;
   @Nullable
   private static class06649 M;

   private static class06649 L() {
      if (R == null) {
         R = class06684.N()
            .N("^^^", "###", "~#~")
            .N('#', var0 -> var0.N().N(class01210.Nf))
            .N('^', class06646.N(class06670.N(class00869.Bl).or(class06670.N(class00869.Bd))))
            .N('~', var0 -> var0.N().P())
            .y();
      }

      return R;
   }

   public class00399(class01362 var1) {
      super(class07032.field_11513, var1);
   }

   private static class06649 u() {
      if (M == null) {
         M = class06684.N().N("   ", "###", "~#~").N('#', var0 -> var0.N().N(class01210.Nf)).N('~', var0 -> var0.N().P()).y();
      }

      return M;
   }

   public static boolean y(class07299 var0, class07209 var1, class06584 var2) {
      return var2.N(class06570.Gd) && var1.method_10264() >= var0.method_31607() + 2 && var0.y() != class07086.field_5801 && !var0.method_8608()
         ? u().N(var0, var1) != null
         : false;
   }

   @Override
   public void N(class07299 var1, class07209 var2, class00500 var3, @Nullable class07438 var4, class06584 var5) {
      N(var1, var2);
   }

   @Override
   public MapCodec<class00399> N() {
      return y;
   }

   public static void N(class07299 var0, class07209 var1) {
      if (var0.method_8321(var1) instanceof class07237 class07237) {
         N(var0, var1, class07237);
      }
   }

   public static void N(class07299 var0, class07209 var1, class07237 var2) {
      if (!var0.method_8608()) {
         class00500 class00500 = var2.w();
         if ((class00500.N(class00869.Bl) || class00500.N(class00869.Bd)) && var1.method_10264() >= var0.method_31607() && var0.y() != class07086.field_5801) {
            class06653 class06653 = L().N(var0, var1);
            if (class06653 != null) {
               class00680 class00680 = class07078.yF.N(var0, class06113.field_16461);
               if (class00680 != null) {
                  class00885.N(var0, class06653);
                  class07209 class07209 = class06653.N(1, 2, 0).u();
                  class00680.method_5808(
                     class07209.method_10263() + 0.5,
                     class07209.method_10264() + 0.55,
                     class07209.method_10260() + 0.5,
                     class06653.y().z() == class07185.field_11048 ? 0.0F : 90.0F,
                     0.0F
                  );
                  class00680.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = class06653.y().z() == class07185.field_11048 ? 0.0F : 90.0F;
                  class00680.M();

                  for (class04770 class04770 : var0.N(class04770.class, class00680.method_5829().M(50.0))) {
                     class06912.P.N(class04770, class00680);
                  }

                  var0.method_8649(class00680);
                  class00885.y(var0, class06653);
               }
            }
         }
      }
   }
}
