package minecraft;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class class05526 implements class05485 {
   private static final Logger N = LogUtils.getLogger();

   public class05526() {
      super();
   }

   @Override
   public void y(class05513 var1) {
   }

   @Override
   public void N(class05513 var1) {
      String s = var1.L().method_23854();
      if (var1.b()) {
         N.error("{} failed at {}! {}", new Object[]{var1.y(), s, class07536.L(var1.m())});
      } else {
         N.warn("(optional) {} failed at {}. {}", new Object[]{var1.y(), s, class07536.L(var1.m())});
      }
   }
}
