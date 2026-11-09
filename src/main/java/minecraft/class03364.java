package minecraft;

import Nursultan.class10412;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import org.slf4j.Logger;

public class class03364 extends class00453 {
   private static final Logger y = LogUtils.getLogger();
   public static final MapCodec<class03364> N = RecordCodecBuilder.mapCodec(
      var0 -> N(var0).and(class05946.N(class04227.yo).fieldOf("name").forGetter(var0x -> var0x.L)).apply(var0, class03364::new)
   );
   private final class05946<class08122> L;

   private class03364(List<class05957> var1, class05946<class08122> var2) {
      super(var1);
      this.L = var2;
   }

   @Override
   protected class06584 N(class06584 var1, class05908 var2) {
      class08122 class08122 = var2.N().u(this.L).map(class03556::N).orElse(null);
      if (class08122 == null) {
         y.warn("Unknown function: {}", this.L.N());
         return var1;
      } else {
         class05925 class05925 = class05908.N(class08122);
         if (var2.y(class05925)) {
            class06584 class06584;
            try {
               class06584 = class08122.apply(var1, var2);
            } finally {
               var2.L(class05925);
            }

            return class06584;
         } else {
            y.warn("Detected infinite loop in loot tables");
            return var1;
         }
      }
   }

   public static class00471<?> N(class05946<class08122> var0) {
      return N(var1 -> new class03364(var1, var0));
   }

   @Override
   public class05959<class03364> N() {
      return class07439.o;
   }

   @Override
   public void N(class05561 var1) {
      if (!var1.y()) {
         var1.N(new class05566(this.L));
      } else if (var1.N(this.L)) {
         var1.N(new class05537(this.L));
      } else {
         super.N(var1);
         var1.N().u(this.L).ifPresentOrElse(var2 -> var2.N().N(var1.N(new class10412(this.L), this.L)), () -> var1.N(new class05576(this.L)));
      }
   }
}
