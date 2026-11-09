package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class00309(class00299 template, class00299 base, class00299 addition, class00299 result, class00299 craftingStation) implements class00265 {
   public static final MapCodec<class00309> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class00299.N.fieldOf("template").forGetter(class00309::y),
            class00299.N.fieldOf("base").forGetter(class00309::L),
            class00299.N.fieldOf("addition").forGetter(class00309::R),
            class00299.N.fieldOf("result").forGetter(class00309::u),
            class00299.N.fieldOf("crafting_station").forGetter(class00309::i)
         )
         .apply(var0, class00309::new)
   );
   public static final class02362<class04247, class00309> y = class02362.N(
      class00299.y,
      class00309::y,
      class00299.y,
      class00309::L,
      class00299.y,
      class00309::R,
      class00299.y,
      class00309::u,
      class00299.y,
      class00309::i,
      class00309::new
   );
   public static final class00273<class00309> L = new class00273<>(N, y);

   public class00299 L() {
      return this.base;
   }

   public class00309(class00299 template, class00299 base, class00299 addition, class00299 result, class00299 craftingStation) {
      this.template = template;
      this.base = base;
      this.addition = addition;
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

   public class00299 y() {
      return this.template;
   }

   @Override
   public class00273<class00309> N() {
      return L;
   }

   public class00299 R() {
      return this.addition;
   }
}
