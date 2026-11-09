package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public class class08916 implements class06572 {
   public static final MapCodec<class08916> N = class08919.N.xmap(class08916::new, var0 -> var0.y);
   private final class08919 y;

   public class08916(boolean var1, class08934 var2) {
      this(new class08919(var1, var2));
   }

   private class08916(class08919 var1) {
      super();
      this.y = var1;
   }

   @Override
   public float N(class06584 var1, @Nullable class03448 var2, @Nullable class08961 var3, int var4) {
      return this.y.N(var1, var2, var3, var4);
   }

   @Override
   public MapCodec<class08916> N() {
      return N;
   }
}
