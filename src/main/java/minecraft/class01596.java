package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public class class01596 {
   public static final MapCodec<class01596> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class04206.NY.T().fieldOf("type").forGetter(class01596::N),
            class06338.T.fieldOf("level").forGetter(class01596::y),
            Codec.LONG.optionalFieldOf("ticks_left", 0L).forGetter(var0x -> var0x.u)
         )
         .apply(var0, class01596::new)
   );
   private final class01624 y;
   private final int L;
   private long u;

   public void L() {
      this.u = this.y.M();
   }

   public class01596(class01624 var1, int var2) {
      this(var1, var2, var1.M());
   }

   private class01596(class01624 var1, int var2, long var3) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
   }

   @Override
   public String toString() {
      return this.y.R()
         ? "Ticket[" + class07536.N(class04206.NY, this.y) + " " + this.L + "] with " + this.u + " ticks left ( out of" + this.y.M() + ")"
         : "Ticket[" + class07536.N(class04206.NY, this.y) + " " + this.L + "] with no timeout";
   }

   public boolean i() {
      return this.y.R() && this.u < 0L;
   }

   public void u() {
      if (this.y.R()) {
         this.u--;
      }
   }

   public int y() {
      return this.L;
   }

   public class01624 N() {
      return this.y;
   }
}
