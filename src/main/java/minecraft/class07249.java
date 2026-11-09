package minecraft;

import java.util.Optional;
import net.fabricmc.fabric.impl.transfer.item.SpecialLogicInventory;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class07249 extends class00394 implements class01986, SpecialLogicInventory {
   public static final String N = "RecordItem";
   public static final String y = "ticks_since_song_started";
   private class06584 u;
   private final class02220 i;
   private boolean R = false;

   public void L(class06584 var1) {
      this.u = var1;
      class02206.N(this.z.method_30349(), var1).ifPresent(var1x -> this.i.N((class03556<class02206>)var1x, 0L));
      this.z.method_8408(this.d(), this.w().i());
      this.method_5431();
   }

   public class02220 L() {
      return this.i;
   }

   public void M() {
      if (this.z != null && !this.z.method_8608()) {
         class07209 class07209 = this.d();
         class06584 class06584x = this.N();
         if (!class06584x.R()) {
            this.U();
            class06889 class06889 = class06889.N(class07209, 0.5, 1.01, 0.5).y(this.z.field_9229, 0.7F);
            class06584 class06584x = class06584x.t();
            class00717 class00717 = new class00717(this.z, class06889.N(), class06889.y(), class06889.L(), class06584x);
            class00717.L();
            this.z.method_8649(class00717);
            this.u();
         }
      }
   }

   public class07249(class07209 var1, class00500 var2) {
      super(class00404.field_11907, var1, var2);
      this.u = class06584.E;
      this.i = new class02220(this::u, this.d());
   }

   public int B() {
      return class02206.N(this.z.method_30349(), this.u).map(class03556::N).map(class02206::i).orElse(0);
   }

   @Override
   public class00394 Z() {
      return this;
   }

   public void z() {
      class02206.N(this.z.method_30349(), this.N()).ifPresent(var1 -> this.i.N(this.z, (class03556<class02206>)var1));
   }

   public void u() {
      this.z.method_8408(this.d(), this.w().i());
      this.method_5431();
   }

   @Override
   public boolean N(class06695 var1, int var2, class06584 var3) {
      return var1.N_60(class06584::R);
   }

   @Override
   public void N(class07209 var1, class00500 var2) {
      this.M();
   }

   @Override
   public class06584 N() {
      return this.u;
   }

   @Override
   protected void N(class08329 var1) {
      super.N(var1);
      if (!this.N().R()) {
         var1.N("RecordItem", class06584.y, this.N());
      }

      if (this.i.y() != null) {
         var1.N("ticks_since_song_started", this.i.L());
      }
   }

   @Override
   protected void N(class08299 var1) {
      super.N(var1);
      class06584 class06584 = var1.<class06584>N("RecordItem", class06584.y).orElse(class06584.E);
      if (!this.u.R() && !class06584.L(class06584, this.u)) {
         this.i.N(this.z, this.w());
      }

      this.u = class06584;
      var1.R("ticks_since_song_started")
         .ifPresent(var2x -> class02206.N(var1.N(), this.u).ifPresent(var2xx -> this.i.N((class03556<class02206>)var2xx, var2x)));
   }

   public static void N(class07299 var0, class07209 var1, class00500 var2, class07249 var3) {
      var3.i.y(var0, var2);
   }

   private void N(boolean var1) {
      if (this.z != null && this.z.method_8320(this.d()) == this.w()) {
         this.z.method_8652(this.d(), this.w().y(class07122.y, var1), 2);
         this.z.N(class01194.L, this.d(), class01164.N(this.w()));
      }
   }

   private void N(class06584 var1, CallbackInfo var2) {
      if (this.R) {
         this.u = var1;
         var2.cancel();
      }
   }

   @Override
   public void N(class06584 var1) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         this.u = var1;
         boolean flag = !this.u.R();
         Optional<class03556<class02206>> optional = class02206.N(this.z.method_30349(), this.u);
         this.N(flag);
         if (flag && optional.isPresent()) {
            this.i.N(this.z, optional.get());
         } else {
            this.i.N(this.z, this.w());
         }
      }
   }

   @Override
   public class06584 N(int var1) {
      class06584 class06584 = this.u;
      this.N(class06584.E);
      return class06584;
   }

   @Override
   public boolean method_5437(int var1, class06584 var2) {
      return var2.L(class02484.NE) && this.method_5438(var1).R();
   }

   @Override
   public int method_5444() {
      return 1;
   }

   @Override
   public void r_() {
      super.r_();
      this.z.N(class01194.I, this.d(), class01164.N(this.w()));
      this.z.N(1011, this.d(), 0);
   }

   public void fabric_onFinalCommit(int var1, class06584 var2, class06584 var3) {
      this.N(var3);
   }

   public void fabric_setSuppress(boolean var1) {
      this.R = var1;
   }
}
