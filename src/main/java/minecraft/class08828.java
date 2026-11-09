package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public class class08828 extends class00453 {
   public static final MapCodec<class08828> N = RecordCodecBuilder.mapCodec(var0 -> N(var0).apply(var0, class08828::new));

   public static class00471<?> L() {
      return N(class08828::new);
   }

   private class08828(List<class05957> var1) {
      super(var1);
   }

   @Override
   public class05959<class08828> N() {
      return class07439.w;
   }

   @Override
   public class06584 N(class06584 var1, class05908 var2) {
      Float f = var2.L(class06551.E);
      if (f != null) {
         class06069 class06069 = var2.y();
         float f1 = 1.0F / f;
         int i = var1.c();
         int j = 0;

         for (int k = 0; k < i; k++) {
            if (class06069.z() <= f1) {
               j++;
            }
         }

         var1.i(j);
      }

      return var1;
   }
}
