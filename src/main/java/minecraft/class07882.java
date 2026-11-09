package minecraft;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Set;
import org.slf4j.Logger;

public class class07882 extends class00453 {
   private static final Logger y = LogUtils.getLogger();
   public static final MapCodec<class07882> N = RecordCodecBuilder.mapCodec(
      var0 -> N(var0)
         .and(var0.group(class06339.N.fieldOf("damage").forGetter(var0x -> var0x.L), Codec.BOOL.fieldOf("add").orElse(false).forGetter(var0x -> var0x.u)))
         .apply(var0, class07882::new)
   );
   private final class06378 L;
   private final boolean u;

   private class07882(List<class05957> var1, class06378 var2, boolean var3) {
      super(var1);
      this.L = var2;
      this.u = var3;
   }

   @Override
   public Set<class07491<?>> y() {
      return this.L.y();
   }

   @Override
   public class06584 N(class06584 var1, class05908 var2) {
      if (var1.W()) {
         int i = var1.s();
         float f = this.u ? 1.0F - (float)var1.P() / i : 0.0F;
         float f1 = 1.0F - class04995.N(this.L.y(var2) + f, 0.0F, 1.0F);
         var1.y(class04995.y(f1 * i));
      } else {
         y.warn("Couldn't set damage of loot item {}", var1);
      }

      return var1;
   }

   public static class00471<?> N(class06378 var0) {
      return N(var1 -> new class07882(var1, var0, false));
   }

   public static class00471<?> N(class06378 var0, boolean var1) {
      return N(var2 -> new class07882(var2, var0, var1));
   }

   @Override
   public class05959<class07882> N() {
      return class07439.m;
   }
}
