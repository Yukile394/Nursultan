package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.List;

public class class02507 implements class02489 {
   public static final class02507 y = new class02507();
   public static final MapCodec<class02507> L = MapCodec.unit(() -> y);

   private class02507() {
      super();
   }

   @Override
   public class02491 N() {
      return class02491.field_49856;
   }

   @Override
   public <T> List<T> N(List<T> var1, List<T> var2, int var3) {
      return var2;
   }
}
