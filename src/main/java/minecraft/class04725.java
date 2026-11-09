package minecraft;

import java.util.concurrent.CompletableFuture;
import org.jspecify.annotations.Nullable;

public class class04725 extends class05407 {
   private static final class00392 N = class00392.L("mco.configure.world.buttons.invite");
   private static final class00392 y = class00392.L("mco.configure.world.invite.profile.name").y(-6250336);
   private static final class00392 L = class00392.L("mco.configure.world.players.inviting").y(-6250336);
   private static final class00392 u = class00392.L("mco.configure.world.players.error").y(-65536);
   private static final class00392 i = class00392.L("mco.configure.world.players.invite.duplicate").y(-65536);
   private final class03686 R = new class03686(this);
   @Nullable
   private class04927 M;
   @Nullable
   private class05362 B;
   private final class04981 Z;
   private final class05092 z;
   @Nullable
   private class00392 U;

   public class04725(class05092 var1, class04981 var2) {
      super(N);
      this.z = var1;
      this.Z = var2;
   }

   private void N(class00392 var1) {
      this.U = var1;
      this.field_22787.NT().u(var1);
   }

   private void N() {
      if (this.B != null && this.M != null) {
         if (class05018.B(this.M.method_1882())) {
            this.N(u);
         } else if (this.Z.Z.stream().anyMatch(var1x -> var1x.N.equalsIgnoreCase(this.M.method_1882()))) {
            this.N(i);
         } else {
            long ix = this.Z.y;
            String s = this.M.method_1882().trim();
            this.B.field_22763 = false;
            this.M.method_1888(false);
            this.N(L);
            CompletableFuture.<Boolean>supplyAsync(() -> this.z.N(ix, s), class07536.Z()).thenAcceptAsync(var1x -> {
               if (var1x) {
                  this.field_22787.N(this.z);
               } else {
                  this.N(u);
               }

               this.M.method_1888(true);
               this.B.field_22763 = true;
            }, this.field_44944);
         }
      }
   }

   @Override
   public void method_25426() {
      this.R.N(N, this.field_22793);
      class01885 class01885 = this.R.L(class01885.u().N(8));
      this.M = new class04927((class01590)this.field_22787.i_3, 200, 20, class00392.L("mco.configure.world.invite.profile.name"));
      class01885.N(class03725.N(this.field_22793, this.M, y));
      this.B = class01885.N(class05362.method_46430(N, var1x -> this.N()).N(200).N());
      this.R.y(class05362.method_46430(class05220.U, var1x -> this.method_25419()).N(200).N());
      this.R.method_48206(var1x -> {
         class06478 class06478 = this.method_37063(var1x);
      });
      this.method_48640();
   }

   @Override
   protected void method_56131() {
      if (this.M != null) {
         this.method_48265(this.M);
      }
   }

   @Override
   public void method_48640() {
      this.R.N();
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
      if (this.U != null && this.B != null) {
         var1.N(this.field_22793, this.U, this.field_22789 / 2, this.B.method_46427() + this.B.method_25364() + 8, -1);
      }
   }

   @Override
   public void method_25419() {
      this.field_22787.N(this.z);
   }
}
