package minecraft;

import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.IntStream.Builder;
import org.jspecify.annotations.Nullable;

final class class00186 extends class08886 {
   class00186(String var1, int var2, class00157 var3, class00157... var4) {
      super(var3, var4);
   }

   @Override
   public <T> T N(DynamicOps<T> var1) {
      return (T)var1.createIntList(IntStream.empty());
   }

   @Nullable
   @Override
   public <T> T N(DynamicOps<T> var1, List<class00170> var2, class02325<?> var3) {
      Builder builder = IntStream.builder();

      for (class00170 class00170 : var2) {
         Number number = this.N(class00170, var3);
         if (number == null) {
            return null;
         }

         builder.add(number.intValue());
      }

      return (T)var1.createIntList(builder.build());
   }
}
