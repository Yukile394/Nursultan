package minecraft;

import com.google.common.collect.Iterables;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.concurrent.CompletableFuture;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class00408 implements AutoCloseable {
   private static final Logger N = LogUtils.getLogger();
   private final Map<class08413<?>, Optional<class06555>> y = new HashMap<>();
   private final DataFixer L;
   private final class01929 u;
   private final Path i;
   private CompletableFuture<?> R = CompletableFuture.completedFuture(null);

   @Nullable
   private <T extends class06555> T L(class08413<T> var1) {
      try {
         Path path = this.N(var1.N());
         if (Files.exists(path)) {
            class07001 class07001 = this.N(var1.N(), var1.u(), class07529.y().comp_4026().y());
            class03519 class03519 = this.u.N(class07713.N);
            return (T)var1.L()
               .parse(class03519, class07001.N("data"))
               .resultOrPartial(var1x -> N.error("Failed to parse saved data for '{}': {}", var1, var1x))
               .orElse(null);
         }
      } catch (Exception exception) {
         N.error("Error loading saved data: {}", var1, exception);
      }

      return null;
   }

   private Map<class08413<?>, class07001> L() {
      Object2ObjectArrayMap object2objectarraymap = new Object2ObjectArrayMap();
      class03519 class03519 = this.u.N(class07713.N);
      this.y.forEach((var3, var4) -> var4.filter(class06555::method_79).ifPresent(var4x -> {
         object2objectarraymap.put(var3, this.N(var3, var4x, class03519));
         var4x.method_78(false);
      }));
      return object2objectarraymap;
   }

   public class00408(Path var1, DataFixer var2, class01929 var3) {
      super();
      this.L = var2;
      this.i = var1;
      this.u = var3;
   }

   @Override
   public void close() {
      this.y();
   }

   public void y() {
      this.N().join();
   }

   @Nullable
   public <T extends class06555> T y(class08413<T> var1) {
      Optional<class06555> optional = this.y.get(var1);
      if (optional == null) {
         optional = Optional.ofNullable(this.L(var1));
         this.y.put(var1, optional);
      }

      return (T)optional.orElse(null);
   }

   private class07001 N(class05715 var1, DataFixer var2, class07001 var3, int var4, int var5, Operation var6) {
      return var1 == null ? var3 : (class07001)var6.call(new Object[]{var1, var2, var3, var4, var5});
   }

   private Path N(String var1) {
      return this.i.resolve(var1 + ".dat");
   }

   private <T extends class06555> class07001 N(class08413<T> var1, class06555 var2, class03519<class07709> var3) {
      Codec codec = var1.L();
      class07001 class07001 = new class07001();
      class07001.N("data", (class07709)codec.encodeStart(var3, var2).getOrThrow());
      class07717.i(class07001);
      return class07001;
   }

   public CompletableFuture<?> N() {
      Map<class08413<?>, class07001> map = this.L();
      if (map.isEmpty()) {
         return CompletableFuture.completedFuture(null);
      } else {
         int ix = class07536.M();
         int j = map.size();
         if (j > ix) {
            this.R = this.R.thenCompose(var4 -> {
               ArrayList arraylist = new ArrayList(ix);
               int ixx = class04995.R(j, ix);

               for (List list : Iterables.partition(map.entrySet(), ixx)) {
                  arraylist.add(CompletableFuture.runAsync(() -> {
                     for (Entry entry : list) {
                        this.N((class08413<?>)entry.getKey(), (class07001)entry.getValue());
                     }
                  }, class07536.Z()));
               }

               return CompletableFuture.allOf(arraylist.toArray(CompletableFuture[]::new));
            });
         } else {
            this.R = this.R
               .thenCompose(
                  var2x -> CompletableFuture.allOf(
                     map.entrySet()
                        .stream()
                        .map(var1xx -> CompletableFuture.runAsync(() -> this.N(var1xx.getKey(), var1xx.getValue()), class07536.Z()))
                        .toArray(CompletableFuture[]::new)
                  )
               );
         }

         return this.R;
      }
   }

   private boolean N(PushbackInputStream var1) throws IOException {
      byte[] abyte = new byte[2];
      boolean flag = false;
      int ix = var1.read(abyte, 0, 2);
      if (ix == 2 && ((abyte[1] & 255) << 8 | abyte[0] & 255) == 35615) {
         flag = true;
      }

      if (ix != 0) {
         var1.unread(abyte, 0, ix);
      }

      return flag;
   }

   public class07001 N(String var1, class05715 var2, int var3) throws IOException {
      class07001 class07001;
      try (
         InputStream inputstream = Files.newInputStream(this.N(var1));
         PushbackInputStream pushbackinputstream = new PushbackInputStream(new class03172(inputstream), 2);
      ) {
         class07001 class07001x;
         if (this.N(pushbackinputstream)) {
            class07001x = class07742.N_82(pushbackinputstream, class07726.L());
         } else {
            try (DataInputStream datainputstream = new DataInputStream(pushbackinputstream)) {
               class07001x = class07742.N(datainputstream);
            }
         }

         int ix = class07717.y(class07001x, 1343);
         DataFixer datafixer = this.L;
         class07001 = this.N(var2, datafixer, class07001x, ix, var3, var0 -> {
            WrapOperationRuntime.checkArgumentCount(var0, 5, "[net.minecraft.class_4284, com.mojang.datafixers.DataFixer, net.minecraft.class_2487, int, int]");
            return ((class05715)var0[0]).N((DataFixer)var0[1], (class07001)var0[2], (Integer)var0[3], (Integer)var0[4]);
         });
      }

      return class07001;
   }

   public <T extends class06555> void N(class08413<T> var1, T var2) {
      this.y.put(var1, Optional.of(var2));
      var2.method_80();
   }

   public <T extends class06555> T N(class08413<T> var1) {
      class06555 class06555x = this.y(var1);
      if (class06555x != null) {
         return (T)class06555x;
      } else {
         class06555 class06555x = (class06555)var1.y().get();
         this.N(var1, class06555x);
         return (T)class06555x;
      }
   }

   private void N(class08413<?> var1, class07001 var2) {
      Path path = this.N(var1.N());

      try {
         class07742.N(var2, path);
      } catch (IOException ioexception) {
         N.error("Could not save data to {}", path.getFileName(), ioexception);
      }
   }
}
