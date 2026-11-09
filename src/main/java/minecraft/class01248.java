package minecraft;

import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import net.fabricmc.fabric.api.event.lifecycle.v1.CommonLifecycleEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.CommonLifecycleEvents.TagsLoaded;
import net.fabricmc.fabric.api.resource.v1.DataResourceStore.Mutable;
import net.fabricmc.fabric.impl.resource.DataResourceStoreImpl;
import net.fabricmc.fabric.impl.resource.FabricDataResourceStoreHolder;
import net.fabricmc.fabric.impl.resource.SetupMarkerResourceReloader;
import net.fabricmc.fabric.impl.resource.conditions.ResourceConditionsImpl;
import net.fabricmc.fabric.impl.tag.TagAliasLoader;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class01248 implements FabricDataResourceStoreHolder {
   private static final Logger N = LogUtils.getLogger();
   private static final CompletableFuture<class06244> y = CompletableFuture.completedFuture(class06244.field_17274);
   private final class02331 L;
   private final class07686 u;
   private final class06482 i;
   private final class04478 R;
   private final class05961 M;
   private final List<class00720<?>> B;
   private class02003 Z;
   private class01042 z;
   private final Mutable U = new DataResourceStoreImpl();

   public class06482 L() {
      return this.i;
   }

   public void M() {
      this.B.forEach(class00720::u);
      this.N(null);
      this.y(null);
   }

   private class01248(class02003<class02969> var1, class01929 var2, class03767 var3, class07671 var4, List<class00720<?>> var5, class08152 var6) {
      super();
      this.L = new class02331(var1.N());
      this.B = var5;
      this.i = new class06482(var2);
      this.u = new class07686(var4, class04348.N(var2, var3));
      this.R = new class04478(var2);
      this.M = new class05961(var6, this.u.N());
      this.N(var1, var2, var3, var4, var5, var6, null);
      this.y(var1, var2, var3, var4, var5, var6, null);
   }

   public class04478 i() {
      return this.R;
   }

   public class07686 u() {
      return this.u;
   }

   private void y(class02003 var1, class01929 var2, class03767 var3, class07671 var4, List var5, class08152 var6, CallbackInfo var7) {
      this.z = var1.N();
   }

   private void y(CallbackInfo var1) {
      ((TagsLoaded)CommonLifecycleEvents.TAGS_LOADED.invoker()).onTagsLoaded(this.z, false);
   }

   public class02331 y() {
      return this.L;
   }

   private void N(CallbackInfo var1) {
      TagAliasLoader.applyToDynamicRegistries(this.Z, class02969.field_39972);
      TagAliasLoader.applyToDynamicRegistries(this.Z, class02969.field_39974);
   }

   private void N(class02003 var1, class01929 var2, class03767 var3, class07671 var4, List var5, class08152 var6, CallbackInfo var7) {
      this.Z = var1;
   }

   private static void N(
      class01089 var0, class02003 var1, List var2, class03767 var3, class07671 var4, class08152 var5, Executor var6, Executor var7, CallbackInfoReturnable var8
   ) {
      ResourceConditionsImpl.currentFeatures = var3;
   }

   private static List N(List var0, class02347 var1, class03767 var2, class01248 var3) {
      ArrayList arraylist = new ArrayList(var0);
      arraylist.addFirst(new SetupMarkerResourceReloader(var3, var1.y(), var2));
      return Collections.unmodifiableList(arraylist);
   }

   public class05961 N() {
      return this.M;
   }

   public static CompletableFuture<class01248> N(
      class01089 var0, class02003<class02969> var1, List<class00720<?>> var2, class03767 var3, class07671 var4, class08152 var5, Executor var6, Executor var7
   ) {
      N(var0, var1, var2, var3, var4, var5, var6, var7, null);
      return class02314.N(var1, var2, var0, var6).thenCompose(var7x -> {
         class01248 class01248 = new class01248(var7x.N(), var7x.y(), var3, var4, var2, var5);
         List list = class01248.R();
         CompletableFuture completablefuture1 = y;
         boolean flag = N.isDebugEnabled();
         CompletableFuture<class06244> completablefuture = completablefuture1;
         return class06162.N(var0, N(list, var7x, var3, class01248), var6, var7, completablefuture, flag).N().thenApply(var1xx -> class01248);
      });
   }

   public List<class01081> R() {
      return List.of(this.i, this.M, this.R);
   }

   public Mutable fabric$getDataResourceStore() {
      return this.U;
   }
}
