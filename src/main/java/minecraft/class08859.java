package minecraft;

import Nursultan.class11659;
import Nursultan.class11663;
import com.mojang.logging.LogUtils;
import java.util.Set;
import java.util.function.Supplier;
import org.lwjgl.opengl.GLCapabilities;
import org.slf4j.Logger;

public abstract class class08859 {
   private static final Logger N = LogUtils.getLogger();

   public class08859() {
      super();
   }

   public boolean y() {
      return false;
   }

   public void N(Supplier<String> var1) {
   }

   public void N() {
   }

   public static class08859 N(GLCapabilities var0, boolean var1, Set<String> var2) {
      if (var1) {
         if (var0.GL_KHR_debug && class08879.y) {
            var2.add("GL_KHR_debug");
            return new class08892();
         }

         if (var0.GL_EXT_debug_label && class08879.L) {
            var2.add("GL_EXT_debug_label");
            return new class11663();
         }

         N.warn("Debug labels unavailable: neither KHR_debug nor EXT_debug_label are supported");
      }

      return new class11659();
   }

   public void N(class08861 var1) {
   }

   public void N(class08893 var1) {
   }

   public void N(class08238 var1) {
   }

   public void N(class02255 var1) {
   }

   public void N(class08523 var1) {
   }
}
