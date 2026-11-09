package minecraft;

import java.util.List;
import org.jspecify.annotations.Nullable;

public class class03723 extends class05096 {
   private static final class01894 N = class01894.y("popup/background");
   private static final int y = 12;
   private static final int L = 18;
   private static final int u = 6;
   private static final int i = 130;
   private static final int R = 64;
   private static final int M = 250;
   private final class05096 B;
   @Nullable
   private final class01894 Z;
   private final class00392 z;
   private final List<class03708> U;
   @Nullable
   private final Runnable E;
   private final int W;
   private final class01885 m = class01885.u();

   class03723(class05096 var1, int var2, @Nullable class01894 var3, class00392 var4, class00392 var5, List<class03708> var6, @Nullable Runnable var7) {
      super(var4);
      this.B = var1;
      this.Z = var3;
      this.z = var5;
      this.U = var6;
      this.E = var7;
      this.W = var2 - 36;
   }

   private class01885 N() {
      int ix = 6 * (this.U.size() - 1);
      int j = Math.min((this.W - ix) / this.U.size(), 150);
      class01885 class01885 = class01885.i();
      class01885.N(6);

      for (class03708 class03708 : this.U) {
         class01885.N(class05362.method_46430(class03708.N(), var2x -> class03708.y().accept(this)).N(j).N());
      }

      return class01885;
   }

   @Override
   public void method_25426() {
      this.B.method_25423(this.field_22789, this.field_22790);
      this.m.N(12).L().y();
      this.m.N(new class04230(this.field_22785.L().N(class06541.field_1067), this.field_22793).N(this.W).N(true));
      if (this.Z != null) {
         this.m.N(class03608.N(130, 64, this.Z, 130, 64));
      }

      this.m.N(new class04230(this.z, this.field_22793).N(this.W).N(true));
      this.m.N(this.N());
      this.m.method_48206(var1 -> {
         class06478 class06478 = this.method_37063(var1);
      });
      this.method_48640();
   }

   @Override
   public void method_49589() {
      super.method_49589();
      this.B.method_48267();
   }

   @Override
   public void method_48640() {
      this.B.method_25410(this.field_22789, this.field_22790);
      this.m.N();
      class02077.N(this.m, this.method_48202());
   }

   @Override
   public void method_25420(class01054 var1, int var2, int var3, float var4) {
      this.B.method_25420(var1, var2, var3, var4);
      var1.L();
      this.B.method_25394(var1, -1, -1, var4);
      var1.L();
      this.method_52752(var1);
      var1.N(class08394.Na, N, this.m.method_46426() - 18, this.m.method_46427() - 18, this.m.method_25368() + 36, this.m.method_25364() + 36);
   }

   @Override
   public void method_25419() {
      if (this.E != null) {
         this.E.run();
      }

      this.field_22787.N(this.B);
   }

   @Override
   public class00392 method_25435() {
      return class05220.N(this.field_22785, this.z);
   }
}
