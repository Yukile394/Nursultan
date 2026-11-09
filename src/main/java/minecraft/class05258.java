package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class05258 extends class05261 {
   public static final MapCodec<class05258> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class04206.i.T().fieldOf("block").forGetter(var0x -> var0x.y), Codec.FLOAT.fieldOf("probability").forGetter(var0x -> var0x.u))
         .apply(var0, class05258::new)
   );
   private final class00891 y;
   private final float u;

   public class05258(class00891 var1, float var2) {
      super();
      this.y = var1;
      this.u = var2;
   }

   @Override
   public boolean N(class00500 var1, class06069 var2) {
      return var1.N(this.y) && var2.z() < this.u;
   }

   @Override
   protected class05240<?> N() {
      return class05240.i;
   }
}
