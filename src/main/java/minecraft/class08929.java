package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public record class08929() implements class08909 {
   public static final MapCodec<class08929> N = MapCodec.unit(new class08929());

   public class08929() {
   }

   @Override
   public MapCodec<class08929> N() {
      return N;
   }

   @Override
   public boolean method_65638(class06584 var1, @Nullable class03448 var2, @Nullable class07438 var3, int var4, class03662 var5) {
      return class05462.i(var1);
   }
}
