package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import org.jspecify.annotations.Nullable;

public class class03604 implements class03336 {
   public static final MapCodec<class03604> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class07001.N.fieldOf("data").forGetter(var0x -> var0x.y)).apply(var0, class03604::new)
   );
   private final class07001 y;

   public class03604(class07001 var1) {
      super();
      this.y = var1;
   }

   @Override
   public class07001 N(class06069 var1, @Nullable class07001 var2) {
      return var2 == null ? this.y.N() : var2.N(this.y);
   }

   @Override
   public class03368<?> N() {
      return class03368.L;
   }
}
