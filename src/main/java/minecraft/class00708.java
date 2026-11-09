package minecraft;

import com.mojang.logging.LogUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class00708 extends class00692 {
   private static final Logger y = LogUtils.getLogger();
   private static final int L = 10;
   @Nullable
   private class06889 u;
   private int i;

   @Override
   public void L() {
      this.u = null;
      this.i = 0;
   }

   public class00708(class00690 var1) {
      super(var1);
   }

   @Override
   public class00702<class00708> B() {
      return class00702.Z;
   }

   @Override
   public float i() {
      return 3.0F;
   }

   public void N(class06889 var1) {
      this.u = var1;
   }

   @Override
   public void N(class04782 var1) {
      if (this.u == null) {
         y.warn("Aborting charge player as no target was set.");
         this.N.W().N(class00702.N);
      } else if (this.i > 0 && this.i++ >= 10) {
         this.N.W().N(class00702.N);
      } else {
         double d0 = this.u.L(this.N.method_23317(), this.N.method_23318(), this.N.method_23321());
         if (d0 < 100.0 || d0 > 22500.0 || this.N.field_5976 || this.N.field_5992) {
            this.i++;
         }
      }
   }

   @Nullable
   @Override
   public class06889 R() {
      return this.u;
   }
}
