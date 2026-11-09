package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public abstract class class02467<T extends class02500> implements class02487<T> {
   private final Codec<T> L;
   private final MapCodec<class02470<T>> u;
   private final class02362<class04247, class02470<T>> i;

   @Override
   public Codec<T> L() {
      return this.L;
   }

   public class02467(Codec<T> var1) {
      super();
      this.L = var1;
      this.u = class02470.N(this, var1);
      this.i = class02389.<class02500>u(var1).N_10(var1x -> new class02470<>(this, (T)var1x), class02470::y);
   }

   @Override
   public class02362<class04247, class02470<T>> i() {
      return this.i;
   }

   @Override
   public MapCodec<class02470<T>> u() {
      return this.u;
   }
}
