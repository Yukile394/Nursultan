package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public record class08925() implements class08909 {
   public static final MapCodec<class08925> N = MapCodec.unit(new class08925());

   public class08925() {
      super();
   }

   @Override
   public MapCodec<class08925> N() {
      return N;
   }

   @Override
   public boolean method_65638(class06584 var1, @Nullable class03448 var2, @Nullable class07438 var3, int var4, class03662 var5) {
      return var1.m();
   }
}
