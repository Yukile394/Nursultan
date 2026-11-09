package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Set;

public record class00908(float unenchantedChance, class02546 enchantedChance, class03556<class07304> enchantment) implements class05957 {
   public static final MapCodec<class00908> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            Codec.floatRange(0.0F, 1.0F).fieldOf("unenchanted_chance").forGetter(class00908::L),
            class02546.y.fieldOf("enchanted_chance").forGetter(class00908::u),
            class07304.L.fieldOf("enchantment").forGetter(class00908::i)
         )
         .apply(var0, class00908::new)
   );

   public float L() {
      return this.unenchantedChance;
   }

   public class00908(float unenchantedChance, class02546 enchantedChance, class03556<class07304> enchantment) {
      super();
      this.unenchantedChance = unenchantedChance;
      this.enchantedChance = enchantedChance;
      this.enchantment = enchantment;
   }

   public class03556<class07304> i() {
      return this.enchantment;
   }

   public class02546 u() {
      return this.enchantedChance;
   }

   @Override
   public Set<class07491<?>> y() {
      return Set.of(class06551.R);
   }

   public boolean test(class05908 var1) {
      class07049 class07049 = var1.L(class06551.R);
      int i = class07049 instanceof class07438 class07438 ? class07323.N(this.enchantment, class07438) : 0;
      float f = i > 0 ? this.enchantedChance.N(i) : this.unenchantedChance;
      return var1.y().z() < f;
   }

   public static class05952 N(class01929 var0, float var1, float var2) {
      class01921 class01921 = var0.y(class04227.yR);
      return () -> new class00908(var1, new class02532(var1 + var2, var2), class01921.y(class07314.j));
   }

   @Override
   public class05955 N() {
      return class07693.i;
   }
}
