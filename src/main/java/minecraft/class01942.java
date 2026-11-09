package minecraft;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import java.util.function.Predicate;
import org.slf4j.Logger;

public record class01942(Map<String, class01968> tests) implements class01975 {
   static final Logger y = LogUtils.getLogger();
   public static final Codec<class01942> L = class06338.u(Codec.unboundedMap(Codec.STRING, class01968.N)).xmap(class01942::new, class01942::N);

   public class01942(Map<String, class01968> tests) {
      this.tests = tests;
   }

   private static <O, S extends class00522<O, S>> Predicate<S> N(class00507<O, S> var0, String var1, class01968 var2) {
      class08092<?> class08092 = var0.N(var1);
      if (class08092 == null) {
         throw new IllegalArgumentException(String.format(Locale.ROOT, "Unknown property '%s' on '%s'", var1, var0.L()));
      } else {
         return var2.N(var0.L(), class08092);
      }
   }

   public Map<String, class01968> N() {
      return this.tests;
   }

   @Override
   public <O, S extends class00522<O, S>> Predicate<S> N(class00507<O, S> var1) {
      ArrayList arraylist = new ArrayList(this.tests.size());
      this.tests.forEach((var2x, var3) -> arraylist.add(N(var1, var2x, var3)));
      return class07536.N(arraylist);
   }
}
