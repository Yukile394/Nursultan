package minecraft;

import Nursultan.class10082;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

@FunctionalInterface
public interface class01640 {
   Logger N = LogUtils.getLogger();

   static class01640 N(Set<class02968<?>> var0) {
      return (var1, var2) -> {
         Optional<class08393> optional;
         Optional<class08500> optional1;
         List<class10082<?>> list;
         try {
            class03643 class03643 = var2.method_14481();
            optional = class03643.N(class08393.y);
            optional1 = class03643.N(class08500.i);
            list = class03643.N(var0);
         } catch (Exception exception) {
            N.error("Unable to parse metadata from {}", var1, exception);
            return null;
         }

         class08280 class08280;
         try (InputStream inputstream = var2.method_14482()) {
            class08280 = class08280.N(inputstream);
         } catch (IOException ioexception) {
            N.error("Using missing texture, unable to load {}", var1, ioexception);
            return null;
         }

         class02002 class02002;
         if (optional.isPresent()) {
            class02002 = optional.get().N(class08280.N(), class08280.y());
            if (!class04995.u(class08280.N(), class02002.N()) || !class04995.u(class08280.y(), class02002.y())) {
               N.error(
                  "Image {} size {},{} is not multiple of frame size {},{}", new Object[]{var1, class08280.N(), class08280.y(), class02002.N(), class02002.y()}
               );
               class08280.close();
               return null;
            }
         } else {
            class02002 = new class02002(class08280.N(), class08280.y());
         }

         return new class01991(var1, class02002, class08280, optional, list, optional1);
      };
   }

   @Nullable
   class01991 loadSprite(class01894 var1, class01079 var2);
}
