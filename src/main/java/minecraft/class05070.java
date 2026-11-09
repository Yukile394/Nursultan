package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.OptionalInt;

public class class05070 extends class05054 {
   public static final MapCodec<class05070> u = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            Codec.intRange(0, 80).fieldOf("limit").orElse(1).forGetter(var0x -> var0x.i),
            Codec.intRange(0, 80).fieldOf("upper_limit").orElse(1).forGetter(var0x -> var0x.R),
            Codec.intRange(0, 16).fieldOf("lower_size").orElse(0).forGetter(var0x -> var0x.M),
            Codec.intRange(0, 16).fieldOf("middle_size").orElse(1).forGetter(var0x -> var0x.B),
            Codec.intRange(0, 16).fieldOf("upper_size").orElse(1).forGetter(var0x -> var0x.Z),
            N()
         )
         .apply(var0, class05070::new)
   );
   private final int i;
   private final int R;
   private final int M;
   private final int B;
   private final int Z;

   public class05070(int var1, int var2, int var3, int var4, int var5, OptionalInt var6) {
      super(var6);
      this.i = var1;
      this.R = var2;
      this.M = var3;
      this.B = var4;
      this.Z = var5;
   }

   @Override
   protected class05052<?> y() {
      return class05052.y;
   }

   @Override
   public int N(int var1, int var2) {
      if (var2 < this.i) {
         return this.M;
      } else {
         return var2 >= var1 - this.R ? this.Z : this.B;
      }
   }
}
