package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Optional;
import java.util.UUID;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07641 extends class07652 implements class05310 {
   private static final class02131<Integer> N = class03289.N(class07641.class, class02154.y);
   private static final int y = 1024;
   private static final String L = "stew_effects";
   @Nullable
   private class02692 u;
   @Nullable
   private UUID i;

   @Override
   protected void method_66649(class02666 var1) {
      this.method_66650(var1, class02484.NH);
      super.method_66649(var1);
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(N, class07631.field_57612.field_55964);
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("Type", class07631.field_41549, this.W());
      var1.y("stew_effects", class02692.L, this.u);
   }

   @Nullable
   @Override
   public <T> T method_58694(class02477<? extends T> var1) {
      return var1 == class02484.NH ? method_66651(var1, this.W()) : super.method_58694(var1);
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.N(var1.<class07631>N("Type", class07631.field_41549).orElse(class07631.field_57612));
      this.u = var1.<class02692>N("stew_effects", class02692.L).orElse(null);
   }

   @Override
   public void method_5800(class04782 var1, class00672 var2) {
      UUID uuid = var2.method_5667();
      if (!uuid.equals(this.i)) {
         this.N(this.W() == class07631.field_18109 ? class07631.field_18110 : class07631.field_18109);
         this.i = uuid;
         this.method_5783(class04909.bL, 2.0F, 1.0F);
      }
   }

   public class07641(class07078<? extends class07641> var1, class07299 var2) {
      super(var1, var2);
   }

   private Optional<class02692> i(class06584 var1) {
      class04107 class04107 = class04107.N(var1.B());
      return class04107 != null ? Optional.of(class04107.L()) : Optional.empty();
   }

   @Override
   public boolean d() {
      return this.method_5805() && !this.method_6109();
   }

   private void N(class08036 var1, class07050 var2, CallbackInfoReturnable var3) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_2) && !var1.method_5998(var2).N(class01226.a)) {
         var3.setReturnValue(super.N(var1, var2));
      }
   }

   @Nullable
   public class07641 y(class04782 var1, class07077 var2) {
      class07641 class07641 = class07078.NV.N(var1, class06113.field_16466);
      if (class07641 != null) {
         class07641.N(this.N((class07641)var2));
      }

      return class07641;
   }

   private class07631 N(class07641 var1) {
      class07631 class07631xx = this.W();
      class07631 class07631x = var1.W();
      class07631 class07631xx;
      if (class07631xx == class07631x && this.field_5974.y(1024) == 0) {
         class07631xx = class07631xx == class07631.field_18110 ? class07631.field_18109 : class07631.field_18110;
      } else {
         class07631xx = this.field_5974.Z() ? class07631xx : class07631x;
      }

      return class07631xx;
   }

   public static boolean N(class07078<class07641> var0, class07284 var1, class06113 var2, class07209 var3, class06069 var4) {
      return var1.method_8320(var3.method_10074()).N(class01210.Ls) && N(var1, var3);
   }

   @Override
   public float N(class07209 var1, class05487 var2) {
      return var2.method_8320(var1.method_10074()).N(class00869.RC) ? 10.0F : var2.B(var1);
   }

   @Override
   public void N(class04782 var1, class04911 var2, class06584 var3) {
      var1.method_43129(null, this, class04909.bM, var2, 1.0F, 1.0F);
      this.N(class07078.J, class08234.N(this, false, false), var3x -> {
         var1.method_65096(class07107.l, this.method_23317(), this.method_23323(0.5), this.method_23321(), 1, 0.0, 0.0, 0.0, 0.0);
         this.method_61419(var1, class06273.ND, var3, (var1xx, var2xx) -> {
            for (int ix = 0; ix < var2xx.c(); ix++) {
               var1xx.method_8649(new class00717(this.method_73183(), this.method_23317(), this.method_23323(1.0), this.method_23321(), var2xx.L(1)));
            }
         });
      });
   }

   private void N(class07631 var1) {
      this.field_6011.N(N, var1.field_55964);
   }

   private class07082 N(class07652 var1, class08036 var2, class07050 var3) {
      return (class07082)(ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_2) ? class07082.i : super.N(var2, var3));
   }

   @Override
   public class07082 N(class08036 var1, class07050 var2) {
      class06584 class06584xx = var1.method_5998(var2);
      if (class06584xx.N(class06570.sC) && !this.method_6109()) {
         boolean flag = false;
         class06584 class06584x;
         if (this.u != null) {
            flag = true;
            class06584x = new class06584(class06570.dk);
            class06584x.N(class02484.NN, this.u);
            this.u = null;
         } else {
            class06584x = new class06584(class06570.TD);
         }

         class06584 class06584xx = class05970.N(class06584xx, var1, class06584x, false);
         var1.method_6122(var2, class06584xx);
         class04891 class04891;
         if (flag) {
            class04891 = class04909.bR;
         } else {
            class04891 = class04909.bi;
         }

         this.method_5783(class04891, 1.0F, 1.0F);
         return class07082.N;
      } else if (class06584xx.N(class06570.vr) && this.d()) {
         if (this.method_73183() instanceof class04782 class04782) {
            this.N(class04782, class04911.field_15248, class06584xx);
            this.method_32875(class01194.H, var1);
            class06584xx.N(1, var1, var2.N());
         }

         return class07082.N;
      } else if (this.W() != class07631.field_18110) {
         return super.N(var1, var2);
      } else {
         CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
         this.N(var1, var2, callbackinforeturnable);
         if (callbackinforeturnable.isCancelled()) {
            return (class07082)callbackinforeturnable.getReturnValue();
         } else {
            Optional<class02692> optional = this.i(class06584xx);
            if (optional.isEmpty()) {
               return this.N(this, var1, var2);
            } else {
               if (this.u != null) {
                  for (int ix = 0; ix < 2; ix++) {
                     this.method_73183()
                        .method_8406(
                           class07107.NZ,
                           this.method_23317() + this.field_5974.U() / 2.0,
                           this.method_23323(0.5),
                           this.method_23321() + this.field_5974.U() / 2.0,
                           0.0,
                           this.field_5974.U() / 5.0,
                           0.0
                        );
                  }
               } else {
                  class06584xx.N(1, var1);
                  class00436 class00436 = class00436.N(class07107.T, -1, 1.0F);

                  for (int j = 0; j < 4; j++) {
                     this.method_73183()
                        .method_8406(
                           class00436,
                           this.method_23317() + this.field_5974.U() / 2.0,
                           this.method_23323(0.5),
                           this.method_23321() + this.field_5974.U() / 2.0,
                           0.0,
                           this.field_5974.U() / 5.0,
                           0.0
                        );
                  }

                  this.u = optional.get();
                  this.method_5783(class04909.bu, 2.0F, 1.0F);
               }

               return class07082.N;
            }
         }
      }
   }

   public class07631 W() {
      return class07631.N(this.field_6011.N(N));
   }

   @Override
   protected <T> boolean method_66654(class02477<T> var1, T var2) {
      if (var1 == class02484.NH) {
         this.N(method_66651(class02484.NH, var2));
         return true;
      } else {
         return super.method_66654(var1, var2);
      }
   }
}
