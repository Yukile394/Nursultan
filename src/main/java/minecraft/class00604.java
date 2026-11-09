package minecraft;

import java.util.function.Consumer;
import org.joml.Matrix3x2f;
import org.jspecify.annotations.Nullable;

public class class00604 implements class00580 {
   private static final class00577 L = new class00577(new Matrix3x2f());
   private final class01590 u;
   private final int i;
   private final int R;
   private class00577 M = L;
   private boolean B;
   @Nullable
   private class00405 Z;
   private final Consumer<class00405> z = var1x -> {
      if (var1x.Z() != null || this.B && var1x.U() != null) {
         this.Z = var1x;
      }
   };

   public class00604(class01590 var1, int var2, int var3) {
      super();
      this.u = var1;
      this.i = var2;
      this.R = var3;
   }

   @Nullable
   public class00405 y() {
      return this.Z;
   }

   public class00604 N(boolean var1) {
      this.B = var1;
      return this;
   }

   @Override
   public void N(class00392 var1, int var2, int var3, int var4, int var5, int var6, class00577 var7) {
      int ix = this.u.N(var1);
      byte b0 = 9;
      this.N(var1, var2, var3, var4, var5, var6, ix, b0, var7);
   }

   @Override
   public class00577 N() {
      return this.M;
   }

   @Override
   public void N(class00937 var1, int var2, int var3, class00577 var4, class01028 var5) {
      int ix = var1.N(var2, this.u, var5);
      class00580.N(new class08652(this.u, var5, var4.N(), ix, var3, class02566.y(var4.y()), 0, true, true, var4.L()), (float)this.i, (float)this.R, this.z);
   }

   @Override
   public void N(class00577 var1) {
      this.M = var1;
   }
}
