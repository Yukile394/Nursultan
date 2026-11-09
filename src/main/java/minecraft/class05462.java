package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import org.apache.commons.lang3.math.Fraction;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class05462 extends class06581 {
   public static final int N = 4;
   public static final int y = 3;
   public static final int L = 12;
   public static final int m = 11;
   private static final int P = class02566.N(1.0F, 1.0F, 0.33F, 0.33F);
   private static final int s = class02566.N(1.0F, 0.44F, 0.53F, 1.0F);
   private static final int T = 10;
   private static final int b = 2;
   private static final int j = 200;

   private static void L(class07049 var0) {
      var0.method_5783(class04909.uO, 1.0F, 1.0F);
   }

   public class05462(class06573 var1) {
      super(var1);
   }

   @Override
   public boolean B(class06584 var1) {
      return var1.a_(class02484.D, class02830.N).R().compareTo(Fraction.ZERO) > 0;
   }

   @Override
   public int Z(class06584 var1) {
      class02830 class02830 = var1.a_(class02484.D, class02830.N);
      return Math.min(1 + class04995.N(class02830.R(), 12), 13);
   }

   public static boolean i(class06584 var0) {
      class02830 class02830 = var0.method_58694(class02484.D);
      return class02830 != null && class02830.B() != -1;
   }

   @Override
   public Optional<class04830> U(class06584 var1) {
      return !var1.a_(class02484.v, class08562.L).N(class02484.D)
         ? Optional.empty()
         : Optional.ofNullable(var1.method_58694(class02484.D)).map(class04828::new);
   }

   @Override
   public int z(class06584 var1) {
      return var1.a_(class02484.D, class02830.N).R().compareTo(Fraction.ONE) >= 0 ? P : s;
   }

   public static float u(class06584 var0) {
      return var0.a_(class02484.D, class02830.N).R().floatValue();
   }

   private static void y(class07049 var0) {
      var0.method_5783(class04909.uQ, 0.8F, 0.8F + var0.method_73183().method_8409().z() * 0.4F);
   }

   @Override
   public class06509 y(class06584 var1) {
      return class06509.field_55494;
   }

   private boolean y(class06584 var1, class08036 var2) {
      class02830 class02830 = var1.method_58694(class02484.D);
      if (class02830 != null && !class02830.M()) {
         Optional<class06584> optional = N(var1, var2, class02830);
         if (optional.isPresent()) {
            var2.method_7328(optional.get(), true);
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public static class06584 E(class06584 var0) {
      class02830 class02830 = var0.method_58694(class02484.D);
      return class02830 != null && class02830.B() != -1 ? class02830.N(class02830.B()) : class06584.E;
   }

   @Override
   public void N(class00717 var1) {
      class02830 class02830 = var1.N().method_58694(class02484.D);
      if (class02830 != null) {
         var1.N().N(class02484.D, class02830.N);
         class05970.N(var1, class02830.u());
      }
   }

   public static List<class05462> N() {
      return Stream.of(
            class06570.jq,
            class06570.jK,
            class06570.jV,
            class06570.je,
            class06570.jH,
            class06570.jc,
            class06570.jX,
            class06570.ja,
            class06570.jp,
            class06570.jF,
            class06570.jA,
            class06570.jh,
            class06570.jS,
            class06570.jx,
            class06570.jD,
            class06570.jC,
            class06570.jf
         )
         .map(var0 -> (class05462)var0)
         .toList();
   }

   public static class06581 N(class06563 var0) {
      return switch (var0) {
         case field_7952 -> class06570.jK;
         case field_7946 -> class06570.jV;
         case field_7958 -> class06570.je;
         case field_7951 -> class06570.jH;
         case field_7947 -> class06570.jc;
         case field_7961 -> class06570.jX;
         case field_7954 -> class06570.ja;
         case field_7944 -> class06570.jp;
         case field_7967 -> class06570.jF;
         case field_7955 -> class06570.jA;
         case field_7966 -> class06570.jC;
         case field_7957 -> class06570.jS;
         case field_7942 -> class06570.jx;
         case field_7964 -> class06570.jD;
         case field_7963 -> class06570.jh;
         case field_7945 -> class06570.jf;
      };
   }

   private static void N(class07299 var0, class07049 var1) {
      var0.method_8396(null, var1.method_24515(), class04909.uY, class04911.field_15248, 0.8F, 0.8F + var1.method_73183().method_8409().z() * 0.4F);
   }

   private void N(class07299 var1, class08036 var2, class07050 var3, CallbackInfoReturnable var4) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21)) {
         class02830 class02830 = var2.method_5998(var3).method_58694(class02484.D);
         if (class02830 == null || class02830.M()) {
            var4.setReturnValue(class07082.u);
         }
      } else if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_2)) {
         var4.setReturnValue(class07082.L);
      }
   }

   private void N(class08036 var1) {
      class07482 class07482 = (class07482)var1.fields_07fa3311b0e9d3e9b883d09222919bf5a_3;
      if (class07482 != null) {
         class07482.y(var1.method_31548());
      }
   }

   private static void N(class07049 var0) {
      var0.method_5783(class04909.ug, 0.8F, 0.8F + var0.method_73183().method_8409().z() * 0.4F);
   }

   public static void N(class06584 var0, int var1) {
      class02830 class02830 = var0.method_58694(class02484.D);
      if (class02830 != null) {
         class02822 class02822 = new class02822(class02830);
         class02822.N(var1);
         var0.N(class02484.D, class02822.u());
      }
   }

   private void N(class07299 var1, class08036 var2, class06584 var3) {
      if (this.y(var3, var2)) {
         N(var1, var2);
         var2.method_7259(class01235.L.y(this));
      }
   }

   @Override
   public class07082 N(class07299 var1, class08036 var2, class07050 var3) {
      var2.method_6019(var3);
      class07041 class07041x;
      class07041 class07041x = class07041x = class07082.N;
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, class07041x);
      this.N(var1, var2, var3, callbackinforeturnable);
      return (class07082)(callbackinforeturnable.isCancelled() ? (class07082)callbackinforeturnable.getReturnValue() : class07041x);
   }

   @Override
   public boolean N(class06584 var1, class06584 var2, class06937 var3, class05442 var4, class08036 var5, class04803 var6) {
      if (var4 == class05442.field_27013 && var2.R()) {
         N(var1, -1);
         return false;
      } else {
         class02830 class02830 = var1.method_58694(class02484.D);
         if (class02830 == null) {
            return false;
         } else {
            class02822 class02822 = new class02822(class02830);
            if (var4 == class05442.field_27013 && !var2.R()) {
               if (var3.y(var5) && class02822.N(var2) > 0) {
                  y(var5);
               } else {
                  L(var5);
               }

               var1.N(class02484.D, class02822.u());
               this.N(var5);
               return true;
            } else if (var4 == class05442.field_27014 && var2.R()) {
               if (var3.y(var5)) {
                  class06584 class06584 = class02822.y();
                  if (class06584 != null) {
                     N((class07049)var5);
                     var6.N(class06584);
                  }
               }

               var1.N(class02484.D, class02822.u());
               this.N(var5);
               return true;
            } else {
               N(var1, -1);
               return false;
            }
         }
      }
   }

   @Override
   public boolean N(class06584 var1, class06937 var2, class05442 var3, class08036 var4) {
      class02830 class02830 = var1.method_58694(class02484.D);
      if (class02830 == null) {
         return false;
      } else {
         class06584 class06584xx = var2.i();
         class02822 class02822 = new class02822(class02830);
         if (var3 == class05442.field_27013 && !class06584xx.R()) {
            if (class02822.N(var2, var4) > 0) {
               y(var4);
            } else {
               L(var4);
            }

            var1.N(class02484.D, class02822.u());
            this.N(var4);
            return true;
         } else if (var3 == class05442.field_27014 && class06584xx.R()) {
            class06584 class06584x = class02822.y();
            if (class06584x != null) {
               class06584 class06584xx = var2.R(class06584x);
               if (class06584xx.c() > 0) {
                  class02822.N(class06584xx);
               } else {
                  N((class07049)var4);
               }
            }

            var1.N(class02484.D, class02822.u());
            this.N(var4);
            return true;
         } else {
            return false;
         }
      }
   }

   @Override
   public void N(class07299 var1, class07438 var2, class06584 var3, int var4) {
      if (var2 instanceof class08036 class08036) {
         int i = this.N(var3, var2);
         if (var4 == i || var4 < i - 10 && var4 % 2 == 0) {
            this.N(var1, class08036, var3);
         }
      }
   }

   @Override
   public int N(class06584 var1, class07438 var2) {
      return 200;
   }

   private static Optional<class06584> N(class06584 var0, class08036 var1, class02830 var2) {
      class02822 class02822 = new class02822(var2);
      class06584 class06584 = class02822.y();
      if (class06584 != null) {
         N((class07049)var1);
         var0.N(class02484.D, class02822.u());
         return Optional.of(class06584);
      } else {
         return Optional.empty();
      }
   }

   public static int W(class06584 var0) {
      return var0.a_(class02484.D, class02830.N).N();
   }

   public static int R(class06584 var0) {
      return var0.a_(class02484.D, class02830.N).B();
   }
}
