package minecraft;

import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.util.function.Supplier;
import net.caffeinemc.mods.lithium.common.tracking.entity.ToggleableMovementTracker;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class00253 extends class00250 implements class03969, class03977 {
   private static final int B = 27;
   private class00743<class06584> Z = class00743.method_10213(27, class06584.E);
   @Nullable
   private class05946<class05074> W;
   private long m;

   @Override
   public class04803 method_32318(int var1) {
      return this.c_(var1);
   }

   @Override
   public void method_5650(class07062 var1) {
      if (!this.method_73183().method_8608() && var1.N()) {
         class06704.N(this.method_73183(), this, this);
      }

      super.method_5650(var1);
   }

   @Override
   protected void method_5652(class08329 var1) {
      super.method_5652(var1);
      this.N(var1);
   }

   @Override
   public class07082 method_5688(class08036 var1, class07050 var2) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return (class07082)callbackinforeturnable.getReturnValue();
      } else {
         class07082 class07082x = super.method_5688(var1, var2);
         if (class07082x != class07082.i) {
            return class07082x;
         } else if (this.method_5818(var1) && !var1.method_21823()) {
            return class07082.i;
         } else {
            class07082 class07082x = this.L(var1);
            if (class07082x.N() && var1.method_73183() instanceof class04782 class04782) {
               this.method_32875(class01194.U, var1);
               class01514.N(class04782, var1, true);
            }

            return class07082x;
         }
      }
   }

   @Override
   protected void method_5749(class08299 var1) {
      super.method_5749(var1);
      this.a_(var1);
   }

   @Override
   public void method_5842() {
      this.s();
   }

   public class00253(class07078<? extends class00253> var1, class07299 var2, Supplier<class06581> var3) {
      super(var1, var2, var3);
   }

   @Override
   protected float B() {
      return 0.15F;
   }

   @Override
   protected int Z() {
      return 1;
   }

   private void s() {
      class01113 class01113 = this.getChangeListener();
      if (class01113 instanceof ToggleableMovementTracker toggleablemovementtracker) {
         class06889 class06889 = this.method_73189();
         int i = toggleablemovementtracker.lithium$setNotificationMask(0);
         super.method_5842();
         toggleablemovementtracker.lithium$setNotificationMask(i);
         if (!class06889.equals(this.method_73189())) {
            class01113.N();
         }
      } else {
         super.method_5842();
      }
   }

   @Override
   public void m() {
      this.Z = class00743.method_10213(this.method_5439(), class06584.E);
   }

   @Nullable
   @Override
   public class05946<class05074> U() {
      return this.W;
   }

   public void y(@Nullable class08036 var1) {
      this.u(var1);
   }

   @Override
   public long E() {
      return this.m;
   }

   @Override
   public void N(class04782 var1, class07072 var2) {
      this.N(var1, this.z());
      this.N(var2, var1, this);
   }

   private void N(class08036 var1, class07050 var2, CallbackInfoReturnable var3) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_21_5) && var1.method_21823()) {
         var3.setReturnValue(this.L(var1));
      }
   }

   @Override
   public void N(long var1) {
      this.m = var1;
   }

   @Override
   public void N(@Nullable class05946<class05074> var1) {
      this.W = var1;
   }

   @Override
   public void N(class08036 var1) {
      var1.method_17355(this);
      if (var1.method_73183() instanceof class04782 class04782) {
         this.method_32875(class01194.U, var1);
         class01514.N(class04782, var1, true);
      }
   }

   @Override
   public boolean method_5443(class08036 var1) {
      return this.i(var1);
   }

   @Override
   public void method_5432(class08978 var1) {
      this.method_73183().method_32888(class01194.z, this.method_73189(), class01164.N(var1.aB_()));
   }

   @Override
   public void method_5448() {
      this.h_();
   }

   @Override
   public void method_5447(int var1, class06584 var2) {
      this.N(var1, var2);
   }

   @Override
   public void method_5431() {
   }

   @Override
   public class06584 method_5434(int var1, int var2) {
      return this.N(var1, var2);
   }

   @Override
   public class06584 method_5441(int var1) {
      return this.a_(var1);
   }

   @Override
   public class00743<class06584> W() {
      return this.Z;
   }

   @Nullable
   @Override
   public class07482 createMenu(int var1, class08044 var2, class08036 var3) {
      if (this.W != null && var3.method_7325()) {
         return null;
      } else {
         this.y(var2.z);
         return class07490.N(var1, var2, this);
      }
   }

   @Override
   public class06584 method_5438(int var1) {
      return this.b_(var1);
   }

   @Override
   public int method_5439() {
      return 27;
   }
}
