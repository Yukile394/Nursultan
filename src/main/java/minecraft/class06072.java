package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class06072 extends class06034 {
   public static final Codec<class06072> L = RecordCodecBuilder.create(
      var0 -> var0.group(
            class06034.M.forGetter(var0x -> var0x),
            class06052.L.fieldOf("vertical_rotation").forGetter(var0x -> var0x.u),
            class06037.N.fieldOf("shape").forGetter(var0x -> var0x.i)
         )
         .apply(var0, class06072::new)
   );
   public final class06052 u;
   public final class06037 i;

   public class06072(
      float var1, class03855 var2, class06052 var3, class06055 var4, class06050 var5, class03543<class00891> var6, class06052 var7, class06037 var8
   ) {
      super(var1, var2, var3, var4, var5, var6);
      this.u = var7;
      this.i = var8;
   }

   public class06072(class06034 var1, class06052 var2, class06037 var3) {
      this(var1.y, var1.B, var1.Z, var1.z, var1.U, var1.E, var2, var3);
   }
}
