package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record class06526(class03556<class07304> enchantment, List<Float> values) implements class05957 {
   public static final MapCodec<class06526> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class07304.L.fieldOf("enchantment").forGetter(class06526::L), class06338.y(Codec.FLOAT.listOf()).fieldOf("chances").forGetter(class06526::u)
         )
         .apply(var0, class06526::new)
   );

   public class03556<class07304> L() {
      return this.enchantment;
   }

   public class06526(class03556<class07304> enchantment, List<Float> values) {
      super();
      this.enchantment = enchantment;
      this.values = values;
   }

   public List<Float> u() {
      return this.values;
   }

   @Override
   public Set<class07491<?>> y() {
      return Set.of(class06551.U);
   }

   public boolean test(class05908 var1) {
      class06584 class06584 = var1.L(class06551.U);
      int i = class06584 != null ? class07323.N(this.enchantment, class06584) : 0;
      float f = this.values.get(Math.min(i, this.values.size() - 1));
      return var1.y().z() < f;
   }

   @Override
   public class05955 N() {
      return class07693.U;
   }

   public static class05952 N(class03556<class07304> var0, float... var1) {
      ArrayList arraylist = new ArrayList(var1.length);

      for (float f : var1) {
         arraylist.add(f);
      }

      return () -> new class06526(var0, arraylist);
   }
}
