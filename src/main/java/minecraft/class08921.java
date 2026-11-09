package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public record class08921() implements class06572 {
   public static final MapCodec<class08921> N = MapCodec.unit(new class08921());

   public class08921() {
      super();
   }

   @Override
   public float N(class06584 var1, @Nullable class03448 var2, @Nullable class08961 var3, int var4) {
      return class05462.u(var1);
   }

   @Override
   public MapCodec<class08921> N() {
      return N;
   }
}
