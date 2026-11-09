package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import io.netty.buffer.ByteBuf;

public class class00473 implements class07126 {
   private final class07103<class00473> N;
   private final float y;

   private class00473(class07103<class00473> var1, float var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public static class02362<? super ByteBuf, class00473> y(class07103<class00473> var0) {
      return class02389.E.N_10(var1 -> new class00473(var0, var1), var0x -> var0x.y);
   }

   public static MapCodec<class00473> N(class07103<class00473> var0) {
      return Codec.FLOAT.xmap(var1 -> new class00473(var0, var1), var0x -> var0x.y).optionalFieldOf("power", N(var0, 1.0F));
   }

   public static class00473 N(class07103<class00473> var0, float var1) {
      return new class00473(var0, var1);
   }

   public float N() {
      return this.y;
   }

   @Override
   public class07103<class00473> method_10295() {
      return this.N;
   }
}
