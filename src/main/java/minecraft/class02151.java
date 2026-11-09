package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class class02151 extends class02142 {
   public static final class02151 N = new class02151(0);
   public static final MapCodec<class02151> y = Codec.INT.fieldOf("value").xmap(class02151::N, class02151::d);
   private final int R;

   @Override
   public int L() {
      return this.R;
   }

   private class02151(int var1) {
      super();
      this.R = var1;
   }

   @Override
   public String toString() {
      return Integer.toString(this.R);
   }

   @Override
   public class02139<?> u() {
      return class02139.N;
   }

   @Override
   public int y() {
      return this.R;
   }

   public static class02151 N(int var0) {
      return var0 == 0 ? N : new class02151(var0);
   }

   public int N() {
      return this.R;
   }

   @Override
   public int N(class06069 var1) {
      return this.R;
   }

   public int d() {
      return this.R;
   }
}
