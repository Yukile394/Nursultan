package minecraft;

import org.joml.Matrix3x2fc;
import org.jspecify.annotations.Nullable;

public final class class08652 implements class08320 {
   public final class01590 N;
   public final class01028 y;
   public final Matrix3x2fc L;
   public final int u;
   public final int i;
   public final int R;
   public final int M;
   public final boolean B;
   final boolean Z;
   @Nullable
   public final class03255 z;
   @Nullable
   private class01608 U;
   @Nullable
   private class03255 E;

   public class08652(
      class01590 var1, class01028 var2, Matrix3x2fc var3, int var4, int var5, int var6, int var7, boolean var8, boolean var9, @Nullable class03255 var10
   ) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = var5;
      this.R = var6;
      this.M = var7;
      this.B = var8;
      this.Z = var9;
      this.z = var10;
   }

   public class01608 N() {
      if (this.U == null) {
         this.U = this.N.N(this.y, this.u, this.i, this.R, this.B, this.Z, this.M);
         class03255 class03255 = this.U.N();
         if (class03255 != null) {
            class03255 = class03255.y(this.L);
            this.E = this.z != null ? this.z.y(class03255) : class03255;
         }
      }

      return this.U;
   }

   @Nullable
   @Override
   public class03255 comp_4274() {
      this.N();
      return this.E;
   }
}
