package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.stream.Stream;

public class class04308 extends class04297 {
   public static final MapCodec<class04308> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class03855.L.fieldOf("height").forGetter(var0x -> var0x.L)).apply(var0, class04308::new)
   );
   private final class03855 L;

   private class04308(class03855 var1) {
      super();
      this.L = var1;
   }

   public static class04308 y(class06055 var0, class06055 var1) {
      return N(class01708.N(var0, var1));
   }

   @Override
   public Stream<class07209> N(class01034 var1, class06069 var2, class07209 var3) {
      return Stream.of(var3.method_33096(this.L.N(var2, var1)));
   }

   @Override
   public class04323<?> N() {
      return class04323.E;
   }

   public static class04308 N(class03855 var0) {
      return new class04308(var0);
   }

   public static class04308 N(class06055 var0, class06055 var1) {
      return N(class03854.N(var0, var1));
   }
}
