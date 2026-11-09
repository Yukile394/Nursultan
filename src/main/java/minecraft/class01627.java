package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class01627 {
   public static final Codec<class01627> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            Codec.intRange(0, class07376.L).fieldOf("height").forGetter(class01627::N),
            class04206.i.T().fieldOf("block").orElse(class00869.N).forGetter(var0x -> var0x.y().i())
         )
         .apply(var0, class01627::new)
   );
   private final class00891 y;
   private final int L;

   public class01627(int var1, class00891 var2) {
      super();
      this.L = var1;
      this.y = var2;
   }

   @Override
   public String toString() {
      return (this.L != 1 ? this.L + "*" : "") + class04206.i.y(this.y);
   }

   public class00500 y() {
      return this.y.W();
   }

   public class01627 N(int var1) {
      return this.L > var1 ? new class01627(var1, this.y) : this;
   }

   public int N() {
      return this.L;
   }
}
