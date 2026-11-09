package minecraft;

import com.mojang.serialization.MapCodec;

public class class03619<P extends class03647> {
   public static final class03619<class03636> N = N("mangrove_root_placer", class03636.L);
   private final MapCodec<P> y;

   public class03619(MapCodec<P> var1) {
      super();
      this.y = var1;
   }

   private static <P extends class03647> class03619<P> N(String var0, MapCodec<P> var1) {
      return class00751.N(class04206.x, var0, new class03619<>(var1));
   }

   public MapCodec<P> N() {
      return this.y;
   }
}
