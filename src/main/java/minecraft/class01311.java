package minecraft;

import Nursultan.class09461;
import com.viaversion.viafabricplus.features.limitation.max_chat_length.MaxChatLength;
import com.viaversion.viafabricplus.settings.impl.DebugSettings;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class01311 extends class05096 {
   public static final double N = 7.0;
   private static final class00392 M = class00392.L("chat_screen.usage");
   private String B = "";
   private int Z = -1;
   protected class04927 y;
   protected String L;
   protected boolean u;
   protected class01322 i = class01322.field_62016;
   public class05910 R;

   private boolean L() {
      return !DebugSettings.INSTANCE.legacyTabCompletions.isEnabled() || !this.y.method_1882().startsWith("/");
   }

   public class01311(String var1, boolean var2) {
      super(class00392.L("chat_screen.title"));
      this.L = var1;
      this.u = var2;
   }

   private void y(String var1) {
      boolean flag = true;
      this.R.N(this.N(flag));
      class05910 class05910 = this.R;
      if (this.N(class05910)) {
         class05910.u();
      }

      this.u = false;
   }

   private void y(CallbackInfo var1) {
      if (DebugSettings.INSTANCE.legacyTabCompletions.isEnabled()) {
         this.y.method_1852(this.L);
         this.R.u();
      }
   }

   private boolean y() {
      return this.field_22787.L();
   }

   public void N(String var1, boolean var2) {
      var1 = this.N(var1);
      if (!var1.isEmpty()) {
         if (var2) {
            ((class01056)this.field_22787.i_6).i().N(var1);
         }

         if (var1.startsWith("/")) {
            ((class01683)((class04453)this.field_22787.T_4).y_0).u(var1.substring(1));
         } else {
            ((class01683)((class04453)this.field_22787.T_4).y_0).L(var1);
         }
      }
   }

   private boolean N(class00405 var1, boolean var2) {
      class00647 class00647 = var1.Z();
      if (var2) {
         if (var1.U() != null) {
            this.method_25415(var1.U(), false);
         }
      } else if (class00647 != null) {
         if (class00647 instanceof class00669 && ((class00669)class00647).y().equals(class06451.y)) {
            class03040 class03040 = this.field_22787.N();
            if (class03040.L() != 0L) {
               class03040.y();
            }
         } else {
            method_71999(class00647, this.field_22787, this);
         }

         return true;
      }

      return false;
   }

   public String N(String var1) {
      return class05018.i(StringUtils.normalizeSpace(var1.trim()));
   }

   public void N(int var1) {
      int ix = this.Z + var1;
      int j = ((class01056)this.field_22787.i_6).i().L().size();
      ix = class04995.N(ix, 0, j);
      if (ix != this.Z) {
         if (ix == j) {
            this.Z = j;
            this.y.method_1852(this.B);
         } else {
            if (this.Z == j) {
               this.B = this.y.method_1882();
            }

            this.y.method_1852(((class01056)this.field_22787.i_6).i().L().get(ix));
            this.R.N(false);
            this.Z = ix;
         }
      }
   }

   @Nullable
   private class01028 N(String var1, int var2) {
      return this.u ? class01028.a_(var1, class00405.N.N(class06541.field_1080).y(true)) : null;
   }

   private boolean N(class05910 var1) {
      return this.L();
   }

   private boolean N(boolean var1) {
      String s = this.y.method_1882();
      return this.L() ? true : !s.isEmpty();
   }

   private void N(CallbackInfo var1) {
      if (this.y.method_1861() == 256) {
         this.y.method_1880(MaxChatLength.getChatLength());
      }
   }

   public boolean N(class04927 var1, String var2) {
      return !DebugSettings.INSTANCE.legacyTabCompletions.isEnabled();
   }

   protected boolean N() {
      return this.i != class01322.field_62016 && (this.i != class01322.field_62015 || !((class05630)this.field_22787.i_7).Nd().method_41753());
   }

   @Override
   public void method_25426() {
      this.Z = ((class01056)this.field_22787.i_6).i().L().size();
      this.y = new class09461(this, (class01590)this.field_22787.i_4, 4, this.field_22790 - 12, this.field_22789 - 4, 12, class00392.L("chat.editBox"));
      this.y.method_1880(256);
      this.y.method_1858(false);
      String s = this.L;
      class04927 class04927 = this.y;
      if (this.N(class04927, s)) {
         class04927.method_1852(s);
      }

      this.y.method_1863(this::y);
      this.y.method_73210(this::N);
      this.y.method_1856(false);
      this.method_37063(this.y);
      this.R = new class05910(this.field_22787, this, this.y, this.field_22793, false, false, 1, 10, true, -805306368);
      this.R.y(false);
      this.R.N(false);
      this.R.u();
      this.N(null);
      this.y(null);
   }

   @Override
   protected void method_56131() {
      this.method_48265(this.y);
   }

   @Override
   public boolean method_25404(class06601 var1) {
      if (this.R.N(var1)) {
         return true;
      } else if (this.u && var1.v() == 259) {
         this.y.method_1852("");
         this.u = false;
         return true;
      } else if (super.method_25404(var1)) {
         return true;
      } else if (var1.u()) {
         this.N(this.y.method_1882(), true);
         this.i = class01322.field_62017;
         this.field_22787.N(null);
         return true;
      } else {
         switch (var1.v()) {
            case 264:
               this.N(1);
               break;
            case 265:
               this.N(-1);
               break;
            case 266:
               ((class01056)this.field_22787.i_6).i().N(((class01056)this.field_22787.i_6).i().M() - 1);
               break;
            case 267:
               ((class01056)this.field_22787.i_6).i().N(-((class01056)this.field_22787.i_6).i().M() + 1);
               break;
            default:
               return false;
         }

         return true;
      }
   }

   @Override
   public void method_25415(String var1, boolean var2) {
      if (var2) {
         this.y.method_1852(var1);
      } else {
         this.y.method_1867(var1);
      }
   }

   @Override
   public void method_25432() {
      ((class01056)this.field_22787.i_6).i().u();
      this.L = this.y.method_1882();
      if (this.N() || StringUtils.isBlank(this.L)) {
         ((class01056)this.field_22787.i_6).i().B();
      } else if (!this.u) {
         ((class01056)this.field_22787.i_6).i().y(this.L);
      }
   }

   @Override
   public void method_25420(class01054 var1, int var2, int var3, float var4) {
   }

   @Override
   public void method_25394(class01054 var1, int var2, int var3, float var4) {
      var1.N(2, this.field_22790 - 14, this.field_22789 - 2, this.field_22790 - 2, ((class05630)this.field_22787.i_7).N(Integer.MIN_VALUE));
      ((class01056)this.field_22787.i_6).i().N(var1, this.field_22793, ((class01056)this.field_22787.i_6).R(), var2, var3, true, this.y());
      super.method_25394(var1, var2, var3, var4);
      this.R.N(var1, var2, var3);
   }

   @Override
   public void method_25419() {
      this.i = class01322.field_62015;
      super.method_25419();
   }

   @Override
   public boolean method_25421() {
      return false;
   }

   @Override
   protected void method_37062(class03428 var1) {
      var1.N(class03457.field_33788, this.method_25440());
      var1.N(class03457.field_33791, M);
      String s = this.y.method_1882();
      if (!s.isEmpty()) {
         var1.N().N(class03457.field_33788, class00392.N("chat_screen.message", s));
      }
   }

   @Override
   public void method_25410(int var1, int var2) {
      this.L = this.y.method_1882();
      this.method_25423(var1, var2);
   }

   @Override
   public boolean method_73217() {
      return true;
   }

   @Override
   public boolean method_25401(double var1, double var3, double var5, double var7) {
      var7 = class04995.N(var7, -1.0, 1.0);
      if (this.R.N(var7)) {
         return true;
      } else {
         if (!this.field_22787.L()) {
            var7 *= 7.0;
         }

         ((class01056)this.field_22787.i_6).i().N((int)var7);
         return true;
      }
   }

   @Override
   public boolean method_25402(class06613 var1, boolean var2) {
      if (this.R.N(var1)) {
         return true;
      } else {
         if (var1.v() == 0) {
            int ix = this.field_22787.Nt().s();
            class00604 class00604 = new class00604(this.method_64506(), (int)var1.n(), (int)var1.t()).N(this.y());
            ((class01056)this.field_22787.i_6).i().N(class00604, ix, ((class01056)this.field_22787.i_6).R(), true);
            class00405 class00405 = class00604.y();
            if (class00405 != null && this.N(class00405, this.y())) {
               this.L = this.y.method_1882();
               return true;
            }
         }

         return super.method_25402(var1, var2);
      }
   }
}
