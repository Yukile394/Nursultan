package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class07750 extends class07100 implements class05700 {
   public static final MapCodec<class07750> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class06563.field_41600.fieldOf("color").forGetter(class07750::y), t()).apply(var0, class07750::new)
   );
   private final class06563 Z;

   public class07750(class06563 var1, class01362 var2) {
      super(var2);
      this.Z = var1;
      this.P(this.Q.y().y(y, false).y(L, false).y(u, false).y(i, false).y(R, false));
   }

   @Override
   public class06563 y() {
      return this.Z;
   }

   @Override
   public MapCodec<class07750> N() {
      return N;
   }
}
