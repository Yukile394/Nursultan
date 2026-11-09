package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public class class06810 extends class00453 {
   public static final MapCodec<class06810> N = RecordCodecBuilder.mapCodec(var0 -> N(var0).apply(var0, class06810::new));

   public static class00471<?> L() {
      return N(class06810::new);
   }

   protected class06810(List<class05957> var1) {
      super(var1);
   }

   @Override
   public class05959<class06810> N() {
      return class07439.A;
   }

   @Override
   protected class06584 N(class06584 var1, class05908 var2) {
      return class06584.E;
   }
}
