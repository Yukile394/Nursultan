package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class class07763 extends class07796 implements class05700 {
   public static final MapCodec<class07763> N = y(class07763::new);

   public class07763(class01362 var1) {
      super(var1);
   }

   @Override
   public class06563 y() {
      return class06563.field_7952;
   }

   @Override
   public MapCodec<class07763> N() {
      return N;
   }

   @Override
   protected class07082 N(class00500 var1, class07299 var2, class07209 var3, class08036 var4, class06183 var5) {
      if (!var2.method_8608() && var2.method_8321(var3) instanceof class00419 class00419) {
         var4.method_17355(class00419);
         var4.method_7281(class01235.Nu);
      }

      return class07082.N;
   }

   @Nullable
   @Override
   public <T extends class00394> class01118<T> N(class07299 var1, class00500 var2, class00404<T> var3) {
      return N(var3, class00404.field_11890, class00419::N);
   }

   @Override
   public class00394 N(class07209 var1, class00500 var2) {
      return new class00419(var1, var2);
   }
}
