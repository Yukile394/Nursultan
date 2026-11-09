package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class02545(class03543<class07304> enchantments, int minCost, int maxCostSpan) implements class02530 {
   public static final int y = 10000;
   public static final MapCodec<class02545> L = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class03541.N(class04227.yR).fieldOf("enchantments").forGetter(class02545::y),
            class06338.N(1, 10000).fieldOf("min_cost").forGetter(class02545::L),
            class06338.N(0, 10000).fieldOf("max_cost_span").forGetter(class02545::u)
         )
         .apply(var0, class02545::new)
   );

   public int L() {
      return this.minCost;
   }

   public class02545(class03543<class07304> enchantments, int minCost, int maxCostSpan) {
      super();
      this.enchantments = enchantments;
      this.minCost = minCost;
      this.maxCostSpan = maxCostSpan;
   }

   public int u() {
      return this.maxCostSpan;
   }

   public class03543<class07304> y() {
      return this.enchantments;
   }

   @Override
   public void N(class06584 var1, class02715 var2, class06069 var3, class07052 var4) {
      float f = var4.u();
      int i = class04995.y(var3, this.minCost, this.minCost + (int)(f * this.maxCostSpan));

      for (class07317 class07317 : class07323.y(var3, var1, i, this.enchantments.N())) {
         var2.y(class07317.y(), class07317.L());
      }
   }

   @Override
   public MapCodec<class02545> N() {
      return L;
   }
}
