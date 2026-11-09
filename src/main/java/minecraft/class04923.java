package minecraft;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class class04923 {
   private static final class01028 N = class01028.N(32, class00405.N);

   public class04923() {
      super();
   }

   private static String N(String var0) {
      return ((class05630)class06202.Nq().i_7).D().method_41753() ? var0 : class06541.N(var0);
   }

   public static List<class01028> N(class05936 var0, int var1, class01590 var2) {
      class05199 class05199 = new class05199();
      var0.N((var1x, var2x) -> {
         class05199.N(class05936.N(N(var2x), var1x));
         return Optional.empty();
      }, class00405.N);
      ArrayList arraylist = Lists.newArrayList();
      var2.y().N(class05199.y(), var1, class00405.N, (var1x, var2x) -> {
         class01028 class01028 = class07018.y().N(var1x);
         arraylist.add(var2x ? class01028.N(N, class01028) : class01028);
      });
      return arraylist.isEmpty() ? Lists.newArrayList(new class01028[]{class01028.N}) : arraylist;
   }
}
