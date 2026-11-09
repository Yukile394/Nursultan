package minecraft;

import Nursultan.class10401;
import Nursultan.class11824;
import java.util.Objects;
import java.util.function.Consumer;
import org.joml.Vector3d;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class08382 {
   public static final int field_55663 = 3;
   private final class07049 field_55664;
   private int field_55665;
   public final class08605 field_55666 = new class08605(0, class06889.L, 0.0F, 0.0F);
   @Nullable
   private class06889 field_55667;
   @Nullable
   private class07109 field_55668;
   @Nullable
   private final Consumer<class08382> field_55669;

   public boolean method_66270() {
      return this.field_55666.N > 0;
   }

   public float method_66268() {
      return this.field_55666.N > 0 ? this.field_55666.L : this.field_55664.method_36454();
   }

   public class06889 method_66265() {
      return this.field_55666.N > 0 ? this.field_55666.y : this.field_55664.method_73189();
   }

   public float method_66269() {
      return this.field_55666.N > 0 ? this.field_55666.u : this.field_55664.method_36455();
   }

   public void method_66267(class06889 var1, float var2, float var3) {
      this.handler$cfi000$nursultan$injectRefreshPositionAndAngles(var1, var2, var3, null);
      if (this.field_55665 == 0) {
         this.field_55664.method_60949(var1, var2, var3);
         this.method_66272();
      } else if (!this.method_66270()
         || !Objects.equals(this.method_66268(), var2)
         || !Objects.equals(this.method_66269(), var3)
         || !Objects.equals(this.method_66265(), var1)) {
         this.field_55666.N = this.field_55665;
         this.field_55666.y = var1;
         this.field_55666.L = var2;
         this.field_55666.u = var3;
         this.field_55667 = this.field_55664.method_73189();
         this.field_55668 = new class07109(this.field_55664.method_36455(), this.field_55664.method_36454());
         if (this.field_55669 != null) {
            this.field_55669.accept(this);
         }
      }
   }

   public class08382(class07049 var1) {
      this(var1, 3, null);
   }

   public class08382(class07049 var1, int var2) {
      this(var1, var2, null);
   }

   public class08382(class07049 var1, @Nullable Consumer<class08382> var2) {
      this(var1, 3, var2);
   }

   public class08382(class07049 var1, int var2, @Nullable Consumer<class08382> var3) {
      super();
      this.field_55665 = var2;
      this.field_55664 = var1;
      this.field_55669 = var3;
   }

   public void method_66272() {
      this.field_55666.N = 0;
      this.field_55667 = null;
      this.field_55668 = null;
   }

   public void method_66271() {
      if (!this.method_66270()) {
         this.method_66272();
      } else {
         double d0 = 1.0 / this.field_55666.N;
         if (this.field_55667 != null) {
            class06889 class06889x = this.field_55664.method_73189().u(this.field_55667);
            if (this.field_55664.method_73183().method_8587(this.field_55664, this.field_55664.method_65341(this.field_55666.y.i(class06889x)))) {
               this.field_55666.N(class06889x);
            }
         }

         if (this.field_55668 != null) {
            float f3 = this.field_55664.method_36454() - this.field_55668.U;
            float f = this.field_55664.method_36455() - this.field_55668.z;
            this.field_55666.N(f3, f);
         }

         double d3 = class04995.u(d0, this.field_55664.method_23317(), this.field_55666.y.M);
         double d1 = class04995.u(d0, this.field_55664.method_23318(), this.field_55666.y.B);
         double d2 = class04995.u(d0, this.field_55664.method_23321(), this.field_55666.y.Z);
         class06889 class06889 = new class06889(d3, d1, d2);
         float f1 = (float)class04995.i(d0, (double)this.field_55664.method_36454(), (double)this.field_55666.L);
         float f2 = (float)class04995.u(d0, (double)this.field_55664.method_36455(), (double)this.field_55666.u);
         this.field_55664.method_33574(class06889);
         this.field_55664.method_5710(f1, f2);
         this.field_55666.N();
         this.field_55667 = class06889;
         this.field_55668 = new class07109(this.field_55664.method_36455(), this.field_55664.method_36454());
      }
   }

   public void method_66266(int var1) {
      this.field_55665 = var1;
   }

   public void handler$cfi000$nursultan$injectRefreshPositionAndAngles(class06889 var1, float var2, float var3, CallbackInfo var4) {
      class07049 class07049 = this.field_55664;
      if (class07049 instanceof class10401) {
         class11824 class11824 = (class11824)((class10401)class07049).dataManager();
         Vector3d vector3d = class11824.N().N();
         class11824.u().N().set(vector3d);
         vector3d.set(var1.M, var1.B, var1.Z);
      }
   }
}
