package minecraft;

import org.lwjgl.glfw.GLFW;
import org.lwjgl.glfw.GLFWVidMode;

public class class02742 {
   private static final int N = 60;
   private static final int y = 10;
   private static final int L = 30;
   private static final int u = 10;
   private static final long i = 60000L;
   private static final long R = 600000L;
   private final class05630 M;
   private final class06202 B;
   private int Z;
   private long z;

   public boolean L() {
      class02767 class02767 = this.y();
      return class02767 == class02767.field_55844 || class02767 == class02767.field_55845;
   }

   public class02742(class05630 var1, class06202 var2) {
      super();
      this.M = var1;
      this.B = var2;
      this.Z = var1.B().method_41753();
   }

   public void u() {
      this.z = class07536.L();
   }

   private int y(int var1) {
      long ix = GLFW.glfwGetPrimaryMonitor();
      if (ix == 0L) {
         return var1;
      } else {
         GLFWVidMode glfwvidmode = GLFW.glfwGetVideoMode(ix);
         if (glfwvidmode == null) {
            return var1;
         } else {
            int j = glfwvidmode.refreshRate();
            return j > 0 ? j : var1;
         }
      }
   }

   public class02767 y() {
      class02424 class02424 = this.M.z().method_41753();
      if (this.B.Nt().z()) {
         return class02767.field_55844;
      } else {
         if (class02424 == class02424.field_52744) {
            long ix = class07536.L() - this.z;
            if (ix > 600000L) {
               return class02767.field_55845;
            }

            if (ix > 60000L) {
               return class02767.field_55846;
            }
         }

         return (class03448)this.B.T_3 != null || (class05096)this.B.v_3 == null && this.B.NZ() == null ? class02767.field_55843 : class02767.field_55847;
      }
   }

   public int N() {
      return switch (this.y()) {
         case field_55843 -> this.Z;
         case field_55844 -> 10;
         case field_55845 -> 10;
         case field_55846 -> Math.min(this.Z, 30);
         case field_55847 -> this.y(60);
      };
   }

   public void N(int var1) {
      this.Z = var1;
   }
}
