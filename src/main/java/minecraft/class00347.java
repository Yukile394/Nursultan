package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class00347 extends class00343 implements class06572 {
   public static final MapCodec<class00347> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            Codec.BOOL.optionalFieldOf("wobble", true).forGetter(class00343::y), class00342.field_55560.fieldOf("source").forGetter(var0x -> var0x.y)
         )
         .apply(var0, class00347::new)
   );
   private final class00342 y;
   private final class06069 L = class06069.u();
   private final class00373 u;

   public class00347(boolean var1, class00342 var2) {
      super(var1);
      this.y = var2;
      this.u = this.N(0.9F);
   }

   @Override
   protected float N(class06584 var1, class03448 var2, int var3, class08961 var4) {
      float f = this.y.N(var2, var1, var4, this.L);
      long i = var2.N();
      if (this.u.N(i)) {
         this.u.N(i, f);
      }

      return this.u.N();
   }

   @Override
   public MapCodec<class00347> N() {
      return N;
   }
}
