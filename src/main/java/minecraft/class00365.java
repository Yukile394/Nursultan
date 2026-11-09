package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public record class00365() implements class00372<class05946<class03252>> {
   public static final Codec<class05946<class03252>> N = class05946.N(class04227.yw);
   public static final class00336<class00365, class05946<class03252>> y = class00336.N(MapCodec.unit(new class00365()), N);

   public class00365() {
   }

   @Override
   public Codec<class05946<class03252>> y() {
      return N;
   }

   @Override
   public class00336<class00365, class05946<class03252>> N() {
      return y;
   }

   @Nullable
   public class05946<class03252> y(class06584 var1, @Nullable class03448 var2, @Nullable class07438 var3, int var4, class03662 var5) {
      class03254 class03254 = var1.method_58694(class02484.Nu);
      return class03254 == null ? null : class03254.N().i().orElse(null);
   }
}
