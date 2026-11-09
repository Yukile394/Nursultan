package minecraft;

import com.google.common.base.Predicates;
import com.mojang.datafixers.util.Pair;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import net.caffeinemc.mods.lithium.common.entity.pushable.EntityPushablePredicate;
import net.caffeinemc.mods.lithium.common.tracking.entity.ToggleableMovementTracker;
import net.caffeinemc.mods.lithium.common.world.WorldHelper;
import net.caffeinemc.mods.lithium.mixin.block.hopper.EntityAccessor;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class02757 extends class02736 {
   private static final double y = 0.01;
   private static final double L = 0.2;
   private static final double u = 0.4;
   private static final double i = 0.4;
   private final class08382 R;
   private class06889 M = class06889.L;
   private class06889 B;
   private int Z;

   @Nullable
   public class06889 L(double var1, double var3, double var5) {
      int ix = class04995.N(var1);
      int j = class04995.N(var3);
      int k = class04995.N(var5);
      if (this.L().method_8320(new class07209(ix, j - 1, k)).N(class01210.e)) {
         j--;
      }

      class00500 class00500 = this.L().method_8320(new class07209(ix, j, k));
      if (class07760.U(class00500)) {
         Pair<class00753, class00753> pair = class07504.N(class00500.L(((class07760)class00500.i()).L()));
         class00753 class00753 = (class00753)pair.getFirst();
         class00753 class00753x = (class00753)pair.getSecond();
         double d0 = ix + 0.5 + class00753.method_10263() * 0.5;
         double d1 = j + 0.0625 + class00753.method_10264() * 0.5;
         double d2 = k + 0.5 + class00753.method_10260() * 0.5;
         double d3 = ix + 0.5 + class00753x.method_10263() * 0.5;
         double d4 = j + 0.0625 + class00753x.method_10264() * 0.5;
         double d5 = k + 0.5 + class00753x.method_10260() * 0.5;
         double d6 = d3 - d0;
         double d7 = (d4 - d1) * 2.0;
         double d8 = d5 - d2;
         double d9;
         if (d6 == 0.0) {
            d9 = var5 - k;
         } else if (d8 == 0.0) {
            d9 = var1 - ix;
         } else {
            double d10 = var1 - d0;
            double d11 = var5 - d2;
            d9 = (d10 * d6 + d11 * d8) * 2.0;
         }

         var1 = d0 + d6 * d9;
         var3 = d1 + d7 * d9;
         var5 = d2 + d8 * d9;
         if (d7 < 0.0) {
            var3++;
         } else if (d7 > 0.0) {
            var3 += 0.5;
         }

         return new class06889(var1, var3, var5);
      } else {
         return null;
      }
   }

   public class02757(class07504 var1) {
      super(var1);
      this.R = new class08382(var1, this::N);
   }

   @Override
   public class06889 u(class06889 var1) {
      return !Double.isNaN(var1.M) && !Double.isNaN(var1.B) && !Double.isNaN(var1.Z)
         ? new class06889(class04995.N(var1.M, -0.4, 0.4), var1.B, class04995.N(var1.Z, -0.4, 0.4))
         : class06889.L;
   }

   @Override
   public boolean u() {
      class00734 class00734 = this.N.method_5829().L(0.2F, 0.0, 0.2F);
      if (this.N.Z() && this.i().z() >= 0.01) {
         class07299 class07299 = this.L();
         class07504 class07504xx = this.N;
         Predicate<class07049> predicate = class07042.N(this.N);
         class07504 class07504x = class07504xx;
         class07299 class07299x = class07299;
         List list = this.N(class07299x, class07504x, class00734, predicate);
         if (!list.isEmpty()) {
            for (class07049 class07049 : list) {
               if (!(class07049 instanceof class08036)
                  && !(class07049 instanceof class07625)
                  && !(class07049 instanceof class07504)
                  && !this.N.method_5782()
                  && !class07049.method_5765()) {
                  class07049.method_5804(this.N);
               } else {
                  class07049.method_5697(this.N);
               }
            }
         }
      } else {
         class07504 class07504x = this.N;
         class07299 class07299xx = this.L();

         for (class07049 class07049x : this.N(class07299xx, class07504x, class00734)) {
            if (!this.N.method_5626(class07049x) && class07049x.method_5810() && class07049x instanceof class07504) {
               class07049x.method_5697(this.N);
            }
         }
      }

      return false;
   }

   @Override
   public double y(class04782 var1) {
      return this.N.method_5799() ? 0.2 : 0.4;
   }

   private void y(class04782 var1, CallbackInfo var2) {
      if (this instanceof class06695) {
         class01113 class01113 = ((EntityAccessor)this).getChangeListener();
         if (class01113 instanceof ToggleableMovementTracker toggleablemovementtracker) {
            this.Z = toggleablemovementtracker.lithium$setNotificationMask(this.Z);
            if (!this.B.equals(this.R())) {
               class01113.N();
            }
         }

         this.B = null;
      }
   }

   @Override
   public void y() {
      if (this.L() instanceof class04782 class04782) {
         this.N.method_56990();
         class07209 class07209 = this.N.L();
         class00500 class00500 = this.L().method_8320(class07209);
         boolean flag = class07760.U(class00500);
         this.N.N(flag);
         if (flag) {
            this.N(class04782);
            if (class00500.N(class00869.Bh)) {
               this.N.N(class04782, class07209.method_10263(), class07209.method_10264(), class07209.method_10260(), class00500.L(class06900.u));
            }
         } else {
            this.N.L(class04782);
         }

         this.N.method_61409();
         this.N(0.0F);
         double d0 = this.N.field_6014 - this.M();
         double d1 = this.N.field_5969 - this.Z();
         if (d0 * d0 + d1 * d1 > 0.001) {
            this.y((float)(class04995.u(d1, d0) * 180.0 / Math.PI));
            if (this.N.u()) {
               this.y(this.U() + 180.0F);
            }
         }

         double d2 = class04995.R(this.U() - this.N.field_5982);
         if (d2 < -170.0 || d2 >= 170.0) {
            this.y(this.U() + 180.0F);
            this.N.y(!this.N.u());
         }

         this.N(this.z() % 360.0F);
         this.y(this.U() % 360.0F);
         this.u();
      } else {
         if (this.R.method_66270()) {
            this.R.method_66271();
         } else {
            this.N.method_23311();
            this.N(this.z() % 360.0F);
            this.y(this.U() % 360.0F);
         }
      }
   }

   @Override
   public class07211 E() {
      return this.N.u() ? this.N.method_5735().b().R() : this.N.method_5735().R();
   }

   private List N(class07299 var1, class07049 var2, class00734 var3) {
      return var1.N(class07504.class, var3, var1x -> var1x != var2);
   }

   private void N(class04782 var1, CallbackInfo var2) {
      if (this instanceof class06695) {
         this.B = this.R();
         if (((EntityAccessor)this).getChangeListener() instanceof ToggleableMovementTracker toggleablemovementtracker) {
            this.Z = toggleablemovementtracker.lithium$setNotificationMask(0);
         }
      }
   }

   private List N(class07299 var1, class07049 var2, class00734 var3, Predicate var4) {
      if (var4 == Predicates.alwaysFalse()) {
         return Collections.emptyList();
      } else {
         if (var4 instanceof EntityPushablePredicate entitypushablepredicate) {
            class01129<class07049> class01129 = WorldHelper.getEntityCacheOrNull(var1);
            if (class01129 != null) {
               return WorldHelper.getPushableEntities(var1, class01129, var2, var3, entitypushablepredicate);
            }
         }

         return var1.method_8333(var2, var3, var4);
      }
   }

   @Override
   public double N(class07209 var1, class08080 var2, double var3) {
      return 0.0;
   }

   @Override
   public void N(class06889 var1) {
      this.M = var1;
      this.y(this.M);
   }

   @Nullable
   public class06889 N(double var1, double var3, double var5, double var7) {
      int ix = class04995.N(var1);
      int j = class04995.N(var3);
      int k = class04995.N(var5);
      if (this.L().method_8320(new class07209(ix, j - 1, k)).N(class01210.e)) {
         j--;
      }

      class00500 class00500 = this.L().method_8320(new class07209(ix, j, k));
      if (class07760.U(class00500)) {
         class08080 class08080 = class00500.L(((class07760)class00500.i()).L());
         var3 = j;
         if (class08080.y()) {
            var3 = j + 1;
         }

         Pair<class00753, class00753> pair = class07504.N(class08080);
         class00753 class00753x = (class00753)pair.getFirst();
         class00753 class00753x = (class00753)pair.getSecond();
         double d0 = class00753x.method_10263() - class00753x.method_10263();
         double d1 = class00753x.method_10260() - class00753x.method_10260();
         double d2 = Math.sqrt(d0 * d0 + d1 * d1);
         d0 /= d2;
         d1 /= d2;
         var1 += d0 * var7;
         var5 += d1 * var7;
         if (class00753x.method_10264() != 0 && class04995.N(var1) - ix == class00753x.method_10263() && class04995.N(var5) - k == class00753x.method_10260()) {
            var3 += class00753x.method_10264();
         } else if (class00753x.method_10264() != 0
            && class04995.N(var1) - ix == class00753x.method_10263()
            && class04995.N(var5) - k == class00753x.method_10260()) {
            var3 += class00753x.method_10264();
         }

         return this.L(var1, var3, var5);
      } else {
         return null;
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void N(class04782 var1) {
      this.N(var1, null);
      class07209 class07209 = this.N.L();
      class00500 class00500 = this.L().method_8320(class07209);
      this.N.method_38785();
      double d0 = this.N.method_23317();
      double d1 = this.N.method_23318();
      double d2 = this.N.method_23321();
      class06889 class06889xx = this.L(d0, d1, d2);
      d1 = class07209.method_10264();
      boolean flag = false;
      boolean flag1 = false;
      if (class00500.N(class00869.yG)) {
         flag = class00500.L(class06900.u);
         flag1 = !flag;
      }

      double d3 = 0.0078125;
      if (this.N.method_5799()) {
         d3 *= 0.2;
      }

      class06889 class06889x = this.i();
      class08080 class08080 = class00500.L(((class07760)class00500.i()).L());
      switch (class08080) {
         case field_12667:
            this.y(class06889x.y(-d3, 0.0, 0.0));
            d1++;
            break;
         case field_12666:
            this.y(class06889x.y(d3, 0.0, 0.0));
            d1++;
            break;
         case field_12670:
            this.y(class06889x.y(0.0, 0.0, d3));
            d1++;
            break;
         case field_12668:
            this.y(class06889x.y(0.0, 0.0, -d3));
            d1++;
      }

      class06889x = this.i();
      Pair<class00753, class00753> pair = class07504.N(class08080);
      class00753 class00753 = (class00753)pair.getFirst();
      class00753 class00753x = (class00753)pair.getSecond();
      double d4 = class00753x.method_10263() - class00753.method_10263();
      double d5 = class00753x.method_10260() - class00753.method_10260();
      double d6 = Math.sqrt(d4 * d4 + d5 * d5);
      if (class06889x.M * d4 + class06889x.Z * d5 < 0.0) {
         d4 = -d4;
         d5 = -d5;
      }

      double d7 = Math.min(2.0, class06889x.Z());
      class06889x = new class06889(d7 * d4 / d6, class06889x.B, d7 * d5 / d6);
      this.y(class06889x);
      class07049 class07049 = this.N.method_31483();
      class06889 class06889x;
      if (this.N.method_31483() instanceof class04770 class04770) {
         class06889x = class04770.method_63563();
      } else {
         class06889x = class06889.L;
      }

      if (class07049 instanceof class08036 && class06889x.B() > 0.0) {
         class06889 class06889xx = class06889x.u();
         double d21 = this.i().z();
         if (class06889xx.B() > 0.0 && d21 < 0.01) {
            this.y(this.i().y(class06889x.M * 0.001, 0.0, class06889x.Z * 0.001));
            flag1 = false;
         }
      }

      if (flag1) {
         double d19 = this.i().Z();
         if (d19 < 0.03) {
            this.y(class06889.L);
         } else {
            this.y(this.i().u(0.5, 0.0, 0.5));
         }
      }

      double d20 = class07209.method_10263() + 0.5 + class00753.method_10263() * 0.5;
      double d8 = class07209.method_10260() + 0.5 + class00753.method_10260() * 0.5;
      double d9 = class07209.method_10263() + 0.5 + class00753x.method_10263() * 0.5;
      double d10 = class07209.method_10260() + 0.5 + class00753x.method_10260() * 0.5;
      d4 = d9 - d20;
      d5 = d10 - d8;
      double d11;
      if (d4 == 0.0) {
         d11 = d2 - class07209.method_10260();
      } else if (d5 == 0.0) {
         d11 = d0 - class07209.method_10263();
      } else {
         double d12 = d0 - d20;
         double d13 = d2 - d8;
         d11 = (d12 * d4 + d13 * d5) * 2.0;
      }

      d0 = d20 + d4 * d11;
      d2 = d8 + d5 * d11;
      this.y(d0, d1, d2);
      double d22 = this.N.method_5782() ? 0.75 : 1.0;
      double d23 = this.N.N_73(var1);
      class06889x = this.i();
      this.N
         .method_5784(class07451.field_6308, new class06889(class04995.N(d22 * class06889x.M, -d23, d23), 0.0, class04995.N(d22 * class06889x.Z, -d23, d23)));
      if (class00753.method_10264() != 0
         && class04995.N(this.N.method_23317()) - class07209.method_10263() == class00753.method_10263()
         && class04995.N(this.N.method_23321()) - class07209.method_10260() == class00753.method_10260()) {
         this.y(this.N.method_23317(), this.N.method_23318() + class00753.method_10264(), this.N.method_23321());
      } else if (class00753x.method_10264() != 0
         && class04995.N(this.N.method_23317()) - class07209.method_10263() == class00753x.method_10263()
         && class04995.N(this.N.method_23321()) - class07209.method_10260() == class00753x.method_10260()) {
         this.y(this.N.method_23317(), this.N.method_23318() + class00753x.method_10264(), this.N.method_23321());
      }

      this.y(this.N.N(this.i()));
      class06889 class06889xx = this.L(this.N.method_23317(), this.N.method_23318(), this.N.method_23321());
      if (class06889xx != null && class06889xx != null) {
         double d14 = (class06889xx.B - class06889xx.B) * 0.05;
         class06889 class06889xxx = this.i();
         double d15 = class06889xxx.Z();
         if (d15 > 0.0) {
            this.y(class06889xxx.u((d15 + d14) / d15, 1.0, (d15 + d14) / d15));
         }

         this.y(this.N.method_23317(), class06889xx.B, this.N.method_23321());
      }

      int j = class04995.N(this.N.method_23317());
      int ix = class04995.N(this.N.method_23321());
      if (j != class07209.method_10263() || ix != class07209.method_10260()) {
         class06889 class06889xxx = this.i();
         double d24 = class06889xxx.Z();
         this.N(d24 * (j - class07209.method_10263()), class06889xxx.B, d24 * (ix - class07209.method_10260()));
      }

      if (flag) {
         class06889 class06889xxx = this.i();
         double d25 = class06889xxx.Z();
         if (d25 > 0.01) {
            double d16 = 0.06;
            this.y(class06889xxx.y(class06889xxx.M / d25 * 0.06, 0.0, class06889xxx.Z / d25 * 0.06));
         } else {
            class06889 class06889xxxx = this.i();
            double d17 = class06889xxxx.M;
            double d18 = class06889xxxx.Z;
            if (class08080 == class08080.field_12674) {
               if (this.N.y(class07209.method_10067())) {
                  d17 = 0.02;
               } else if (this.N.y(class07209.method_10078())) {
                  d17 = -0.02;
               }
            } else {
               if (class08080 != class08080.field_12665) {
                  this.y(var1, null);
                  return;
               }

               if (this.N.y(class07209.method_10095())) {
                  d18 = 0.02;
               } else if (this.N.y(class07209.method_10072())) {
                  d18 = -0.02;
               }
            }

            this.N(d17, class06889xxxx.B, d18);
         }
      }

      this.y(var1, null);
   }

   public void N(class08382 var1) {
      this.y(this.M);
   }

   @Override
   public class08382 N() {
      return this.R;
   }

   @Override
   public double W() {
      return this.N.method_5782() ? 0.997 : 0.96;
   }
}
