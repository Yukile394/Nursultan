package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;
import java.util.stream.Stream;

public record class00286(class00299 base, class00299 material, class03556<class03246> pattern) implements class00299 {
   public static final MapCodec<class00286> L = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class00299.N.fieldOf("base").forGetter(class00286::y),
            class00299.N.fieldOf("material").forGetter(class00286::L),
            class03246.L.fieldOf("pattern").forGetter(class00286::u)
         )
         .apply(var0, class00286::new)
   );
   public static final class02362<class04247, class00286> u = class02362.N(
      class00299.y, class00286::y, class00299.y, class00286::L, class03246.u, class00286::u, class00286::new
   );
   public static final class00319<class00286> i = new class00319<>(L, u);

   public class00299 L() {
      return this.material;
   }

   public class00286(class00299 base, class00299 material, class03556<class03246> pattern) {
      this.base = base;
      this.material = material;
      this.pattern = pattern;
   }

   public class03556<class03246> u() {
      return this.pattern;
   }

   public class00299 y() {
      return this.base;
   }

   @Override
   public class00319<class00286> N() {
      return i;
   }

   @Override
   public <T> Stream<T> N(class00311 var1, class00308<T> var2) {
      if (var2 instanceof class00287 class00287) {
         class01929 class01929 = var1.L(class00282.y);
         if (class01929 != null) {
            class06069 class06069 = class06069.y((long)System.identityHashCode(this));
            List list = this.base.N(var1);
            if (list.isEmpty()) {
               return Stream.empty();
            }

            List list1 = this.material.N(var1);
            if (list1.isEmpty()) {
               return Stream.empty();
            }

            return Stream.<class06584>generate(() -> {
               class06584 class06584x = class07536.N_77(list, class06069);
               class06584 class06584x = class07536.N_77(list1, class06069);
               return class03259.N(class01929, class06584x, class06584x, this.pattern);
            }).limit(256L).filter(var0 -> !var0.R()).limit(16L).map(class00287::y);
         }
      }

      return Stream.empty();
   }
}
