package minecraft;

import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public interface class03558 extends class01636 {
   Logger R = LogUtils.getLogger();

   @Override
   default void method_59807(class00381 var1, Exception var2) throws class07878 {
      R.error("Failed to handle packet {}, suppressing error", var1, var2);
   }
}
