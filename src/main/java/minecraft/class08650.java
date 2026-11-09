package minecraft;

import org.joml.Matrix3x2f;
import org.jspecify.annotations.Nullable;

public final class class08650 implements class08320 {
   private final String N;
   private final Matrix3x2f y;
   private final class08763 L;
   private final int u;
   private final int i;
   @Nullable
   private final class03255 R;
   @Nullable
   private final class03255 M;
   @Nullable
   private final class03255 B;

   public class08763 L() {
      return this.L;
   }

   @Nullable
   public class03255 M() {
      return this.M;
   }

   public class08650(String var1, Matrix3x2f var2, class08763 var3, int var4, int var5, @Nullable class03255 var6) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
      this.i = var5;
      this.R = var6;
      this.M = this.L().B() ? this.B() : null;
      this.B = this.N(this.M != null ? this.M : new class03255(this.u, this.i, 16, 16));
   }

   @Nullable
   private class03255 B() {
      class00734 class00734 = this.L.M();
      int ix = class04995.L(class00734.y() * 16.0);
      int j = class04995.L(class00734.L() * 16.0);
      if (ix <= 16 && j <= 16) {
         return null;
      } else {
         float f = (float)(class00734.N * 16.0);
         float f1 = (float)(class00734.i * 16.0);
         int k = class04995.y(f);
         int l = class04995.y(f1);
         int i1 = this.u + k + 8;
         int j1 = this.i - l + 8;
         return new class03255(i1, j1, ix, j);
      }
   }

   public int i() {
      return this.i;
   }

   public int u() {
      return this.u;
   }

   public Matrix3x2f y() {
      return this.y;
   }

   public String N() {
      return this.N;
   }

   @Nullable
   private class03255 N(class03255 var1) {
      class03255 class03255 = var1.y(this.y);
      return this.R != null ? this.R.y(class03255) : class03255;
   }

   @Nullable
   @Override
   public class03255 comp_4274() {
      return this.B;
   }

   @Nullable
   public class03255 R() {
      return this.R;
   }
}
