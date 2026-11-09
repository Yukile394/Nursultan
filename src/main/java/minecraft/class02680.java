package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;
import java.util.function.UnaryOperator;

public record class02680(class03556<class06581> item, int count, class02471 components, class06584 itemStack) {
   public static final Codec<class02680> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class06581.u.fieldOf("id").forGetter(class02680::N),
            class06338.b.fieldOf("count").orElse(1).forGetter(class02680::y),
            class02471.N.optionalFieldOf("components", class02471.L).forGetter(class02680::L)
         )
         .apply(var0, class02680::new)
   );
   public static final class02362<class04247, class02680> y = class02362.N(
      class06581.i, class02680::N, class02389.B, class02680::y, class02471.y, class02680::L, class02680::new
   );
   public static final class02362<class04247, Optional<class02680>> L = y.N_33(class02389::N);

   public class02471 L() {
      return this.components;
   }

   public class02680(class03556<class06581> item, int count, class02471 components, class06584 itemStack) {
      this.item = item;
      this.count = count;
      this.components = components;
      this.itemStack = itemStack;
   }

   public class02680(class03556<class06581> var1, int var2, class02471 var3) {
      this(var1, var2, var3, N(var1, var2, var3));
   }

   public class02680(class07310 var1, int var2) {
      this(var1.B().i(), var2, class02471.L);
   }

   public class02680(class07310 var1) {
      this(var1, 1);
   }

   public class06584 u() {
      return this.itemStack;
   }

   public int y() {
      return this.count;
   }

   public boolean N(class06584 var1) {
      return var1.N(this.item) && this.components.test((class02666)var1);
   }

   private static class06584 N(class03556<class06581> var0, int var1, class02471 var2) {
      return new class06584(var0, var1, var2.u());
   }

   public class02680 N(UnaryOperator<class02504> var1) {
      return new class02680(this.item, this.count, var1.apply(class02471.N()).N());
   }

   public class03556<class06581> N() {
      return this.item;
   }
}
