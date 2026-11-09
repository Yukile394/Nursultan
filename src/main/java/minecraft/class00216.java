package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.JavaOps;

class class00216 implements class00203 {
   class00216(class00191 var1) {
      super();
      this.N = var1;
   }

   @Override
   public <T> DataResult<T> N(Codec<T> var1, T var2, class01929 var3) {
      return var1.encodeStart(this.N.N(JavaOps.INSTANCE), var2).flatMap(var2x -> var1.parse(var3.N(JavaOps.INSTANCE), var2x));
   }
}
