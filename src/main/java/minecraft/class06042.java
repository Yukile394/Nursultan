package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;

public class class06042 extends class06052 {
   public static final class06042 N = new class06042(0.0F);
   public static final MapCodec<class06042> y = Codec.FLOAT.fieldOf("value").xmap(class06042::N, class06042::d);
   private final float u;

   @Override
   public class06061<?> L() {
      return class06061.N;
   }

   private class06042(float var1) {
      super();
      this.u = var1;
   }

   @Override
   public String toString() {
      return Float.toString(this.u);
   }

   public float u() {
      return this.u;
   }

   @Override
   public float y() {
      return this.u;
   }

   public static class06042 N(float var0) {
      return var0 == 0.0F ? N : new class06042(var0);
   }

   @Override
   public float N() {
      return this.u;
   }

   @Override
   public float N(class06069 var1) {
      return this.u;
   }

   public float d() {
      return this.u;
   }
}
