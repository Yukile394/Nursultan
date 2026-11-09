package minecraft;

import com.google.common.collect.Sets;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Set;

public record class06345(class06378 min, class06378 max) implements class06378 {
   public static final MapCodec<class06345> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class06339.N.fieldOf("min").forGetter(class06345::L), class06339.N.fieldOf("max").forGetter(class06345::u))
         .apply(var0, class06345::new)
   );

   public class06378 L() {
      return this.min;
   }

   public class06345(class06378 min, class06378 max) {
      super();
      this.min = min;
      this.max = max;
   }

   public class06378 u() {
      return this.max;
   }

   @Override
   public Set<class07491<?>> y() {
      return Sets.union(this.min.y(), this.max.y());
   }

   @Override
   public float y(class05908 var1) {
      return class04995.N(var1.y(), this.min.y(var1), this.max.y(var1));
   }

   @Override
   public int N(class05908 var1) {
      return class04995.N(var1.y(), this.min.N(var1), this.max.N(var1));
   }

   @Override
   public class06341 N() {
      return class06339.L;
   }

   public static class06345 N(float var0, float var1) {
      return new class06345(class04711.N(var0), class04711.N(var1));
   }
}
