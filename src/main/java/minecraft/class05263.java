package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class05263 extends class05261 {
   public static final MapCodec<class05263> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class00500.N.fieldOf("block_state").forGetter(var0x -> var0x.y), Codec.FLOAT.fieldOf("probability").forGetter(var0x -> var0x.u))
         .apply(var0, class05263::new)
   );
   private final class00500 y;
   private final float u;

   public class05263(class00500 var1, float var2) {
      super();
      this.y = var1;
      this.u = var2;
   }

   @Override
   public boolean N(class00500 var1, class06069 var2) {
      return var1 == this.y && var2.z() < this.u;
   }

   @Override
   protected class05240<?> N() {
      return class05240.R;
   }
}
