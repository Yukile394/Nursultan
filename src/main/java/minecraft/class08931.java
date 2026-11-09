package minecraft;

import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalIntRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalIntRef;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import net.caffeinemc.mods.sodium.client.render.frapi.mesh.MutableMeshImpl;
import net.caffeinemc.mods.sodium.client.render.frapi.render.AccessLayerRenderState;
import net.caffeinemc.mods.sodium.client.render.frapi.render.OrderedSubmitNodeCollectorExtension;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.FabricRenderState;
import net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey;
import net.fabricmc.fabric.api.renderer.v1.render.FabricLayerRenderState;
import net.fabricmc.fabric.api.renderer.v1.render.ItemRenderTypeGetter;
import net.irisshaders.iris.shaderpack.materialmap.NamespacedId;
import net.irisshaders.iris.shaderpack.materialmap.WorldRenderingSettings;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
public class class08931 implements AccessLayerRenderState, FabricRenderState, FabricLayerRenderState {
   private static final Vector3fc[] M = new Vector3fc[0];
   public static final Supplier<Vector3fc[]> N = () -> M;
   private final List<class02022> B;
   boolean y;
   @Nullable
   class08388 L;
   class03265 u;
   @Nullable
   private class07311 Z;
   private class08915 z;
   private int[] U;
   @Nullable
   private class00368<Object> E;
   @Nullable
   private Object W;
   Supplier<Vector3fc[]> i;
   @Nullable
   private Map m;
   private class08898 P;
   private final MutableMeshImpl s;
   private ItemRenderTypeGetter T;

   public void setData(RenderStateDataKey var1, Object var2) {
      if (this.m == null) {
         this.m = new Reference2ObjectOpenHashMap();
      }

      this.m.put(var1, var2);
   }

   public class08931(class08898 var1) {
      super();
      this.R = var1;
      this.s = new MutableMeshImpl();
      this.T = null;
      this.B = new ArrayList<>();
      this.u = class03265.N;
      this.z = class08915.field_55341;
      this.U = new int[0];
      this.i = N;
      this.N(var1, null);
   }

   private void y(class01421 var1, class01237 var2, int var3, int var4, int var5, CallbackInfo var6, LocalIntRef var7) {
      CapturedRenderingState.INSTANCE.setCurrentBlockEntity(var7.get());
      CapturedRenderingState.INSTANCE.setCurrentRenderedItem(0);
   }

   private void y(CallbackInfo var1) {
      this.s.clear();
      this.T = null;
   }

   public List<class02022> y() {
      return this.B;
   }

   public void N() {
      this.B.clear();
      this.Z = null;
      this.z = class08915.field_55341;
      this.E = null;
      this.W = null;
      Arrays.fill(this.U, -1);
      this.y = false;
      this.L = null;
      this.u = class03265.N;
      this.i = N;
      this.N(null);
      this.y(null);
   }

   private void N(class01237 var1, class01421 var2, class03662 var3, int var4, int var5, int var6, int[] var7, List var8, class07311 var9, class08915 var10) {
      if (this.s.size() > 0 && var1 instanceof OrderedSubmitNodeCollectorExtension) {
         ((OrderedSubmitNodeCollectorExtension)var1).fabric_submitItem(var2, var3, var4, var5, var6, var7, var8, var9, var10, this.s, this.T);
      } else {
         var1.N(var2, var3, var4, var5, var6, var7, var8, var9, var10);
      }
   }

   public void N(boolean var1) {
      this.y = var1;
   }

   public void N(Supplier<Vector3fc[]> var1) {
      this.i = var1;
   }

   private void N(class06581 var1, class01894 var2) {
      if (WorldRenderingSettings.INSTANCE.getItemIds() != null) {
         if (var1 instanceof class06918 class06918 && !(var1 instanceof class04810)) {
            if (WorldRenderingSettings.INSTANCE.getBlockStateIds() == null) {
               return;
            }

            CapturedRenderingState.INSTANCE.setCurrentBlockEntity(1);
            CapturedRenderingState.INSTANCE.setCurrentRenderedItem(WorldRenderingSettings.INSTANCE.getBlockStateIds().getOrDefault(class06918.L().W(), 0));
         } else {
            class01894 class01894 = var2 != null ? var2 : class04206.B.y(var1);
            CapturedRenderingState.INSTANCE
               .setCurrentRenderedItem(WorldRenderingSettings.INSTANCE.getItemIds().applyAsInt(new NamespacedId(class01894.y(), class01894.N())));
         }
      }
   }

   private void N(class01421 var1, class01237 var2, int var3, int var4, int var5, CallbackInfo var6, LocalIntRef var7) {
      var7.set(CapturedRenderingState.INSTANCE.getCurrentRenderedBlockEntity());
      this.N(this.P.getDisplayItem(), this.P.getDisplayItemModel());
   }

   private void N(class08898 var1, CallbackInfo var2) {
      this.P = var1;
   }

   private void N(CallbackInfo var1) {
      this.clearExtraData();
   }

   public void N(class08915 var1) {
      this.z = var1;
   }

   private static class00368<Object> N(class00368<?> var0) {
      return var0;
   }

   public <T> void N(class00368<T> var1, @Nullable T var2) {
      this.E = N(var1);
      this.W = var2;
   }

   public void N(class03265 var1) {
      this.u = var1;
   }

   public void N(class08388 var1) {
      this.L = var1;
   }

   void N(class01421 var1, class01237 var2, int var3, int var4, int var5) {
      LocalIntRefImpl localintrefimpl = new LocalIntRefImpl();
      localintrefimpl.init(0);
      this.N(var1, var2, var3, var4, var5, null, localintrefimpl);
      var1.N();
      this.u.N(this.R.N.L(), var1.L());
      if (this.E != null) {
         this.E.N(this.W, this.R.N, var1, var2, var3, var4, this.z != class08915.field_55341, var5);
      } else if (this.Z != null) {
         class08915 class08915 = this.z;
         class07311 class07311 = this.Z;
         List<class02022> list = this.B;
         int[] aint = this.U;
         class03662 class03662 = this.R.N;
         this.N(var2, var1, class03662, var3, var4, var5, aint, list, class07311, class08915);
      }

      var1.y();
      this.y(var1, var2, var3, var4, var5, null, localintrefimpl);
   }

   public int[] N(int var1) {
      if (var1 > this.U.length) {
         this.U = new int[var1];
         Arrays.fill(this.U, -1);
      }

      return this.U;
   }

   public void N(class07311 var1) {
      this.Z = var1;
   }

   @Nullable
   public Object getData(RenderStateDataKey var1) {
      return this.m == null ? null : this.m.get(var1);
   }

   public void clearExtraData() {
      if (this.m != null) {
         this.m.clear();
      }
   }

   public Object getDataOrDefault(RenderStateDataKey var1, Object var2) {
      return this.m == null ? var2 : this.m.getOrDefault(var1, var2);
   }

   public void fabric_setRenderTypeGetter(ItemRenderTypeGetter var1) {
      this.T = var1;
   }

   public MutableMeshImpl fabric_getMutableMesh() {
      return this.s;
   }
}
