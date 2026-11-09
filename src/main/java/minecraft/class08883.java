package minecraft;

import com.mojang.serialization.Codec;

public record class08883(class03674 variant) implements class08880 {
   public static final Codec<class08883> u = class03674.y.xmap(class08883::new, class08883::y);

   public class08883(class03674 variant) {
      super();
      this.variant = variant;
   }

   public class03674 y() {
      return this.variant;
   }

   @Override
   public void method_62326(class08350 var1) {
      this.variant.method_62326(var1);
   }

   @Override
   public class08887 method_68521(class02028 var1) {
      return new class08857(this.variant.N(var1));
   }
}
