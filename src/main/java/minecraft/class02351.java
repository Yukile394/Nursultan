package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

record class02351(int bonusMultiplier) implements class02339 {
   public static final Codec<class02351> N = RecordCodecBuilder.create(
      var0 -> var0.group(Codec.INT.fieldOf("bonusMultiplier").forGetter(class02351::y)).apply(var0, class02351::new)
   );
   public static final class02320 y = new class02320(class01894.y("uniform_bonus_count"), N);

   class02351(int bonusMultiplier) {
      this.bonusMultiplier = bonusMultiplier;
   }

   public int y() {
      return this.bonusMultiplier;
   }

   @Override
   public class02320 N() {
      return y;
   }

   @Override
   public int N(class06069 var1, int var2, int var3) {
      return var2 + var1.y(this.bonusMultiplier * var3 + 1);
   }
}
