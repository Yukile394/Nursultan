package minecraft;

import com.mojang.datafixers.Products.P4;
import com.mojang.datafixers.Products.P5;
import com.mojang.datafixers.Products.P9;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import com.mojang.serialization.codecs.RecordCodecBuilder.Mu;
import java.util.List;
import java.util.Optional;

public class class03548 extends class03532 {
   public static final MapCodec<class03548> N = RecordCodecBuilder.mapCodec(var0 -> y(var0).apply(var0, class03548::new));
   private final int L;
   private final int u;
   private final int i;
   private final class03543<class00780> R;

   public int L() {
      return this.i;
   }

   public class03548(int var1, int var2, int var3, class03543<class00780> var4) {
      this(class00753.field_11176, class03555.field_37782, 1.0F, 0, Optional.empty(), var1, var2, var3, var4);
   }

   public class03548(
      class00753 var1, class03555 var2, float var3, int var4, Optional<class03538> var5, int var6, int var7, int var8, class03543<class00780> var9
   ) {
      super(var1, var2, var3, var4, var5);
      this.L = var6;
      this.u = var7;
      this.i = var8;
      this.R = var9;
   }

   @Override
   public class03549<?> i() {
      return class03549.y;
   }

   public class03543<class00780> u() {
      return this.R;
   }

   public int y() {
      return this.u;
   }

   private static P9<Mu<class03548>, class00753, class03555, Float, Integer, Optional<class03538>, Integer, Integer, Integer, class03543<class00780>> y(
      Instance<class03548> var0
   ) {
      P5 p5 = N(var0);
      P4 p4 = var0.group(
         Codec.intRange(0, 1023).fieldOf("distance").forGetter(class03548::N),
         Codec.intRange(0, 1023).fieldOf("spread").forGetter(class03548::y),
         Codec.intRange(1, 4095).fieldOf("count").forGetter(class03548::L),
         class03541.N(class04227.NA).fieldOf("preferred_biomes").forGetter(class03548::u)
      );
      return new P9(p5.t1(), p5.t2(), p5.t3(), p5.t4(), p5.t5(), p4.t1(), p4.t2(), p4.t3(), p4.t4());
   }

   public int N() {
      return this.L;
   }

   @Override
   protected boolean N(class02045 var1, int var2, int var3) {
      List list = var1.N(this);
      return list == null ? false : list.contains(new class07321(var2, var3));
   }
}
