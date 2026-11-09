package minecraft;

import Nursultan.class12010;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.settings.impl.DebugSettings;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.Map;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06918 extends class06581 implements class12010 {
   @Deprecated
   private final class00891 N;

   public class00891 L() {
      return this.N;
   }

   @Nullable
   public class06942 L(class06942 var1) {
      return var1;
   }

   public class06918(class00891 var1, class06573 var2) {
      super(var2);
      this.N = var1;
   }

   @Nullable
   public class00500 u(class06942 var1) {
      class00500 class00500 = this.L().N(var1);
      return class00500 != null && this.N(var1, class00500) ? class00500 : null;
   }

   @Override
   public boolean u() {
      return !(this.L() instanceof class07027);
   }

   protected boolean y() {
      return true;
   }

   protected boolean y(class06942 var1, class00500 var2) {
      return var1.method_8045().method_8652(var1.method_8037(), var2, 11);
   }

   public class07082 y(class06942 var1) {
      if (!this.L().N(var1.method_8045().method_45162())) {
         return class07082.u;
      } else if (!var1.N()) {
         return class07082.u;
      } else {
         class06942 class06942 = this.L(var1);
         if (class06942 == null) {
            return class07082.u;
         } else {
            class00500 class00500x = this.u(class06942);
            if (class00500x == null) {
               return class07082.u;
            } else if (!this.y(class06942, class00500x)) {
               return class07082.u;
            } else {
               class07209 class07209 = class06942.method_8037();
               class07299 class07299 = class06942.method_8045();
               class08036 class08036 = class06942.method_8036();
               class06584 class06584 = class06942.method_8041();
               class00500 class00500x = class07299.method_8320(class07209);
               if (class00500x.N(class00500x.i())) {
                  class00500x = this.N(class07209, class07299, class06584, class00500x);
                  this.N(class07209, class07299, class08036, class06584, class00500x);
                  N(class07299, class07209, class06584);
                  class00500x.i().N(class07299, class07209, class00500x, class08036, class06584);
                  if (class08036 instanceof class04770) {
                     class06912.w.N((class04770)class08036, class07209, class06584);
                  }
               }

               class07752 class07752 = class00500x.O();
               class04891 class04891 = this.N(class00500x);
               class04911 class04911 = class04911.field_15245;
               float f2 = (class07752.N() + 1.0F) / 2.0F;
               float f1 = class07752.y() * 0.8F;
               float f = f2;
               class04911 class04911x = class04911;
               class04891 class04891x = class04891;
               if (this.N(class07299, class08036, class07209, class04891x, class04911x, f, f1)) {
                  class07299.method_8396(class08036, class07209, class04891x, class04911x, f, f1);
               }

               class07299.N(class01194.Z, class07209, class01164.N(class08036, class00500x));
               class06584.N(1, class08036);
               return class07082.N;
            }
         }
      }
   }

   @Override
   public void N(class00717 var1) {
      class02854 class02854 = var1.N().N(class02484.NG, class02854.N);
      if (class02854 != null) {
         class05970.N(var1, class02854.i());
      }
   }

   @Override
   public class07082 N(class06501 var1) {
      class07082 class07082 = this.y(new class06942(var1));
      return !class07082.N() && var1.method_8041().L(class02484.w) ? super.N(var1.method_8045(), var1.method_8036(), var1.method_20287()) : class07082;
   }

   public void N(Map<class00891, class06581> var1, class06581 var2) {
      var1.put(this.L(), var2);
   }

   public static void N(class06584 var0, class00404<?> var1, class08303 var2) {
      var2.L("id");
      if (var2.N()) {
         var0.y(class02484.NB);
      } else {
         class00394.N(var2, var1);
         var0.N(class02484.NB, class08983.N(var1, var2.y()));
      }
   }

   private void N(class06942 var1, class00500 var2, CallbackInfoReturnable var3) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
         class00891 class00891 = var2.i();
         if (class00891 == class00869.LA || class00891 == class00869.BH) {
            class07299 class07299 = var1.method_8045();
            class07209 class07209 = var1.method_8037();
            boolean flag = false;

            for (class07211 class07211 : class07221.field_11062) {
               class00500 class00500 = class07299.method_8320(class07209.method_10093(class07211));
               if (class00500.i() == class00891) {
                  if (flag) {
                     var3.setReturnValue(false);
                     return;
                  }

                  flag = true;
                  if (class00500.L(class00860.i) != class06638.field_12569) {
                     var3.setReturnValue(false);
                     return;
                  }
               }
            }
         }
      }
   }

   private boolean N(class07299 var1, class07049 var2, class07209 var3, class04891 var4, class04911 var5, float var6, float var7) {
      return !DebugSettings.INSTANCE.serversidePlaceSounds.isEnabled();
   }

   private static void N(class07299 var0, class07209 var1, class06584 var2) {
      class00394 class00394 = var0.method_8321(var1);
      if (class00394 != null) {
         class00394.y(var2);
         class00394.method_5431();
      }
   }

   protected boolean N(class07209 var1, class07299 var2, @Nullable class08036 var3, class06584 var4, class00500 var5) {
      return N(var2, var3, var1, var4);
   }

   protected boolean N(class06942 var1, class00500 var2) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return callbackinforeturnable.getReturnValueZ();
      } else {
         class08036 class08036 = var1.method_8036();
         return (!this.y() || var2.N((class05487)var1.method_8045(), var1.method_8037()))
            && var1.method_8045().method_8628(var2, var1.method_8037(), class06092.N(class08036));
      }
   }

   private class00500 N(class07209 var1, class07299 var2, class06584 var3, class00500 var4) {
      class02841 class02841 = var3.a_(class02484.Nl, class02841.N);
      if (class02841.N()) {
         return var4;
      } else {
         class00500 class00500 = class02841.N(var4);
         if (class00500 != var4) {
            var2.method_8652(var1, class00500, 2);
         }

         return class00500;
      }
   }

   @Override
   public boolean N(class06584 var1, @Nullable class08036 var2) {
      if (var2 != null && var2.method_75004().hasPermission(class08162.y)) {
         class08983 class08983 = var1.method_58694(class02484.NB);
         if (class08983 != null) {
            return ((class00404)class08983.N()).method_65166();
         }
      }

      return false;
   }

   public static boolean N(class07299 var0, @Nullable class08036 var1, class07209 var2, class06584 var3) {
      if (var0.method_8608()) {
         return false;
      } else {
         class08983 class08983 = var3.method_58694(class02484.NB);
         if (class08983 != null) {
            class00394 class00394 = var0.method_8321(var2);
            if (class00394 != null) {
               class00404<?> class00404 = class00394.O();
               if (class00404 != class08983.N()) {
                  return false;
               }

               if (!class00404.method_65166() || var1 != null && var1.method_7338()) {
                  return class08983.N(class00394, var0.method_30349());
               }

               return false;
            }
         }

         return false;
      }
   }

   protected class04891 N(class00500 var1) {
      return var1.O().i();
   }

   @Override
   public class03767 method_45322() {
      return this.L().method_45322();
   }
}
