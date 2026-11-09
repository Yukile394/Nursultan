package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public abstract class class00748 extends class07796 {
   public static final class08064<class07211> N = class07101.R;
   public static final class06667 y = class06665.n;

   public class00748(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(N, class07211.field_11043).y(y, false));
   }

   @Override
   protected class00500 N(class00500 var1, class06993 var2) {
      return var1.y(N, var2.N(var1.L(N)));
   }

   @Override
   protected class00500 N(class00500 var1, class07111 var2) {
      return var1.N(var2.N(var1.L(N)));
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(N, y);
   }

   @Nullable
   protected static <T extends class00394> class01118<T> N(class07299 var0, class00404<T> var1, class00404<? extends class07242> var2) {
      return var0 instanceof class04782 class04782 ? N(var1, var2, (var1x, var2x, var3x, var4) -> class07242.N(class04782, var2x, var3x, var4)) : null;
   }

   @Override
   protected int N_24(class00500 var1, class07299 var2, class07209 var3, class07211 var4) {
      return class07482.N(var2.method_8321(var3));
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      if (!var2.method_8608()) {
         this.N(var2, var3, var4);
      }

      return class07082.N;
   }

   protected abstract void N(class07299 var1, class07209 var2, class08036 var3);

   @Override
   public class00500 N(class06942 var1) {
      return this.W().y(N, var1.method_8042().b());
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, boolean var4) {
      class06704.N(var1, var2, var3);
   }

   @Override
   protected boolean N(class00500 var1) {
      return true;
   }

   @Override
   protected abstract MapCodec<? extends class00748> N();
}
