package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.DataResult.Error;
import com.mojang.serialization.DataResult.Success;

class class08330<T> implements class08294<T> {
   private final class04490 N;
   private final String y;
   private final DynamicOps<class07709> L;
   private final Codec<T> u;
   private final class07741 i;

   class08330(class04490 var1, String var2, DynamicOps<class07709> var3, Codec<T> var4, class07741 var5) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = var5;
   }

   @Override
   public void N(T var1) {
      switch (this.u.encodeStart(this.L, var1)) {
         case Success success:
            this.i.add((class07709)success.value());
            break;
         case Error error:
            this.N.N_47(new class08297(this.y, var1, error));
            error.partialValue().ifPresent(this.i::add);
            break;
         default:
            throw new MatchException(null, null);
      }
   }

   @Override
   public boolean N() {
      return this.i.isEmpty();
   }
}
