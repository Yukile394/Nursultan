package minecraft;

import com.mojang.serialization.MapCodec;
import org.jspecify.annotations.Nullable;

public record class08767() implements class00335 {
   public static final MapCodec<class08767> N = MapCodec.unit(class08767::new);

   public class08767() {
      super();
   }

   @Override
   public MapCodec<class08767> N() {
      return N;
   }

   @Nullable
   @Override
   public class00368<?> N(class00331 var1) {
      class01097 class01097 = class03359.N(var1.y(), class07032.field_11510);
      return class01097 == null ? null : new class08779(var1.u(), class01097);
   }
}
