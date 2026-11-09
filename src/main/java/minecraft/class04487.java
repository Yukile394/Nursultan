package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class class04487 extends class07796 {
   public static final MapCodec<class04487> N = y(class04487::new);
   public static final class08064<class04481> y = class06665.yO;
   public static final class06667 L = class06665.yJ;

   public class04487(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, class04481.field_47383).y(L, false));
   }

   @Override
   public MapCodec<class04487> N() {
      return N;
   }

   @Nullable
   @Override
   public <T extends class00394> class01118<T> N(class07299 var1, class00500 var2, class00404<T> var3) {
      return var1 instanceof class04782 class04782
         ? N(var3, class00404.field_47352, (var1x, var2x, var3x, var4x) -> var4x.L().N(class04782, var2x, var3x.u(class06665.yJ).orElse(false)))
         : N(var3, class00404.field_47352, (var0, var1x, var2x, var3x) -> var3x.L().N(var0, var1x, var2x.u(class06665.yJ).orElse(false)));
   }

   @Nullable
   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return new class04512(var1, var2);
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y, L);
   }
}
