package minecraft;

import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.PrimitiveCodec;

class class00595 implements PrimitiveCodec<String> {
   class00595() {
      super();
   }

   @Override
   public String toString() {
      return "NamespacedString";
   }

   public <T> DataResult<String> read(DynamicOps<T> var1, T var2) {
      return var1.getStringValue(var2).map(class00622::N);
   }

   public <T> T write(DynamicOps<T> var1, String var2) {
      return (T)var1.createString(var2);
   }
}
