package minecraft;

import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public record class00809(class07001 tag) {
   private static final Logger i = LogUtils.getLogger();
   public static final Codec<class00809> N = class07755.R.xmap(class00809::new, class00809::N);
   public static final class02362<ByteBuf, class00809> y = class02389.j.N_10(class00809::new, class00809::N);
   public static final String L = "SelectedItem";

   public class00809(class07001 tag) {
      this.tag = tag;
   }

   public static class07001 y(class07049 var0) {
      class07001 class07001;
      try (class04495 class04495 = new class04495(var0.method_71370(), i)) {
         class08303 class08303 = class08303.N(class04495, var0.method_56673());
         var0.method_5647(class08303);
         if (var0 instanceof class08036 class08036) {
            class06584 class06584 = class08036.method_31548().y();
            if (!class06584.R()) {
               class08303.N("SelectedItem", class06584.y, class06584);
            }
         }

         class07001 = class08303.y();
      }

      return class07001;
   }

   public boolean N(class07049 var1) {
      return this.N(y(var1));
   }

   public class07001 N() {
      return this.tag;
   }

   public boolean N(@Nullable class07709 var1) {
      return var1 != null && class07717.N(this.tag, var1, true);
   }

   public boolean N(class02666 var1) {
      return var1.a_(class02484.y, class02837.N).y(this.tag);
   }
}
