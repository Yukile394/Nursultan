package minecraft;

import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.UUID;
import java.util.function.Supplier;

class class04730 extends class04718 {
   protected static final int N = 32;
   private static final class00392 L = class00392.L("mco.configure.world.invites.normal.tooltip");
   private static final class00392 u = class00392.L("mco.configure.world.invites.ops.tooltip");
   private static final class00392 i = class00392.L("mco.configure.world.invites.remove.tooltip");
   private static final class01894 R = class01894.y("player_list/make_operator");
   private static final class01894 M = class01894.y("player_list/remove_operator");
   private static final class01894 B = class01894.y("player_list/remove_player");
   private static final int Z = 8;
   private static final int z = 7;
   private final class04950 U;
   private final class05362 E;
   private final class05362 W;
   private final class05362 m;

   private void L(int var1) {
      if (var1 >= 0 && var1 < this.y.M.Z.size()) {
         class04950 class04950 = this.y.M.Z.get(var1);
         class05122 class05122 = new class05122(var3x -> {
            if (var3x) {
               class04601.N(var2xx -> var2xx.N(this.y.M.y, class04950.y), var0 -> class04710.N.error("Couldn't uninvite user", var0));
               this.y.M.Z.remove(var1);
               this.y.N(this.y.M);
            }

            this.y.i.N(this.y.u);
         }, class04710.L, class00392.N("mco.configure.world.uninvite.player", class04950.N));
         this.y.i.N(class05122);
      }
   }

   public class04730(class04710 var1, class04950 var2) {
      super();
      this.y = var1;
      this.U = var2;
      int ix = var1.M.Z.indexOf(this.U);
      this.W = class01858.N(L, var2x -> this.N(ix), false)
         .N(R, 8, 7)
         .N(16 + var1.u.method_64506().N(L))
         .N(var1x -> class05220.N(class00392.N("mco.invited.player.narration", var2.N), var1x.get(), class00392.N("narration.cycle_button.usage.focused", u)))
         .y();
      this.m = class01858.N(u, var2x -> this.y(ix), false)
         .N(M, 8, 7)
         .N(16 + var1.u.method_64506().N(u))
         .N(var1x -> class05220.N(class00392.N("mco.invited.player.narration", var2.N), var1x.get(), class00392.N("narration.cycle_button.usage.focused", L)))
         .y();
      this.E = class01858.N(i, var2x -> this.L(ix), false)
         .N(B, 8, 7)
         .N(16 + var1.u.method_64506().N(i))
         .N(var1x -> class05220.N(class00392.N("mco.invited.player.narration", var2.N), var1x.get()))
         .y();
      this.N();
   }

   private class05362 y() {
      return this.W.field_22764 ? this.W : this.m;
   }

   private void y(int var1) {
      UUID uuid = this.y.M.Z.get(var1).y;
      class04601.<class04964>N(var2x -> var2x.L(this.y.M.y, uuid), var0 -> class04710.N.error("Couldn't deop the user", var0)).thenAcceptAsync(var1x -> {
         this.N(var1x);
         this.N();
         this.method_25395(this.W);
      }, this.y.i);
   }

   private void N(class04964 var1) {
      for (class04950 class04950 : this.y.M.Z) {
         class04950.L = var1.N().contains(class04950.N);
      }
   }

   private void N(int var1) {
      UUID uuid = this.y.M.Z.get(var1).y;
      class04601.<class04964>N(var2x -> var2x.y(this.y.M.y, uuid), var0 -> class04710.N.error("Couldn't op the user", var0)).thenAcceptAsync(var1x -> {
         this.N(var1x);
         this.N();
         this.method_25395(this.m);
      }, this.y.i);
   }

   private void N() {
      this.W.field_22764 = !this.U.L;
      this.m.field_22764 = !this.W.field_22764;
   }

   @Override
   public List<? extends class04654> method_25396() {
      return ImmutableList.of(this.y(), this.E);
   }

   @Override
   public List<? extends class03434> method_37025() {
      return ImmutableList.of(this.y(), this.E);
   }

   @Override
   public void method_25343(class01054 var1, int var2, int var3, boolean var4, float var5) {
      int ix;
      if (!this.U.u) {
         ix = -6250336;
      } else if (this.U.i) {
         ix = -16711936;
      } else {
         ix = -1;
      }

      int j = this.method_73385() - 16;
      class04601.N(var1, this.method_73380(), j, 32, this.U.y);
      int k = this.method_73385() - 4;
      var1.y(this.y.R, this.U.N, this.method_73380() + 8 + 32, k, ix);
      int l = this.method_73385() - 10;
      int i1 = this.method_73389() - this.E.method_25368();
      this.E.y(i1, l);
      this.E.method_25394(var1, var2, var3, var5);
      int j1 = i1 - this.y().method_25368() - 8;
      this.W.y(j1, l);
      this.W.method_25394(var1, var2, var3, var5);
      this.m.y(j1, l);
      this.m.method_25394(var1, var2, var3, var5);
   }
}
