package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class07734 extends class03137 implements class05700 {
   public static final MapCodec<class07734> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class06563.field_41600.fieldOf("color").forGetter(class07734::y), t()).apply(var0, class07734::new)
   );
   private final class06563 L;

   public class07734(class06563 var1, class01362 var2) {
      super(var2);
      this.L = var1;
   }

   @Override
   public class06563 y() {
      return this.L;
   }

   @Override
   public MapCodec<class07734> N() {
      return N;
   }
}
