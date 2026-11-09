package minecraft;

import com.mojang.serialization.MapCodec;

public class class06623 {
   private static final class06333<String, MapCodec<? extends class04457>> y = new class06333<>();
   public static final MapCodec<class04457> N = class03748.N(y, class04457::N, "source");

   public class06623() {
      super();
   }

   static {
      y.N("entity", class00403.N);
      y.N("block", class00397.N);
      y.N("storage", class01449.N);
   }
}
