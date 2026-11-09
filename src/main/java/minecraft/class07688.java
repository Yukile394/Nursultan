package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public abstract class class07688 extends class07796 {
   public static final class06667 N = class06665.k;
   private final class07030 y;

   public class07688(class07030 var1, class01362 var2) {
      super(var2);
      this.y = var1;
      this.P(this.Q.y().y(N, false));
   }

   public class07030 y() {
      return this.y;
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(N);
   }

   @Override
   public class00500 N(class06942 var1) {
      return this.W().y(N, var1.method_8045().W(var1.method_8037()));
   }

   @Override
   protected boolean N(class00500 var1, class08791 var2) {
      return false;
   }

   @Override
   protected void N(class00500 var1, class07299 var2, class07209 var3, class00891 var4, @Nullable class02733 var5, boolean var6) {
      if (!var2.method_8608()) {
         boolean flag = var2.W(var3);
         if (flag != var1.L(N)) {
            var2.method_8652(var3, var1.y(N, flag), 2);
         }
      }
   }

   @Override
   protected abstract MapCodec<? extends class07688> N();

   @Nullable
   @Override
   public <T extends class00394> class01118<T> N(class07299 var1, class00500 var2, class00404<T> var3) {
      return var1.method_8608() && (var2.N(class00869.BI) || var2.N(class00869.BJ) || var2.N(class00869.Bo) || var2.N(class00869.Bq))
         ? N(var3, class00404.field_11913, class07237::N)
         : null;
   }

   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return new class07237(var1, var2);
   }
}
