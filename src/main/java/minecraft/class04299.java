package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class04299 extends class03855 {
   public static final MapCodec<class04299> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class04540.y(class03855.L).fieldOf("distribution").forGetter(var0x -> var0x.y)).apply(var0, class04299::new)
   );
   private final class04540<class03855> y;

   public class04299(class04540<class03855> var1) {
      super();
      this.y = var1;
   }

   @Override
   public int N(class06069 var1, class06057 var2) {
      return this.y.y(var1).N(var1, var2);
   }

   @Override
   public class03862<?> N() {
      return class03862.R;
   }
}
