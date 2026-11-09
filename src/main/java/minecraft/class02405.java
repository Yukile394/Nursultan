package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.stream.Stream;

public class class02405 extends class04297 {
   public static final MapCodec<class02405> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class07830.field_24772.fieldOf("heightmap").forGetter(var0x -> var0x.L)).apply(var0, class02405::new)
   );
   private final class07830 L;

   private class02405(class07830 var1) {
      super();
      this.L = var1;
   }

   @Override
   public class04323<?> N() {
      return class04323.U;
   }

   public static class02405 N(class07830 var0) {
      return new class02405(var0);
   }

   @Override
   public Stream<class07209> N(class01034 var1, class06069 var2, class07209 var3) {
      int i = var3.method_10263();
      int j = var3.method_10260();
      int k = var1.N(this.L, i, j);
      return k > var1.N() ? Stream.of(new class07209(i, k, j)) : Stream.of();
   }
}
