package minecraft;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class class08759 implements class08773 {
   private static final Logger N = LogUtils.getLogger();
   private final boolean y;
   private final class08761 L;
   private boolean u;
   private long i = Long.MAX_VALUE;
   private long R = Long.MAX_VALUE;

   public class08759(boolean var1) {
      super();
      this.y = var1;
      this.L = new class08761(var1);
   }

   public static class08759 y() {
      return new class08759(true);
   }

   @Override
   public void N(class08753 var1) {
      if (!this.u) {
         this.L.N(var1);
         class08753 class08753 = this.y ? class08753.field_61108 : class08753.field_61107;
         if (var1 == class08753) {
            N.info("Time elapsed: {} ms", class07536.L() - this.i);
            this.R = Long.MAX_VALUE;
            this.u = true;
         }
      }
   }

   @Override
   public void N(class05946<class07299> var1, class07321 var2) {
   }

   @Override
   public void N(class08753 var1, int var2, int var3) {
      if (!this.u) {
         this.L.N(var1, var2, var3);
         if (class07536.L() > this.R) {
            this.R += 500L;
            int ix = class04995.y(this.L.N() * 100.0F);
            N.info(class00392.N("menu.preparingSpawn", ix).getString());
         }
      }
   }

   public static class08759 N() {
      return new class08759(false);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void N(class08753 var1, int var2) {
      if (!this.u) {
         if (this.i == Long.MAX_VALUE) {
            long ix = class07536.L();
            this.i = ix;
            this.R = ix;
         }

         this.L.N(var1, var2);
         switch (var1) {
            case field_61106:
               N.info("Selecting global world spawn...");
               break;
            case field_61107:
               N.info("Loading {} persistent chunks...", var2);
               break;
            case field_61108:
               N.info("Loading {} chunks for player spawn...", var2);
         }
      }
   }
}
