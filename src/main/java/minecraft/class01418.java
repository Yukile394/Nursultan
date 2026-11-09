package minecraft;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Stream;
import org.jspecify.annotations.Nullable;

public class class01418 {
   private static final String N = "command_storage_";
   private final Map<String, class01410> y = new HashMap<>();
   private final class00408 L;

   private class01410 L(String var1) {
      class01410 class01410x = this.y.get(var1);
      if (class01410x != null) {
         return class01410x;
      } else {
         class01410 class01410x = this.L.N(class01410.N(var1));
         this.y.put(var1, class01410x);
         return class01410x;
      }
   }

   public class01418(class00408 var1) {
      super();
      this.L = var1;
   }

   @Nullable
   private class01410 y(String var1) {
      class01410 class01410x = this.y.get(var1);
      if (class01410x != null) {
         return class01410x;
      } else {
         class01410 class01410x = this.L.y(class01410.N(var1));
         if (class01410x != null) {
            this.y.put(var1, class01410x);
         }

         return class01410x;
      }
   }

   public Stream<class01894> N() {
      return this.y.entrySet().stream().flatMap(var0 -> var0.getValue().L(var0.getKey()));
   }

   static String N(String var0) {
      return "command_storage_" + var0;
   }

   public void N(class01894 var1, class07001 var2) {
      this.L(var1.y()).N(var1.N(), var2);
   }

   public class07001 N(class01894 var1) {
      class01410 class01410 = this.y(var1.y());
      return class01410 != null ? class01410.y(var1.N()) : new class07001();
   }
}
