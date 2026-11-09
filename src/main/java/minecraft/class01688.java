package minecraft;

import baritone.utils.accessor.IChunkArray;
import baritone.utils.accessor.IClientChunkProvider;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Map;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import jerozgen.languagereload.mixin.ClientChunkManagerAccessor;
import net.caffeinemc.mods.sodium.client.render.chunk.map.ChunkTrackerHolder;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents.Load;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientChunkEvents.Unload;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(EnvType.CLIENT)
public class class01688 extends class00558 implements IClientChunkProvider, ClientChunkManagerAccessor {
   static final Logger N = LogUtils.getLogger();
   private final class00570 u;
   private final class05795 i;
   volatile class01705 y;
   final class03448 L;

   @Override
   public class05795 L() {
      return this.i;
   }

   public class01688(class03448 var1, int var2) {
      super();
      this.L = var1;
      this.u = new class00561(var1, new class07321(0, 0), var1.method_30349().L(class04227.NA).y(class00795.y));
      this.i = new class05795(this, true, var1.method_8597().i());
      this.y = new class01705(this, y(var2));
   }

   @Override
   public class07290 i() {
      return this.L;
   }

   public void u(int var1, int var2) {
      this.y.u = var1;
      this.y.i = var2;
   }

   @Override
   public int y() {
      return this.y.R;
   }

   private void y(int var1, int var2, class00667 var3, Map var4, Consumer var5, CallbackInfoReturnable var6) {
      ChunkTrackerHolder.get(this.L).onChunkStatusAdded(var1, var2, 1);
   }

   private static int y(int var0) {
      return Math.max(2, var0) + 3;
   }

   @Nullable
   public class00570 N(int var1, int var2, class00549 var3, boolean var4) {
      if (this.y.y(var1, var2)) {
         class00570 class00570 = this.y.N(this.y.N(var1, var2));
         if (N(class00570, var1, var2)) {
            return class00570;
         }
      }

      return var4 ? this.u : null;
   }

   @Override
   public void N(int var1, int var2, int var3, boolean var4) {
      this.y.N(var1, var2, var3, var4);
   }

   private void N(class07321 var1, CallbackInfo var2) {
      ChunkTrackerHolder.get(this.L).onChunkStatusRemoved(var1.B, var1.Z, 1);
   }

   private void N(int var1, CallbackInfo var2, class01705 var3, class00570 var4, class07321 var5) {
      if (!var3.y(var5.B, var5.Z)) {
         ((Unload)ClientChunkEvents.CHUNK_UNLOAD.invoker()).onChunkUnload(this.L, var4);
      }
   }

   private void N(class07321 var1, CallbackInfo var2, class00570 var3) {
      ((Unload)ClientChunkEvents.CHUNK_UNLOAD.invoker()).onChunkUnload(this.L, var3);
   }

   private void N(int var1, int var2, class00667 var3, Map var4, Consumer var5, CallbackInfoReturnable var6, class00570 var7) {
      if (var7 != null) {
         ((Unload)ClientChunkEvents.CHUNK_UNLOAD.invoker()).onChunkUnload(this.L, var7);
      }
   }

   private void N(int var1, int var2, class00667 var3, Map var4, Consumer var5, CallbackInfoReturnable var6) {
      ((Load)ClientChunkEvents.CHUNK_LOAD.invoker()).onChunkLoad(this.L, (class00570)var6.getReturnValue());
   }

   public void N(class07321 var1) {
      if (this.y.y(var1.B, var1.Z)) {
         int ix = this.y.N(var1.B, var1.Z);
         class00570 class00570 = this.y.N(ix);
         if (N(class00570, var1.B, var1.Z)) {
            class01705 class01705 = this.y;
            this.N(var1, null, class00570);
            class01705.y(ix, class00570);
            this.N(var1, null);
         }
      }
   }

   public void N(int var1) {
      int ix = this.y.L;
      int j = y(var1);
      if (ix != j) {
         class01705 class01705 = new class01705(this, j);
         class01705.u = this.y.u;
         class01705.i = this.y.i;

         for (int k = 0; k < this.y.N.length(); k++) {
            class00570 class00570 = this.y.N.get(k);
            if (class00570 != null) {
               class07321 class07321 = class00570.R();
               int l = class07321.B;
               int i1 = class07321.Z;
               this.N(var1, null, class01705, class00570, class07321);
               if (class01705.y(l, i1)) {
                  class01705.N(class01705.N(class07321.B, class07321.Z), class00570);
               }
            }
         }

         this.y = class01705;
      }
   }

   public void N(int var1, int var2, class00667 var3) {
      if (!this.y.y(var1, var2)) {
         N.warn("Ignoring chunk since it's not in the view range: {}, {}", var1, var2);
      } else {
         int ix = this.y.N(var1, var2);
         class00570 class00570 = this.y.N.get(ix);
         if (!N(class00570, var1, var2)) {
            N.warn("Ignoring chunk since it's not present: {}, {}", var1, var2);
         } else {
            class00570.N(var3);
         }
      }
   }

   @Nullable
   public class00570 N(int var1, int var2, class00667 var3, Map<class07830, long[]> var4, Consumer<class01806> var5) {
      if (!this.y.y(var1, var2)) {
         N.warn("Ignoring chunk since it's not in the view range: {}, {}", var1, var2);
         return null;
      } else {
         int ix = this.y.N(var1, var2);
         class00570 class00570 = this.y.N.get(ix);
         class07321 class07321 = new class07321(var1, var2);
         if (!N(class00570, var1, var2)) {
            this.N(var1, var2, var3, var4, var5, null, class00570);
            class00570 = new class00570(this.L, class07321);
            class00570.N(var3, var4, var5);
            this.y.N(ix, class00570);
         } else {
            class00570.N(var3, var4, var5);
            this.y.N(class00570);
         }

         this.L.N(class07321);
         this.y(var1, var2, var3, var4, var5, null);
         this.N(var1, var2, var3, var4, var5, new CallbackInfoReturnable("", false, class00570));
         return class00570;
      }
   }

   @Override
   public void N(BooleanSupplier var1, boolean var2) {
   }

   @Override
   public void N(class00772 var1, class01296 var2) {
      ((class03063)class06202.Nq().B_2).N(var2.N(), var2.y(), var2.L());
   }

   @Override
   public String N() {
      return this.y.N.length() + ", " + this.y();
   }

   private static boolean N(@Nullable class00570 var0, int var1, int var2) {
      if (var0 == null) {
         return false;
      } else {
         class07321 class07321 = var0.R();
         return class07321.B == var1 && class07321.Z == var2;
      }
   }

   public LongOpenHashSet R() {
      return this.y.y;
   }

   public IChunkArray extractReferenceArray() {
      for (Field field : class01688.class.getDeclaredFields()) {
         if (IChunkArray.class.isAssignableFrom(field.getType())) {
            try {
               return (IChunkArray)field.get(this);
            } catch (IllegalAccessException illegalaccessexception) {
               throw new RuntimeException(illegalaccessexception);
            }
         }
      }

      throw new RuntimeException(Arrays.toString((Object[])class01688.class.getDeclaredFields()));
   }

   public class01688 createThreadSafeCopy() {
      IChunkArray ichunkarray = this.extractReferenceArray();
      class01688 class01688 = new class01688(this.L, ichunkarray.viewDistance() - 3);
      IChunkArray ichunkarray1 = class01688.extractReferenceArray();
      ichunkarray1.copyFrom(ichunkarray);
      if (ichunkarray1.viewDistance() != ichunkarray.viewDistance()) {
         throw new IllegalStateException(ichunkarray1.viewDistance() + " " + ichunkarray.viewDistance());
      } else {
         return class01688;
      }
   }
}
