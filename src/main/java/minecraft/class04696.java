package minecraft;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class class04696 extends class05129 {
   private static final Logger y = LogUtils.getLogger();
   private static final class00392 L = class00392.L("mco.download.preparing");
   private final long u;
   private final int i;
   private final class05096 R;
   private final String M;

   public class04696(long var1, int var3, String var4, class05096 var5) {
      super();
      this.u = var1;
      this.i = var3;
      this.R = var5;
      this.M = var4;
   }

   @Override
   public void run() {
      class05111 class05111 = class05111.N();
      int ix = 0;

      while (ix < 25) {
         try {
            if (this.y()) {
               return;
            }

            class04945 class04945 = class05111.y(this.u, this.i);
            N(1L);
            if (this.y()) {
               return;
            }

            N(new class04704(this.R, class04945, this.M, var0 -> {}));
            return;
         } catch (class05098 class05098) {
            if (this.y()) {
               return;
            }

            N(class05098.L);
            ix++;
         } catch (class05097 class05097) {
            if (this.y()) {
               return;
            }

            y.error("Couldn't download world data", class05097);
            N(new class04702(class05097, this.R));
            return;
         } catch (Exception exception) {
            if (this.y()) {
               return;
            }

            y.error("Couldn't download world data", exception);
            this.N(exception);
            return;
         }
      }
   }

   @Override
   public class00392 N() {
      return L;
   }
}
