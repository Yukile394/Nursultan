package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class04033 extends class04050 {
   public static final MapCodec<class04033> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class04025.y.fieldOf("predicate").forGetter(var0x -> var0x.L)).apply(var0, class04033::new)
   );
   private final class04025 L;

   private class04033(class04025 var1) {
      super();
      this.L = var1;
   }

   @Override
   protected boolean y(class01034 var1, class06069 var2, class07209 var3) {
      return this.L.test(var1.y(), var3);
   }

   @Override
   public class04323<?> N() {
      return class04323.N;
   }

   public static class04033 N(class04025 var0) {
      return new class04033(var0);
   }
}
