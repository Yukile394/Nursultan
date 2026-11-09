package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public abstract class class07796 extends class00891 implements class07190 {
   public class07796(class01362 var1) {
      super(var1);
   }

   @Nullable
   protected static <E extends class00394, A extends class00394> class01118<A> N(class00404<A> var0, class00404<E> var1, class01118<? super E> var2) {
      return var1 == var0 ? var2 : null;
   }

   @Nullable
   @Override
   protected class06237 N(class00500 var1, class07299 var2, class07209 var3) {
      class00394 class00394 = var2.method_8321(var3);
      return class00394 instanceof class06237 ? (class06237)class00394 : null;
   }

   @Override
   protected boolean N(class00500 var1, class07299 var2, class07209 var3, int var4, int var5) {
      super.N(var1, var2, var3, var4, var5);
      class00394 class00394 = var2.method_8321(var3);
      return class00394 == null ? false : class00394.N(var4, var5);
   }

   @Override
   protected abstract MapCodec<? extends class07796> N();
}
