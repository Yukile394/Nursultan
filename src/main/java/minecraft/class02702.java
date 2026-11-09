package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public class class02702 extends class00453 {
   public static final MapCodec<class02702> N = RecordCodecBuilder.mapCodec(
      var0 -> N(var0).and(class02678.y.fieldOf("components").forGetter(var0x -> var0x.y)).apply(var0, class02702::new)
   );
   private final class02678 y;

   private class02702(List<class05957> var1, class02678 var2) {
      super(var1);
      this.y = var2;
   }

   @Override
   public class06584 N(class06584 var1, class05908 var2) {
      var1.N(this.y);
      return var1;
   }

   @Override
   public class05959<class02702> N() {
      return class07439.U;
   }

   public static <T> class00471<?> N(class02477<T> var0, T var1) {
      return N(var2 -> new class02702(var2, class02678.N().N(var0, var1).N()));
   }
}
