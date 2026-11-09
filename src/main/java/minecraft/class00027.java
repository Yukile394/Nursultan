package minecraft;

import com.mojang.datafixers.util.Either;
import io.netty.buffer.ByteBuf;
import java.util.UUID;

class class00027 extends class00037 {
   public class00027(Either<UUID, String> var1, class00028 var2, class00667 var3) {
      super(var1, var2, class00025.field_59778);
   }

   class00027(UUID var1) {
      super(Either.left(var1), class00028.L, class00025.field_59778);
   }

   @Override
   public void y(ByteBuf var1) {
   }

   @Override
   public double N(class07049 var1) {
      return Double.POSITIVE_INFINITY;
   }

   @Override
   public class00036 N(class07299 var1, class00007 var2, class00945 var3) {
      return class00036.field_60423;
   }

   @Override
   public double N(class07299 var1, class00023 var2, class00945 var3) {
      return Double.NaN;
   }

   @Override
   public void N(class00037 var1) {
   }
}
