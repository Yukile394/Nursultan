package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public class class04030 extends class00453 {
   public static final MapCodec<class04030> N = RecordCodecBuilder.mapCodec(
      var0 -> N(var0).and(class06525.N.fieldOf("id").forGetter(var0x -> var0x.y)).apply(var0, class04030::new)
   );
   private final class03556<class06525> y;

   private class04030(List<class05957> var1, class03556<class06525> var2) {
      super(var1);
      this.y = var2;
   }

   @Override
   public class06584 N(class06584 var1, class05908 var2) {
      var1.N(class02484.h, class06517.N, this.y, class06517::y);
      return var1;
   }

   @Override
   public class05959<class04030> N() {
      return class07439.I;
   }

   public static class00471<?> N(class03556<class06525> var0) {
      return N(var1 -> new class04030(var1, var0));
   }
}
