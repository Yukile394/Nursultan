package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class02555(class03556<class07304> enchantment, class02142 level) implements class02530 {
   public static final MapCodec<class02555> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class07304.L.fieldOf("enchantment").forGetter(class02555::y), class02142.L.fieldOf("level").forGetter(class02555::L))
         .apply(var0, class02555::new)
   );

   public class02142 L() {
      return this.level;
   }

   public class02555(class03556<class07304> enchantment, class02142 level) {
      super();
      this.enchantment = enchantment;
      this.level = level;
   }

   public class03556<class07304> y() {
      return this.enchantment;
   }

   @Override
   public MapCodec<class02555> N() {
      return y;
   }

   @Override
   public void N(class06584 var1, class02715 var2, class06069 var3, class07052 var4) {
      var2.y(this.enchantment, class04995.N(this.level.N(var3), this.enchantment.N().u(), this.enchantment.N().i()));
   }
}
