package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class00240(class00299 ingredient, class00299 fuel, class00299 result, class00299 craftingStation, int duration, float experience)
   implements class00265 {
   public static final MapCodec<class00240> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class00299.N.fieldOf("ingredient").forGetter(class00240::y),
            class00299.N.fieldOf("fuel").forGetter(class00240::L),
            class00299.N.fieldOf("result").forGetter(class00240::u),
            class00299.N.fieldOf("crafting_station").forGetter(class00240::i),
            Codec.INT.fieldOf("duration").forGetter(class00240::R),
            Codec.FLOAT.fieldOf("experience").forGetter(class00240::M)
         )
         .apply(var0, class00240::new)
   );
   public static final class02362<class04247, class00240> y = class02362.N(
      class00299.y,
      class00240::y,
      class00299.y,
      class00240::L,
      class00299.y,
      class00240::u,
      class00299.y,
      class00240::i,
      class02389.B,
      class00240::R,
      class02389.E,
      class00240::M,
      class00240::new
   );
   public static final class00273<class00240> L = new class00273<>(N, y);

   public class00299 L() {
      return this.fuel;
   }

   public float M() {
      return this.experience;
   }

   public class00240(class00299 ingredient, class00299 fuel, class00299 result, class00299 craftingStation, int duration, float experience) {
      this.ingredient = ingredient;
      this.fuel = fuel;
      this.result = result;
      this.craftingStation = craftingStation;
      this.duration = duration;
      this.experience = experience;
   }

   @Override
   public class00299 i() {
      return this.craftingStation;
   }

   @Override
   public class00299 u() {
      return this.result;
   }

   public class00299 y() {
      return this.ingredient;
   }

   @Override
   public class00273<class00240> N() {
      return L;
   }

   @Override
   public boolean N(class03767 var1) {
      return this.ingredient.N(var1) && this.L().N(var1) && class00265.super.N(var1);
   }

   public int R() {
      return this.duration;
   }
}
