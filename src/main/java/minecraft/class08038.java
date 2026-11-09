package minecraft;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.datafixers.util.Either;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import net.caffeinemc.mods.lithium.common.entity.projectile.ProjectileEntityClassGroup;
import net.caffeinemc.mods.lithium.common.world.WorldHelper;
import org.jspecify.annotations.Nullable;

public final class class08038 {
   public static final float N = 0.3F;

   public class08038() {
      super();
   }

   public static Collection<class06145> N(
      class07299 var0, class07049 var1, class06889 var2, class06889 var3, class00734 var4, Predicate<class07049> var5, boolean var6
   ) {
      return N(var0, var1, var2, var3, var4, var5, N(var1), class05849.field_17558, var6);
   }

   public static Collection<class06145> N(
      class07299 var0,
      class07049 var1,
      class06889 var2,
      class06889 var3,
      class00734 var4,
      Predicate<class07049> var5,
      float var6,
      class05849 var7,
      boolean var8
   ) {
      ArrayList arraylist = new ArrayList();

      for (class07049 class07049 : var0.method_8333(var1, var4, var5)) {
         class00734 class00734 = class07049.method_5829();
         if (var8 && class00734.u(var2)) {
            arraylist.add(new class06145(class07049, var2));
         } else {
            Optional<class06889> optional = class00734.y(var2, var3);
            if (optional.isPresent()) {
               arraylist.add(new class06145(class07049, optional.get()));
            } else if (!(var6 <= 0.0)) {
               Optional<class06889> optional1 = class00734.M(var6).y(var2, var3);
               if (!optional1.isEmpty()) {
                  class06889 class06889x = optional1.get();
                  class06889 class06889x = class00734.R();
                  class06183 class06183 = var0.y(new class05862(class06889x, class06889x, var7, class05835.field_1348, var1));
                  if (class06183.N() != class07113.field_1333) {
                     class06889x = class06183.y();
                  }

                  Optional<class06889> optional2 = class07049.method_5829().y(class06889x, class06889x);
                  if (optional2.isPresent()) {
                     arraylist.add(new class06145(class07049, optional2.get()));
                  }
               }
            }
         }
      }

      return arraylist;
   }

   public static void N(class07049 var0, float var1) {
      class06889 class06889 = var0.method_18798();
      if (class06889.B() != 0.0) {
         double d0 = class06889.Z();
         var0.method_36456((float)(class04995.u(class06889.Z, class06889.M) * 180.0F / (float)Math.PI) + 90.0F);
         var0.method_36457((float)(class04995.u(d0, class06889.B) * 180.0F / (float)Math.PI) - 90.0F);

         while (var0.method_36455() - var0.field_6004 < -180.0F) {
            var0.field_6004 -= 360.0F;
         }

         while (var0.method_36455() - var0.field_6004 >= 180.0F) {
            var0.field_6004 += 360.0F;
         }

         while (var0.method_36454() - var0.field_5982 < -180.0F) {
            var0.field_5982 -= 360.0F;
         }

         while (var0.method_36454() - var0.field_5982 >= 180.0F) {
            var0.field_5982 += 360.0F;
         }

         var0.method_36457(class04995.B(var1, var0.field_6004, var0.method_36455()));
         var0.method_36456(class04995.B(var1, var0.field_5982, var0.method_36454()));
      }
   }

   @Nullable
   public static class06145 N(class07299 var0, class07049 var1, class06889 var2, class06889 var3, class00734 var4, Predicate<class07049> var5, float var6) {
      double d0 = Double.MAX_VALUE;
      Optional<class06889> optional = Optional.empty();
      class07049 class07049x = null;

      for (class07049 class07049x : N(
         var0,
         var1,
         var4,
         var5,
         var0x -> {
            WrapOperationRuntime.checkArgumentCount(
               var0x, 4, "[net.minecraft.class_1937, net.minecraft.class_1297, net.minecraft.class_238, java.util.function.Predicate]"
            );
            return ((class07299)var0x[0]).method_8333((class07049)var0x[1], (class00734)var0x[2], (Predicate<? super class07049>)var0x[3]);
         }
      )) {
         Optional<class06889> optional1 = class07049x.method_5829().M(var6).y(var2, var3);
         if (optional1.isPresent()) {
            double d1 = var2.M(optional1.get());
            if (d1 < d0) {
               class07049x = class07049x;
               d0 = d1;
               optional = optional1;
            }
         }
      }

      return class07049x == null ? null : new class06145(class07049x, optional.get());
   }

   public static float N(class07049 var0) {
      return Math.max(0.0F, Math.min(0.3F, (var0.field_6012 - 2) / 20.0F));
   }

   private static List N(class07299 var0, class07049 var1, class00734 var2, Predicate var3, Operation var4) {
      if (var1 != null && ProjectileEntityClassGroup.OPTIMIZED_PROJECTILES.contains(var1)) {
         class01129<class07049> class01129 = WorldHelper.getEntityCacheOrNull(var0);
         if (class01129 != null) {
            return WorldHelper.getEntitiesOfEntityGroupPlusDragonPieces(
               var0, class01129, var1, ProjectileEntityClassGroup.CAN_MAYBE_BE_HIT_BY_OPTIMIZED_PROJECTILE, var2, var3
            );
         }
      }

      return (List)var4.call(new Object[]{var0, var1, var2, var3});
   }

   public static class08007 N(class07438 var0, class06584 var1, float var2, @Nullable class06584 var3) {
      class08007 class08007 = ((class06927)(var1.B() instanceof class06927 ? var1.B() : class06570.sD)).N(var0.method_73183(), var1, var0, var3);
      class08007.N(var2);
      return class08007;
   }

   public static class07050 N(class07438 var0, class06581 var1) {
      return var0.method_6047().N(var1) ? class07050.field_5808 : class07050.field_5810;
   }

   public static class07089 N(class07049 var0, Predicate<class07049> var1, double var2) {
      class06889 class06889 = var0.method_5828(0.0F).L(var2);
      class07299 class07299 = var0.method_73183();
      return N(var0.method_33571(), var0, var1, class06889, class07299, 0.0F, class05849.field_17558);
   }

   public static class07089 N(class07049 var0, Predicate<class07049> var1, class05849 var2) {
      class06889 class06889 = var0.method_18798();
      class07299 class07299 = var0.method_73183();
      return N(var0.method_73189(), var0, var1, class06889, class07299, N(var0), var2);
   }

   public static Either<class06183, Collection<class06145>> N(class07049 var0, class06543 var1, Predicate<class07049> var2, class05849 var3) {
      class06889 class06889xxx = var0.method_75117();
      class06889 class06889x = var0.method_33571();
      class06889 class06889xx = class06889x.i(class06889xxx.L((double)var1.N(var0)));
      double d0 = var0.method_60478().y(class06889xxx);
      class06889 class06889xxx = class06889x.i(class06889xxx.L(var1.y(var0) + Math.max(0.0, d0)));
      return N(var0, class06889x, class06889xx, var2, class06889xxx, var1.i(), var3);
   }

   public static class07089 N(class07049 var0, Predicate<class07049> var1) {
      class06889 class06889 = var0.method_18798();
      class07299 class07299 = var0.method_73183();
      return N(var0.method_73189(), var0, var1, class06889, class07299, N(var0), class05849.field_17558);
   }

   @Nullable
   public static class06145 N(class07299 var0, class08005 var1, class06889 var2, class06889 var3, class00734 var4, Predicate<class07049> var5) {
      return N(var0, var1, var2, var3, var4, var5, N(var1));
   }

   @Nullable
   public static class06145 N(class07049 var0, class06889 var1, class06889 var2, class00734 var3, Predicate<class07049> var4, double var5) {
      class07299 class07299 = var0.method_73183();
      double d0 = var5;
      class07049 class07049x = null;
      class06889 class06889x = null;

      for (class07049 class07049x : class07299.method_8333(var0, var3, var4)) {
         class00734 class00734 = class07049x.method_5829().M(class07049x.method_5871());
         Optional<class06889> optional = class00734.y(var1, var2);
         if (class00734.u(var1)) {
            if (d0 >= 0.0) {
               class07049x = class07049x;
               class06889x = optional.orElse(var1);
               d0 = 0.0;
            }
         } else if (optional.isPresent()) {
            class06889 class06889x = optional.get();
            double d1 = var1.M(class06889x);
            if (d1 < d0 || d0 == 0.0) {
               if (class07049x.method_5668() == var0.method_5668()) {
                  if (d0 == 0.0) {
                     class07049x = class07049x;
                     class06889x = class06889x;
                  }
               } else {
                  class07049x = class07049x;
                  class06889x = class06889x;
                  d0 = d1;
               }
            }
         }
      }

      return class07049x == null ? null : new class06145(class07049x, class06889x);
   }

   private static Either<class06183, Collection<class06145>> N(
      class07049 var0, class06889 var1, class06889 var2, Predicate<class07049> var3, class06889 var4, float var5, class05849 var6
   ) {
      class07299 class07299 = var0.method_73183();
      class06183 class06183 = class07299.y(new class05862(var1, var4, var6, class05835.field_1348, var0));
      if (class06183.N() != class07113.field_1333) {
         var4 = class06183.y();
         if (var1.M(var4) < var1.M(var2)) {
            return Either.left(class06183);
         }
      }

      class00734 class00734 = class00734.N(var2, var5, var5, var5).y(var4.u(var2)).M(1.0);
      Collection<class06145> collection = N(class07299, var0, var2, var4, class00734, var3, var5, var6, true);
      return !collection.isEmpty() ? Either.right(collection) : Either.left(class06183);
   }

   public static class07089 N(class06889 var0, class07049 var1, Predicate<class07049> var2, class06889 var3, class07299 var4, float var5, class05849 var6) {
      class06889 class06889 = var0.i(var3);
      Object object = var4.y(new class05862(var0, class06889, var6, class05835.field_1348, var1));
      if (((class07089)object).N() != class07113.field_1333) {
         class06889 = ((class07089)object).y();
      }

      class06145 class06145 = N(var4, var1, var0, class06889, var1.method_5829().y(var3).M(1.0), var2, var5);
      if (class06145 != null) {
         object = class06145;
      }

      return (class07089)object;
   }
}
