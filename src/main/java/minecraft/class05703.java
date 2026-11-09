package minecraft;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.DataResult.Error;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import net.fabricmc.fabric.impl.loot.LootUtil;
import net.fabricmc.fabric.impl.resource.conditions.ResourceConditionsImpl;
import net.fabricmc.fabric.mixin.resource.conditions.RegistryOpsAccessor;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public abstract class class05703<T> extends class01291<Map<class01894, T>> {
   private static final Logger N = LogUtils.getLogger();
   private final DynamicOps<JsonElement> y;
   private final Codec<T> L;
   private final class03069 u;
   private static final Object i;

   private class05703(DynamicOps<JsonElement> var1, Codec<T> var2, class03069 var3) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
   }

   public class05703(Codec<T> var1, class03069 var2) {
      this(JsonOps.INSTANCE, var1, var2);
   }

   protected class05703(class01929 var1, Codec<T> var2, class05946<? extends class00751<T>> var3) {
      this(var1.N(JsonOps.INSTANCE), var2, class03069.N(var3));
   }

   private static DataResult N(Codec var0, DynamicOps var1, Object var2, Operation var3, class03069 var4, Entry var5) {
      JsonElement jsonelement = (JsonElement)var2;
      class03542 class03542 = null;
      if (var1 instanceof RegistryOpsAccessor registryopsaccessor) {
         class03542 = registryopsaccessor.getRegistryInfoGetter();
      }

      if (jsonelement.isJsonObject()) {
         JsonObject jsonobject = jsonelement.getAsJsonObject();
         String s = var4.getDirectoryName();
         if (!ResourceConditionsImpl.applyResourceConditions(jsonobject, s, (class01894)var5.getKey(), class03542)) {
            return DataResult.success(i);
         }
      }

      return (DataResult)var3.call(new Object[]{var0, var1, var2});
   }

   private static void N(Map var0, class01894 var1, Object var2, CallbackInfo var3) {
      if (var2 == i) {
         var3.cancel();
      }
   }

   private static void N(class01089 var0, class03069 var1, DynamicOps var2, Codec var3, Map var4, CallbackInfo var5, Entry var6, class01894 var7) {
      String s = var1.getDirectoryName();
      if (class03347.L.y().N().N().equals(s)) {
         ((Map)LootUtil.SOURCES.get()).put(var7, LootUtil.determineSource((class01079)var6.getValue()));
      }
   }

   private static DataResult N(Codec var0, DynamicOps var1, Object var2, Operation var3, LocalRef var4, LocalRef var5) {
      return N(var0, var1, var2, var3, (class03069)var4.get(), (Entry)var5.get());
   }

   protected Map<class01894, T> y(class01089 var1, class04643 var2) {
      HashMap hashmap = new HashMap();
      N(var1, this.u, this.y, this.L, hashmap);
      return hashmap;
   }

   public static <T> void N(class01089 var0, class05946<? extends class00751<T>> var1, DynamicOps<JsonElement> var2, Codec<T> var3, Map<class01894, T> var4) {
      N(var0, class03069.N(var1), var2, var3, var4);
   }

   public static <T> void N(class01089 var0, class03069 var1, DynamicOps<JsonElement> var2, Codec<T> var3, Map<class01894, T> var4) {
      for (Entry entry : var1.N(var0).entrySet()) {
         class01894 class01894x = (class01894)entry.getKey();
         class01894 class01894x = var1.y(class01894x);

         try {
            N(var0, var1, var2, var3, var4, null, entry, class01894x);

            try (BufferedReader bufferedreader = ((class01079)entry.getValue()).method_43039()) {
               JsonElement jsonelement = class08326.N(bufferedreader);
               Operation operation = var0x -> {
                  WrapOperationRuntime.checkArgumentCount(var0x, 3, "[com.mojang.serialization.Codec, com.mojang.serialization.DynamicOps, java.lang.Object]");
                  return ((Codec)var0x[0]).parse((DynamicOps)var0x[1], var0x[2]);
               };
               LocalRefImpl localrefimpl = new LocalRefImpl();
               LocalRefImpl localrefimpl1 = new LocalRefImpl();
               localrefimpl.init(var1);
               localrefimpl1.init(entry);
               DataResult dataresult = N(var3, var2, jsonelement, operation, localrefimpl, localrefimpl1);
               entry = (Entry)localrefimpl1.dispose();
               var1 = (class03069)localrefimpl.dispose();
               dataresult.ifSuccess(var2x -> {
                  CallbackInfo callbackinfo = new CallbackInfo("", true);
                  N(var4, class01894, var2x, callbackinfo);
                  if (!callbackinfo.isCancelled()) {
                     if (var4.putIfAbsent(class01894, var2x) != null) {
                        throw new IllegalStateException("Duplicate data file ignored with ID " + class01894);
                     }
                  }
               }).ifError(var2x -> N.error("Couldn't parse data file '{}' from '{}': {}", new Object[]{class01894, class01894x, var2x}));
            }
         } catch (IllegalArgumentException | IOException | JsonParseException jsonparseexception) {
            N.error("Couldn't parse data file '{}' from '{}'", new Object[]{class01894x, class01894x, jsonparseexception});
         }
      }
   }
}
