package minecraft;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import org.jspecify.annotations.Nullable;

public class class04609 {
   private static final Long2ObjectMap<String> N = new Long2ObjectOpenHashMap();

   public class04609() {
      super();
   }

   public static void y(long var0) {
      N.remove(var0);
   }

   public static void N(long var0, @Nullable String var2) {
      N.put(var0, var2);
   }

   public static String N(long var0) {
      return (String)N.get(var0);
   }
}
