package minecraft;

import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Arrays;
import org.slf4j.Logger;

public class class07932 {
   private static final Logger N = LogUtils.getLogger();
   private static final String y = "RPC Connection #{}: ";

   public class07932() {
      super();
   }

   public void N(class07403 var1, String var2, Object... var3) {
      if (var3.length == 0) {
         N.info("RPC Connection #{}: " + var2, var1.N());
      } else {
         ArrayList arraylist = new ArrayList<>(Arrays.asList(var3));
         arraylist.addFirst(var1.N());
         N.info("RPC Connection #{}: " + var2, arraylist.toArray());
      }
   }
}
