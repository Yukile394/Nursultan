package minecraft;

import Nursultan.class09488;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface class01659 {
   static <B extends class00667> class02362<B, class01659> N(class01637<B> var0, List<class01668<? super B, ?>> var1) {
      Map map = var1.stream().collect(Collectors.toUnmodifiableMap(var0x -> var0x.N().N(), class01668::y));
      return new class09488<>(map, var0);
   }

   static <B extends ByteBuf, T extends class01659> class02362<B, T> N(class02880<B, T> var0, class02895<B, T> var1) {
      return class02362.N_34(var0, var1);
   }

   static <T extends class01659> class01666<T> N(String var0) {
      return new class01666<>(class01894.y(var0));
   }

   class01666<? extends class01659> method_56479();
}
