package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class05333 extends class05318 {
   public static final MapCodec<class05333> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            Codec.FLOAT.fieldOf("min_chance").orElse(0.0F).forGetter(var0x -> var0x.y),
            Codec.FLOAT.fieldOf("max_chance").orElse(0.0F).forGetter(var0x -> var0x.u),
            Codec.INT.fieldOf("min_dist").orElse(0).forGetter(var0x -> var0x.i),
            Codec.INT.fieldOf("max_dist").orElse(0).forGetter(var0x -> var0x.R),
            class07185.field_25065.fieldOf("axis").orElse(class07185.field_11052).forGetter(var0x -> var0x.M)
         )
         .apply(var0, class05333::new)
   );
   private final float y;
   private final float u;
   private final int i;
   private final int R;
   private final class07185 M;

   public class05333(float var1, float var2, int var3, int var4, class07185 var5) {
      super();
      if (var3 >= var4) {
         throw new IllegalArgumentException("Invalid range: [" + var3 + "," + var4 + "]");
      } else {
         this.y = var1;
         this.u = var2;
         this.i = var3;
         this.R = var4;
         this.M = var5;
      }
   }

   @Override
   public boolean N(class07209 var1, class07209 var2, class07209 var3, class06069 var4) {
      class07211 class07211 = class07211.N(class07212.field_11056, this.M);
      float f = Math.abs((var2.method_10263() - var3.method_10263()) * class07211.P());
      float f1 = Math.abs((var2.method_10264() - var3.method_10264()) * class07211.s());
      float f2 = Math.abs((var2.method_10260() - var3.method_10260()) * class07211.T());
      int ix = (int)(f + f1 + f2);
      return var4.z() <= class04995.y(class04995.R((float)ix, (float)this.i, (float)this.R), this.y, this.u);
   }

   @Override
   protected class05301<?> N() {
      return class05301.L;
   }
}
