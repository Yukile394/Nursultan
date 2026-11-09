package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class04389 extends class06034 {
   public static final Codec<class04389> L = RecordCodecBuilder.create(
      var0 -> var0.group(
            class06034.M.forGetter(var0x -> var0x),
            class06052.L.fieldOf("horizontal_radius_multiplier").forGetter(var0x -> var0x.u),
            class06052.L.fieldOf("vertical_radius_multiplier").forGetter(var0x -> var0x.i),
            class06052.N(-1.0F, 1.0F).fieldOf("floor_level").forGetter(var0x -> var0x.W)
         )
         .apply(var0, class04389::new)
   );
   public final class06052 u;
   public final class06052 i;
   final class06052 W;

   public class04389(class06034 var1, class06052 var2, class06052 var3, class06052 var4) {
      this(var1.y, var1.B, var1.Z, var1.z, var1.U, var1.E, var2, var3, var4);
   }

   public class04389(
      float var1, class03855 var2, class06052 var3, class06055 var4, class03543<class00891> var5, class06052 var6, class06052 var7, class06052 var8
   ) {
      this(var1, var2, var3, var4, class06050.N, var5, var6, var7, var8);
   }

   public class04389(
      float var1,
      class03855 var2,
      class06052 var3,
      class06055 var4,
      class06050 var5,
      class03543<class00891> var6,
      class06052 var7,
      class06052 var8,
      class06052 var9
   ) {
      super(var1, var2, var3, var4, var5, var6);
      this.u = var7;
      this.i = var8;
      this.W = var9;
   }
}
