package minecraft;

import java.util.function.Consumer;
import org.joml.Matrix3x2f;
import org.joml.Vector2f;
import org.jspecify.annotations.Nullable;

class class06469 implements class06465, Consumer<class00405> {
   private final class01054 N;
   private final class01590 y;
   private final class00580 L;
   private class00577 u;
   private final int i;
   private final int R;
   private final Vector2f M = new Vector2f();
   @Nullable
   private class00405 B;
   private final boolean Z;

   public class06469(class01054 var1, class01590 var2, int var3, int var4, boolean var5) {
      super();
      this.N = var1;
      this.y = var2;
      this.L = var1.N(class01065.field_63852, this);
      this.i = var3;
      this.R = var4;
      this.Z = var5;
      this.u = this.L.N();
      this.N();
   }

   private boolean N(int var1, int var2, int var3, int var4) {
      return class00580.N(this.M.x, this.M.y, var1, var2, var3, var4);
   }

   @Override
   public void N(int var1, int var2, int var3, int var4, float var5, class03054 var6) {
      int ix = class02566.N(var5, var6.i());
      this.N.N(var1, var2, var3, var4, ix);
      if (this.N(var1, var2, var3, var4)) {
         this.N(var6);
      }
   }

   @Override
   public void N(int var1, int var2, boolean var3, class03054 var4, class03050 var5) {
      int ix = var2 - var5.field_39767 - 1;
      int j = var1 + var5.field_39766;
      boolean flag = this.N(var1, ix, j, var2);
      if (flag) {
         this.N(var4);
      }

      if (var3 || flag) {
         var5.N(this.N, var1, ix);
      }
   }

   private void N(class03054 var1) {
      if (var1.M() != null) {
         this.N.y(this.y, this.y.L(var1.M(), 210), this.i, this.R);
      }
   }

   @Override
   public boolean N(int var1, float var2, class01028 var3) {
      this.B = null;
      this.L.N(class00937.field_62009, 0, var1, this.u.y(var2), var3);
      if (this.Z && this.B != null && this.B.U() != null) {
         this.N.N(class06608.u);
      }

      return this.B != null;
   }

   @Override
   public void N(Consumer<Matrix3x2f> var1) {
      var1.accept(this.N.i());
      this.u = this.u.N(new Matrix3x2f(this.N.i()));
      this.N();
   }

   @Override
   public void N(int var1, int var2, int var3, int var4, int var5) {
      this.N.N(var1, var2, var3, var4, var5);
   }

   public void accept(class00405 var1) {
      this.B = var1;
   }

   private void N() {
      this.N.i().invert(new Matrix3x2f()).transformPosition(this.i, this.R, this.M);
   }
}
