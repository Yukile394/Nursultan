package minecraft;

import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class00074 extends class01062 {
   private static final Logger M = LogUtils.getLogger();
   @Nullable
   private class07001 B;

   public class00074(class08337 var1, class02003<class02969> var2, class07842 var3) {
      super(var1, var2, var3, var1.Nt());
      this.N(10);
   }

   @Nullable
   @Override
   public class07001 y() {
      return this.B;
   }

   @Override
   protected void N(class04770 var1) {
      if (this.L().N(var1.method_72498())) {
         try (class04495 class04495 = new class04495(var1.method_71370(), M)) {
            class08303 class08303 = class08303.N(class04495, var1.method_56673());
            var1.method_5647(class08303);
            this.B = class08303.y();
         }
      }

      super.N(var1);
   }

   @Override
   public class00392 N(SocketAddress var1, class08774 var2) {
      return (class00392)(this.L().N(var2) && this.N(var2.y()) != null ? class00392.L("multiplayer.disconnect.name_taken") : super.N(var1, var2));
   }
}
