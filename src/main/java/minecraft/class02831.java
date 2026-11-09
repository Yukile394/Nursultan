package minecraft;

import com.mojang.serialization.Codec;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public interface class02831 {
   Codec<class02831> N = class02836.field_59742.dispatch("type", class02831::L, var0 -> var0.field_59747);
   class02362<class04247, class02831> y = class02836.field_59744.<class04247>N().y(class02831::L, class02836::y);

   class02836 L();

   static class02831 y() {
      return class02811.L;
   }

   static class02831 N() {
      return class02846.L;
   }

   void N(Consumer<class00392> var1, @Nullable class08036 var2, class03556<class07468> var3, class07471 var4);

   static class02831 N(class00392 var0) {
      return new class02808(var0);
   }
}
