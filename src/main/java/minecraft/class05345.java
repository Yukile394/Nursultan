package minecraft;

import Nursultan.class10511;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class05345 extends class05096 {
   private static final int N = 2;
   private static final class01894 y = class01894.y("icon/draft_report");
   private int L;
   @Nullable
   private final class00392 u;
   private final boolean i;
   private final class04453 R;
   private final class00392 M;
   private final List<class05362> B = Lists.newArrayList();
   @Nullable
   private class05362 Z;

   public class05345(@Nullable class00392 var1, boolean var2, class04453 var3) {
      super(class00392.L(var2 ? "deathScreen.title.hardcore" : "deathScreen.title"));
      this.u = var1;
      this.i = var2;
      this.R = var3;
      class05216 class05216 = class00392.y(Integer.toString(var3.method_7272())).N(class06541.field_1054);
      this.M = class00392.N("deathScreen.score.value", class05216);
   }

   private void y() {
      if ((class03448)this.field_22787.T_3 != null) {
         ((class03448)this.field_22787.T_3).N(class03448.N);
      }

      this.field_22787.Nj();
      this.field_22787.N(new class04705());
   }

   public static void N(class01054 var0, int var1, int var2) {
      var0.N(0, 0, var1, var2, 1615855616, -1602211792);
   }

   private void N(boolean var1) {
      Iterator<class05362> iterator = this.B.iterator();

      while (iterator.hasNext()) {
         iterator.next().field_22763 = var1;
      }
   }

   private void N(class00580 var1) {
      class00577 class00577 = var1.N();
      int ix = this.field_22789 / 2;
      var1.N(class00577.N(2.0F));
      var1.N(class00937.field_62010, ix / 2, 30, this.field_22785);
      var1.N(class00577);
      if (this.u != null) {
         var1.N(class00937.field_62010, ix, 85, this.u);
      }

      var1.N(class00937.field_62010, ix, 100, this.M);
   }

   private void N() {
      if (this.i) {
         this.y();
      } else {
         class10511 class10511 = new class10511(var1x -> {
            if (var1x) {
               this.y();
            } else {
               this.R.K();
               this.field_22787.N(null);
            }
         }, class00392.L("deathScreen.quit.confirm"), class05220.N, class00392.L("deathScreen.titleScreen"), class00392.L("deathScreen.respawn"));
         this.field_22787.N(class10511);
         class10511.method_2125(20);
      }
   }

   @Override
   public void method_25426() {
      this.L = 0;
      this.B.clear();
      class05216 class05216 = this.i ? class00392.L("deathScreen.spectate") : class00392.L("deathScreen.respawn");
      this.B.add(this.method_37063(class05362.method_46430(class05216, var1x -> {
         this.R.K();
         var1x.field_22763 = false;
      }).N(this.field_22789 / 2 - 100, this.field_22790 / 4 + 72, 200, 20).N()));
      this.Z = this.method_37063(
         class05362.method_46430(class00392.L("deathScreen.titleScreen"), var1x -> this.field_22787.R().N(this.field_22787, this, this::N, true))
            .N(this.field_22789 / 2 - 100, this.field_22790 / 4 + 96, 200, 20)
            .N()
      );
      this.B.add(this.Z);
      this.N(false);
   }

   @Override
   public boolean method_25422() {
      return false;
   }

   @Override
   public void method_25393() {
      super.method_25393();
      this.L++;
      if (this.L == 20) {
         this.N(true);
      }
   }

   @Override
   public void method_25420(class01054 var1, int var2, int var3, float var4) {
      N(var1, this.field_22789, this.field_22790);
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      this.N(var1.N(class01065.field_63852));
      if (this.Z != null && this.field_22787.R().L()) {
         var1.N(class08394.Na, y, this.Z.method_46426() + this.Z.method_25368() - 17, this.Z.method_46427() + 3, 15, 15);
      }
   }

   @Override
   public boolean method_25421() {
      return false;
   }

   @Override
   public boolean method_73217() {
      return true;
   }

   @Override
   public boolean method_25402(class06613 var1, boolean var2) {
      class00604 class00604 = new class00604(this.method_64506(), (int)var1.n(), (int)var1.t());
      this.N(class00604);
      class00405 class00405 = class00604.y();
      return class00405 != null && class00405.Z() instanceof class00652 class00652
         ? method_71843(this.field_22787, this, class00652.y())
         : super.method_25402(var1, var2);
   }
}
