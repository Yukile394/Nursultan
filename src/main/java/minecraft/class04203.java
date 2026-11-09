package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.JsonOps;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.slf4j.Logger;

public class class04203 {
   private static final Logger N = LogUtils.getLogger();
   private static final class03069 y = new class03069("atlases", ".json");
   private final List<class04233> L;

   private class04203(List<class04233> var1) {
      super();
      this.L = var1;
   }

   public List<class04235> N(class01089 var1) {
      HashMap hashmap = new HashMap();
      class04204 class04204 = new class04204(this, hashmap);
      this.L.forEach(var2x -> var2x.N(var1, class04204));
      Builder builder = ImmutableList.builder();
      builder.add((class04235)var0 -> class08923.y());
      builder.addAll(hashmap.values());
      return builder.build();
   }

   public static class04203 N(class01089 var0, class01894 var1) {
      class01894 class01894 = y.N(var1);
      ArrayList arraylist = new ArrayList();

      for (class01079 class01079 : var0.N(class01894)) {
         try (BufferedReader bufferedreader = class01079.method_43039()) {
            Dynamic dynamic = new Dynamic(JsonOps.INSTANCE, class08326.N(bufferedreader));
            arraylist.addAll((Collection)class04223.y.parse(dynamic).getOrThrow());
         } catch (Exception exception) {
            N.error("Failed to parse atlas definition {} in pack {}", new Object[]{class01894, class01079.method_14480(), exception});
         }
      }

      return new class04203(arraylist);
   }
}
