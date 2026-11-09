package minecraft;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class class04734 extends class05129 {
   private static final Logger y = LogUtils.getLogger();
   private static final class00392 L = class00392.L("mco.create.world.wait");
   private final String u;
   private final String i;
   private final long R;

   public class04734(long var1, String var3, String var4) {
      super();
      this.R = var1;
      this.u = var3;
      this.i = var4;
   }

   @Override
   public void run() {
      class05111 class05111 = class05111.N();

      try {
         class05111.N(this.R, this.u, this.i);
      } catch (class05097 class05097) {
         y.error("Couldn't create world", class05097);
         this.N(class05097);
      } catch (Exception exception) {
         y.error("Could not create world", exception);
         this.N(exception);
      }
   }

   @Override
   public class00392 N() {
      return L;
   }
}
