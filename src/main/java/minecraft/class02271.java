package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class class02271 extends class07796 {
   public static final MapCodec<class02271> N = y(class02271::new);
   public static final class08092<class02302> y = class06665.yg;
   public static final class08064<class07211> L = class07101.R;
   public static final class06667 u = class06665.yJ;

   public class02271(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(L, class07211.field_11043).y(y, class02302.field_48899).y(u, false));
   }

   @Override
   public class00500 N(class00500 var1, class07111 var2) {
      return var1.N(var2.N(var1.L(L)));
   }

   @Override
   public class00500 N(class00500 var1, class06993 var2) {
      return var1.y(L, var2.N(var1.L(L)));
   }

   @Override
   public MapCodec<class02271> N() {
      return N;
   }

   @Override
   public class07082 N(class06584 var1, class00500 var2, class07299 var3, class07209 var4, class08036 var5, class07050 var6, class06183 var7) {
      if (!var1.R() && var2.L(y) == class02302.field_48900) {
         if (var3 instanceof class04782 class04782) {
            if (!(class04782.method_8321(var4) instanceof class02261 class02261)) {
               return class07082.R;
            }

            class02308.N(class04782, var4, var2, class02261.R(), class02261.N(), class02261.L(), var5, var1);
         }

         return class07082.y;
      } else {
         return class07082.R;
      }
   }

   @Nullable
   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return new class02261(var1, var2);
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(L, y, u);
   }

   @Nullable
   @Override
   public <T extends class00394> class01118<T> N(class07299 var1, class00500 var2, class00404<T> var3) {
      return var1 instanceof class04782 class04782
         ? N(var3, class00404.field_48859, (var1x, var2x, var3x, var4x) -> class02308.N(class04782, var2x, var3x, var4x.R(), var4x.N(), var4x.L()))
         : N(var3, class00404.field_48859, (var0, var1x, var2x, var3x) -> class02284.N(var0, var1x, var2x, var3x.u(), var3x.L()));
   }

   @Override
   public class00500 N(class06942 var1) {
      return this.W().y(L, var1.method_8042().b());
   }
}
