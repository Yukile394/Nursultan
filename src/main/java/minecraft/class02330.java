package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

record class02330(int extraRounds, float probability) implements class02339 {
   private static final Codec<class02330> u = RecordCodecBuilder.create(
      var0 -> var0.group(Codec.INT.fieldOf("extra").forGetter(class02330::y), Codec.FLOAT.fieldOf("probability").forGetter(class02330::L))
         .apply(var0, class02330::new)
   );
   public static final class02320 N = new class02320(class01894.y("binomial_with_bonus_count"), u);

   public float L() {
      return this.probability;
   }

   class02330(int extraRounds, float probability) {
      super();
      this.extraRounds = extraRounds;
      this.probability = probability;
   }

   public int y() {
      return this.extraRounds;
   }

   @Override
   public class02320 N() {
      return N;
   }

   @Override
   public int N(class06069 var1, int var2, int var3) {
      for (int i = 0; i < var3 + this.extraRounds; i++) {
         if (var1.z() < this.probability) {
            var2++;
         }
      }

      return var2;
   }
}
