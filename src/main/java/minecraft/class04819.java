package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public class class04819 extends class00891 implements class00886 {
   public static final MapCodec<class04819> N = y(class04819::new);
   private static final float y = 0.083333336F;
   private static final float L = 0.9F;
   private static final float u = 1.5F;
   private static final float i = 2.5F;
   private static final class00494 R = class00389.N(0.0, 0.0, 0.0, 1.0, 0.9F, 1.0);
   private static final double M = 4.0;
   private static final double B = 7.0;

   @Override
   protected class00494 L(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      return class00389.N();
   }

   public class04819(class01362 var1) {
      super(var1);
   }

   @Override
   protected boolean y(class00500 var1, class00500 var2, class07211 var3) {
      return var2.N(this) ? true : super.y(var1, var2, var3);
   }

   @Override
   protected class00494 y_4(class00500 var1, class07290 var2, class07209 var3, class06092 var4) {
      if (!var4.i() && var4 instanceof class06093) {
         class07049 class07049 = ((class06093)var4).R();
         if (class07049 != null) {
            if (class07049.field_6017 > 2.5) {
               return R;
            }

            if (class07049 instanceof class00701 || N(class07049) && var4.N(class00389.y(), var3, false) && !var4.L()) {
               return super.y_4(var1, var2, var3, var4);
            }
         }
      }

      return class00389.N();
   }

   @Override
   public class06584 N(@Nullable class07438 var1, class07284 var2, class07209 var3, class00500 var4) {
      var2.method_8652(var3, class00869.N.W(), 11);
      if (!var2.method_8608()) {
         var2.N(2001, var3, class00891.W(var4));
      }

      return new class06584(class06570.jm);
   }

   @Override
   public MapCodec<class04819> N() {
      return N;
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return true;
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class07049 var4, class08400 var5, boolean var6) {
      if (!(var4 instanceof class07438) || var4.method_55667().N(this)) {
         var4.method_5844(var1, new class06889(0.9F, 1.5, 0.9F));
         if (var2.method_8608()) {
            class06069 class06069 = var2.method_8409();
            if ((var4.field_6038 != var4.method_23317() || var4.field_5989 != var4.method_23321()) && class06069.Z()) {
               var2.method_8406(
                  class07107.NX,
                  var4.method_23317(),
                  var3.method_10264() + 1,
                  var4.method_23321(),
                  class04995.y(class06069, -1.0F, 1.0F) * 0.083333336F,
                  0.05F,
                  class04995.y(class06069, -1.0F, 1.0F) * 0.083333336F
               );
            }
         }
      }

      class07209 class07209 = var3.method_10062();
      var5.N(
         class08397.field_56645,
         var2x -> {
            if (var2 instanceof class04782 class04782
               && var2x.method_5809()
               && (class04782.method_64395().N(class07305.I) || var2x instanceof class08036)
               && var2x.method_36971(class04782, class07209)) {
               var2.N(class07209, false);
            }
         }
      );
      var5.N(class08397.field_56642);
      var5.N(class08397.field_56645);
   }

   @Override
   public void N(class07299 var1, class00500 var2, class07209 var3, class07049 var4, double var5) {
      if (!(var5 < 4.0) && var4 instanceof class07438 class07438) {
         class07443 class07443 = class07438.method_39760();
         class04891 class04891 = var5 < 7.0 ? class07443.y() : class07443.N();
         var4.method_5783(class04891, 1.0F, 1.0F);
      }
   }

   @Override
   protected class00494 N(class00500 var1, class07290 var2, class07209 var3, class07049 var4) {
      class00494 class00494 = this.y_4(var1, var2, var3, class06092.N(var4));
      return class00494.method_1110() ? class00389.y() : class00494;
   }

   public static boolean N(class07049 var0) {
      if (var0.method_5864().N(class01217.Z)) {
         return true;
      } else {
         return var0 instanceof class07438 ? ((class07438)var0).method_6118(class07085.field_6166).N(class06570.bB) : false;
      }
   }

   @Override
   public Optional<class04891> s_() {
      return Optional.of(class04909.uw);
   }
}
