package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

class class04041 extends class04028 {
   private final class03543<class04651> R;
   public static final MapCodec<class04041> N = RecordCodecBuilder.mapCodec(
      var0 -> N(var0).and(class03541.N(class04227.e).fieldOf("fluids").forGetter(var0x -> var0x.R)).apply(var0, class04041::new)
   );

   public class04041(class00753 var1, class03543<class04651> var2) {
      super(var1);
      this.R = var2;
   }

   @Override
   public class04054<?> N() {
      return class04054.L;
   }

   @Override
   protected boolean N(class00500 var1) {
      return var1.Y().N(this.R);
   }
}
