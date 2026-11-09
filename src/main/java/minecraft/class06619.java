package minecraft;

import org.lwjgl.glfw.GLFW;

public class class06619 {
   public static final class06619 N = new class06619("default", 0L);
   private final String y;
   private final long L;

   private class06619(String var1, long var2) {
      super();
      this.y = var1;
      this.L = var2;
   }

   @Override
   public String toString() {
      return this.y;
   }

   public static class06619 N(int var0, String var1, class06619 var2) {
      long i = GLFW.glfwCreateStandardCursor(var0);
      return i == 0L ? var2 : new class06619(var1, i);
   }

   public void N(class08844 var1) {
      GLFW.glfwSetCursor(var1.B(), this.L);
   }
}
