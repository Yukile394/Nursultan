package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.stream.Stream;

public class class03016 extends class04297 {
   public static final MapCodec<class03016> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class02142.N(-16, 16).fieldOf("xz_spread").forGetter(var0x -> var0x.L), class02142.N(-16, 16).fieldOf("y_spread").forGetter(var0x -> var0x.u)
         )
         .apply(var0, class03016::new)
   );
   private final class02142 L;
   private final class02142 u;

   private class03016(class02142 var1, class02142 var2) {
      super();
      this.L = var1;
      this.u = var2;
   }

   public static class03016 y(class02142 var0) {
      return new class03016(var0, class02151.N(0));
   }

   public static class03016 N(class02142 var0, class02142 var1) {
      return new class03016(var0, var1);
   }

   @Override
   public class04323<?> N() {
      return class04323.m;
   }

   @Override
   public Stream<class07209> N(class01034 var1, class06069 var2, class07209 var3) {
      int i = var3.method_10263() + this.L.N(var2);
      int j = var3.method_10264() + this.u.N(var2);
      int k = var3.method_10260() + this.L.N(var2);
      return Stream.of(new class07209(i, j, k));
   }

   public static class03016 N(class02142 var0) {
      return new class03016(class02151.N(0), var0);
   }
}
