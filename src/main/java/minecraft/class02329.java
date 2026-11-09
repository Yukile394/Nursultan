package minecraft;

import com.mojang.serialization.MapCodec;
import io.netty.buffer.ByteBuf;

public class class02329 implements class07126 {
   private final class07103<class02329> N;
   private final int y;

   public float L() {
      return class02566.i(this.y) / 255.0F;
   }

   private class02329(class07103<class02329> var1, int var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public float u() {
      return class02566.y(this.y) / 255.0F;
   }

   public float y() {
      return class02566.u(this.y) / 255.0F;
   }

   public static class02362<? super ByteBuf, class02329> y(class07103<class02329> var0) {
      return class02389.M.N_10(var1 -> new class02329(var0, var1), var0x -> var0x.y);
   }

   public static MapCodec<class02329> N(class07103<class02329> var0) {
      return class06338.W.xmap(var1 -> new class02329(var0, var1), var0x -> var0x.y).fieldOf("color");
   }

   public float N() {
      return class02566.L(this.y) / 255.0F;
   }

   public static class02329 N(class07103<class02329> var0, int var1) {
      return new class02329(var0, var1);
   }

   public static class02329 N(class07103<class02329> var0, float var1, float var2, float var3) {
      return N(var0, class02566.N(1.0F, var1, var2, var3));
   }

   @Override
   public class07103<class02329> method_10295() {
      return this.N;
   }
}
