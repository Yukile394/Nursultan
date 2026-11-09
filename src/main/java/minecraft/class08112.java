package minecraft;

import java.util.ArrayList;
import java.util.List;
import org.joml.Matrix4f;
import org.jspecify.annotations.Nullable;

public class class08112 {
   final List<class08142> N = new ArrayList<>();
   final List<class08142> y = new ArrayList<>();

   public class08112() {
      super();
   }

   public void N(class01421 var1, @Nullable class06889 var2, int var3, class00392 var4, boolean var5, int var6, double var7, class06959 var9) {
      if (var2 != null) {
         class06202 class06202 = class06202.Nq();
         var1.N();
         var1.N(var2.M, var2.B + 0.5, var2.Z);
         var1.N(var9.i);
         var1.y(0.025F, -0.025F, 0.025F);
         Matrix4f matrix4f = new Matrix4f(var1.L().N());
         float f = -((class01590)class06202.i_3).N(var4) / 2.0F;
         int i = (int)(((class05630)class06202.i_7).N(0.25F) * 255.0F) << 24;
         if (var5) {
            this.y.add(new class08142(matrix4f, f, var3, var4, class03042.y(var6, 2), -1, 0, var7));
            this.N.add(new class08142(matrix4f, f, var3, var4, var6, -2130706433, i, var7));
         } else {
            this.y.add(new class08142(matrix4f, f, var3, var4, var6, -2130706433, i, var7));
         }

         var1.y();
      }
   }

   public void N() {
      this.y.clear();
      this.N.clear();
   }
}
