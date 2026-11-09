package minecraft;

import com.mojang.logging.LogUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05435 {
   static final Logger N = LogUtils.getLogger();
   final class05096 y;
   volatile boolean L;
   @Nullable
   class00642 u;

   public class05435(class05096 var1) {
      super();
      this.y = var1;
   }

   public void y() {
      if (this.u != null) {
         if (this.u.method_10758()) {
            this.u.method_10754();
         } else {
            this.u.method_10768();
         }
      }
   }

   public void N(class04981 var1, class03420 var2) {
      class06202 class06202 = class06202.Nq();
      class06202.No();
      class06202.NT().u(class00392.L("mco.connect.success"));
      String s = var2.N();
      int i = var2.y();
      new class05405(this, "Realms-connect-task", s, i, class06202, var1).start();
   }

   public void N() {
      this.L = true;
      if (this.u != null && this.u.method_10758()) {
         this.u.method_10747(class00392.L("disconnect.genericReason"));
         this.u.method_10768();
      }
   }
}
