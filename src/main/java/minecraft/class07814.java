package minecraft;

import com.google.gson.JsonElement;
import com.mojang.serialization.JsonOps;
import io.netty.buffer.ByteBuf;

public record class07814(class00392 reason) implements class00381<class07844> {
   private static final class03519<JsonElement> L = class01042.y.N(JsonOps.INSTANCE);
   public static final class02362<ByteBuf, class07814> N = class02362.N(
      class02389.R(262144).N_33(class02389.N(L, class03748.N)), class07814::N, class07814::new
   );

   public class07814(class00392 reason) {
      super();
      this.reason = reason;
   }

   public void method_65081(class07844 var1) {
      var1.N(this);
   }

   public class00392 N() {
      return this.reason;
   }

   @Override
   public class02897<class07814> method_65080() {
      return class04271.i;
   }
}
