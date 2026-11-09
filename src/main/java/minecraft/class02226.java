package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class02226(class02546 amount) implements class06378 {
   public static final MapCodec<class02226> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class02546.y.fieldOf("amount").forGetter(class02226::L)).apply(var0, class02226::new)
   );

   public class02546 L() {
      return this.amount;
   }

   public class02226(class02546 amount) {
      this.amount = amount;
   }

   @Override
   public float y(class05908 var1) {
      int i = var1.y(class06551.W);
      return this.amount.N(i);
   }

   public static class02226 N(class02546 var0) {
      return new class02226(var0);
   }

   @Override
   public class06341 N() {
      return class06339.M;
   }
}
