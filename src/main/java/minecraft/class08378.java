package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public record class08378() implements class00372<class05946<class07299>> {
   public static final Codec<class05946<class07299>> N = class05946.N(class04227.yg);
   public static final class00336<class08378, class05946<class07299>> y = class00336.N(MapCodec.unit(new class08378()), N);

   public class08378() {
   }

   @Override
   public Codec<class05946<class07299>> y() {
      return N;
   }

   @Override
   public class00336<class08378, class05946<class07299>> N() {
      return y;
   }

   @Nullable
   public class05946<class07299> y(class06584 var1, @Nullable class03448 var2, @Nullable class07438 var3, int var4, class03662 var5) {
      return var2 != null ? var2.method_27983() : null;
   }
}
