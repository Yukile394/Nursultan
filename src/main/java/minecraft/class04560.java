package minecraft;

import ca.weblite.objc.Client;
import ca.weblite.objc.NSObject;
import com.sun.jna.Pointer;
import java.io.IOException;
import java.io.InputStream;
import java.util.Base64;
import java.util.Locale;
import java.util.Optional;
import org.lwjgl.glfw.GLFWNativeCocoa;

public class class04560 {
   public static final boolean N = System.getProperty("os.name").toLowerCase(Locale.ROOT).contains("mac");
   private static final int y = 8;
   private static final int L = 16384;

   private static Optional<NSObject> L(class08844 var0) {
      long i = GLFWNativeCocoa.glfwGetCocoaWindow(var0.B());
      return i != 0L ? Optional.of(new NSObject(new Pointer(i))) : Optional.empty();
   }

   private static void L(NSObject var0) {
      var0.send("toggleFullScreen:", new Object[]{Pointer.NULL});
   }

   public class04560() {
      super();
   }

   private static long y(NSObject var0) {
      return (Long)var0.sendRaw("styleMask", new Object[0]);
   }

   public static void y(class08844 var0) {
      L(var0).ifPresent(var0x -> {
         long i = y(var0x);
         var0x.send("setStyleMask:", new Object[]{i & -9L});
      });
   }

   private static boolean N(NSObject var0) {
      return (y(var0) & 16384L) != 0L;
   }

   public static void N(class03652<InputStream> var0) throws IOException {
      try (InputStream inputstream = (InputStream)var0.get()) {
         String s = Base64.getEncoder().encodeToString(inputstream.readAllBytes());
         Client client = Client.getInstance();
         Object object = client.sendProxy("NSData", "alloc", new Object[0]).send("initWithBase64Encoding:", new Object[]{s});
         Object object1 = client.sendProxy("NSImage", "alloc", new Object[0]).send("initWithData:", new Object[]{object});
         client.sendProxy("NSApplication", "sharedApplication", new Object[0]).send("setApplicationIconImage:", new Object[]{object1});
      }
   }

   public static void N(class08844 var0) {
      L(var0).filter(class04560::N).ifPresent(class04560::L);
   }
}
