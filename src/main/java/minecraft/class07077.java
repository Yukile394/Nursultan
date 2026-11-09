package minecraft;

import Nursultan.class10714;
import java.util.Optional;
import net.caffeinemc.mods.lithium.common.ai.brain.SensorHelper;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public abstract class class07077 extends class07475 {
   private static final class02131<Boolean> N = class03289.N(class07077.class, class02154.U);
   public static final int W = -24000;
   private static final int y = 40;
   protected static final int m = 0;
   protected static final int P = 0;
   protected int s = 0;
   protected int T = 0;
   protected int b;

   public void L(int var1) {
      this.N(var1, false);
   }

   protected void M() {
      if (!this.method_6109() && this.method_5765()) {
         class07049 class07049 = this.method_5854();
         if (class07049 instanceof class00250 && !((class00250)class07049).N(this)) {
            this.method_5848();
         }
      }
   }

   public int K() {
      if (this.method_73183().method_8608()) {
         return this.field_6011.N(N) ? -1 : 1;
      } else {
         return this.s;
      }
   }

   @Override
   public void method_5674(class02131<?> var1) {
      if (N.equals(var1)) {
         this.N(var1, null);
         this.method_18382();
      }

      super.method_5674(var1);
   }

   @Override
   public void method_5693(class04293 var1) {
      super.method_5693(var1);
      var1.N(N, false);
   }

   @Override
   public void method_5652(class08329 var1) {
      super.method_5652(var1);
      var1.N("Age", this.K());
      var1.N("ForcedAge", this.T);
   }

   @Override
   public boolean method_6109() {
      return this.K() < 0;
   }

   @Override
   public void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.u(var1.N("Age", 0));
      this.T = var1.N("ForcedAge", 0);
   }

   public class07077(class07078<? extends class07077> var1, class07299 var2) {
      super(var1, var2);
   }

   public int V() {
      return this.T;
   }

   public int e() {
      return this.b;
   }

   public static int i(int var0) {
      return (int)(var0 / 20 * 0.1F);
   }

   public boolean q() {
      return false;
   }

   public void u(int var1) {
      int i = this.K();
      this.s = var1;
      if (i < 0 && var1 >= 0 || i >= 0 && var1 < 0) {
         this.field_6011.N(N, var1 < 0);
         this.M();
      }
   }

   @Override
   public void y(boolean var1) {
      this.u(var1 ? -24000 : 0);
   }

   @Nullable
   public abstract class07077 y(class04782 var1, class07077 var2);

   public void N(int var1, boolean var2) {
      int i = this.K();
      i += var1 * 20;
      if (i > 0) {
         i = 0;
      }

      int j = i - i;
      this.u(i);
      if (var2) {
         this.T += j;
         if (this.b == 0) {
            this.b = 40;
         }
      }

      if (this.K() == 0) {
         this.u(this.T);
      }
   }

   private void N(class02131 var1, CallbackInfo var2) {
      if (!this.method_73183().method_8608()) {
         if (this.method_6109()) {
            SensorHelper.enableSensor(this, class05340.P, true);
         } else {
            SensorHelper.disableSensor(this, class05340.P);
            if (this.method_18868().N(class05378.e)) {
               this.method_18868().N(class05378.e, Optional.empty());
            }
         }
      }
   }

   @Nullable
   @Override
   public class07446 N(class01001 var1, class07052 var2, class06113 var3, @Nullable class07446 var4) {
      if (var4 == null) {
         var4 = new class10714(true);
      }

      class10714 class10714 = (class10714)var4;
      if (class10714.L() && class10714.N() > 0 && var1.method_8409().z() <= class10714.u()) {
         this.u(-24000);
      }

      class10714.y();
      return super.N(var1, var2, var3, (class07446)var4);
   }

   @Override
   public void method_6007() {
      super.method_6007();
      if (this.method_73183().method_8608()) {
         if (this.b > 0) {
            if (this.b % 4 == 0) {
               this.method_73183().method_8406(class07107.F, this.method_23322(1.0), this.method_23319() + 0.5, this.method_23325(1.0), 0.0, 0.0, 0.0);
            }

            this.b--;
         }
      } else if (this.method_5805()) {
         int i = this.K();
         if (i < 0) {
            this.u(++i);
         } else if (i > 0) {
            this.u(--i);
         }
      }
   }
}
