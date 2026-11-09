package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class class03442 extends class01219 {
   public final class03530<class00891> N;
   public static final MapCodec<class03442> y = class03530.y(class04227.Z).xmap(class03442::new, var0 -> var0.N).fieldOf("value");

   public class03442(class03530<class00891> var1) {
      super();
      this.N = var1;
   }

   @Nullable
   @Override
   public class01228 N(class05487 var1, class07209 var2, class07209 var3, class01228 var4, class01228 var5, class01233 var6) {
      return class06391.N(this.N).test(var1.method_8320(var5.N())) ? var5 : null;
   }

   @Override
   protected class05235<?> N() {
      return class05235.m;
   }
}
