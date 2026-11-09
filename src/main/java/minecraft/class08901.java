package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public record class08901() implements class08909 {
   public static final MapCodec<class08901> N = MapCodec.unit(new class08901());

   public class08901() {
   }

   @Override
   public MapCodec<class08901> N() {
      return N;
   }

   @Override
   public boolean method_65638(class06584 var1, @Nullable class03448 var2, @Nullable class07438 var3, int var4, class03662 var5) {
      if (var3 instanceof class08036 class08036 && class08036.fields_57fa3311b0e9d3e9b883d09222919bf5a_2 != null) {
         class07070 class07070 = class03817.N(class08036);
         return var3.method_61420(class07070) == var1;
      } else {
         return false;
      }
   }
}
