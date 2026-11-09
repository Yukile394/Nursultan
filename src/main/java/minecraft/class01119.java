package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class01119 {
   private static final Codec<Double> R = Codec.doubleRange(0.01, 50.0);
   public static final Codec<class01119> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            R.fieldOf("filling").orElse(1.7).forGetter(var0x -> var0x.y),
            R.fieldOf("inner_layer").orElse(2.2).forGetter(var0x -> var0x.L),
            R.fieldOf("middle_layer").orElse(3.2).forGetter(var0x -> var0x.u),
            R.fieldOf("outer_layer").orElse(4.2).forGetter(var0x -> var0x.i)
         )
         .apply(var0, class01119::new)
   );
   public final double y;
   public final double L;
   public final double u;
   public final double i;

   public class01119(double var1, double var3, double var5, double var7) {
      super();
      this.y = var1;
      this.L = var3;
      this.u = var5;
      this.i = var7;
   }
}
