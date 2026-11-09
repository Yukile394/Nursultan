package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class06050 {
   public static final class06050 N = new class06050(false, class00869.Bs.W(), class00869.Te.W(), class00869.iX.W(), class00869.ND.W());
   public static final Codec<class06050> y = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.BOOL.optionalFieldOf("debug_mode", false).forGetter(class06050::N),
            class00500.N.optionalFieldOf("air_state", N.y()).forGetter(class06050::y),
            class00500.N.optionalFieldOf("water_state", N.y()).forGetter(class06050::L),
            class00500.N.optionalFieldOf("lava_state", N.y()).forGetter(class06050::u),
            class00500.N.optionalFieldOf("barrier_state", N.y()).forGetter(class06050::i)
         )
         .apply(var0, class06050::new)
   );
   private final boolean L;
   private final class00500 u;
   private final class00500 i;
   private final class00500 R;
   private final class00500 M;

   public class00500 L() {
      return this.i;
   }

   private class06050(boolean var1, class00500 var2, class00500 var3, class00500 var4, class00500 var5) {
      super();
      this.L = var1;
      this.u = var2;
      this.i = var3;
      this.R = var4;
      this.M = var5;
   }

   public class00500 i() {
      return this.M;
   }

   public class00500 u() {
      return this.R;
   }

   public class00500 y() {
      return this.u;
   }

   public static class06050 N(boolean var0, class00500 var1, class00500 var2, class00500 var3, class00500 var4) {
      return new class06050(var0, var1, var2, var3, var4);
   }

   public static class06050 N(class00500 var0, class00500 var1, class00500 var2, class00500 var3) {
      return new class06050(false, var0, var1, var2, var3);
   }

   public static class06050 N(boolean var0, class00500 var1) {
      return new class06050(var0, var1, N.L(), N.u(), N.i());
   }

   public boolean N() {
      return this.L;
   }
}
