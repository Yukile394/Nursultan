package minecraft;

import com.google.common.collect.ImmutableSet;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.types.Type;
import java.util.Objects;
import java.util.Optional;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityType.Builder;
import net.fabricmc.fabric.impl.object.builder.FabricEntityTypeImpl;
import net.fabricmc.fabric.impl.object.builder.FabricEntityTypeImpl.Builder.Living;
import net.fabricmc.fabric.impl.object.builder.FabricEntityTypeImpl.Builder.Mob;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class07045<T extends class07049> implements Builder, net.fabricmc.fabric.impl.object.builder.FabricEntityTypeImpl.Builder {
   private final class07040<T> N;
   private final class07428 y;
   private ImmutableSet<class00891> L;
   private boolean u;
   private boolean i;
   private boolean R;
   private boolean M;
   private int B;
   private int Z;
   private class01325 z;
   private float U;
   private class03839 E;
   private class03767 W;
   private class08216<class07078<?>, Optional<class05946<class05074>>> m;
   private final class08216<class07078<?>, String> P;
   private boolean s;
   @Nullable
   private Boolean T = null;
   @Nullable
   private Boolean b = null;
   private Living j = null;
   private Mob v = null;

   public class07045<T> L(float var1) {
      return this.N(class03831.field_47744, 0.0F, -var1, 0.0F);
   }

   public class07045<T> L() {
      this.R = true;
      return this;
   }

   private class07045(class07040<T> var1, class07428 var2) {
      super();
      this.L = ImmutableSet.of();
      this.u = true;
      this.i = true;
      this.B = 5;
      this.Z = 3;
      this.z = class01325.y(0.6F, 1.8F);
      this.U = 1.0F;
      this.E = class03810.N();
      this.W = class03794.M;
      this.m = var0 -> Optional.of(class05946.N(class04227.yJ, var0.N().R("entities/")));
      this.P = var0 -> class07536.N("entity", var0.N());
      this.s = true;
      this.N = var1;
      this.y = var2;
      this.M = var2 == class07428.field_6294 || var2 == class07428.field_17715;
   }

   public class07045<T> i() {
      this.m = class08216.N(Optional.empty());
      return this;
   }

   public class07045<T> u() {
      this.M = true;
      return this;
   }

   public class07045<T> u(float var1) {
      return this.N(class03831.field_47745, 0.0F, var1, 0.0F);
   }

   public class07045<T> y() {
      this.u = false;
      return this;
   }

   private static class07078 y(class07078 var0) {
      return var0;
   }

   public class07045<T> y(int var1) {
      this.Z = var1;
      return this;
   }

   public class07045<T> y(float var1) {
      this.z = this.z.y(var1);
      return this;
   }

   @Nullable
   private Type N(TypeReference var1, String var2, Operation var3, LocalRef var4) {
      return this.N(var1, var2, var3, (class05946)var4.get());
   }

   public class07045<T> N(class02957... var1) {
      this.W = class03794.i.N(var1);
      return this;
   }

   private void N(class05946 var1, CallbackInfoReturnable var2) {
      if (var2.getReturnValue() instanceof FabricEntityTypeImpl fabricentitytypeimpl) {
         fabricentitytypeimpl.fabric_setAlwaysUpdateVelocity(this.T);
         fabricentitytypeimpl.fabric_setCanPotentiallyExecuteCommands(this.b);
         if (this.j != null) {
            this.j.onBuild(N((class07078)var2.getReturnValue()));
         }

         if (this.v != null) {
            this.v.onBuild(y((class07078)var2.getReturnValue()));
         }
      } else {
         throw new IllegalStateException();
      }
   }

   private static class07078 N(class07078 var0) {
      return var0;
   }

   public class07078<T> N(class05946<class07078<?>> var1) {
      if (this.u) {
         TypeReference typereference1 = class06962.J;
         String sx = var1.N().toString();
         TypeReference typereference = typereference1;
         Operation operation = var0 -> {
            WrapOperationRuntime.checkArgumentCount(var0, 2, "[com.mojang.datafixers.DSL$TypeReference, java.lang.String]");
            return class07536.N((TypeReference)var0[0], (String)var0[1]);
         };
         LocalRefImpl localrefimpl = new LocalRefImpl();
         localrefimpl.init(var1);
         this.N(typereference, sx, operation, localrefimpl);
         var1 = (class05946)localrefimpl.dispose();
      }

      class07078 class07078x;
      class07078 class07078x = class07078x = new class07078<>(
         this.N, this.y, this.u, this.i, this.R, this.M, this.L, this.z.N(this.E), this.U, this.B, this.Z, this.P.get(var1), this.m.get(var1), this.W, this.s
      );
      this.N(var1, new CallbackInfoReturnable("", false, class07078x));
      return class07078x;
   }

   @Nullable
   private Type N(TypeReference var1, String var2, Operation var3, class05946 var4) {
      return !var4.N().y().equals("minecraft") ? null : (Type)var3.call(new Object[]{var1, var2});
   }

   public class07045<T> N(float... var1) {
      for (float f : var1) {
         this.E = this.E.N(class03831.field_47743, 0.0F, f, 0.0F);
      }

      return this;
   }

   public class07045<T> N(class06889... var1) {
      for (class06889 class06889 : var1) {
         this.E = this.E.N(class03831.field_47743, class06889);
      }

      return this;
   }

   public static <T extends class07049> class07045<T> N(class07040<T> var0, class07428 var1) {
      return new class07045<>(var0, var1);
   }

   public class07045<T> N(class06889 var1) {
      return this.N(class03831.field_47744, var1);
   }

   public class07045<T> N(float var1) {
      this.U = var1;
      return this;
   }

   public class07045<T> N(float var1, float var2) {
      this.z = class01325.y(var1, var2);
      return this;
   }

   public static <T extends class07049> class07045<T> N(class07428 var0) {
      return new class07045<>((var0x, var1) -> null, var0);
   }

   public class07045<T> N(int var1) {
      this.B = var1;
      return this;
   }

   public class07045<T> N() {
      this.i = false;
      return this;
   }

   public class07045<T> N(class03831 var1, class06889 var2) {
      this.E = this.E.N(var1, var2);
      return this;
   }

   public class07045<T> N(class03831 var1, float var2, float var3, float var4) {
      this.E = this.E.N(var1, var2, var3, var4);
      return this;
   }

   public class07045<T> N(class00891... var1) {
      this.L = ImmutableSet.copyOf(var1);
      return this;
   }

   public class07045 canPotentiallyExecuteCommands(boolean var1) {
      this.b = var1;
      return this;
   }

   public void fabric_setLivingEntityBuilder(Living var1) {
      Objects.requireNonNull(var1, "Cannot set null living entity builder");
      this.j = var1;
   }

   public class07045<T> R() {
      this.s = false;
      return this;
   }

   public class07045 alwaysUpdateVelocity(boolean var1) {
      this.T = var1;
      return this;
   }

   public void fabric_setMobEntityBuilder(Mob var1) {
      Objects.requireNonNull(var1, "Cannot set null mob entity builder");
      this.v = var1;
   }
}
