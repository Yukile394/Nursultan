package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class02515(class03543<class07304> enchantments, class02142 cost) implements class02530 {
   public static final MapCodec<class02515> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class03541.N(class04227.yR).fieldOf("enchantments").forGetter(class02515::y), class02142.L.fieldOf("cost").forGetter(class02515::L))
         .apply(var0, class02515::new)
   );

   public class02142 L() {
      return this.cost;
   }

   public class02515(class03543<class07304> enchantments, class02142 cost) {
      super();
      this.enchantments = enchantments;
      this.cost = cost;
   }

   public class03543<class07304> y() {
      return this.enchantments;
   }

   @Override
   public MapCodec<class02515> N() {
      return y;
   }

   @Override
   public void N(class06584 var1, class02715 var2, class06069 var3, class07052 var4) {
      for (class07317 class07317 : class07323.y(var3, var1, this.cost.N(var3), this.enchantments.N())) {
         var2.y(class07317.y(), class07317.L());
      }
   }
}
