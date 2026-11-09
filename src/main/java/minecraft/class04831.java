package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import java.util.Set;

public record class04831(class01894 id) implements class04794 {
   public static final MapCodec<class04831> N = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(class01894.N.fieldOf("source").forGetter(class04831::L)).apply(var0, class04831::new)
   );

   public class01894 L() {
      return this.id;
   }

   public class04831(class01894 id) {
      this.id = id;
   }

   @Override
   public Set<class07491<?>> y() {
      return Set.of();
   }

   @Override
   public class07709 N(class05908 var1) {
      return var1.u().method_8503().yZ().N(this.id);
   }

   @Override
   public class04837 N() {
      return class04821.y;
   }
}
