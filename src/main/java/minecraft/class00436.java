package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import io.netty.buffer.ByteBuf;

public class class00436 implements class07126 {
   private final class07103<class00436> N;
   private final int y;
   private final float L;

   public float L() {
      return class02566.i(this.y) / 255.0F;
   }

   private class00436(class07103<class00436> var1, int var2, float var3) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
   }

   public float u() {
      return this.L;
   }

   public static class02362<? super ByteBuf, class00436> y(class07103<class00436> var0) {
      return class02362.N(class02389.M, var0x -> var0x.y, class02389.E, var0x -> var0x.L, (var1, var2) -> new class00436(var0, var1, var2));
   }

   public float y() {
      return class02566.u(this.y) / 255.0F;
   }

   public static MapCodec<class00436> N(class07103<class00436> var0) {
      return RecordCodecBuilder.mapCodec(
         var1 -> var1.group(
               class06338.E.optionalFieldOf("color", -1).forGetter(var0xx -> var0xx.y),
               Codec.FLOAT.optionalFieldOf("power", 1.0F).forGetter(var0xx -> var0xx.L)
            )
            .apply(var1, (var1x, var2) -> new class00436(var0, var1x, var2))
      );
   }

   public float N() {
      return class02566.L(this.y) / 255.0F;
   }

   public static class00436 N(class07103<class00436> var0, int var1, float var2) {
      return new class00436(var0, var1, var2);
   }

   public static class00436 N(class07103<class00436> var0, float var1, float var2, float var3, float var4) {
      return N(var0, class02566.N(1.0F, var1, var2, var3), var4);
   }

   @Override
   public class07103<class00436> method_10295() {
      return this.N;
   }
}
