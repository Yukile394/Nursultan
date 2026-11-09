package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public record class00315(List<class00299> ingredients, class00299 result, class00299 craftingStation) implements class00265 {
   public static final MapCodec<class00315> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class00299.N.listOf().fieldOf("ingredients").forGetter(class00315::y),
            class00299.N.fieldOf("result").forGetter(class00315::u),
            class00299.N.fieldOf("crafting_station").forGetter(class00315::i)
         )
         .apply(var0, class00315::new)
   );
   public static final class02362<class04247, class00315> y = class02362.N(
      class00299.y.N_33(class02389.N()), class00315::y, class00299.y, class00315::u, class00299.y, class00315::i, class00315::new
   );
   public static final class00273<class00315> L = new class00273<>(N, y);

   public class00315(List<class00299> ingredients, class00299 result, class00299 craftingStation) {
      this.ingredients = ingredients;
      this.result = result;
      this.craftingStation = craftingStation;
   }

   @Override
   public class00299 i() {
      return this.craftingStation;
   }

   @Override
   public class00299 u() {
      return this.result;
   }

   public List<class00299> y() {
      return this.ingredients;
   }

   @Override
   public boolean N(class03767 var1) {
      return this.ingredients.stream().allMatch(var1x -> var1x.N(var1)) && class00265.super.N(var1);
   }

   @Override
   public class00273<class00315> N() {
      return L;
   }
}
