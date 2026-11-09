package minecraft;

import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public class class05602 implements class06386 {
   public static final Codec<class05602> N = class06338.L(class04336.L).fieldOf("features").xmap(class05602::new, var0 -> var0.y).codec();
   public final class03543<class04336> y;

   public class05602(class03543<class04336> var1) {
      super();
      this.y = var1;
   }

   @Override
   public Stream<class03238<?, ?>> u() {
      return this.y.N().flatMap(var0 -> var0.N().N());
   }
}
