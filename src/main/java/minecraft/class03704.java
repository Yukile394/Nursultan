package minecraft;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import net.fabricmc.fabric.api.entity.FakePlayer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class03704 {
   private static final Logger N = LogUtils.getLogger();
   private static final Gson y = new GsonBuilder().setPrettyPrinting().create();
   private final class01062 L;
   private final Path u;
   private class07166 i;
   private final Map<class03711, class08019> R = new LinkedHashMap<>();
   private final Set<class03711> M = new HashSet<>();
   private final Set<class03711> B = new HashSet<>();
   private final Set<class03734> Z = new HashSet<>();
   private class04770 z;
   @Nullable
   private class03711 U;
   private boolean E = true;
   private final Codec<class01709> W;

   private class01709 L() {
      LinkedHashMap linkedhashmap = new LinkedHashMap();
      this.R.forEach((var1x, var2) -> {
         if (var2.y()) {
            linkedhashmap.put(var1x.N(), var2);
         }
      });
      return new class01709(linkedhashmap);
   }

   private void L(class04478 var1) {
      for (class03711 class03711 : var1.y()) {
         class07151 class07151 = class03711.y();
         if (class07151.i().isEmpty()) {
            this.N(class03711, "");
            class07151.u().N(this.z);
         }
      }
   }

   private void L(class03711 var1) {
      class03734 class03734 = this.i.N(var1);
      if (class03734 != null) {
         this.Z.add(class03734.u());
      }
   }

   public class03704(DataFixer var1, class01062 var2, class04478 var3, Path var4, class04770 var5) {
      super();
      this.L = var2;
      this.u = var4;
      this.z = var5;
      this.i = var3.N();
      short short1 = 1343;
      this.W = class05715.field_19220.N(class01709.N, var1, 1343);
      this.u(var3);
   }

   private void i(class03711 var1) {
      class08019 class08019 = this.y(var1);

      for (Entry entry : var1.y().i().entrySet()) {
         class06562 class06562 = class08019.L((String)entry.getKey());
         if (class06562 != null && (class06562.N() || class08019.N())) {
            this.y(var1, (String)entry.getKey(), (class06915)entry.getValue());
         }
      }
   }

   private void u(class03711 var1) {
      class08019 class08019 = this.y(var1);
      if (!class08019.N()) {
         for (Entry entry : var1.y().i().entrySet()) {
            class06562 class06562 = class08019.L((String)entry.getKey());
            if (class06562 != null && !class06562.N()) {
               this.N(var1, (String)entry.getKey(), (class06915)entry.getValue());
            }
         }
      }
   }

   private void u(class04478 var1) {
      if (Files.isRegularFile(this.u)) {
         try (BufferedReader bufferedreader = Files.newBufferedReader(this.u, StandardCharsets.UTF_8)) {
            JsonElement jsonelement = class08326.N(bufferedreader);
            class01709 class01709 = (class01709)this.W.parse(JsonOps.INSTANCE, jsonelement).getOrThrow(JsonParseException::new);
            this.N(var1, class01709);
         } catch (JsonIOException | IOException ioexception) {
            N.error("Couldn't access player advancements in {}", this.u, ioexception);
         } catch (JsonParseException jsonparseexception) {
            N.error("Couldn't parse player advancements in {}", this.u, jsonparseexception);
         }
      }

      this.L(var1);
      this.y(var1);
   }

   public boolean y(class03711 var1, String var2) {
      boolean flag = false;
      class08019 class08019 = this.y(var1);
      boolean flag1 = class08019.N();
      if (class08019.y(var2)) {
         this.u(var1);
         this.B.add(var1);
         flag = true;
      }

      if (flag1 && !class08019.N()) {
         this.L(var1);
      }

      return flag;
   }

   public class08019 y(class03711 var1) {
      class08019 class08019 = this.R.get(var1);
      if (class08019 == null) {
         class08019 = new class08019();
         this.N(var1, class08019);
      }

      return class08019;
   }

   private <T extends class06516> void y(class03711 var1, String var2, class06915<T> var3) {
      var3.N().y(this, new class06588<>(var3.y(), var1, var2));
   }

   public void y() {
      JsonElement jsonelement = (JsonElement)this.W.encodeStart(JsonOps.INSTANCE, this.L()).getOrThrow();

      try {
         class06290.L(this.u.getParent());

         try (BufferedWriter bufferedwriter = Files.newBufferedWriter(this.u, StandardCharsets.UTF_8)) {
            y.toJson(jsonelement, y.newJsonWriter(bufferedwriter));
         }
      } catch (JsonIOException | IOException ioexception) {
         N.error("Couldn't save player advancements to {}", this.u, ioexception);
      }
   }

   private void y(class04478 var1) {
      for (class03711 class03711 : var1.y()) {
         this.u(class03711);
      }
   }

   private void N(class03734 var1, Set<class03711> var2, Set<class01894> var3) {
      class02100.N(var1, var1x -> this.y(var1x.y()).N(), (var3x, var4) -> {
         class03711 class03711 = var3x.y();
         if (var4) {
            if (this.M.add(class03711)) {
               var2.add(class03711);
               if (this.R.containsKey(class03711)) {
                  this.B.add(class03711);
               }
            }
         } else if (this.M.remove(class03711)) {
            var3.add(class03711.N());
         }
      });
   }

   void N(class03711 var1, String var2, CallbackInfoReturnable var3) {
      if (this.z instanceof FakePlayer) {
         var3.setReturnValue(false);
      }
   }

   void N(class04770 var1, CallbackInfo var2) {
      if (var1 instanceof FakePlayer) {
         var2.cancel();
      }
   }

   public void N(class04770 var1) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      this.N(var1, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         this.z = var1;
      }
   }

   private <T extends class06516> void N(class03711 var1, String var2, class06915<T> var3) {
      var3.N().N(this, new class06588<>(var3.y(), var1, var2));
   }

   public void N(class04478 var1) {
      this.N();
      this.R.clear();
      this.M.clear();
      this.Z.clear();
      this.B.clear();
      this.E = true;
      this.U = null;
      this.i = var1.N();
      this.u(var1);
   }

   public boolean N(class03711 var1, String var2) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, callbackinforeturnable);
      if (callbackinforeturnable.isCancelled()) {
         return callbackinforeturnable.getReturnValueZ();
      } else {
         boolean flag = false;
         class08019 class08019 = this.y(var1);
         boolean flag1 = class08019.N();
         if (class08019.N(var2)) {
            this.i(var1);
            this.B.add(var1);
            flag = true;
            if (!flag1 && class08019.N()) {
               var1.y().u().N(this.z);
               var1.y().L().ifPresent(var2x -> {
                  if (var2x.Z() && this.z.method_51469().method_64395().N(class07305.A)) {
                     this.L.N(var2x.i().N(var1, this.z), false);
                  }
               });
            }
         }

         if (!flag1 && class08019.N()) {
            this.L(var1);
         }

         return flag;
      }
   }

   private void N(class04478 var1, class01709 var2) {
      var2.N((var2x, var3) -> {
         class03711 class03711 = var1.N(var2x);
         if (class03711 == null) {
            N.warn("Ignored advancement '{}' in progress file {} - it doesn't exist anymore?", var2x, this.u);
         } else {
            this.N(class03711, var3);
            this.B.add(class03711);
            this.L(class03711);
         }
      });
   }

   private void N(class03711 var1, class08019 var2) {
      var2.N(var1.y().R());
      this.R.put(var1, var2);
   }

   public void N(@Nullable class03711 var1) {
      class03711 class03711 = this.U;
      if (var1 != null && var1.y().N() && var1.y().L().isPresent()) {
         this.U = var1;
      } else {
         this.U = null;
      }

      if (class03711 != this.U) {
         this.z.field_13987.method_14364(new class06674(this.U == null ? null : this.U.N()));
      }
   }

   public void N(class04770 var1, boolean var2) {
      if (this.E || !this.Z.isEmpty() || !this.B.isEmpty()) {
         HashMap hashmap = new HashMap();
         HashSet hashset = new HashSet();
         HashSet hashset1 = new HashSet();

         for (class03734 class03734 : this.Z) {
            this.N(class03734, hashset, hashset1);
         }

         this.Z.clear();

         for (class03711 class03711 : this.B) {
            if (this.M.contains(class03711)) {
               hashmap.put(class03711.N(), this.R.get(class03711));
            }
         }

         this.B.clear();
         if (!hashmap.isEmpty() || !hashset.isEmpty() || !hashset1.isEmpty()) {
            var1.field_13987.method_14364(new class08077(this.E, hashset, hashset1, hashmap, var2));
         }
      }

      this.E = false;
   }

   public void N() {
      Iterator<class06583<?>> iterator = class04206.NU.iterator();

      while (iterator.hasNext()) {
         iterator.next().N(this);
      }
   }
}
