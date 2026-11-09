package minecraft;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;

public class class08017 extends class00453 {
   private static final Logger y = LogUtils.getLogger();
   public static final MapCodec<class08017> N = RecordCodecBuilder.mapCodec(var0 -> N(var0).apply(var0, class08017::new));

   public static class00471<?> L() {
      return N(class08017::new);
   }

   private class08017(List<class05957> var1) {
      super(var1);
   }

   @Override
   public class05959<class08017> N() {
      return class07439.E;
   }

   @Override
   public class06584 N(class06584 var1, class05908 var2) {
      if (var1.R()) {
         return var1;
      } else {
         class02904 class02904 = new class02904(var1);
         Optional<class03729<class05654>> optional = var2.u().method_64577().N(class05838.y, class02904, var2.u());
         if (optional.isPresent()) {
            class06584 class06584 = optional.get().y().method_8116(class02904, var2.u().method_30349());
            if (!class06584.R()) {
               return class06584.L(var1.c());
            }
         }

         y.warn("Couldn't smelt {} because there is no smelting recipe", var1);
         return var1;
      }
   }
}
