package minecraft;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class class04740 extends class05129 {
   private static final Logger y = LogUtils.getLogger();
   private static final class00392 L = class00392.L("mco.backup.restoring");
   private final class04948 u;
   private final long i;
   private final class05092 R;

   public class04740(class04948 var1, long var2, class05092 var4) {
      super();
      this.u = var1;
      this.i = var2;
      this.R = var4;
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

            class05111.y(this.i, this.u.N);
            N(1L);
            if (this.y()) {
               return;
            }

            N(this.R);
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

            y.error("Couldn't restore backup", class05097);
            N(new class04702(class05097, this.R));
            return;
         } catch (Exception exception) {
            if (this.y()) {
               return;
            }

            y.error("Couldn't restore backup", exception);
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
