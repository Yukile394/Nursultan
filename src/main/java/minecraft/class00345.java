package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public record class00345() implements class00372<class06558> {
   public static final Codec<class06558> N = class06558.field_55209;
   public static final class00336<class00345, class06558> y = class00336.N(MapCodec.unit(new class00345()), N);

   public class00345() {
      super();
   }

   @Override
   public Codec<class06558> y() {
      return N;
   }

   @Override
   public class00336<class00345, class06558> N() {
      return y;
   }

   public class06558 y(class06584 var1, @Nullable class03448 var2, @Nullable class07438 var3, int var4, class03662 var5) {
      class02820 class02820 = var1.method_58694(class02484.x);
      if (class02820 == null || class02820.y()) {
         return class06558.field_55206;
      } else {
         return class02820.N(class06570.GJ) ? class06558.field_55208 : class06558.field_55207;
      }
   }
}
