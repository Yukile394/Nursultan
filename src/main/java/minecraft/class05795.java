package minecraft;

import me.flashyreese.mods.sodiumextra.client.SodiumExtraClientMod;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class05795 implements class05029 {
   public static final int y = 1;
   public static final class05795 L = new class05795();
   protected final class05474 u;
   @Nullable
   private final class05015<?, ?> N;
   @Nullable
   private final class05015<?, ?> i;

   public int L() {
      return this.u.method_32890() + 2;
   }

   public class05795(class00538 var1, boolean var2, boolean var3) {
      super();
      this.u = var1.i();
      this.N = var2 ? new class05028(var1) : null;
      this.i = var3 ? new class05785(var1) : null;
   }

   private class05795() {
      super();
      this.u = class05474.L(0, 0);
      this.N = null;
      this.i = null;
   }

   public int i() {
      return this.u() + this.L();
   }

   public int u() {
      return this.u.method_32891() - 1;
   }

   public void y(class07321 var1, boolean var2) {
      if (this.N != null) {
         this.N.y(var1, var2);
      }

      if (this.i != null) {
         this.i.y(var1, var2);
      }
   }

   public class04993 y(class00772 var1, class01296 var2) {
      if (var1 == class00772.field_9282) {
         if (this.N != null) {
            return this.N.L(var2.W());
         }
      } else if (this.i != null) {
         return this.i.L(var2.W());
      }

      return class04993.field_44724;
   }

   @Override
   public void y(class07321 var1) {
      if (this.N != null) {
         this.N.y(var1);
      }

      if (this.i != null) {
         this.i.y(var1);
      }
   }

   @Override
   public int N() {
      int ix = 0;
      if (this.N != null) {
         ix += this.N.N();
      }

      if (this.i != null) {
         ix += this.i.N();
      }

      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, ix);
      this.N(callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? callbackinforeturnable.getReturnValueI() : ix;
   }

   public boolean N(long var1) {
      return this.N == null || this.N.R.U(var1) && (this.i == null || this.i.R.U(var1));
   }

   @Override
   public void N(class01296 var1, boolean var2) {
      if (this.N != null) {
         this.N.N(var1, var2);
      }

      if (this.i != null) {
         this.i.N(var1, var2);
      }
   }

   @Override
   public void N(class07209 var1) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         if (this.N != null) {
            this.N.N(var1);
         }

         if (this.i != null) {
            this.i.N(var1);
         }
      }
   }

   public void N(class07209 var1, CallbackInfo var2) {
      if (!SodiumExtraClientMod.options().renderSettings.lightUpdates) {
         var2.cancel();
      }
   }

   public void N(CallbackInfoReturnable var1) {
      if (!SodiumExtraClientMod.options().renderSettings.lightUpdates) {
         var1.setReturnValue(0);
      }
   }

   public class05035 N(class00772 var1) {
      if (var1 == class00772.field_9282) {
         return (class05035)(this.N == null ? class04994.field_15812 : this.N);
      } else {
         return (class05035)(this.i == null ? class04994.field_15812 : this.i);
      }
   }

   public String N(class00772 var1, class01296 var2) {
      if (var1 == class00772.field_9282) {
         if (this.N != null) {
            return this.N.y(var2.W());
         }
      } else if (this.i != null) {
         return this.i.y(var2.W());
      }

      return "n/a";
   }

   public void N(class00772 var1, class01296 var2, @Nullable class00536 var3) {
      if (var1 == class00772.field_9282) {
         if (this.N != null) {
            this.N.N(var2.W(), var3);
         }
      } else if (this.i != null) {
         this.i.N(var2.W(), var3);
      }
   }

   @Override
   public void N(class07321 var1, boolean var2) {
      if (this.N != null) {
         this.N.N(var1, var2);
      }

      if (this.i != null) {
         this.i.N(var1, var2);
      }
   }

   public int N(class07209 var1, int var2) {
      int ix = this.i == null ? 0 : this.i.L(var1) - var2;
      return Math.max(this.N == null ? 0 : this.N.L(var1), ix);
   }

   @Override
   public boolean au_() {
      return this.i != null && this.i.au_() ? true : this.N != null && this.N.au_();
   }
}
