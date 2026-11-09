package minecraft;

import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import java.util.List;

public interface class02489 {
   MapCodec<class02489> N = N(Integer.MAX_VALUE);

   static MapCodec<class02489> N(int var0) {
      return class02491.field_49860.dispatchMap("mode", class02489::N, var0x -> var0x.field_49863).validate(var1 -> {
         if (var1 instanceof class02463 class02463 && class02463.L().isPresent()) {
            int i = class02463.L().get();
            if (i > var0) {
               return DataResult.error(() -> "Size value too large: " + i + ", max size is " + var0);
            }
         }

         return DataResult.success(var1);
      });
   }

   <T> List<T> N(List<T> var1, List<T> var2, int var3);

   default <T> List<T> N(List<T> var1, List<T> var2) {
      return this.N(var1, var2, Integer.MAX_VALUE);
   }

   class02491 N();
}
