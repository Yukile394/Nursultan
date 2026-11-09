package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.OptionalInt;

public class class05046 extends class05054 {
   public static final MapCodec<class05046> u = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            Codec.intRange(0, 81).fieldOf("limit").orElse(1).forGetter(var0x -> var0x.i),
            Codec.intRange(0, 16).fieldOf("lower_size").orElse(0).forGetter(var0x -> var0x.R),
            Codec.intRange(0, 16).fieldOf("upper_size").orElse(1).forGetter(var0x -> var0x.M),
            N()
         )
         .apply(var0, class05046::new)
   );
   private final int i;
   private final int R;
   private final int M;

   public class05046(int var1, int var2, int var3) {
      this(var1, var2, var3, OptionalInt.empty());
   }

   public class05046(int var1, int var2, int var3, OptionalInt var4) {
      super(var4);
      this.i = var1;
      this.R = var2;
      this.M = var3;
   }

   @Override
   protected class05052<?> y() {
      return class05052.N;
   }

   @Override
   public int N(int var1, int var2) {
      return var2 < this.i ? this.R : this.M;
   }
}
