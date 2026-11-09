package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class04747 {
   public static final Codec<class04747> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class04336.y.fieldOf("feature").forGetter(var0x -> var0x.y), Codec.floatRange(0.0F, 1.0F).fieldOf("chance").forGetter(var0x -> var0x.L)
         )
         .apply(var0, class04747::new)
   );
   public final class03556<class04336> y;
   public final float L;

   public class04747(class03556<class04336> var1, float var2) {
      super();
      this.y = var1;
      this.L = var2;
   }

   public boolean N(class05974 var1, class08088 var2, class06069 var3, class07209 var4) {
      return this.y.N().N(var1, var2, var3, var4);
   }
}
