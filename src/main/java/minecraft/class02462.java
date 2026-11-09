package minecraft;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.MapCodec;
import java.util.List;
import java.util.stream.Stream;
import org.slf4j.Logger;

public class class02462 implements class02489 {
   private static final Logger u = LogUtils.getLogger();
   public static final class02462 y = new class02462();
   public static final MapCodec<class02462> L = MapCodec.unit(() -> y);

   private class02462() {
      super();
   }

   @Override
   public class02491 N() {
      return class02491.field_49859;
   }

   @Override
   public <T> List<T> N(List<T> var1, List<T> var2, int var3) {
      if (var1.size() + var2.size() > var3) {
         u.error("Contents overflow in section append");
         return var1;
      } else {
         return Stream.<T>concat(var1.stream(), var2.stream()).toList();
      }
   }
}
