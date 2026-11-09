package minecraft;

import com.mojang.blaze3d.opengl.GlConst;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormatElement;
import com.mojang.blaze3d.vertex.VertexFormatElement.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jspecify.annotations.Nullable;

class class08867 extends class08865 {
   private final Map<VertexFormat, class08861> N = new HashMap<>();
   private final class08859 y;

   public class08867(class08859 var1) {
      super();
      this.y = var1;
   }

   @Override
   public void N(VertexFormat var1, @Nullable class08523 var2) {
      class08861 class08861x = this.N.get(var1);
      if (class08861x == null) {
         int i = GlStateManager._glGenVertexArrays();
         GlStateManager._glBindVertexArray(i);
         if (var2 != null) {
            GlStateManager._glBindBuffer(34962, var2.u);
            N(var1, true);
         }

         class08861 class08861x = new class08861(i, var1, var2);
         this.y.N(class08861x);
         this.N.put(var1, class08861x);
      } else {
         GlStateManager._glBindVertexArray(class08861x.N);
         if (var2 != null && class08861x.L != var2) {
            GlStateManager._glBindBuffer(34962, var2.u);
            class08861x.L = var2;
            N(var1, false);
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static void N(VertexFormat var0, boolean var1) {
      int i = var0.getVertexSize();
      List<VertexFormatElement> list = var0.getElements();

      for (int j = 0; j < list.size(); j++) {
         VertexFormatElement vertexformatelement = list.get(j);
         if (var1) {
            GlStateManager._enableVertexAttribArray(j);
         }

         switch (vertexformatelement.usage()) {
            case POSITION:
            case GENERIC:
            case UV:
               if (vertexformatelement.type() == Type.FLOAT) {
                  GlStateManager._vertexAttribPointer(
                     j, vertexformatelement.count(), GlConst.toGl(vertexformatelement.type()), false, i, var0.getOffset(vertexformatelement)
                  );
               } else {
                  GlStateManager._vertexAttribIPointer(
                     j, vertexformatelement.count(), GlConst.toGl(vertexformatelement.type()), i, var0.getOffset(vertexformatelement)
                  );
               }
               break;
            case NORMAL:
            case COLOR:
               GlStateManager._vertexAttribPointer(
                  j, vertexformatelement.count(), GlConst.toGl(vertexformatelement.type()), true, i, var0.getOffset(vertexformatelement)
               );
         }
      }
   }
}
