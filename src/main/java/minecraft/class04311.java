package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

@Deprecated
public class class04311 extends class04028 {
   public static final MapCodec<class04311> N = RecordCodecBuilder.mapCodec(var0 -> N(var0).apply(var0, class04311::new));

   public class04311(class00753 var1) {
      super(var1);
   }

   @Override
   protected boolean N(class00500 var1) {
      return var1.B();
   }

   @Override
   public class04054<?> N() {
      return class04054.i;
   }
}
