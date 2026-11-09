package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class06840 extends class06813 {
   public static final MapCodec<class06840> N = RecordCodecBuilder.mapCodec(
      var0 -> N(var0).and(class02936.i.fieldOf("component").forGetter(var0x -> var0x.L)).apply(var0, class06840::new)
   );
   private final class02928<?> L;

   private class06840(class06834 var1, class02928<?> var2) {
      super(var1);
      this.L = var2;
   }

   @Override
   protected class06838 N(class06838 var1) {
      return var1.N(this.L::N);
   }

   @Override
   public MapCodec<class06840> N() {
      return N;
   }
}
