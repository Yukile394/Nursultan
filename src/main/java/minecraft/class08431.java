package minecraft;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.logging.LogUtils;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.renderer.v1.mesh.MutableQuadView;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadAtlas;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadEmitter;
import net.fabricmc.fabric.api.renderer.v1.mesh.QuadView;
import net.fabricmc.fabric.api.renderer.v1.model.MeshBakedGeometry;
import net.fabricmc.fabric.api.util.TriState;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
public record class08431(class08496 quads, boolean useAmbientOcclusion, class08388 particleIcon) implements class08877 {
   private static final Logger u = LogUtils.getLogger();

   @Override
   public class08388 L() {
      return this.particleIcon;
   }

   public class08431(class08496 quads, boolean useAmbientOcclusion, class08388 particleIcon) {
      super();
      this.quads = quads;
      this.useAmbientOcclusion = useAmbientOcclusion;
      this.particleIcon = particleIcon;
   }

   @Override
   public boolean y() {
      return this.useAmbientOcclusion;
   }

   private static void N(class02028 var0, class01894 var1, class04673 var2, CallbackInfoReturnable var3, class08496 var4, LocalRef var5) {
      if (var4 instanceof MeshBakedGeometry) {
         ((MeshBakedGeometry)var4).getMesh().forEach(var2x -> {
            if (var2x.atlas() != QuadAtlas.BLOCK) {
               Object object = (Multimap)var5.get();
               if (object == null) {
                  object = HashMultimap.create();
                  var5.set(object);
               }

               class08388 class08388 = var0.y().spriteFinder(var2x.atlas()).find(var2x);
               object.put(class08388.method_45852(), class08388.method_45851().method_45816());
            }
         });
      }
   }

   public class08496 N() {
      return this.quads;
   }

   @Override
   public List<class02022> N(@Nullable class07211 var1) {
      return this.quads.method_68049(var1);
   }

   public static class08877 N(class02028 var0, class01894 var1, class04673 var2) {
      class08529 class08529 = var0.N(var1);
      class08838 class08838 = class08529.B();
      boolean flag = class08529.u();
      class08388 class08388x = class08529.N(class08838, var0);
      class08496 class08496 = class08529.N(class08838, var0, var2);
      Object object = null;
      LocalRefImpl localrefimpl = new LocalRefImpl();
      localrefimpl.init(object);
      N(var0, var1, var2, null, class08496, localrefimpl);
      object = (Multimap)localrefimpl.dispose();
      Iterator<class02022> iterator = class08496.method_68048().iterator();

      while (iterator.hasNext()) {
         class08388 class08388x = iterator.next().E();
         if (!class08388x.method_45852().equals(class08626.N)) {
            if (object == null) {
               object = HashMultimap.create();
            }

            object.put(class08388x.method_45852(), class08388x.method_45851().method_45816());
         }
      }

      if (object != null) {
         u.warn("Rejecting block model {}, since it contains sprites from outside of supported atlas: {}", var1, object);
         return var0.N();
      } else {
         return new class08431(class08496, flag, class08388x);
      }
   }

   @Override
   public void emitQuads(QuadEmitter var1, Predicate var2) {
      if (this.quads instanceof MeshBakedGeometry meshbakedgeometry) {
         if (this.useAmbientOcclusion) {
            meshbakedgeometry.getMesh().outputTo(var1);
         } else {
            var1.pushTransform(var0 -> {
               if (var0.ambientOcclusion() == TriState.DEFAULT) {
                  var0.ambientOcclusion(TriState.FALSE);
               }

               return true;
            });
            meshbakedgeometry.getMesh().outputTo(var1);
            var1.popTransform();
         }
      } else {
         class08877.super.emitQuads(var1, var2);
      }
   }
}
