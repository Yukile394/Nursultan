package minecraft;

import java.util.List;
import java.util.Optional;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.resource.client.PackTooltipComponent;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
public class class05066 extends class05068 implements class07583 {
   private static final int i = 157;
   public static final int y = 32;
   private final class05059 R;
   protected final class06202 L;
   private final class01272 M;
   private final class02071 B;
   private final class04230 Z;

   private boolean L() {
      return !this.M.B() || !this.M.Z();
   }

   @Override
   public boolean M() {
      return this.u.method_25396().stream().anyMatch(var1 -> var1.N().equals(this.N()));
   }

   public class05066(class05059 var1, class06202 var2, class05059 var3, class01272 var4) {
      super(var1);
      this.u = var1;
      this.L = var2;
      this.M = var4;
      this.R = var3;
      this.B = new class02071(var4.u(), (class01590)var2.i_3);
      this.Z = new class04230(class00390.N(var4.M(), class00405.N.N(-8355712)), (class01590)var2.i_3);
      this.Z.y(2);
   }

   private void i() {
      if (this.M.b()) {
         this.M.W();
      }
   }

   private void u() {
      if (this.M.T()) {
         this.M.E();
      }
   }

   public void y() {
      if (this.M.P()) {
         this.R();
      } else if (this.M.s()) {
         this.M.U();
      }
   }

   private void N(class01054 var1, int var2, int var3, boolean var4, float var5, CallbackInfo var6) {
      if (var4) {
         class00392 class00392 = null;
         boolean flag = false;
         if (this.B.method_25368() < ((class01590)this.L.i_3).N(this.B.method_25369().method_30937())) {
            class00392 = this.B.method_25369();
         }

         List<class01028> list = ((class01590)this.L.i_3).L(this.Z.method_25369(), i - (this.u.method_44390() > 0 ? 6 : 0));
         if (list.size() > 2) {
            flag = true;
         }

         if (class00392 != null || flag) {
            var1.N(
               (class01590)this.L.i_3,
               List.of(),
               Optional.of(new PackTooltipComponent(Optional.ofNullable(class00392), flag ? Optional.of(list) : Optional.empty())),
               var2,
               var3
            );
         }
      }
   }

   @Override
   public String N() {
      return this.M.L();
   }

   @Override
   public boolean method_25404(class06601 var1) {
      if (var1.u()) {
         this.y();
         return true;
      } else {
         if (var1.W()) {
            if (var1.B()) {
               this.u();
               return true;
            }

            if (var1.Z()) {
               this.i();
               return true;
            }
         }

         return super.method_25404(var1);
      }
   }

   @Override
   public boolean method_25402(class06613 var1, boolean var2) {
      if (this.L()) {
         int ix = (int)var1.n() - this.method_73380();
         int j = (int)var1.t() - this.method_73382();
         if (this.M.P() && this.N(ix, j, 32)) {
            this.R();
            return true;
         }

         if (this.M.s() && this.y(ix, j, 32)) {
            this.M.U();
            return true;
         }

         if (this.M.T() && this.u(ix, j, 32)) {
            this.M.E();
            return true;
         }

         if (this.M.b() && this.i(ix, j, 32)) {
            this.M.W();
            return true;
         }
      }

      return super.method_25402(var1, var2);
   }

   private void R() {
      if (this.M.y().N()) {
         this.M.z();
      } else {
         class00392 class00392 = this.M.y().L();
         this.L.N(new class05733(var1x -> {
            this.L.N(this.R.U);
            if (var1x) {
               this.M.z();
            }
         }, class05059.z, class00392));
      }
   }

   @Override
   public void method_25343(class01054 var1, int var2, int var3, boolean var4, float var5) {
      if (!this.M.y().N()) {
         int ix = this.method_73380() - 1;
         int j = this.method_73382() - 1;
         int k = this.method_73389() + 1;
         int l = this.method_73386() + 1;
         var1.N(ix, j, k, l, -8978432);
      }

      var1.N(class08394.Na, this.M.N(), this.method_73380(), this.method_73382(), 0.0F, 0.0F, 32, 32, 32, 32);
      if (!this.B.method_25369().equals(this.M.u())) {
         this.B.method_25355(this.M.u());
      }

      if (!this.Z.method_25369().method_10851().equals(this.M.M().method_10851())) {
         this.Z.method_25355(class00390.N(this.M.M(), class00405.N.N(-8355712)));
      }

      if (this.L() && (((class05630)this.L.i_7).Nm().method_41753() || var4 || this.R.method_25334() == this && this.R.method_25370())) {
         var1.N(this.method_73380(), this.method_73382(), this.method_73380() + 32, this.method_73382() + 32, -1601138544);
         int i1 = var2 - this.method_73380();
         int j1 = var3 - this.method_73382();
         if (!this.M.y().N()) {
            this.B.method_25355(class05059.Z);
            this.Z.method_25355(this.M.y().y());
         }

         if (this.M.P()) {
            if (this.N(i1, j1, 32)) {
               var1.N(class08394.Na, class05059.N, this.method_73380(), this.method_73382(), 32, 32);
               class05059.N(this.u, var1);
            } else {
               var1.N(class08394.Na, class05059.y, this.method_73380(), this.method_73382(), 32, 32);
            }
         } else {
            if (this.M.s()) {
               if (this.y(i1, j1, 32)) {
                  var1.N(class08394.Na, class05059.L, this.method_73380(), this.method_73382(), 32, 32);
                  class05059.y(this.u, var1);
               } else {
                  var1.N(class08394.Na, class05059.u, this.method_73380(), this.method_73382(), 32, 32);
               }
            }

            if (this.M.T()) {
               if (this.u(i1, j1, 32)) {
                  var1.N(class08394.Na, class05059.i, this.method_73380(), this.method_73382(), 32, 32);
                  class05059.L(this.u, var1);
               } else {
                  var1.N(class08394.Na, class05059.R, this.method_73380(), this.method_73382(), 32, 32);
               }
            }

            if (this.M.b()) {
               if (this.i(i1, j1, 32)) {
                  var1.N(class08394.Na, class05059.M, this.method_73380(), this.method_73382(), 32, 32);
                  class05059.u(this.u, var1);
               } else {
                  var1.N(class08394.Na, class05059.B, this.method_73380(), this.method_73382(), 32, 32);
               }
            }
         }
      }

      this.B.N(157 - (class05059.y(this.u) ? 6 : 0));
      this.B.y(this.method_73380() + 32 + 2, this.method_73382() + 1);
      this.B.method_25394(var1, var2, var3, var5);
      this.Z.N(157 - (class05059.L(this.u) ? 6 : 0));
      this.Z.y(this.method_73380() + 32 + 2, this.method_73382() + 12);
      this.Z.method_25394(var1, var2, var3, var5);
      this.N(var1, var2, var3, var4, var5, null);
   }

   @Override
   public class00392 method_37006() {
      return class00392.N("narrator.select", this.M.u());
   }
}
