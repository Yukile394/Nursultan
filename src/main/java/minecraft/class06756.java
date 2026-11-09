package minecraft;

import Nursultan.class10666;
import Nursultan.class10670;
import com.mojang.serialization.DataResult;

public interface class06756<Value> {
   class06756<Float> N = N(0.0F, 1.0F);
   class06756<Float> y = N(0.0F, Float.POSITIVE_INFINITY);

   Value y(Value var1);

   static <Value> class06756<Value> N() {
      return new class10666<>();
   }

   DataResult<Value> N(Value var1);

   static class06756<Float> N(float var0, float var1) {
      return new class10670(var0, var1);
   }
}
