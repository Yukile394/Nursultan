package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class00855(class00836 occupied, class00836 full, class00836 empty) {
   public static final Codec<class00855> N = RecordCodecBuilder.create(
      var0 -> var0.group(
            class00836.u.optionalFieldOf("occupied", class00836.L).forGetter(class00855::N),
            class00836.u.optionalFieldOf("full", class00836.L).forGetter(class00855::y),
            class00836.u.optionalFieldOf("empty", class00836.L).forGetter(class00855::L)
         )
         .apply(var0, class00855::new)
   );
   public static final class00855 y = new class00855(class00836.L, class00836.L, class00836.L);

   public class00836 L() {
      return this.empty;
   }

   public class00855(class00836 occupied, class00836 full, class00836 empty) {
      super();
      this.occupied = occupied;
      this.full = full;
      this.empty = empty;
   }

   public class00836 y() {
      return this.full;
   }

   public boolean N(int var1, int var2, int var3) {
      if (!this.full.u(var1)) {
         return false;
      } else {
         return !this.empty.u(var2) ? false : this.occupied.u(var3);
      }
   }

   public class00836 N() {
      return this.occupied;
   }
}
