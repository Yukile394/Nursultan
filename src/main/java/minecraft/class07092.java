package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class class07092 implements class07126 {
   private static final Codec<class06584> N = Codec.withAlternative(class06584.L, class06581.u, class06584::new);
   private final class07103<class07092> y;
   private final class06584 L;

   public class07092(class07103<class07092> var1, class06584 var2) {
      super();
      if (var2.R()) {
         throw new IllegalArgumentException("Empty stacks are not allowed");
      } else {
         this.y = var1;
         this.L = var2;
      }
   }

   public static class02362<? super class04247, class07092> y(class07103<class07092> var0) {
      return class06584.z.N_10(var1 -> new class07092(var0, var1), var0x -> var0x.L);
   }

   public static MapCodec<class07092> N(class07103<class07092> var0) {
      return N.xmap(var1 -> new class07092(var0, var1), var0x -> var0x.L).fieldOf("item");
   }

   public class06584 N() {
      return this.L;
   }

   @Override
   public class07103<class07092> method_10295() {
      return this.y;
   }
}
