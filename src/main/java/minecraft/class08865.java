package minecraft;

import Nursultan.class11662;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.util.Set;
import org.jspecify.annotations.Nullable;
import org.lwjgl.opengl.GLCapabilities;

public abstract class class08865 {
   public class08865() {
      super();
   }

   public static class08865 N(GLCapabilities var0, class08859 var1, Set<String> var2) {
      if (var0.GL_ARB_vertex_attrib_binding && class08879.N) {
         var2.add("GL_ARB_vertex_attrib_binding");
         return new class11662(var1);
      } else {
         return new class08867(var1);
      }
   }

   public abstract void N(VertexFormat var1, @Nullable class08523 var2);
}
