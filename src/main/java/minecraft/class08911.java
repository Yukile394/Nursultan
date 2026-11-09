package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public record class08911() implements class06572 {
   public static final MapCodec<class08911> N = MapCodec.unit(new class08911());

   public class08911() {
   }

   @Override
   public float N(class06584 var1, @Nullable class03448 var2, @Nullable class08961 var3, int var4) {
      if (var3 != null) {
         class07438 class07438 = var3.method_72393();
         if (class07438 instanceof class08036) {
            return ((class08036)class07438).method_7357().N(var1, 0.0F);
         }
      }

      return 0.0F;
   }

   @Override
   public MapCodec<class08911> N() {
      return N;
   }
}
