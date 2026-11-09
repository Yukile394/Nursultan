package minecraft;

import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class class03418 extends class05096 {
   private static final class00392 u = class00392.L("gui.abuseReport.reason.title");
   private static final class00392 i = class00392.L("gui.abuseReport.reason.description");
   private static final class00392 R = class00392.L("gui.abuseReport.read_info");
   private static final int M = 320;
   private static final int B = 62;
   private static final int Z = 4;
   @Nullable
   private final class05096 z;
   private class03392 U;
   @Nullable
   class03380 N;
   private final Consumer<class03380> E;
   final class03686 y = new class03686(this);
   final class03752 L;

   private int L() {
      return (this.field_22789 + 320) / 2;
   }

   public class03418(@Nullable class05096 var1, @Nullable class03380 var2, class03752 var3, Consumer<class03380> var4) {
      super(u);
      this.z = var1;
      this.N = var2;
      this.E = var4;
      this.L = var3;
   }

   private int Z() {
      return 62;
   }

   private int i() {
      return this.field_22790 - this.y.y() - 4;
   }

   private int u() {
      return this.i() - this.Z();
   }

   private int y() {
      return (this.field_22789 - 320) / 2;
   }

   int N() {
      return this.y.u() - this.Z() - 8;
   }

   @Override
   public void method_25426() {
      this.y.N(u, this.field_22793);
      class01885 class01885x = this.y.L(class01885.u().N(4));
      this.U = class01885x.N(new class03392(this, this.field_22787));
      class03376 class03376 = class01962.N(this.N, this.U::N);
      this.U.method_25313(class03376);
      class01885x.N(class02057.y(this.Z()));
      class01885 class01885x = this.y.y(class01885.i().N(8));
      class01885x.N(class05362.method_46430(R, class01321.y(this, class03597.W)).N());
      class01885x.N(class05362.method_46430(class05220.u, var1x -> {
         class03376 class03376x = this.U.method_25334();
         if (class03376x != null) {
            this.E.accept(class03376x.N());
         }

         this.field_22787.N(this.z);
      }).N());
      this.y.method_48206(var1x -> {
         class06478 class06478 = this.method_37063(var1x);
      });
      this.method_48640();
   }

   @Override
   public void method_48640() {
      this.y.N();
      if (this.U != null) {
         this.U.method_57714(this.field_22789, this.N(), this.y.L());
      }
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      var1.N(this.y(), this.u(), this.L(), this.i(), -16777216);
      var1.y(this.y(), this.u(), this.R(), this.Z(), -1);
      var1.y(this.field_22793, i, this.y() + 4, this.u() + 4, -1);
      class03376 class03376 = this.U.method_25334();
      if (class03376 != null) {
         int ix = this.y() + 4 + 16;
         int j = this.L() - 4;
         int k = this.u() + 4 + 9 + 2;
         int l = this.i() - 4;
         int i1 = j - ix;
         int j1 = l - k;
         int k1 = this.field_22793.y(class03376.N.L(), i1);
         var1.N(this.field_22793, class03376.N.L(), ix, k + (j1 - k1) / 2, i1, -1);
      }
   }

   @Override
   public void method_25419() {
      this.field_22787.N(this.z);
   }

   private int R() {
      return 320;
   }
}
