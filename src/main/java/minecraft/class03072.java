package minecraft;

import com.mojang.logging.LogUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

@FunctionalInterface
public interface class03072 {
   Logger N = LogUtils.getLogger();
   class03072 y = class03926::y;
   class03072 L = var0 -> {
      N.error("Received chat message from {}, but they have no chat session initialized and secure chat is enforced", var0.M());
      return null;
   };

   @Nullable
   class03926 method_45048(class03926 var1);
}
