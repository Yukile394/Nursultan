package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

class class04052 extends class04028 {
   private final class03543<class00891> R;
   public static final MapCodec<class04052> N = RecordCodecBuilder.mapCodec(
      var0 -> N(var0).and(class03541.N(class04227.Z).fieldOf("blocks").forGetter(var0x -> var0x.R)).apply(var0, class04052::new)
   );

   public class04052(class00753 var1, class03543<class00891> var2) {
      super(var1);
      this.R = var2;
   }

   @Override
   public class04054<?> N() {
      return class04054.N;
   }

   @Override
   protected boolean N(class00500 var1) {
      return var1.N(this.R);
   }
}
