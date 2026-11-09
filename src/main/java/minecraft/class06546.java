package minecraft;

import org.jspecify.annotations.Nullable;

public abstract class class06546<T extends class07610> extends class01463<T> {
   protected final int N;
   protected float y;
   protected float L;
   protected class07438 u;

   @Nullable
   protected abstract class01894 L();

   public class06546(T var1, class08044 var2, class00392 var3, int var4, class07438 var5) {
      super((T)var1, var2, var3);
      this.N = var4;
      this.u = var5;
   }

   protected abstract boolean i();

   protected abstract class01894 y();

   protected void y(class01054 var1, int var2, int var3) {
      var1.N(class08394.Na, this.y(), var2, var3, 18, 18);
   }

   @Override
   protected void N(class01054 var1, float var2, int var3, int var4) {
      int i = (this.field_22789 - this.B) / 2;
      int j = (this.field_22790 - this.Z) / 2;
      var1.N(class08394.Na, this.N(), i, j, 0.0F, 0.0F, this.B, this.Z, 256, 256);
      if (this.N > 0 && this.L() != null) {
         var1.N(class08394.Na, this.L(), 90, 54, 0, 0, i + 79, j + 17, this.N * 18, 54);
      }

      if (this.i()) {
         this.y(var1, i + 7, j + 35 - 18);
      }

      if (this.R()) {
         this.y(var1, i + 7, j + 35);
      }

      class05410.N(var1, i + 26, j + 18, i + 78, j + 70, 17, 0.25F, this.y, this.L, this.u);
   }

   protected abstract class01894 N();

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      this.y = var2;
      this.L = var3;
      super.method_25394(var1, var2, var3, var4);
      this.a_(var1, var2, var3);
   }

   protected abstract boolean R();
}
