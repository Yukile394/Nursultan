package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class08922(class01894 base, class00335 specialModel) implements class08895 {
   public static final MapCodec<class08922> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class01894.N.fieldOf("base").forGetter(class08922::N), class00333.y.fieldOf("model").forGetter(class08922::y))
         .apply(var0, class08922::new)
   );

   public class08922(class01894 base, class00335 specialModel) {
      this.base = base;
      this.specialModel = specialModel;
   }

   public class00335 y() {
      return this.specialModel;
   }

   public class01894 N() {
      return this.base;
   }

   private class08517 N(class08905 var1) {
      class02028 class02028 = var1.N();
      class08529 class08529 = class02028.N(this.base);
      class08838 class08838 = class08529.B();
      return class08517.N(class02028, class08529, class08838);
   }

   @Override
   public void method_62326(class08350 var1) {
      var1.markDependency(this.base);
   }

   @Override
   public MapCodec<class08922> method_65585() {
      return N;
   }

   @Override
   public class08910 method_65587(class08905 var1) {
      class00368 class00368 = this.specialModel.N(var1);
      if (class00368 == null) {
         return var1.i();
      } else {
         class08517 class08517 = this.N(var1);
         return new class08930(class00368, class08517);
      }
   }
}
