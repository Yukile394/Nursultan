package minecraft;

import com.mojang.logging.LogUtils;
import java.net.SocketAddress;
import java.nio.file.Path;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class01841 implements class01834 {
   private static final Logger y = LogUtils.getLogger();
   static final class03299 N = var0 -> {};

   @Override
   public Path L() {
      throw new IllegalStateException("Attempted to stop Flight Recorder, but it's not supported on this JVM");
   }

   public class01841() {
      super();
   }

   @Override
   public boolean i() {
      return false;
   }

   @Override
   public boolean u() {
      return false;
   }

   @Override
   public void y(class00648 var1, class02897<?> var2, SocketAddress var3, int var4) {
   }

   @Override
   public void y(class02277 var1, class07321 var2, class05530 var3, int var4) {
   }

   @Override
   public void N(float var1) {
   }

   @Nullable
   @Override
   public class03299 N(class07321 var1, class05946<class07299> var2, String var3) {
      return null;
   }

   @Override
   public class03299 N(class07321 var1, class05946<class07299> var2, class03556<class04748> var3) {
      return N;
   }

   @Override
   public void N(class02277 var1, class07321 var2, class05530 var3, int var4) {
   }

   @Override
   public boolean N(class03215 var1) {
      y.warn("Attempted to start Flight Recorder, but it's not supported on this JVM");
      return false;
   }

   @Override
   public void N(class00648 var1, class02897<?> var2, SocketAddress var3, int var4) {
   }

   @Override
   public void N(int var1) {
   }

   @Override
   public class03299 R() {
      return N;
   }
}
