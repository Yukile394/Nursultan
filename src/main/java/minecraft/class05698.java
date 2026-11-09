package minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

class class05698 extends class05728 {
   private static final class00392 M = class00392.L("mco.onlinePlayers");
   private static final int B = 9;
   private static final int Z = 3;
   private static final int z = 36;
   final class04981 N;
   private final class04282 U;

   private void L() {
      class05685.Q(this.y).Nr().N(class00040.N(class04909.OK, 1.0F));
      class05685.N(this.N, this.y);
   }

   public class05698(class05685 var1, class04981 var2) {
      super(var1);
      this.y = var1;
      this.U = new class04282();
      this.N = var2;
      boolean flag = class05685.N(var2);
      if (class05685.N() && flag && var2.Z()) {
         this.U.N(class04141.N(class00392.N("mco.snapshot.paired", var2.t)));
      } else if (!flag && var2.R()) {
         this.U.N(class04141.N(class00392.N("mco.snapshot.friendsRealm.downgrade", var2.G)));
      }
   }

   private void u() {
      class05685.O(this.y).Nr().N(class00040.N(class04909.OK, 1.0F));
      class05132 class05132 = new class05132(this.y, this.N, this.N.Z());
      class05685.g(this.y).N(class05132);
   }

   public class04981 N() {
      return this.N;
   }

   private boolean N(class01054 var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8) {
      List<class02689> list = this.y.n.N(this.N.y);
      int i = list.size();
      if (i > 0) {
         int j = var3 + var4 - 21;
         int k = var2 + var5 - 9 - 2;
         int l = 9 * i + 3 * (i - 1);
         int i1 = j - l;
         ArrayList arraylist;
         if (var6 >= i1 && var6 <= j && var7 >= k && var7 <= k + 9) {
            arraylist = new ArrayList(i);
         } else {
            arraylist = null;
         }

         class07949 class07949 = class05685.k(this.y).Nn();

         for (int j1 = 0; j1 < list.size(); j1++) {
            class02689 class02689 = list.get(j1);
            class07923 class07923 = class07949.N(class02689);
            int k1 = i1 + 12 * j1;
            class03933.N(var1, class07923.y(), k1, k, 9);
            if (arraylist != null) {
               arraylist.add(class07923);
            }
         }

         if (arraylist != null) {
            var1.N(class05685.Y(this.y), List.of(M), Optional.of(new class02590(arraylist)), var6, var7);
            return true;
         }
      }

      return false;
   }

   @Override
   public boolean method_25404(class06601 var1) {
      if (var1.L()) {
         if (this.N.R == class04961.field_19435) {
            this.u();
            return true;
         }

         if (this.N.M()) {
            this.L();
            return true;
         }
      }

      return super.method_25404(var1);
   }

   @Override
   public boolean method_25402(class06613 var1, boolean var2) {
      if (this.N.R == class04961.field_19435) {
         this.u();
      } else if (this.N.M() && var2 && this.method_25370()) {
         this.L();
      }

      return true;
   }

   @Override
   public void method_25343(class01054 var1, int var2, int var3, boolean var4, float var5) {
      if (this.N.R == class04961.field_19435) {
         var1.N(class08394.Na, class05685.y, this.method_73380() - 5, this.method_73385() - 10, 40, 20);
         int i = this.method_73385() - 4;
         var1.y(class05685.w(this.y), class05685.Z, this.method_73380() + 40 - 2, i, -8388737);
      } else {
         class04601.N(var1, this.method_73380(), this.method_73382(), 32, this.N.B);
         this.N(var1, this.method_73382(), this.method_73380(), this.method_73387(), -1, this.N);
         this.N(var1, this.method_73382(), this.method_73380(), this.method_73387(), this.N);
         this.N(var1, this.method_73382(), this.method_73380(), this.N);
         this.N(this.N, var1, this.method_73389(), this.method_73382(), var2, var3);
         boolean flag = this.N(var1, this.method_73382(), this.method_73380(), this.method_73387(), this.method_73384(), var2, var3, var5);
         if (!flag) {
            this.U
               .N(
                  var1,
                  var2,
                  var3,
                  var4,
                  this.method_25370(),
                  new class03255(this.method_73380(), this.method_73382(), this.method_73387(), this.method_73384())
               );
         }
      }
   }

   @Override
   public class00392 method_37006() {
      return (class00392)(this.N.R == class04961.field_19435
         ? class05685.T
         : class00392.N("narrator.select", Objects.requireNonNullElse(this.N.u, "unknown server")));
   }
}
