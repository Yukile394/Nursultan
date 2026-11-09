package minecraft;

import Nursultan.class09956;
import com.mojang.serialization.MapCodec;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import it.unimi.dsi.fastutil.objects.Reference2ObjectArrayMap;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Stream;
import net.caffeinemc.mods.lithium.common.ai.pathing.BlockStatePathingCache;
import net.caffeinemc.mods.lithium.common.block.BlockStateFlagHolder;
import net.caffeinemc.mods.lithium.common.block.BlockStateFlags;
import net.caffeinemc.mods.lithium.common.block.TrackedBlockStatePredicate;
import net.caffeinemc.mods.lithium.common.initialization.BlockInfoInitializer;
import net.caffeinemc.mods.lithium.common.world.blockview.SingleBlockBlockView;
import net.caffeinemc.mods.lithium.common.world.blockview.SingleBlockBlockView.SingleBlockViewException;
import net.fabricmc.fabric.api.event.player.BlockEvents;
import net.fabricmc.fabric.api.event.player.BlockEvents.UseItemOnCallback;
import net.fabricmc.fabric.api.event.player.BlockEvents.UseWithoutItemCallback;
import net.fabricmc.fabric.impl.content.registry.OxidizableBlocksRegistryImpl.RandomTickCacheRefresher;
import net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import org.apache.commons.lang3.Validate;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public abstract class class01339 extends class00522<class00891, class00500> implements BlockStatePathingCache, BlockStateFlagHolder, RandomTickCacheRefresher {
   private static final class07211[] N = class07211.values();
   private static final class00494[] B = class07536.N(new class00494[N.length], var0 -> Arrays.fill(var0, class00389.N()));
   private static final class00494[] Z = class07536.N(new class00494[N.length], var0 -> Arrays.fill(var0, class00389.y()));
   private final int z;
   private final boolean U;
   private final boolean E;
   private final boolean W;
   @Deprecated
   private final boolean m;
   @Deprecated
   private boolean P;
   private final class04641 s;
   private final class04689 T;
   private final float b;
   private final boolean j;
   private final boolean v;
   private final class01340 n;
   private final class01340 t;
   private final class01340 G;
   private final class01340 l;
   private final class01340 d;
   @Nullable
   private final class01351 w;
   private final boolean k;
   private final class08089 Y;
   private final boolean Q;
   @class09956(
      N = "cache",
      y = "field_23166"
   )
   @Nullable
   public class01369 M;
   private class04688 O;
   private boolean g;
   private boolean I;
   private class00494 J;
   private class00494[] o;
   private boolean q;
   private int K;
   private class04425 V = null;
   private class04425 e = null;
   private int H = -1;

   public Stream<class03530<class00891>> w() {
      return this.i().s().L();
   }

   public class00494 L(class07290 var1, class07209 var2, class06092 var3) {
      return this.i().L(this.N(), var1, var2, var3);
   }

   public boolean L(class07290 var1, class07209 var2, class07211 var3) {
      return this.N(var1, var2, var3, class01020.field_25822);
   }

   public float L(class07290 var1, class07209 var2) {
      float f;
      float f1 = f = this.i().y(this.N(), var1, var2);
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, f);
      this.N(var1, var2, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? callbackinforeturnable.getReturnValueF() : f1;
   }

   public class00494 M(class07290 var1, class07209 var2) {
      return this.M != null ? this.M.N : this.y(var1, var2, class06092.N());
   }

   @Deprecated
   public boolean M() {
      class00891 class00891 = this.i();
      return class00891 != class00869.yw && class00891 != class00869.mS && this.B();
   }

   public boolean P() {
      return this.E;
   }

   @Deprecated
   public boolean T() {
      return this.m;
   }

   public boolean Q() {
      return this.g;
   }

   public class01339(class00891 var1, Reference2ObjectArrayMap<class08092<?>, Comparable<?>> var2, MapCodec<class00500> var3) {
      super(var1, var2, var3);
      this.O = class04684.N.M();
      class01362 class01362 = var1.X;
      this.z = class01362.i.applyAsInt(this.N());
      this.U = var1.a_(this.N());
      this.E = class01362.m;
      this.W = class01362.P;
      this.m = class01362.s;
      this.s = class01362.j;
      this.T = class01362.y.apply(this.N());
      this.b = class01362.M;
      this.j = class01362.B;
      this.v = class01362.W;
      this.n = class01362.l;
      this.t = class01362.d;
      this.G = class01362.w;
      this.l = class01362.k;
      this.d = class01362.Y;
      this.w = class01362.g;
      this.k = class01362.v;
      this.Y = class01362.n;
      this.Q = class01362.t;
   }

   @Deprecated
   public boolean B() {
      return this.P;
   }

   public class00494 B(class07290 var1, class07209 var2) {
      return this.i().u(this.N(), var1, var2);
   }

   public class08089 I() {
      return this.Y;
   }

   public boolean J() {
      return this.i() instanceof class07027 && ProtocolTranslator.getTargetVersion().olderThan(ProtocolVersion.v1_14) ? true : this.j;
   }

   public class00494 Z(class07290 var1, class07209 var2) {
      return this.i().b_(this.N(), var1, var2);
   }

   public boolean Z() {
      return this.q;
   }

   public float i(class07290 var1, class07209 var2) {
      float f;
      float f1 = f = this.b;
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true, f);
      this.y(var1, var2, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? callbackinforeturnable.getReturnValueF() : f1;
   }

   public class00891 i() {
      return this.u;
   }

   public class06898 b() {
      return this.i().d_(this.N());
   }

   public boolean s() {
      return this.W;
   }

   public class04641 n() {
      return this.s;
   }

   public boolean l() {
      return this.w != null;
   }

   public boolean d() {
      return this.Q;
   }

   public int m() {
      return this.z;
   }

   private boolean o() {
      if (this.u.X.b) {
         return true;
      } else if (this.u.X.T) {
         return false;
      } else if (this.M == null) {
         return false;
      } else {
         class00494 class00494 = this.M.N;
         if (class00494.method_1110()) {
            return false;
         } else {
            class00734 class00734 = class00494.method_1107();
            return class00734.N() >= 0.7291666666666666 ? true : class00734.L() >= 1.0;
         }
      }
   }

   public boolean k() {
      return this.i() instanceof class07190;
   }

   public boolean t() {
      return this.I;
   }

   public boolean g() {
      return this.k;
   }

   public boolean v() {
      return this.i().N(this.N());
   }

   public boolean j() {
      return this.i().i_(this.N());
   }

   private int q() {
      if (!BlockStateFlags.ENABLED) {
         throw new IllegalStateException("Tried to access block state flags even though the feature is disabled!");
      } else {
         BlockInfoInitializer.initializeBlockInfo();
         if (this.H == -1) {
            throw new IllegalStateException("Could not initialize block state flags for " + this);
         } else {
            return this.H;
         }
      }
   }

   public class00494 U() {
      return this.J;
   }

   public boolean U(class07290 var1, class07209 var2) {
      return this.G.test(this.N(), var1, var2);
   }

   public int z() {
      return this.K;
   }

   public boolean z(class07290 var1, class07209 var2) {
      return this.t.test(this.N(), var1, var2);
   }

   public void u() {
      this.O = this.u.u(this.N());
      this.g = this.u.e_(this.N());
      if (!this.i().m()) {
         this.M = new class01369(this.N());
      }

      this.P = this.o();
      this.J = this.v ? this.u.z(this.N()) : class00389.N();
      this.I = class00891.N(this.J);
      if (this.J.method_1110()) {
         this.o = B;
      } else if (this.I) {
         this.o = Z;
      } else {
         this.o = new class00494[N.length];
         int i = N.length;

         for (int jx = 0; jx < i; jx++) {
            class07211 class07211 = N[jx];
            this.o[class07211.ordinal()] = this.J.method_20538(class07211);
         }
      }

      this.q = this.u.y(this.N());
      this.K = this.u.b_(this.N());
   }

   public boolean u(class07290 var1, class07209 var2) {
      return this.n.test(this.N(), var1, var2);
   }

   public boolean y(class07290 var1, class07209 var2) {
      return this.d.test(this.N(), var1, var2);
   }

   public final boolean y(class07290 var1, class07209 var2, class07049 var3) {
      return this.N(var1, var2, var3, class07211.field_11036);
   }

   public void y(class04782 var1, class07209 var2, class06069 var3) {
      this.i().y_2(this.N(), var1, var2, var3);
   }

   public long y(class07209 var1) {
      return this.i().N(this.N(), var1);
   }

   public void y(class07284 var1, class07209 var2, int var3, int var4) {
      this.i().N(this.N(), var1, var2, var3, var4);
   }

   public final void y(class07284 var1, class07209 var2, int var3) {
      this.y(var1, var2, var3, 512);
   }

   public class00494 y(class07290 var1, class07209 var2, class06092 var3) {
      return this.i().y_4(this.N(), var1, var2, var3);
   }

   public int y(class07290 var1, class07209 var2, class07211 var3) {
      return this.i().y(this.N(), var1, var2, var3);
   }

   private void y(class07290 var1, class07209 var2, CallbackInfoReturnable var3) {
      class00891 class00891 = this.i();
      if (class00891.equals(class00869.Et) || class00891.equals(class00869.Pn) || class00891.equals(class00869.PM) || class00891.equals(class00869.Pc)) {
         if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_14_4)) {
            var3.setReturnValue(0.8F);
         }
      } else if (class00891.equals(class00869.yq) || class00891.equals(class00869.yd) || class00891.equals(class00869.yK)) {
         if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_15_2)) {
            var3.setReturnValue(0.5F);
         }
      } else if (class00891 instanceof class07137) {
         if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_12_2)) {
            var3.setReturnValue(0.75F);
         } else if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_16_4)) {
            var3.setReturnValue(0.0F);
         }
      } else if (class00891.equals(class00869.LV) && ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(LegacyProtocolVersion.b1_8tob1_8_1)) {
         var3.setReturnValue(10.0F);
      }
   }

   public boolean E() {
      return this.M == null || this.M.y;
   }

   public boolean E(class07290 var1, class07209 var2) {
      return this.l.test(this.N(), var1, var2);
   }

   public boolean N(class03530<class00891> var1, Predicate<class01339> var2) {
      return this.N(var1) && var2.test(this);
   }

   public boolean N(class03543<class00891> var1) {
      return var1.N(this.i().s());
   }

   public boolean N(class03556<class00891> var1) {
      return this.N((class00891)var1.N());
   }

   public boolean N(class00500 var1) {
      return this.i().i(var1);
   }

   @Nullable
   public <T extends class00394> class01118<T> N(class07299 var1, class00404<T> var2) {
      return this.i() instanceof class07190 ? ((class07190)this.i()).N(var1, this.N(), var2) : null;
   }

   public boolean N(class05487 var1, class07209 var2) {
      return this.i().a_(this.N(), var1, var2);
   }

   @Nullable
   public class06237 N(class07299 var1, class07209 var2) {
      return this.i().N(this.N(), var1, var2);
   }

   public boolean N(class03530<class00891> var1) {
      return this.i().s().N(var1);
   }

   public class04689 N(class07290 var1, class07209 var2) {
      return this.T;
   }

   public void N(class04782 var1, class07209 var2, class07307 var3, BiConsumer<class06584, class07209> var4) {
      this.i().N(this.N(), var1, var2, var3, var4);
   }

   public void N(class07299 var1, class00500 var2, class06183 var3, class08005 var4) {
      this.i().N(var1, var2, var3, var4);
   }

   public class00494 N(class07211 var1) {
      return this.o[var1.ordinal()];
   }

   public boolean N(class07290 var1, class07209 var2, class07211 var3, class01020 var4) {
      return this.M != null ? this.M.N(var3, var4) : var4.N(this.N(), var1, var2, var3);
   }

   public class06584 N(class05487 var1, class07209 var2, boolean var3) {
      return this.i().N(var1, var2, this.N(), var3);
   }

   protected abstract class00500 N();

   public boolean N(class07290 var1, class07209 var2, class07078<?> var3) {
      return this.i().X.G.test(this.N(), var1, var2, var3);
   }

   public boolean N(class00891 var1) {
      return this.i() == var1;
   }

   public boolean N(class05946<class00891> var1) {
      return this.i().s().N(var1);
   }

   private void N(class07299 var1, class08036 var2, class06183 var3, CallbackInfoReturnable var4) {
      class07082 class07082 = ((UseWithoutItemCallback)BlockEvents.USE_WITHOUT_ITEM.invoker()).useWithoutItem(this.N(), var1, var3.u(), var2, var3);
      if (class07082 != null) {
         var4.setReturnValue(class07082);
      }
   }

   private void N(class06584 var1, class07299 var2, class08036 var3, class07050 var4, class06183 var5, CallbackInfoReturnable var6) {
      class07082 class07082 = ((UseItemOnCallback)BlockEvents.USE_ITEM_ON.invoker()).useItemOn(var1, this.N(), var2, var5.u(), var3, var4, var5);
      if (class07082 != null) {
         var6.setReturnValue(class07082);
      }
   }

   public void N(class07290 var1, class07209 var2, CallbackInfoReturnable var3) {
      float f = (Float)var3.getReturnValue();
      float f1 = WorldRenderingSettings.INSTANCE.getAmbientOcclusionLevel();
      var3.setReturnValue(1.0F - f1 * (1.0F - f));
   }

   public void N(class07299 var1, class07209 var2, class00891 var3, @Nullable class02733 var4, boolean var5) {
      this.i().N(this.N(), var1, var2, var3, var4, var5);
   }

   public float N(class08036 var1, class07290 var2, class07209 var3) {
      return this.i().N(this.N(), var1, var2, var3);
   }

   public boolean N(class07299 var1, class07209 var2, int var3, int var4) {
      return this.i().N(this.N(), var1, var2, var3, var4);
   }

   public class00500 N(class07111 var1) {
      return this.i().N(this.N(), var1);
   }

   public void N(class04782 var1, class07209 var2, boolean var3) {
      this.i().N(this.N(), var1, var2, var3);
   }

   public void N(class07299 var1, class07209 var2, class00500 var3, boolean var4) {
      this.i().N_23(this.N(), var1, var2, var3, var4);
   }

   public final void N(class07284 var1, class07209 var2, int var3, int var4) {
      class07218 class07218 = new class07218();
      int i = class01354.g.length;

      for (int jx = 0; jx < i; jx++) {
         class07211 class07211 = class01354.g[jx];
         class07218.N(var2, class07211);
         var1.method_42308(class07211.b(), class07218, var2, this.N(), var3, var4);
      }
   }

   public final void N(class07284 var1, class07209 var2, int var3) {
      this.N(var1, var2, var3, 512);
   }

   public class00494 N(class07290 var1, class07209 var2, class07049 var3) {
      return this.i().N(this.N(), var1, var2, var3);
   }

   public int N(class07299 var1, class07209 var2, class07211 var3) {
      return this.i().N_24(this.N(), var1, var2, var3);
   }

   public class00494 N(class07290 var1, class07209 var2, class06092 var3) {
      return this.i().N(this.N(), var1, var2, var3);
   }

   public boolean N(class00500 var1, class07211 var2) {
      return this.i().y(this.N(), var1, var2);
   }

   public int N(class07290 var1, class07209 var2, class07211 var3) {
      return this.i().N_8(this.N(), var1, var2, var3);
   }

   public final boolean N(class07290 var1, class07209 var2, class07049 var3, class07211 var4) {
      return class00891.N(this.y(var1, var2, class06092.N(var3)), var4);
   }

   public class06889 N(class07209 var1) {
      class01351 class01351 = this.w;
      return class01351 != null ? class01351.evaluate(this.N(), var1) : class06889.L;
   }

   public List<class06584> N(class04160 var1) {
      return this.i().N(this.N(), var1);
   }

   public class07082 N(class06584 var1, class07299 var2, class08036 var3, class07050 var4, class06183 var5) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, var4, var5, callbackinforeturnable);
      return callbackinforeturnable.isCancelled()
         ? (class07082)callbackinforeturnable.getReturnValue()
         : this.i().N(var1, this.N(), var2, var5.u(), var3, var4, var5);
   }

   public class07082 N(class07299 var1, class08036 var2, class06183 var3) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, var3, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (class07082)callbackinforeturnable.getReturnValue() : this.i().N(this.N(), var1, var3.u(), var2, var3);
   }

   public void N(class07299 var1, class07209 var2, class08036 var3) {
      this.i().a_(this.N(), var1, var2, var3);
   }

   public class00500 N(class05487 var1, class08713 var2, class07209 var3, class07211 var4, class07209 var5, class00500 var6, class06069 var7) {
      return this.i().N(this.N(), var1, var2, var3, var4, var5, var6, var7);
   }

   public boolean N(class08791 var1) {
      return this.i().N(this.N(), var1);
   }

   public void N(class04782 var1, class07209 var2, class06069 var3) {
      this.i().N(this.N(), var1, var2, var3);
   }

   public class00500 N(class06993 var1) {
      return this.i().N(this.N(), var1);
   }

   public boolean N(class04651 var1) {
      return this.i().N(this.N(), var1);
   }

   public boolean N(class06942 var1) {
      return this.i().N(this.N(), var1);
   }

   public void N(class07299 var1, class07209 var2, class07049 var3, class08400 var4, boolean var5) {
      this.i().N(this.N(), var1, var2, var3, var4, var5);
   }

   public void N(class04782 var1, class07209 var2, class06584 var3, boolean var4) {
      this.i().N(this.N(), var1, var2, var3, var4);
   }

   public boolean W(class07290 var1, class07209 var2) {
      return this.M != null ? this.M.L : this.i().a_(this.N(), var1, var2);
   }

   public boolean W() {
      return this.U;
   }

   public class00494 R(class07290 var1, class07209 var2) {
      return this.N(var1, var2, class06092.N());
   }

   public class03556<class00891> R() {
      return this.u.s();
   }

   public class07752 O() {
      return this.i().j(this.N());
   }

   public boolean G() {
      return this.v;
   }

   public class04688 Y() {
      return this.O;
   }

   public void lithium$initializePathNodeTypeCache() {
      this.V = null;
      this.e = null;
      SingleBlockBlockView singleblockblockview = SingleBlockBlockView.of(this.N(), class07209.field_10980);

      try {
         this.V = (class04425)Validate.notNull(class07955.y(singleblockblockview, class07209.field_10980), "Block has no common path node type!", new Object[0]);
      } catch (ClassCastException | SingleBlockViewException singleblockviewexception1) {
         this.V = null;
      }

      try {
         this.e = class07955.N(new class02682(singleblockblockview, null), 1, 1, 1, null);
         if (this.e == null) {
            this.e = class04425.field_7;
         }
      } catch (NullPointerException | ClassCastException | SingleBlockViewException singleblockviewexception) {
         this.e = null;
      }
   }

   public void lithium$initializeFlags() {
      TrackedBlockStatePredicate.FULLY_INITIALIZED.set(true);
      int i = 0;

      for (int jx = 0; jx < BlockStateFlags.FLAGS.length; jx++) {
         if (BlockStateFlags.FLAGS[jx].test((class00500)this)) {
            i |= 1 << jx;
         }
      }

      this.H = i;
   }

   public int lithium$getAllFlags() {
      int i = this.H;
      if (i == -1) {
         i = this.q();
      }

      return i;
   }

   public class04425 lithium$getPathNodeType() {
      return this.V;
   }

   public void fabric_api$refreshRandomTickCache() {
      this.g = this.u.callHasRandomTicks(this.N());
   }

   public class04425 lithium$getNeighborPathNodeType() {
      return this.e;
   }
}
