package minecraft;

import java.net.SocketAddress;
import java.nio.file.Path;
import jdk.jfr.FlightRecorder;
import org.jspecify.annotations.Nullable;

public interface class01834 {
   class01834 M = (class01834)(Runtime.class.getModule().getLayer().findModule("jdk.jfr").isPresent() && FlightRecorder.isAvailable()
      ? class03223.y()
      : new class01841());

   Path L();

   boolean i();

   boolean u();

   void y(class02277 var1, class07321 var2, class05530 var3, int var4);

   void y(class00648 var1, class02897<?> var2, SocketAddress var3, int var4);

   void N(float var1);

   boolean N(class03215 var1);

   @Nullable
   class03299 N(class07321 var1, class05946<class07299> var2, String var3);

   @Nullable
   class03299 N(class07321 var1, class05946<class07299> var2, class03556<class04748> var3);

   void N(class00648 var1, class02897<?> var2, SocketAddress var3, int var4);

   void N(int var1);

   void N(class02277 var1, class07321 var2, class05530 var3, int var4);

   @Nullable
   class03299 R();
}
