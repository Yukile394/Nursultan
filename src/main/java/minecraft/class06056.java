package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class06056 extends class00410 {
   public static final MapCodec<class06056> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class06563.field_41600.fieldOf("color").forGetter(class06056::y), t()).apply(var0, class06056::new)
   );
   private final class06563 L;

   public class06056(class06563 var1, class01362 var2) {
      super(var2);
      this.L = var1;
   }

   public class06563 y() {
      return this.L;
   }

   @Override
   public MapCodec<class06056> N() {
      return y;
   }
}
