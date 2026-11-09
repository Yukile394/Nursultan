package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;

public record class08332(int slot, class06584 stack) {
   public static final Codec<class08332> N = RecordCodecBuilder.create(
      var0 -> var0.group(class06338.s.fieldOf("Slot").orElse(0).forGetter(class08332::N), class06584.N.forGetter(class08332::y)).apply(var0, class08332::new)
   );

   public class08332(int slot, class06584 stack) {
      super();
      this.slot = slot;
      this.stack = stack;
   }

   public class06584 y() {
      return this.stack;
   }

   public int N() {
      return this.slot;
   }

   public boolean N(int var1) {
      return this.slot >= 0 && this.slot < var1;
   }
}
