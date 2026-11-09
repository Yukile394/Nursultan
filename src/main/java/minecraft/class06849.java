package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class06849 extends class06813 {
   public static final MapCodec<class06849> N = RecordCodecBuilder.mapCodec(
      var0 -> N(var0).and(class06338.b.fieldOf("limit").forGetter(var0x -> var0x.L)).apply(var0, class06849::new)
   );
   private final int L;

   private class06849(class06834 var1, int var2) {
      super(var1);
      this.L = var2;
   }

   @Override
   protected class06838 N(class06838 var1) {
      return var1.N(this.L);
   }

   @Override
   public MapCodec<class06849> N() {
      return N;
   }
}
