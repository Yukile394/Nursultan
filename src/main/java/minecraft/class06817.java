package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class06817 extends class06813 {
   public static final MapCodec<class06817> N = RecordCodecBuilder.mapCodec(
      var0 -> N(var0).and(class00845.N.fieldOf("item_filter").forGetter(var0x -> var0x.L)).apply(var0, class06817::new)
   );
   private final class00845 L;

   private class06817(class06834 var1, class00845 var2) {
      super(var1);
      this.L = var2;
   }

   @Override
   protected class06838 N(class06838 var1) {
      return var1.N_65(this.L);
   }

   @Override
   public MapCodec<class06817> N() {
      return N;
   }
}
