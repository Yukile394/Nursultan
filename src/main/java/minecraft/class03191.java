package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class03191 extends class04028 {
   final class03530<class00891> N;
   public static final MapCodec<class03191> R = RecordCodecBuilder.mapCodec(
      var0 -> N(var0).and(class03530.N(class04227.Z).fieldOf("tag").forGetter(var0x -> var0x.N)).apply(var0, class03191::new)
   );

   protected class03191(class00753 var1, class03530<class00891> var2) {
      super(var1);
      this.N = var2;
   }

   @Override
   public class04054<?> N() {
      return class04054.y;
   }

   @Override
   protected boolean N(class00500 var1) {
      return var1.N(this.N);
   }
}
