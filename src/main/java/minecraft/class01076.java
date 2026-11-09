package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class01076 {
   public static final Codec<class01076> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.INT.fieldOf("centerX").orElse(0).forGetter(var0x -> var0x.y),
            Codec.INT.fieldOf("centerZ").orElse(0).forGetter(var0x -> var0x.L),
            Codec.INT.fieldOf("radius").orElse(0).forGetter(var0x -> var0x.u),
            Codec.INT.fieldOf("height").orElse(0).forGetter(var0x -> var0x.i),
            Codec.BOOL.fieldOf("guarded").orElse(false).forGetter(var0x -> var0x.R)
         )
         .apply(var0, class01076::new)
   );
   private final int y;
   private final int L;
   private final int u;
   private final int i;
   private final boolean R;
   private final class00734 M;

   public int L() {
      return this.u;
   }

   public class01076(int var1, int var2, int var3, int var4, boolean var5) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
      this.i = var4;
      this.R = var5;
      this.M = new class00734(var1 - var3, class07376.i, var2 - var3, var1 + var3, class07376.u, var2 + var3);
   }

   public boolean i() {
      return this.R;
   }

   public int u() {
      return this.i;
   }

   public int y() {
      return this.L;
   }

   public boolean N(class07209 var1) {
      return class01296.N(var1.method_10263()) == class01296.N(this.y) && class01296.N(var1.method_10260()) == class01296.N(this.L);
   }

   public int N() {
      return this.y;
   }

   public class00734 R() {
      return this.M;
   }
}
