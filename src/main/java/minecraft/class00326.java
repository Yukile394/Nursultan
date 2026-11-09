package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.List;

public record class00326(int width, int height, List<class00299> ingredients, class00299 result, class00299 craftingStation) implements class00265 {
   public static final MapCodec<class00326> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            Codec.INT.fieldOf("width").forGetter(class00326::y),
            Codec.INT.fieldOf("height").forGetter(class00326::L),
            class00299.N.listOf().fieldOf("ingredients").forGetter(class00326::R),
            class00299.N.fieldOf("result").forGetter(class00326::u),
            class00299.N.fieldOf("crafting_station").forGetter(class00326::i)
         )
         .apply(var0, class00326::new)
   );
   public static final class02362<class04247, class00326> y = class02362.N(
      class02389.B,
      class00326::y,
      class02389.B,
      class00326::L,
      class00299.y.N_33(class02389.N()),
      class00326::R,
      class00299.y,
      class00326::u,
      class00299.y,
      class00326::i,
      class00326::new
   );
   public static final class00273<class00326> L = new class00273<>(N, y);

   public int L() {
      return this.height;
   }

   public class00326(int width, int height, List<class00299> ingredients, class00299 result, class00299 craftingStation) {
      super();
      if (ingredients.size() != width * height) {
         throw new IllegalArgumentException("Invalid shaped recipe display contents");
      } else {
         this.width = width;
         this.height = height;
         this.ingredients = ingredients;
         this.result = result;
         this.craftingStation = craftingStation;
      }
   }

   @Override
   public class00299 i() {
      return this.craftingStation;
   }

   @Override
   public class00299 u() {
      return this.result;
   }

   public int y() {
      return this.width;
   }

   @Override
   public boolean N(class03767 var1) {
      return this.ingredients.stream().allMatch(var1x -> var1x.N(var1)) && class00265.super.N(var1);
   }

   @Override
   public class00273<class00326> N() {
      return L;
   }

   public List<class00299> R() {
      return this.ingredients;
   }
}
