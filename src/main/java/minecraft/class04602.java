package minecraft;

import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Base64;
import java.util.Map;
import org.jspecify.annotations.Nullable;
import org.lwjgl.system.MemoryUtil;
import org.slf4j.Logger;

public class class04602 {
   private static final Map<String, class04637> N = Maps.newHashMap();
   private static final Logger y = LogUtils.getLogger();
   private static final class01894 L = class01894.y("textures/gui/presets/isles.png");

   public class04602() {
      super();
   }

   private static class01894 y(String var0, String var1) {
      class04637 class04637 = N.get(var0);
      if (class04637 != null && class04637.N().equals(var1)) {
         return class04637.y();
      } else {
         class08280 class08280 = N(var1);
         if (class08280 == null) {
            class01894 class01894 = class08923.L();
            N.put(var0, new class04637(var1, class01894));
            return class01894;
         } else {
            class01894 class01894x = class01894.N("realms", "dynamic/" + var0);
            class06202.Nq().NO().N(class01894x, new class08829(class01894x::toString, class08280));
            N.put(var0, new class04637(var1, class01894x));
            return class01894x;
         }
      }
   }

   @Nullable
   private static class08280 N(String var0) {
      byte[] abyte = Base64.getDecoder().decode(var0);
      ByteBuffer bytebuffer = MemoryUtil.memAlloc(abyte.length);

      try {
         return class08280.N(bytebuffer.put(abyte).flip());
      } catch (IOException ioexception) {
         y.warn("Failed to load world image: {}", var0, ioexception);
      } finally {
         MemoryUtil.memFree(bytebuffer);
      }

      return null;
   }

   public static class01894 N(String var0, @Nullable String var1) {
      return var1 == null ? L : y(var0, var1);
   }
}
