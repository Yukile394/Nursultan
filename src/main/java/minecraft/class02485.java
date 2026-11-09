package minecraft;

import java.util.List;
import java.util.function.Predicate;
import org.jspecify.annotations.Nullable;

public class class02485 extends class06581 {
   private static final int L = 5;
   private static final float m = -3.4F;
   public static final float N = 1.5F;
   private static final float P = 5.0F;
   public static final float y = 3.5F;
   private static final float s = 0.7F;

   public class02485(class06573 var1) {
      super(var1);
   }

   @Override
   public void y(class06584 var1, class07438 var2, class07438 var3) {
      if (y(var3)) {
         var3.method_38785();
      }
   }

   public static boolean y(class07438 var0) {
      return var0.field_6017 > 1.5 && !var0.method_6128();
   }

   public static class02197 y() {
      return new class02197(List.of(), 1.0F, 2, false);
   }

   private static void N(class07299 var0, class07049 var1, class07049 var2) {
      var0.N(2013, var2.method_23312(), 750);
      var0.N(class07438.class, var2.method_5829().M(3.5), N(var1, var2)).forEach(var2x -> {
         class06889 class06889x = var2x.method_73189().u(var2.method_73189());
         double d0 = N(var1, var2x, class06889x);
         class06889 class06889x = class06889x.u().L(d0);
         if (d0 > 0.0) {
            var2x.method_5762(class06889x.M, 0.7F, class06889x.Z);
            if (var2x instanceof class04770 class04770) {
               class04770.field_13987.method_14364(new class06652(class04770));
            }
         }
      });
   }

   public static class02833 N() {
      return class02833.N()
         .N(class05298.u, new class07471(M, 5.0, class07463.field_6328), class02834.field_49217)
         .N(class05298.R, new class07471(B, -3.4F, class07463.field_6328), class02834.field_49217)
         .N();
   }

   private static double N(class07049 var0, class07438 var1, class06889 var2) {
      return (3.5 - var2.M()) * 0.7F * (var0.field_6017 > 5.0 ? 2 : 1) * (1.0 - var1.method_45325(class05298.b));
   }

   @Nullable
   @Override
   public class07072 N(class07438 var1) {
      return y(var1) ? var1.method_48923().R(var1) : super.N(var1);
   }

   private class06889 N(class04770 var1) {
      return var1.method_61165()
            && var1.fields_57fa3311b0e9d3e9b883d09222919bf5a_4 != null
            && var1.fields_57fa3311b0e9d3e9b883d09222919bf5a_4.B <= var1.method_73189().B
         ? var1.fields_57fa3311b0e9d3e9b883d09222919bf5a_4
         : var1.method_73189();
   }

   @Override
   public void N(class06584 var1, class07438 var2, class07438 var3) {
      if (y(var3)) {
         class04782 class04782 = (class04782)var3.method_73183();
         var3.method_18799(var3.method_18798().N(class07185.field_11052, 0.01F));
         if (var3 instanceof class04770 class04770x) {
            class04770x.fields_57fa3311b0e9d3e9b883d09222919bf5a_4 = this.N(class04770x);
            class04770x.method_60984(true);
            class04770x.field_13987.method_14364(new class06652(class04770x));
         }

         if (var2.method_24828()) {
            if (var3 instanceof class04770 class04770) {
               class04770.method_58143(true);
            }

            class04891 class04891 = var3.field_6017 > 5.0 ? class04909.Tg : class04909.TO;
            class04782.method_43128(null, var3.method_23317(), var3.method_23318(), var3.method_23321(), class04891, var3.method_5634(), 1.0F, 1.0F);
         } else {
            class04782.method_43128(null, var3.method_23317(), var3.method_23318(), var3.method_23321(), class04909.TQ, var3.method_5634(), 1.0F, 1.0F);
         }

         N(class04782, var3, var2);
      }
   }

   @Override
   public float N(class07049 var1, float var2, class07072 var3) {
      if (var3.L() instanceof class07438 class07438) {
         if (!y(class07438)) {
            return 0.0F;
         } else {
            double d3 = 3.0;
            double d0 = 8.0;
            double d1 = class07438.field_6017;
            double d2;
            if (d1 <= 3.0) {
               d2 = 4.0 * d1;
            } else if (d1 <= 8.0) {
               d2 = 12.0 + 2.0 * (d1 - 3.0);
            } else {
               d2 = 22.0 + d1 - 8.0;
            }

            return class07438.method_73183() instanceof class04782 class04782
               ? (float)(d2 + class07323.y(class04782, class07438.method_59958(), var1, var3, 0.0F) * d1)
               : (float)d2;
         }
      } else {
         return 0.0F;
      }
   }

   private static Predicate<class07438> N(class07049 var0, class07049 var1) {
      return var2 -> {
         boolean flag = !var2.method_7325();
         boolean flag1 = var2 != var0 && var2 != var1;
         boolean flag2 = !var0.method_5722(var2);
         boolean flag3 = !(var2 instanceof class07453 class07453 && var1 instanceof class07438 class07438 && class07453.NQ() && class07453.L(class07438));
         boolean flag5 = !(var2 instanceof class00681 class00681 && class00681.i());
         boolean flag6 = var1.method_5858(var2) <= Math.pow(3.5, 2.0);
         boolean flag4 = !(var2 instanceof class08036 class08036 && class08036.method_68878() && class08036.method_31549().y);
         return flag && flag1 && flag2 && flag3 && flag5 && flag6 && flag4;
      };
   }
}
