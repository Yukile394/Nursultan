package minecraft;

import Nursultan.class09399;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import it.unimi.dsi.fastutil.objects.Reference2ObjectOpenHashMap;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Consumer;
import net.caffeinemc.mods.sodium.client.render.frapi.mesh.MutableMeshImpl;
import net.caffeinemc.mods.sodium.client.render.frapi.render.QuadToPosPipe;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.FabricRenderState;
import net.fabricmc.fabric.api.client.rendering.v1.RenderStateDataKey;
import net.irisshaders.iris.mixinterface.ItemContextState;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(EnvType.CLIENT)
public class class08898 implements FabricRenderState, ItemContextState {
   class03662 N = class03662.field_4315;
   private int L;
   private boolean u;
   private boolean i;
   @Nullable
   private class00734 R;
   public class08931[] y = new class08931[]{new class08931(this)};
   @Nullable
   private Map M;
   private class06581 B;
   private class01894 Z;

   public void L() {
      this.u = true;
   }

   public class00734 M() {
      if (this.R != null) {
         return this.R;
      } else {
         class09399 class09399 = new class09399();
         this.N(class09399::N);
         class00734 class00734 = class09399.N();
         this.R = class00734;
         return class00734;
      }
   }

   public void setData(RenderStateDataKey var1, Object var2) {
      if (this.M == null) {
         this.M = new Reference2ObjectOpenHashMap();
      }

      this.M.put(var1, var2);
   }

   public class08898() {
      super();
   }

   public boolean B() {
      return this.i;
   }

   private class08931 Z() {
      return this.y[0];
   }

   public boolean i() {
      return this.L == 0;
   }

   public boolean u() {
      return this.u;
   }

   public void y() {
      this.y(null);
      this.N = class03662.field_4315;

      for (int ix = 0; ix < this.L; ix++) {
         this.y[ix].N();
      }

      this.L = 0;
      this.u = false;
      this.i = false;
      this.R = null;
      this.N(null);
   }

   private void y(CallbackInfo var1) {
      this.B = null;
      this.Z = null;
   }

   public void N(boolean var1) {
      this.i = var1;
   }

   public void N(int var1) {
      int ix = this.y.length;
      int j = this.L + var1;
      if (j > ix) {
         this.y = Arrays.copyOf(this.y, j);

         for (int k = ix; k < j; k++) {
            this.y[k] = new class08931(this);
         }
      }
   }

   private void N(CallbackInfo var1) {
      this.clearExtraData();
   }

   public void N(Object var1) {
   }

   private void N(Consumer var1, CallbackInfo var2, Vector3f var3, class08931 var4, Matrix4f var5, LocalRef var6) {
      MutableMeshImpl mutablemeshimpl = var4.fabric_getMutableMesh();
      if (mutablemeshimpl.size() > 0) {
         QuadToPosPipe quadtopospipe = (QuadToPosPipe)var6.get();
         if (quadtopospipe == null) {
            quadtopospipe = new QuadToPosPipe(var1, var3);
            var6.set(quadtopospipe);
         }

         quadtopospipe.matrix = var5;
         mutablemeshimpl.forEachMutable(quadtopospipe);
      }
   }

   public void N(Consumer<Vector3fc> var1) {
      LocalRefImpl localrefimpl = new LocalRefImpl();
      localrefimpl.init(null);
      Vector3f vector3f = new Vector3f();
      class01423 class01423 = new class01423();

      for (int ix = 0; ix < this.L; ix++) {
         class08931 class08931 = this.y[ix];
         class08931.u.N(this.N.L(), class01423);
         Matrix4f matrix4f = class01423.N();

         for (Vector3fc vector3fc : class08931.i.get()) {
            var1.accept(vector3f.set(vector3fc).mulPosition(matrix4f));
         }

         this.N(var1, null, vector3f, class08931, matrix4f, localrefimpl);
         class01423.L();
      }
   }

   @Nullable
   public class08388 N(class06069 var1) {
      return this.L == 0 ? null : this.y[var1.y(this.L)].L;
   }

   public class08931 N() {
      this.N(1);
      return this.y[this.L++];
   }

   public void N(class01421 var1, class01237 var2, int var3, int var4, int var5) {
      for (int ix = 0; ix < this.L; ix++) {
         this.y[ix].N(var1, var2, var3, var4, var5);
      }
   }

   @Nullable
   public Object getData(RenderStateDataKey var1) {
      return this.M == null ? null : this.M.get(var1);
   }

   public class06581 getDisplayItem() {
      return this.B;
   }

   public void clearExtraData() {
      if (this.M != null) {
         this.M.clear();
      }
   }

   public Object getDataOrDefault(RenderStateDataKey var1, Object var2) {
      return this.M == null ? var2 : this.M.getOrDefault(var1, var2);
   }

   public boolean R() {
      return this.Z().y;
   }

   public void setDisplayItem(class06581 var1, class01894 var2) {
      this.B = var1;
      this.Z = var2;
   }

   public class01894 getDisplayItemModel() {
      return this.Z;
   }
}
