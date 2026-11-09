package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public record class08903() implements class08909 {
   public static final MapCodec<class08903> N = MapCodec.unit(new class08903());

   public class08903() {
   }

   @Override
   public MapCodec<class08903> N() {
      return N;
   }

   @Override
   public boolean method_65638(class06584 var1, @Nullable class03448 var2, @Nullable class07438 var3, int var4, class03662 var5) {
      return var5 == class03662.field_4317 && class06202.Nq().L();
   }
}
