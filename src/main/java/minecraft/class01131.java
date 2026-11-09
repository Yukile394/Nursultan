package minecraft;

import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import it.unimi.dsi.fastutil.ints.Int2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.util.Map;
import java.util.UUID;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class01131<T extends class01135> {
   private static final Logger N = LogUtils.getLogger();
   private final Int2ObjectMap<T> y = new Int2ObjectLinkedOpenHashMap();
   private final Map<UUID, T> L = Maps.newHashMap();

   public class01131() {
      super();
   }

   public void y(T var1) {
      this.L.remove(var1.method_5667());
      this.y.remove(var1.method_5628());
   }

   public int y() {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? callbackinforeturnable.getReturnValueI() : this.L.size();
   }

   @Nullable
   public T N(UUID var1) {
      return this.L.get(var1);
   }

   private boolean N(Map var1, Object var2) {
      return var1.containsKey(var2) && ProtocolTranslator.getTargetVersion().newerThan(ProtocolVersion.v1_16_4);
   }

   private void N(CallbackInfoReturnable var1) {
      if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_16_4)) {
         var1.setReturnValue(this.y.size());
      }
   }

   public <U extends T> void N(class01128<T, U> var1, class04197<U> var2) {
      ObjectIterator objectiterator = this.y.values().iterator();

      while (objectiterator.hasNext()) {
         class01135 class01135x = (class01135)objectiterator.next();
         class01135 class01135x = (class01135)var1.N(class01135x);
         if (class01135x != null && var2.accept(class01135x).N()) {
            return;
         }
      }
   }

   public Iterable<T> N() {
      return Iterables.unmodifiableIterable(this.y.values());
   }

   public void N(T var1) {
      UUID uuid = var1.method_5667();
      Map map = this.L;
      if (this.N(map, uuid)) {
         N.warn("Duplicate entity UUID {}: {}", uuid, var1);
      } else {
         this.L.put(uuid, (T)var1);
         this.y.put(var1.method_5628(), var1);
      }
   }

   @Nullable
   public T N(int var1) {
      return (T)this.y.get(var1);
   }
}
