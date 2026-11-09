package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class class04066 extends class07796 {
   public static final MapCodec<class04066> N = y(class04066::new);
   public static final class06667 y = class06665.L;
   private final class02142 L = class02151.N(5);

   public class04066(class01362 var1) {
      super(var1);
      this.P(this.Q.y().y(y, false));
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06584 var4, boolean var5) {
      super.N(var1, var2, var3, var4, var5);
      if (var5) {
         this.N(var2, var3, var4, this.L);
      }
   }

   @Nullable
   @Override
   public <T extends class00394> class01118<T> N(class07299 var1, class00500 var2, class00404<T> var3) {
      return var1.method_8608() ? null : N(var3, class00404.field_37647, class04078::N);
   }

   @Override
   public MapCodec<class04066> N() {
      return N;
   }

   @Nullable
   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return new class04078(var1, var2);
   }

   @Override
   protected void N(class00500 var1, class04782 var2, class07209 var3, class06069 var4) {
      if (var1.L(y)) {
         var2.method_8652(var3, var1.y(y, false), 3);
      }
   }

   @Override
   protected void N(class00517<class00891, class00500> var1) {
      var1.N(y);
   }
}
