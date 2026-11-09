package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Optional;

record class00848(class00816 x, class00816 y, class00816 z) {
   public static final Codec<class00848> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class00816.u.optionalFieldOf("x", class00816.L).forGetter(class00848::N),
            class00816.u.optionalFieldOf("y", class00816.L).forGetter(class00848::y),
            class00816.u.optionalFieldOf("z", class00816.L).forGetter(class00848::L)
         )
         .apply(var0, class00848::new)
   );

   public class00816 L() {
      return this.z;
   }

   private class00848(class00816 x, class00816 y, class00816 z) {
      super();
      this.x = x;
      this.y = y;
      this.z = z;
   }

   public boolean N(double var1, double var3, double var5) {
      return this.x.u(var1) && this.y.u(var3) && this.z.u(var5);
   }

   static Optional<class00848> N(class00816 var0, class00816 var1, class00816 var2) {
      return var0.u() && var1.u() && var2.u() ? Optional.empty() : Optional.of(new class00848(var0, var1, var2));
   }

   public class00816 N() {
      return this.x;
   }
}
