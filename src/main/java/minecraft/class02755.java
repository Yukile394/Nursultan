package minecraft;

import Nursultan.class09882;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalIntRefImpl;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalIntRef;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import it.unimi.dsi.fastutil.objects.Object2IntSortedMap;
import java.util.Collections;
import java.util.SequencedSet;
import net.caffeinemc.mods.lithium.common.initialization.BlockInfoInitializer;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents.BuildCallback;
import net.fabricmc.fabric.api.registry.FuelRegistryEvents.ExclusionsCallback;
import net.fabricmc.fabric.impl.content.registry.FuelRegistryEventsContextImpl;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class02755 {
   private final Object2IntSortedMap<class06581> N;

   public class02755(Object2IntSortedMap<class06581> var1) {
      super();
      this.N = var1;
   }

   public int y(class06584 var1) {
      return var1.R() ? 0 : this.N.getInt(var1.B());
   }

   private static class09882 N(class09882 var0, class03530 var1, Operation var2, class01929 var3, class03767 var4, int var5) {
      FuelRegistryEventsContextImpl fuelregistryeventscontextimpl = new FuelRegistryEventsContextImpl(var3, var4, var5);
      ((BuildCallback)FuelRegistryEvents.BUILD.invoker()).build(var0, fuelregistryeventscontextimpl);
      var2.call(new Object[]{var0, var1});
      ((ExclusionsCallback)FuelRegistryEvents.EXCLUSIONS.invoker()).buildExclusions(var0, fuelregistryeventscontextimpl);
      return var0;
   }

   private static void N(class01929 var0, class03767 var1, int var2, CallbackInfoReturnable var3) {
      BlockInfoInitializer.initializeBlockInfo();
   }

   private static class09882 N(class09882 var0, class03530 var1, Operation var2, LocalRef var3, LocalRef var4, LocalIntRef var5) {
      return N(var0, var1, var2, (class01929)var3.get(), (class03767)var4.get(), var5.get());
   }

   public boolean N(class06584 var1) {
      return this.N.containsKey(var1.B());
   }

   public SequencedSet<class06581> N() {
      return Collections.unmodifiableSequencedSet(this.N.keySet());
   }

   public static class02755 N(class01929 var0, class03767 var1) {
      return N(var0, var1, 200);
   }

   public static class02755 N(class01929 var0, class03767 var1, int var2) {
      class09882 class09882 = new class09882(var0, var1)
         .N(class06570.jW, var2 * 100)
         .N(class00869.zv, var2 * 8 * 10)
         .N(class06570.nU, var2 * 12)
         .N(class06570.sh, var2 * 8)
         .N(class06570.sr, var2 * 8)
         .N(class01226.g, var2 * 3 / 2)
         .N(class01226.T, var2 * 3 / 2)
         .N(class01226.y, var2 * 3 / 2)
         .N(class00869.d, var2 * 3 / 2)
         .N(class01226.Z, var2 * 3 / 2)
         .N(class00869.ZH, var2 * 3 / 2)
         .N(class01226.z, var2 * 3 / 4)
         .N(class00869.Ut, var2 * 3 / 4)
         .N(class01226.c, var2 * 3 / 2)
         .N(class01226.W, var2 * 3 / 2)
         .N(class01226.m, var2 * 3 / 2)
         .N(class01226.U, var2 * 3 / 2)
         .N(class01226.E, var2 * 3 / 2)
         .N(class00869.yR, var2 * 3 / 2)
         .N(class00869.Lt, var2 * 3 / 2)
         .N(class00869.LG, var2 * 3 / 2)
         .N(class00869.PD, var2 * 3 / 2)
         .N(class00869.iG, var2 * 3 / 2)
         .N(class00869.LA, var2 * 3 / 2)
         .N(class00869.BH, var2 * 3 / 2)
         .N(class00869.LD, var2 * 3 / 2)
         .N(class00869.Bp, var2 * 3 / 2)
         .N(class01226.Nj, var2 * 3 / 2)
         .N(class06570.sx, var2 * 3 / 2)
         .N(class06570.jr, var2 * 3 / 2)
         .N(class00869.uW, var2 * 3 / 2)
         .N(class01226.Ns, var2)
         .N(class01226.NT, var2 * 4)
         .N(class06570.TP, var2)
         .N(class06570.Tm, var2)
         .N(class06570.lq, var2)
         .N(class06570.Tb, var2)
         .N(class06570.TT, var2)
         .N(class06570.Ts, var2)
         .N(class01226.B, var2)
         .N(class01226.yW, var2 * 6)
         .N(class01226.N, var2 / 2)
         .N(class01226.u, var2 / 2)
         .N(class06570.Tx, var2 / 2)
         .N(class01226.s, var2 / 2)
         .N(class06570.sC, var2 / 2)
         .N(class01226.M, 1 + var2 / 3)
         .N(class00869.mN, 1 + var2 * 20)
         .N(class06570.dw, var2 * 3 / 2)
         .N(class00869.mx, var2 / 4)
         .N(class00869.yQ, var2 / 2)
         .N(class00869.yg, var2 / 2)
         .N(class00869.yI, var2 / 2)
         .N(class00869.Pa, var2 / 4)
         .N(class00869.Pp, var2 * 3 / 2)
         .N(class00869.PF, var2 * 3 / 2)
         .N(class00869.PC, var2 * 3 / 2)
         .N(class00869.PS, var2 * 3 / 2)
         .N(class00869.Ph, var2 * 3 / 2)
         .N(class00869.TL, var2 * 3 / 2)
         .N(class00869.vS, var2 / 2)
         .N(class00869.vx, var2 / 2)
         .N(class00869.NM, var2 * 3 / 2)
         .N(class00869.nN, var2 / 2);
      class03530 class03530 = class01226.yE;
      Operation operation = var0x -> {
         WrapOperationRuntime.checkArgumentCount(var0x, 2, "[net.minecraft.class_9895$class_9896, net.minecraft.class_6862]");
         return ((class09882)var0x[0]).N((class03530<class06581>)var0x[1]);
      };
      LocalRefImpl localrefimpl = new LocalRefImpl();
      LocalRefImpl localrefimpl1 = new LocalRefImpl();
      LocalIntRefImpl localintrefimpl = new LocalIntRefImpl();
      localrefimpl.init(var0);
      localrefimpl1.init(var1);
      localintrefimpl.init(var2);
      class09882 = N(class09882, class03530, operation, localrefimpl, localrefimpl1, localintrefimpl);
      var2 = localintrefimpl.dispose();
      var1 = (class03767)localrefimpl1.dispose();
      var0 = (class01929)localrefimpl.dispose();
      class02755 class02755 = class09882.N();
      N(var0, var1, var2, null);
      return class02755;
   }
}
