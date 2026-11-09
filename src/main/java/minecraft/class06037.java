package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class06037 {
   public static final Codec<class06037> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class06052.L.fieldOf("distance_factor").forGetter(var0x -> var0x.y),
            class06052.L.fieldOf("thickness").forGetter(var0x -> var0x.L),
            class06338.b.fieldOf("width_smoothness").forGetter(var0x -> var0x.u),
            class06052.L.fieldOf("horizontal_radius_factor").forGetter(var0x -> var0x.i),
            Codec.FLOAT.fieldOf("vertical_radius_default_factor").forGetter(var0x -> var0x.R),
            Codec.FLOAT.fieldOf("vertical_radius_center_factor").forGetter(var0x -> var0x.M)
         )
         .apply(var0, class06037::new)
   );
   public final class06052 y;
   public final class06052 L;
   public final int u;
   public final class06052 i;
   public final float R;
   public final float M;

   public class06037(class06052 var1, class06052 var2, int var3, class06052 var4, float var5, float var6) {
      super();
      this.u = var3;
      this.i = var4;
      this.R = var5;
      this.M = var6;
      this.y = var1;
      this.L = var2;
   }
}
