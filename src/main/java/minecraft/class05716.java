package minecraft;

import java.util.function.Supplier;
import net.caffeinemc.mods.sodium.client.gui.VideoSettingsScreen;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class05716 extends class05096 {
   private static final class00392 y = class00392.L("options.title");
   private static final class00392 L = class00392.L("options.skinCustomisation");
   private static final class00392 u = class00392.L("options.sounds");
   private static final class00392 i = class00392.L("options.video");
   public static final class00392 N = class00392.L("options.controls");
   private static final class00392 R = class00392.L("options.language");
   private static final class00392 M = class00392.L("options.chat");
   private static final class00392 B = class00392.L("options.resourcepack");
   private static final class00392 Z = class00392.L("options.accessibility");
   private static final class00392 z = class00392.L("options.telemetry");
   private static final class04141 U = class04141.N(class00392.L("options.telemetry.disabled"));
   private static final class00392 E = class00392.L("options.credits_and_attribution");
   private static final int W = 2;
   private final class03686 m = new class03686(this, 61, 33);
   private final class05096 P;
   private final class05630 s;
   @Nullable
   private class06366<class07086> T;
   @Nullable
   private class01232 b;

   public class05716(class05096 var1, class05630 var2) {
      super(y);
      this.P = var1;
      this.s = var2;
   }

   private void N(CallbackInfoReturnable var1) {
      var1.setReturnValue(VideoSettingsScreen.createScreen(this));
   }

   private void N(boolean var1) {
      this.field_22787.N(this);
      if (var1 && (class03448)this.field_22787.T_3 != null && this.b != null && this.T != null) {
         this.field_22787.NE().N(new class06321(true));
         this.b.N(true);
         this.b.field_22763 = false;
         this.T.field_22763 = false;
      }
   }

   public static class06366<class07086> N(int var0, int var1, String var2, class06202 var3) {
      return class06366.N(class07086::y, ((class03448)var3.T_3).y())
         .N(class07086.values())
         .N(var0, var1, 150, 20, class00392.L(var2), (var1x, var2x) -> var3.NE().N(new class06287(var2x)));
   }

   private class02102 N() {
      if ((class03448)this.field_22787.T_3 != null && this.field_22787.v()) {
         this.T = N(0, 0, "options.difficulty", this.field_22787);
         if (!((class03448)this.field_22787.T_3).method_8401().U()) {
            this.b = new class01232(
               0,
               0,
               var1x -> this.field_22787
                  .N(
                     new class05733(
                        this::N,
                        class00392.L("difficulty.lock.title"),
                        class00392.N("difficulty.lock.question", ((class03448)this.field_22787.T_3).method_8401().s().y())
                     )
                  )
            );
            this.T.method_25358(this.T.method_25368() - this.b.method_25368());
            this.b.N(((class03448)this.field_22787.T_3).method_8401().T());
            this.b.field_22763 = !this.b.y();
            this.T.field_22763 = !this.b.y();
            class02041 class02041 = new class02041(150, 0, class02062.field_40789);
            class02041.N(this.T);
            class02041.N(this.b);
            return class02041;
         } else {
            this.T.field_22763 = false;
            return this.T;
         }
      } else {
         return class05362.method_46430(class00392.L("options.online"), var1x -> this.field_22787.N(new class04328(this, this.s)))
            .N(this.field_22789 / 2 + 5, this.field_22790 / 6 - 12 + 24, 150, 20)
            .N();
      }
   }

   private void N(class01623 var1) {
      this.s.N(var1);
      this.field_22787.N(this);
   }

   private class05362 N(class00392 var1, Supplier<class05096> var2) {
      return class05362.method_46430(var1, var2x -> this.field_22787.N((class05096)var2.get())).N();
   }

   @Override
   public void method_25426() {
      class01885 class01885x = this.m.N(class01885.u().N(8));
      class01885x.N(new class02071(y, this.field_22793), class02072::y);
      class01885 class01885x = class01885x.N(class01885.i()).N(8);
      class01885x.N(this.s.Nw().method_57701((class05630)this.field_22787.i_7));
      class01885x.N(this.N());
      class02060 class02060 = new class02060();
      class02060.L().R(4).i(4).y();
      class02080 class02080 = class02060.u(2);
      class02080.N(this.N(L, () -> new class04695(this, this.s)));
      class02080.N(this.N(u, () -> new class04698(this, this.s)));
      class02080.N(
         this.N(
            i,
            () -> {
               CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
               this.N(callbackinforeturnable);
               return (class05096)(callbackinforeturnable.isCancelled()
                  ? (class05096)callbackinforeturnable.getReturnValue()
                  : new class04631(this, this.field_22787, this.s));
            }
         )
      );
      class02080.N(this.N(N, () -> new class01395(this, this.s)));
      class02080.N(this.N(R, () -> new class06279(this, this.s, this.field_22787.X())));
      class02080.N(this.N(M, () -> new class01310(this, this.s)));
      class02080.N(this.N(B, () -> new class01270(this.field_22787.t(), this::N, this.field_22787.M(), class00392.L("resourcePack.title"))));
      class02080.N(this.N(Z, () -> new class05336(this, this.s)));
      class05362 class05362 = class02080.N(this.N(z, () -> new class04210(this, this.s)));
      if (!this.field_22787.NC()) {
         class05362.field_22763 = false;
         class05362.method_47400(U);
      }

      class02080.N(this.N(E, () -> new class03577(this)));
      this.m.L(class02060);
      this.m.y(class05362.method_46430(class05220.u, var1x -> this.method_25419()).N(200).N());
      this.m.method_48206(var1x -> {
         class06478 class06478 = this.method_37063(var1x);
      });
      this.method_48640();
   }

   @Override
   public void method_48640() {
      this.m.N();
   }

   @Override
   public void method_25432() {
      this.s.Np();
   }

   @Override
   public void method_25419() {
      this.field_22787.N(this.P);
   }
}
