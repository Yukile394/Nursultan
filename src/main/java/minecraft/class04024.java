package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

class class04024 extends class04028 {
   public static final MapCodec<class04024> N = RecordCodecBuilder.mapCodec(var0 -> N(var0).apply(var0, class04024::new));

   public class04024(class00753 var1) {
      super(var1);
   }

   @Override
   protected boolean N(class00500 var1) {
      return var1.d();
   }

   @Override
   public class04054<?> N() {
      return class04054.R;
   }
}
