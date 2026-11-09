package minecraft;

import com.mojang.serialization.Codec;
import java.util.Set;
import java.util.stream.Collectors;

public class class03794 {
   public static final class02957 N;
   public static final class02957 y;
   public static final class02957 L;
   public static final class02957 u;
   public static final class02981 i;
   public static final Codec<class03767> R;
   public static final class03767 M;
   public static final class03767 B;

   public class03794() {
      super();
   }

   public static boolean N(class03767 var0) {
      return !var0.N(M);
   }

   public static String N(class03767 var0, class03767 var1) {
      return N(i, var0, var1);
   }

   public static String N(class02981 var0, class03767 var1, class03767 var2) {
      Set<class01894> set = var0.y(var2);
      Set<class01894> set1 = var0.y(var1);
      return set.stream().filter(var1x -> !set1.contains(var1x)).map(class01894::toString).collect(Collectors.joining(", "));
   }

   static {
      class02989 class02989 = new class02989("main");
      N = class02989.N("vanilla");
      y = class02989.N("trade_rebalance");
      L = class02989.N("redstone_experiments");
      u = class02989.N("minecart_improvements");
      i = class02989.N();
      R = i.y();
      M = class03767.N(N);
      B = M;
   }
}
