package minecraft;

import org.joml.Vector3f;
import org.jspecify.annotations.Nullable;

public class class01337 extends class03780 {
   public static final float N = 62.500004F;
   public static final float y = 0.9765628F;
   private static final Vector3f i = new Vector3f(0.9765628F, 0.9765628F, 0.9765628F);
   @Nullable
   private class06260 R;

   public class01337(class07267 var1, boolean var2, boolean var3) {
      super(var1, var2, var3);
   }

   @Override
   protected Vector3f y() {
      return i;
   }

   @Override
   protected void N(class01054 var1) {
      if (this.R != null) {
         int ix = this.field_22789 / 2;
         int j = ix - 48;
         byte b0 = 66;
         int k = ix + 48;
         short short1 = 168;
         var1.N(this.R, 62.500004F, this.u, j, 66, k, 168);
      }
   }

   @Override
   protected float N() {
      return 90.0F;
   }

   @Override
   public void method_25426() {
      super.method_25426();
      boolean flag = this.L.w().i() instanceof class07751;
      this.R = class03341.N(this.field_22787.yt(), this.u, flag);
   }
}
