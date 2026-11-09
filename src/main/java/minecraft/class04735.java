package minecraft;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

class class04735 extends class05729<class04735> {
   private static final class00392 y = class00392.L("mco.invites.button.accept");
   private static final class00392 L = class00392.L("mco.invites.button.reject");
   private static final class01883 u = new class01883(class01894.y("pending_invite/accept"), class01894.y("pending_invite/accept_highlighted"));
   private static final class01883 i = new class01883(class01894.y("pending_invite/reject"), class01894.y("pending_invite/reject_highlighted"));
   private static final int R = 18;
   private static final int M = 21;
   private static final int B = 38;
   private final class04957 Z;
   private final List<class06478> z;
   private final class01858 U;
   private final class01858 E;
   private final class02071 W;
   private final class02071 m;
   private final class02071 P;

   class04735(class04729 var1, class04957 var2) {
      super();
      this.N = var1;
      this.z = new ArrayList<>();
      this.Z = var2;
      int ix = var1.L.method_25322() - 32 - 32 - 42;
      this.W = new class02071(class00392.y(var2.y()), class04729.N(var1)).N(ix);
      this.m = new class02071(class00392.y(var2.L()).y(-6250336), class04729.y(var1)).N(ix);
      this.P = new class02071(class00390.N(class04601.N(var2.i()), class00405.N.N(-6250336)), class04729.L(var1)).N(ix);
      class05341 class05341 = this.N(var2);
      this.U = class01858.N(y, var1x -> this.N(true), false).N(u, 18, 18).N(21, 21).N(class05341).N().y();
      this.E = class01858.N(L, var1x -> this.N(false), false).N(i, 18, 18).N(21, 21).N(class05341).N().y();
      this.z.addAll(List.of(this.U, this.E));
   }

   private class05341 N(class04957 var1) {
      return var1x -> {
         class05216 class05216 = class05220.N(var1x.get(), class00392.y(var1.y()), class00392.y(var1.L()), class04601.N(var1.i()));
         return class00392.N("narrator.select", class05216);
      };
   }

   private void N(boolean var1) {
      String s = this.Z.N();
      CompletableFuture.<Boolean>supplyAsync(() -> {
         try {
            class05111 class05111 = class05111.N();
            if (var1) {
               class05111.N(s);
            } else {
               class05111.y(s);
            }

            return true;
         } catch (class05097 class05097) {
            class04729.N.error("Couldn't handle invite", class05097);
            return false;
         }
      }, class07536.Z()).thenAcceptAsync(var2x -> {
         if (var2x) {
            this.N.L.N(this);
            class03400 class03400 = class04729.i(this.N).Nd();
            if (var1) {
               class03400.L.N();
            }

            class03400.u.N();
         }
      }, class04729.u(this.N));
   }

   @Override
   public List<? extends class04654> method_25396() {
      return this.z;
   }

   @Override
   public List<? extends class03434> method_37025() {
      return this.z;
   }

   @Override
   public void method_25343(class01054 var1, int var2, int var3, boolean var4, float var5) {
      int ix = this.method_73380();
      int j = this.method_73382();
      int k = ix + 38;
      class04601.N(var1, ix, j, 32, this.Z.u());
      this.W.y(k, j + 1);
      this.W.method_48579(var1, var2, var3, ix);
      this.m.y(k, j + 12);
      this.m.method_48579(var1, var2, var3, ix);
      this.P.y(k, j + 24);
      this.P.method_48579(var1, var2, var3, ix);
      int l = j + this.method_73384() / 2 - 10;
      this.U.y(ix + this.method_73387() - 16 - 42, l);
      this.U.method_25394(var1, var2, var3, var5);
      this.E.y(ix + this.method_73387() - 8 - 21, l);
      this.E.method_25394(var1, var2, var3, var5);
   }
}
