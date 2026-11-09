package minecraft;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWVidMode;
import org.lwjgl.glfw.GLFWVidMode.Buffer;

public final class class06221 {
   private final long N;
   private final List<class04760> y;
   private class04760 L;
   private int u;
   private int i;

   public int L() {
      return this.u;
   }

   public class06221(long var1) {
      super();
      this.N = var1;
      this.y = Lists.newArrayList();
      this.N();
   }

   @Override
   public String toString() {
      return String.format(Locale.ROOT, "Monitor[%s %sx%s %s]", this.N, this.u, this.i, this.L);
   }

   public int i() {
      return this.y.size();
   }

   public int u() {
      return this.i;
   }

   public class04760 y() {
      return this.L;
   }

   public class04760 N(Optional<class04760> var1) {
      if (var1.isPresent()) {
         class04760 class04760x = (class04760)var1.get();

         for (class04760 class04760x : this.y) {
            if (class04760x.equals(class04760x)) {
               return class04760x;
            }
         }
      }

      return this.y();
   }

   public int N(class04760 var1) {
      return this.y.indexOf(var1);
   }

   public class04760 N(int var1) {
      return this.y.get(var1);
   }

   public void N() {
      this.y.clear();
      Buffer buffer = GLFW.glfwGetVideoModes(this.N);

      for (int ix = buffer.limit() - 1; ix >= 0; ix--) {
         buffer.position(ix);
         class04760 class04760 = new class04760(buffer);
         if (class04760.L() >= 8 && class04760.u() >= 8 && class04760.i() >= 8) {
            this.y.add(class04760);
         }
      }

      int[] aint = new int[1];
      int[] aint1 = new int[1];
      GLFW.glfwGetMonitorPos(this.N, aint, aint1);
      this.u = aint[0];
      this.i = aint1[0];
      GLFWVidMode glfwvidmode = GLFW.glfwGetVideoMode(this.N);
      this.L = new class04760(glfwvidmode);
   }

   public long R() {
      return this.N;
   }
}
