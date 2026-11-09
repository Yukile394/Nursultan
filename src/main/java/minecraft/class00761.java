package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class00761(class00816 x, class00816 y, class00816 z, class00816 horizontal, class00816 absolute) {
   public static final Codec<class00761> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class00816.u.optionalFieldOf("x", class00816.L).forGetter(class00761::N),
            class00816.u.optionalFieldOf("y", class00816.L).forGetter(class00761::y),
            class00816.u.optionalFieldOf("z", class00816.L).forGetter(class00761::L),
            class00816.u.optionalFieldOf("horizontal", class00816.L).forGetter(class00761::u),
            class00816.u.optionalFieldOf("absolute", class00816.L).forGetter(class00761::i)
         )
         .apply(var0, class00761::new)
   );

   public static class00761 L(class00816 var0) {
      return new class00761(class00816.L, class00816.L, class00816.L, class00816.L, var0);
   }

   public class00816 L() {
      return this.z;
   }

   public class00761(class00816 x, class00816 y, class00816 z, class00816 horizontal, class00816 absolute) {
      this.x = x;
      this.y = y;
      this.z = z;
      this.horizontal = horizontal;
      this.absolute = absolute;
   }

   public class00816 i() {
      return this.absolute;
   }

   public class00816 u() {
      return this.horizontal;
   }

   public static class00761 y(class00816 var0) {
      return new class00761(class00816.L, var0, class00816.L, class00816.L, class00816.L);
   }

   public boolean N(double var1, double var3, double var5, double var7, double var9, double var11) {
      float f = (float)(var1 - var7);
      float f1 = (float)(var3 - var9);
      float f2 = (float)(var5 - var11);
      if (!this.x.u(class04995.L(f)) || !this.y.u(class04995.L(f1)) || !this.z.u(class04995.L(f2))) {
         return false;
      } else {
         return !this.horizontal.i(f * f + f2 * f2) ? false : this.absolute.i(f * f + f1 * f1 + f2 * f2);
      }
   }

   public static class00761 N(class00816 var0) {
      return new class00761(class00816.L, class00816.L, class00816.L, var0, class00816.L);
   }

   public class00816 N() {
      return this.x;
   }
}
