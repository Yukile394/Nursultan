package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.OptionalInt;
import org.jspecify.annotations.Nullable;

public class class03769 extends class07796 implements class08990 {
   public static final MapCodec<class03769> N = y(class03769::new);
   public static final class08064<class07211> y = class07101.R;
   public static final class06667 L = class06665.yn;
   public static final class06667 u = class06665.yt;
   public static final class06667 i = class06665.yG;
   public static final class06667 R = class06665.yl;
   public static final class06667 M = class06665.yd;
   public static final class06667 B = class06665.yw;
   private static final int O = 6;
   private static final int F = 3;
   public static final List<class06667> Z = List.of(L, u, i, R, M, B);

   @Override
   public int L() {
      return 3;
   }

   public class03769(class01362 var1) {
      super(var1);
      class00500 class00500 = this.Q.y().y(y, class07211.field_11043);

      for (class06667 class06667 : Z) {
         class00500 = class00500.y(class06667, false);
      }

      this.P(class00500);
   }

   @Override
   public int y() {
      return 2;
   }

   @Override
   protected boolean N(class00500 var1) {
      return true;
   }

   @Override
   public class00500 N(class00500 var1, class07111 var2) {
      return var1.N(var2.N(var1.L(y)));
   }

   @Override
   public class00500 N(class00500 var1, class06993 var2) {
      return var1.y(y, var2.N(var1.L(y)));
   }

   @Override
   public class00500 N(class06942 var1) {
      return this.W().y(y, var1.method_8042().b());
   }

   @Override
   protected int N_24(class00500 var1, class07299 var2, class07209 var3, class07211 var4) {
      if (var2.method_8608()) {
         return 0;
      } else {
         class00394 class00394 = var2.method_8321(var3);
         return class00394 instanceof class03773 ? ((class03773)class00394).L() + 1 : 0;
      }
   }

   @Override
   public MapCodec<class03769> N() {
      return N;
   }

   private static void N(class07299 var0, class07209 var1, class08036 var2, class03773 var3, int var4) {
      if (!var0.method_8608()) {
         class06584 class06584 = var3.method_5434(var4, 1);
         class04891 class04891 = class06584.N(class06570.Gq) ? class04909.Rg : class04909.RO;
         var0.method_8396(null, var1, class04891, class04911.field_15245, 1.0F, 1.0F);
         if (!var2.method_31548().M(class06584)) {
            var2.method_7328(class06584, false);
         }

         var0.N(var2, class01194.L, var1);
      }
   }

   private static void N(class07299 var0, class07209 var1, class08036 var2, class03773 var3, class06584 var4, int var5) {
      if (!var0.method_8608()) {
         var2.method_7259(class01235.L.y(var4.B()));
         class04891 class04891 = var4.N(class06570.Gq) ? class04909.RY : class04909.Rk;
         var3.method_5447(var5, var4.y(1, var2));
         var0.method_8396(null, var1, class04891, class04911.field_15245, 1.0F, 1.0F);
      }
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      if (var2.method_8321(var3) instanceof class03773 class03773) {
         OptionalInt optionalint = this.N(var5, var1.L(y));
         if (optionalint.isEmpty()) {
            return class07082.i;
         } else if (!var1.L(Z.get(optionalint.getAsInt()))) {
            return class07082.L;
         } else {
            N(var2, var3, var4, class03773, optionalint.getAsInt());
            return class07082.N;
         }
      } else {
         return class07082.i;
      }
   }

   @Override
   protected class07082 N(class06584 var1, class00500 var2, class07299 var3, class07209 var4, class08036 var5, class07050 var6, class06183 var7) {
      if (var3.method_8321(var4) instanceof class03773 class03773) {
         if (!var1.N(class01226.yv)) {
            return class07082.R;
         } else {
            OptionalInt optionalint = this.N(var7, var2.L(y));
            if (optionalint.isEmpty()) {
               return class07082.i;
            } else if (var2.L(Z.get(optionalint.getAsInt()))) {
               return class07082.R;
            } else {
               N(var3, var4, var5, class03773, var1, optionalint.getAsInt());
               return class07082.N;
            }
         }
      } else {
         return class07082.i;
      }
   }

   @Nullable
   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return new class03773(var1, var2);
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y);
      Z.forEach(var1x -> var1.N(var1x));
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, boolean var4) {
      class06704.N(var1, var2, var3);
   }
}
