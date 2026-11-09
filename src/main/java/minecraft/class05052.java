package minecraft;

import com.mojang.serialization.MapCodec;

public class class05052<P extends class05054> {
   public static final class05052<class05046> N = N("two_layers_feature_size", class05046.u);
   public static final class05052<class05070> y = N("three_layers_feature_size", class05070.u);
   private final MapCodec<P> L;

   private class05052(MapCodec<P> var1) {
      super();
      this.L = var1;
   }

   private static <P extends class05054> class05052<P> N(String var0, MapCodec<P> var1) {
      return class00751.N(class04206.h, var0, new class05052<>(var1));
   }

   public MapCodec<P> N() {
      return this.L;
   }
}
