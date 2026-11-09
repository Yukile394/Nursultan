package minecraft;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;
import net.fabricmc.fabric.api.item.v1.EnchantingContext;
import org.slf4j.Logger;

public class class08853 extends class00453 {
   private static final Logger y = LogUtils.getLogger();
   public static final MapCodec<class08853> N = RecordCodecBuilder.mapCodec(
      var0 -> N(var0)
         .and(
            var0.group(
               class03541.N(class04227.yR).optionalFieldOf("options").forGetter(var0x -> var0x.L),
               Codec.BOOL.optionalFieldOf("only_compatible", true).forGetter(var0x -> var0x.u)
            )
         )
         .apply(var0, class08853::new)
   );
   private final Optional<class03543<class07304>> L;
   private final boolean u;

   public static class08848 L() {
      return new class08848();
   }

   class08853(List<class05957> var1, Optional<class03543<class07304>> var2, boolean var3) {
      super(var1);
      this.L = var2;
      this.u = var3;
   }

   private static boolean N(class07304 var0, class06584 var1, boolean var2, class06584 var3, class03556 var4) {
      return var1.canBeEnchantedWith(var4, EnchantingContext.ACCEPTABLE);
   }

   @Override
   public class05959<class08853> N() {
      return class07439.B;
   }

   @Override
   public class06584 N(class06584 var1, class05908 var2) {
      class06069 class06069 = var2.y();
      boolean flag = !var1.N(class06570.jY) && this.u;
      Optional optional = class07536.y_9(
         this.L
            .<Stream<? super class03529<class07304>>>map(class03543::N)
            .orElseGet(() -> var2.u().method_30349().L(class04227.yR).z().map(Function.identity()))
            .filter(var2x -> !flag || N(var2x.N(), var1, flag, var1, var2x))
            .toList(),
         class06069
      );
      if (optional.isEmpty()) {
         y.warn("Couldn't find a compatible enchantment for {}", var1);
         return var1;
      } else {
         return N(var1, (class03556<class07304>)optional.get(), class06069);
      }
   }

   private static class06584 N(class06584 var0, class03556<class07304> var1, class06069 var2) {
      int i = class04995.N(var2, ((class07304)var1.N()).u(), ((class07304)var1.N()).i());
      if (var0.N(class06570.jY)) {
         var0 = new class06584(class06570.Gq);
      }

      var0.N(var1, i);
      return var0;
   }

   public static class08848 N(class01929 var0) {
      return L().N(var0.y(class04227.yR).y(class02625.m));
   }
}
