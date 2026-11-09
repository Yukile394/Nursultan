package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class08604(class03556<class06581> item, int count, class02678 components) {
   private static final Codec<class08604> R = RecordCodecBuilder.create(
      var0 -> var0.group(
            class06581.u.fieldOf("id").forGetter(class08604::y),
            class06338.N(1, 99).optionalFieldOf("count", 1).forGetter(class08604::L),
            class02678.y.optionalFieldOf("components", class02678.N).forGetter(class08604::u)
         )
         .apply(var0, class08604::new)
   );
   public static final Codec<class08604> N = Codec.withAlternative(R, class06581.u, var0 -> new class08604((class06581)var0.N())).validate(class08604::N);
   public static final class02362<class04247, class08604> y = class02362.N(
      class06581.i, class08604::y, class02389.B, class08604::L, class02678.L, class08604::u, class08604::new
   );

   public int L() {
      return this.count;
   }

   public class08604(class06581 var1) {
      this(var1.i(), 1, class02678.N);
   }

   public class08604(class03556<class06581> item, int count, class02678 components) {
      super();
      this.item = item;
      this.count = count;
      this.components = components;
   }

   public class02678 u() {
      return this.components;
   }

   public boolean y(class06584 var1) {
      class06584 class06584 = this.N(var1);
      return class06584.c() == 1 && class06584.L(var1, class06584);
   }

   public class03556<class06581> y() {
      return this.item;
   }

   private static DataResult<class08604> N(class08604 var0) {
      return class06584.N(new class06584(var0.item, var0.count, var0.components)).map(var1 -> var0);
   }

   public class00299 N() {
      return new class00302(new class06584(this.item, this.count, this.components));
   }

   public class06584 N(class06584 var1) {
      class06584 class06584 = var1.N(this.item.N(), this.count);
      class06584.y(this.components);
      return class06584;
   }
}
