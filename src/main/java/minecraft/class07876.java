package minecraft;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public abstract class class07876 extends class07453 {
   private static final Logger N = LogUtils.getLogger();
   private static final int y = 100;
   private int L;

   @Override
   public void method_5773() {
      this.L++;
      super.method_5773();
   }

   public class07876(class07078<? extends class07876> var1, class07299 var2) {
      super(var1, var2);
   }

   public boolean v() {
      return this.L > 100;
   }

   public boolean N(class04770 var1) {
      try (class04495 class04495 = new class04495(this.method_71370(), N)) {
         class08303 class08303 = class08303.N(class04495, this.method_56673());
         this.method_5647(class08303);
         class08303.N("id", this.method_5653());
         if (var1.method_74073(class08303.y())) {
            this.method_31472();
            return true;
         }
      }

      return false;
   }
}
