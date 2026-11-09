package minecraft;

import com.mojang.logging.LogUtils;
import java.util.Objects;
import net.fabricmc.fabric.api.event.player.AttackBlockCallback;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents.After;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents.Before;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents.Canceled;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class04787 {
   private static final double N = 1.0;
   private static final Logger y = LogUtils.getLogger();
   protected class04782 L;
   protected final class04770 u;
   private class07282 i = class07282.field_28045;
   @Nullable
   private class07282 R;
   private boolean M;
   private int B;
   private class07209 Z = class07209.field_10980;
   private int z;
   private boolean U;
   private class07209 E = class07209.field_10980;
   private int W;
   private int m = -1;

   @Nullable
   public class07282 L() {
      return this.R;
   }

   public class04787(class04770 var1) {
      super();
      this.u = var1;
      this.L = var1.method_51469();
   }

   public boolean i() {
      return this.i.R();
   }

   public boolean u() {
      return this.i.M();
   }

   private void y(class07209 var1, CallbackInfoReturnable var2, class00394 var3, class00500 var4) {
      ((After)PlayerBlockBreakEvents.AFTER.invoker()).afterBlockBreak(this.L, this.u, var1, var4, var3);
   }

   public class07282 y() {
      return this.i;
   }

   public boolean N(class07282 var1) {
      if (var1 == this.i) {
         return false;
      } else {
         class08033 class08033 = this.u.method_31549();
         this.N(var1, this.i);
         if (class08033.y && var1 != class07282.field_9219 && this.R()) {
            class08033.y = false;
         }

         this.u.method_7355();
         this.L.method_8503().Nm().N(new class06661(class06680.field_29137, this.u));
         this.L.method_8448();
         if (var1 == class07282.field_9220) {
            this.u.method_58396();
         }

         return true;
      }
   }

   public void N(class07209 var1, class07356 var2, class07211 var3, int var4, int var5, CallbackInfo var6) {
      if (var2 == class07356.field_12968) {
         if (((AttackBlockCallback)AttackBlockCallback.EVENT.invoker()).interact(this.u, this.L, class07050.field_5808, var1, var3) != class07082.i) {
            this.u.field_13987.method_14364(new class07259(this.L, var1));
            if (this.L.method_8320(var1).k()) {
               class00394 class00394 = this.L.method_8321(var1);
               if (class00394 != null) {
                  class00381<class07280> class00381 = class00394.i();
                  if (class00381 != null) {
                     this.u.field_13987.method_14364(class00381);
                  }
               }
            }

            var6.cancel();
         }
      }
   }

   public void N(class04782 var1) {
      this.L = var1;
   }

   public class07082 N(class04770 var1, class07299 var2, class06584 var3, class07050 var4, class06183 var5) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, var4, var5, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class07082)callbackinforeturnable.getReturnValue();
      } else {
         class07209 class07209 = var5.u();
         class00500 class00500 = var2.method_8320(class07209);
         if (!class00500.i().N(var2.method_45162())) {
            return class07082.u;
         } else if (this.i == class07282.field_9219) {
            class06237 class06237 = class00500.N(var2, class07209);
            if (class06237 != null) {
               var1.method_17355(class06237);
               return class07082.L;
            } else {
               return class07082.i;
            }
         } else {
            boolean flag = !var1.method_6047().R() || !var1.method_6079().R();
            boolean flag1 = var1.method_21823() && flag;
            class06584 class06584 = var3.t();
            if (!flag1) {
               class07082 class07082xx = class00500.N(var1.method_5998(var4), var2, var1, var4, var5);
               if (class07082xx.N()) {
                  class06912.X.N(var1, class07209, class06584);
                  return class07082xx;
               }

               if (class07082xx instanceof class07087 && var4 == class07050.field_5808) {
                  class07082 class07082x = class00500.N(var2, var1, var5);
                  if (class07082x.N()) {
                     class06912.a.N(var1, class07209);
                     return class07082x;
                  }
               }
            }

            if (!var3.R() && !var1.method_7357().N(var3)) {
               class06501 class06501 = new class06501(var1, var4, var5);
               class07082 class07082x;
               if (var1.method_56992()) {
                  int ix = var3.c();
                  class07082x = var3.N(class06501);
                  var3.i(ix);
               } else {
                  class07082x = var3.N(class06501);
               }

               if (class07082x.N()) {
                  class06912.X.N(var1, class07209, class06584);
               }

               return class07082x;
            } else {
               return class07082.i;
            }
         }
      }
   }

   public void N(class07209 var1, int var2, String var3) {
      if (this.N(var1)) {
         this.N(var1, true, var2, var3);
      } else {
         this.u.field_13987.method_14364(new class07259(var1, this.L.method_8320(var1)));
         this.N(var1, false, var2, var3);
      }
   }

   private void N(class07209 var1, CallbackInfoReturnable var2, class00394 var3, class00500 var4) {
      if (!((Before)PlayerBlockBreakEvents.BEFORE.invoker()).beforeBlockBreak(this.L, this.u, var1, var4, var3)) {
         ((Canceled)PlayerBlockBreakEvents.CANCELED.invoker()).onBlockBreakCanceled(this.L, this.u, var1, var4, var3);
         var2.setReturnValue(false);
      }
   }

   public void N(class04770 var1, class07299 var2, class06584 var3, class07050 var4, CallbackInfoReturnable var5) {
      class07082 class07082 = ((UseItemCallback)UseItemCallback.EVENT.invoker()).interact(var1, var2, var4);
      if (class07082 != class07082.i) {
         var5.setReturnValue(class07082);
         var5.cancel();
      }
   }

   public void N(class04770 var1, class07299 var2, class06584 var3, class07050 var4, class06183 var5, CallbackInfoReturnable var6) {
      class07082 class07082 = ((UseBlockCallback)UseBlockCallback.EVENT.invoker()).interact(var1, var2, var4, var5);
      if (class07082 != class07082.i) {
         var6.setReturnValue(class07082);
         var6.cancel();
      }
   }

   public void N(class07209 var1, class07356 var2, class07211 var3, int var4, int var5) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, var2, var3, var4, var5, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         if (!this.u.method_56093(var1, 1.0)) {
            this.N(var1, false, var5, "too far");
         } else if (var1.method_10264() > var4) {
            this.u.field_13987.method_14364(new class07259(var1, this.L.method_8320(var1)));
            this.N(var1, false, var5, "too high");
         } else {
            if (var2 == class07356.field_12968) {
               if (!this.L.method_8505(this.u, var1)) {
                  this.u.field_13987.method_14364(new class07259(var1, this.L.method_8320(var1)));
                  this.N(var1, false, var5, "may not interact");
                  return;
               }

               if (this.u.method_31549().u) {
                  this.N(var1, var5, "creative destroy");
                  return;
               }

               if (this.u.method_21701(this.L, var1, this.i)) {
                  this.u.field_13987.method_14364(new class07259(var1, this.L.method_8320(var1)));
                  this.N(var1, false, var5, "block action restricted");
                  return;
               }

               this.B = this.z;
               float f = 1.0F;
               class00500 class00500x = this.L.method_8320(var1);
               if (!class00500x.P()) {
                  class07323.N(
                     this.L,
                     this.u.method_6047(),
                     this.u,
                     this.u,
                     class07085.field_6173,
                     class06889.y(var1),
                     class00500x,
                     var1x -> this.u.method_20235(var1x, class07085.field_6173)
                  );
                  class00500x.N(this.L, var1, this.u);
                  f = class00500x.N(this.u, this.u.method_51469(), var1);
               }

               if (!class00500x.P() && f >= 1.0F) {
                  this.N(var1, var5, "insta mine");
               } else {
                  if (this.M) {
                     this.u.field_13987.method_14364(new class07259(this.Z, this.L.method_8320(this.Z)));
                     this.N(var1, false, var5, "abort destroying since another started (client insta mine, server disagreed)");
                  }

                  this.M = true;
                  this.Z = var1.method_10062();
                  int ix = (int)(f * 10.0F);
                  this.L.method_8517(this.u.method_5628(), var1, ix);
                  this.N(var1, true, var5, "actual start of destroying");
                  this.m = ix;
               }
            } else if (var2 == class07356.field_12973) {
               if (var1.equals(this.Z)) {
                  int j = this.z - this.B;
                  class00500 class00500x = this.L.method_8320(var1);
                  if (!class00500x.P()) {
                     float f1 = class00500x.N(this.u, this.u.method_51469(), var1) * (j + 1);
                     if (f1 >= 0.7F) {
                        this.M = false;
                        this.L.method_8517(this.u.method_5628(), var1, -1);
                        this.N(var1, var5, "destroyed");
                        return;
                     }

                     if (!this.U) {
                        this.M = false;
                        this.U = true;
                        this.E = var1;
                        this.W = this.B;
                     }
                  }
               }

               this.N(var1, true, var5, "stopped destroying");
            } else if (var2 == class07356.field_12971) {
               this.M = false;
               if (!Objects.equals(this.Z, var1)) {
                  y.warn("Mismatch in destroy block pos: {} {}", this.Z, var1);
                  this.L.method_8517(this.u.method_5628(), this.Z, -1);
                  this.N(var1, true, var5, "aborted mismatched destroying");
               }

               this.L.method_8517(this.u.method_5628(), var1, -1);
               this.N(var1, true, var5, "aborted destroying");
            }
         }
      }
   }

   private void N(class07209 var1, boolean var2, int var3, String var4) {
      if (class07529.C) {
         y.debug("Server ACK {} {} {} {}", new Object[]{var3, var1, var2, var4});
      }
   }

   private float N(class00500 var1, class07209 var2, int var3) {
      int ix = this.z - var3;
      float f = var1.N(this.u, this.u.method_51469(), var2) * (ix + 1);
      int j = (int)(f * 10.0F);
      if (j != this.m) {
         this.L.method_8517(this.u.method_5628(), var2, j);
         this.m = j;
      }

      return f;
   }

   public void N() {
      this.z++;
      if (this.U) {
         class00500 class00500x = this.L.method_8320(this.E);
         if (class00500x.P()) {
            this.U = false;
         } else if (this.N(class00500x, this.E, this.W) >= 1.0F) {
            this.U = false;
            this.N(this.E);
         }
      } else if (this.M) {
         class00500 class00500 = this.L.method_8320(this.Z);
         if (class00500.P()) {
            this.L.method_8517(this.u.method_5628(), this.Z, -1);
            this.m = -1;
            this.M = false;
         } else {
            this.N(class00500, this.Z, this.B);
         }
      }
   }

   public class07082 N(class04770 var1, class07299 var2, class06584 var3, class07050 var4) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, var4, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class07082)callbackinforeturnable.getReturnValue();
      } else if (this.i == class07282.field_9219) {
         return class07082.i;
      } else if (var1.method_7357().N(var3)) {
         return class07082.i;
      } else {
         int ix = var3.c();
         int j = var3.P();
         class07082 class07082 = var3.N(var2, var1, var4);
         class06584 class06584;
         if (class07082 instanceof class07041) {
            class06584 = Objects.requireNonNullElse(((class07041)class07082).u(), var1.method_5998(var4));
         } else {
            class06584 = var1.method_5998(var4);
         }

         if (class06584 == var3 && class06584.c() == ix && class06584.N((class07438)var1) <= 0 && class06584.P() == j) {
            return class07082;
         } else if (class07082 instanceof class07071 && class06584.N((class07438)var1) > 0 && !var1.method_6115()) {
            return class07082;
         } else {
            if (var3 != class06584) {
               var1.method_6122(var4, class06584);
            }

            if (class06584.R()) {
               var1.method_6122(var4, class06584.E);
            }

            if (!var1.method_6115()) {
               var1.fields_07fa3311b0e9d3e9b883d09222919bf5a_2.y();
            }

            return class07082;
         }
      }
   }

   public boolean N(class07209 var1) {
      class00500 class00500 = this.L.method_8320(var1);
      if (!this.u.method_6047().N(class00500, this.L, var1, this.u)) {
         return false;
      } else {
         class00394 class00394 = this.L.method_8321(var1);
         class00891 class00891 = class00500.i();
         if (class00891 instanceof class01137 && !this.u.method_7338()) {
            this.L.method_8413(var1, class00500, class00500, 3);
            return false;
         } else if (this.u.method_21701(this.L, var1, this.i)) {
            return false;
         } else {
            class04782 class04782 = this.L;
            class04770 class04770 = this.u;
            CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
            this.N(var1, callbackinforeturnable, class00394, class00500);
            if (callbackinforeturnable.isCancelled()) {
               return callbackinforeturnable.getReturnValueZ();
            } else {
               class00500 class00500x = class00891.N(class04782, var1, class00500, (class08036)class04770);
               boolean flag1 = this.L.method_8650(var1, false);
               if (class07529.C) {
                  y.info("server broke {} {} -> {}", new Object[]{var1, class00500x, this.L.method_8320(var1)});
               }

               if (flag1) {
                  class04782 = this.L;
                  this.y(var1, null, class00394, class00500x);
                  class00891.N_7(class04782, var1, class00500x);
               }

               if (this.u.method_66324()) {
                  return true;
               } else {
                  class06584 class06584x = this.u.method_6047();
                  class06584 class06584x = class06584x.t();
                  boolean flag = this.u.method_7305(class00500x);
                  class06584x.N(this.L, class00500x, var1, this.u);
                  if (flag1 && flag) {
                     class00891.N(this.L, this.u, var1, class00500x, class00394, class06584x);
                  }

                  return true;
               }
            }
         }
      }
   }

   protected void N(class07282 var1, @Nullable class07282 var2) {
      this.R = var2;
      this.i = var1;
      class08033 class08033 = this.u.method_31549();
      var1.N(class08033);
   }

   private boolean R() {
      return class07049.method_74656(this.u, this.L, this.u.method_5829()).isEmpty() && this.u.method_74657(1.0) < 1.0;
   }
}
