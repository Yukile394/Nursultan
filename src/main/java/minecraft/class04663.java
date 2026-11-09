package minecraft;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import org.lwjgl.BufferUtils;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWErrorCallback;
import org.lwjgl.glfw.GLFWErrorCallbackI;
import org.lwjgl.system.MemoryUtil;

public class class04663 {
   public static final int N = 65545;
   private final ByteBuffer y = BufferUtils.createByteBuffer(8192);

   public class04663() {
      super();
   }

   public void N(class08844 var1, String var2) {
      byte[] abyte = var2.getBytes(StandardCharsets.UTF_8);
      int i = abyte.length + 1;
      if (i < this.y.capacity()) {
         N(var1, this.y, abyte);
      } else {
         ByteBuffer bytebuffer = MemoryUtil.memAlloc(i);

         try {
            N(var1, bytebuffer, abyte);
         } finally {
            MemoryUtil.memFree(bytebuffer);
         }
      }
   }

   private static void N(class08844 var0, ByteBuffer var1, byte[] var2) {
      var1.clear();
      var1.put(var2);
      var1.put((byte)0);
      var1.flip();
      GLFW.glfwSetClipboardString(var0.B(), var1);
   }

   public String N(class08844 var1, GLFWErrorCallbackI var2) {
      GLFWErrorCallback glfwerrorcallback = GLFW.glfwSetErrorCallback(var2);
      String s = GLFW.glfwGetClipboardString(var1.B());
      s = s != null ? class05232.N(s) : "";
      GLFWErrorCallback glfwerrorcallback1 = GLFW.glfwSetErrorCallback(glfwerrorcallback);
      if (glfwerrorcallback1 != null) {
         glfwerrorcallback1.free();
      }

      return s;
   }
}
