package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public record class00356() implements class00372<class03662> {
   public static final Codec<class03662> N = class03662.field_42468;
   public static final class00336<class00356, class03662> y = class00336.N(MapCodec.unit(new class00356()), N);

   public class00356() {
   }

   @Override
   public Codec<class03662> y() {
      return N;
   }

   @Override
   public class00336<class00356, class03662> N() {
      return y;
   }

   public class03662 y(class06584 var1, @Nullable class03448 var2, @Nullable class07438 var3, int var4, class03662 var5) {
      return var5;
   }
}
