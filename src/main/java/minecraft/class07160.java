package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public class class07160 extends class00453 {
   public static final MapCodec<class07160> N = RecordCodecBuilder.mapCodec(
      var0 -> N(var0).and(class07755.R.fieldOf("tag").forGetter(var0x -> var0x.y)).apply(var0, class07160::new)
   );
   private final class07001 y;

   private class07160(List<class05957> var1, class07001 var2) {
      super(var1);
      this.y = var2;
   }

   @Override
   public class06584 N(class06584 var1, class05908 var2) {
      class02837.N(class02484.y, var1, var1x -> var1x.N(this.y));
      return var1;
   }

   @Override
   public class05959<class07160> N() {
      return class07439.z;
   }

   @Deprecated
   public static class00471<?> N(class07001 var0) {
      return N(var1 -> new class07160(var1, var0));
   }
}
