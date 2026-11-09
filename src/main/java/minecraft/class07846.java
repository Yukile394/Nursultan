package minecraft;

import com.google.gson.JsonElement;
import com.mojang.serialization.JsonOps;
import io.netty.buffer.ByteBuf;

public record class07846(class07806 status) implements class00381<class07834> {
   private static final class03519<JsonElement> L = class01042.y.N(JsonOps.INSTANCE);
   public static final class02362<ByteBuf, class07846> N = class02362.N(class02389.R(32767).N_33(class02389.N(L, class07806.N)), class07846::N, class07846::new);

   public class07846(class07806 status) {
      this.status = status;
   }

   public void method_65081(class07834 var1) {
      var1.N(this);
   }

   public class07806 N() {
      return this.status;
   }

   @Override
   public class02897<class07846> method_65080() {
      return class04273.N;
   }
}
