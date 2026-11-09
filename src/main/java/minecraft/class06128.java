package minecraft;

import java.util.ArrayList;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class06128 implements class04680 {
   private static final class01894 B = class01894.y("toast/tutorial");
   public static final int N = 154;
   public static final int i = 1;
   public static final int R = 3;
   public static final int M = 4;
   private static final int Z = 7;
   private static final int z = 3;
   private static final int U = 11;
   private static final int E = 30;
   private static final int W = 126;
   private final class06090 m;
   private final List<class01028> P;
   private class04650 s = class04650.field_2210;
   private long T;
   private float b;
   private float j;
   private final boolean v;
   private final int n;

   public class06128(class01590 var1, class06090 var2, class00392 var3, @Nullable class00392 var4, boolean var5, int var6) {
      super();
      this.m = var2;
      this.P = new ArrayList<>(2);
      this.P.addAll(var1.L(var3.L().y(-11534256), 126));
      if (var4 != null) {
         this.P.addAll(var1.L(var4, 126));
      }

      this.v = var5;
      this.n = var6;
   }

   public class06128(class01590 var1, class06090 var2, class00392 var3, @Nullable class00392 var4, boolean var5) {
      this(var1, var2, var3, var4, var5, 0);
   }

   public void B() {
      this.s = class04650.field_2209;
   }

   private int Z() {
      return Math.max(this.P.size(), 2) * 11;
   }

   @Override
   public class04650 i() {
      return this.s;
   }

   @Override
   public int u() {
      return 7 + this.Z() + 3;
   }

   public void N(float var1) {
      this.j = var1;
   }

   @Override
   public void N(class06086 var1, long var2) {
      if (this.n > 0) {
         this.j = Math.min((float)var2 / this.n, 1.0F);
         this.b = this.j;
         this.T = var2;
         if (var2 > this.n) {
            this.B();
         }
      } else if (this.v) {
         this.b = class04995.y((float)(var2 - this.T) / 100.0F, this.b, this.j);
         this.T = var2;
      }
   }

   @Override
   public void N(class01054 var1, class01590 var2, long var3) {
      int ix = this.u();
      var1.N(class08394.Na, B, 0, 0, this.L(), ix);
      this.m.N(var1, 6, 6);
      int jx = this.P.size() * 11;
      int k = 7 + (this.Z() - jx) / 2;

      for (int l = 0; l < this.P.size(); l++) {
         var1.N(var2, this.P.get(l), 30, k + l * 11, -16777216, false);
      }

      if (this.v) {
         int j1 = ix - 4;
         var1.N(3, j1, 157, j1 + 1, -1);
         int i1;
         if (this.j >= this.b) {
            i1 = -16755456;
         } else {
            i1 = -11206656;
         }

         var1.N(3, j1, (int)(3.0F + 154.0F * this.b), j1 + 1, i1);
      }
   }
}
