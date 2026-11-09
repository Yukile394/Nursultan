package minecraft;

import com.google.gson.JsonElement;
import com.google.gson.JsonSyntaxException;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.JsonOps;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import net.caffeinemc.mods.sodium.client.SodiumClientMod;
import net.caffeinemc.mods.sodium.client.services.PlatformRuntimeInformation;
import org.apache.commons.io.FileUtils;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class05731 {
   private static final Logger N = LogUtils.getLogger();
   private static final int y = 4649;
   private Map<class01894, class06276> L;
   private final List<class01894> u = new ArrayList<>();
   private boolean i = false;
   @Nullable
   private class05679 R;
   private final File M;
   private long B;
   private final Codec<class05335> Z;

   public void L() {
      this.N(!this.i);
   }

   public boolean L(class01894 var1) {
      switch ((class06276)this.L.get(var1)) {
         case ALWAYS_ON:
            this.N(var1, class06276.field_61595);
            return false;
         case IN_OVERLAY:
            if (this.i) {
               this.N(var1, class06276.field_61595);
               return false;
            }

            this.N(var1, class06276.field_61593);
            return true;
         case NEVER:
            if (this.i) {
               this.N(var1, class06276.field_61594);
            } else {
               this.N(var1, class06276.field_61593);
            }

            return true;
         case null:
         default:
            this.N(var1, class06276.field_61593);
            return true;
      }
   }

   private void L(CallbackInfo var1) {
      class01894 class01894 = PlatformRuntimeInformation.getInstance().isDevelopmentEnvironment()
         ? SodiumClientMod.SODIUM_DEBUG_ENTRY_FULL
         : SodiumClientMod.SODIUM_DEBUG_ENTRY_REDUCED;
      if (!this.L.containsKey(class01894)) {
         this.L.put(class01894, class06276.field_61594);
      }

      if (!this.L.containsKey(SodiumClientMod.SODIUM_FPS_PERCENTILES)) {
         this.L.put(SodiumClientMod.SODIUM_FPS_PERCENTILES, class06276.field_61594);
      }
   }

   public void M() {
      class05335 class05335 = new class05335(Optional.ofNullable(this.R), this.R == null ? Optional.of(this.L) : Optional.empty());

      try {
         FileUtils.writeStringToFile(this.M, ((JsonElement)this.Z.encodeStart(JsonOps.INSTANCE, class05335).getOrThrow()).toString(), StandardCharsets.UTF_8);
      } catch (IOException ioexception) {
         N.error("Failed to save debug profile file {}", this.M, ioexception);
      }
   }

   public class05731(File var1) {
      super();
      this.M = new File(var1, "debug-profile.json");
      this.Z = class05715.field_63266.N(class05335.N, class06202.Nq().Nh(), 4649);
      this.N();
   }

   private void B() {
      this.R = class05679.field_61599;
      this.L = new HashMap<>(class06134.c.get(class05679.field_61599));
      this.y(null);
   }

   private void Z() {
      this.L.put(class06134.Z, class06276.field_61594);
      this.L.put(class06134.U, class06276.field_61594);
      this.L.put(class06134.E, class06276.field_61594);
      this.L.put(class06134.u, class06276.field_61594);
      this.L.put(class06134.i, class06276.field_61594);
      this.L.put(SodiumClientMod.SODIUM_FPS_PERCENTILES, class06276.field_61594);
   }

   public void i() {
      this.N(null);
      this.L(null);
      this.u.clear();
      boolean flag = class06202.Nq().h();

      for (Entry entry : this.L.entrySet()) {
         if (entry.getValue() == class06276.field_61593 || this.i && entry.getValue() == class06276.field_61594) {
            class01285 class01285 = class06134.N((class01894)entry.getKey());
            if (class01285 != null && class01285.method_72753(flag)) {
               this.u.add((class01894)entry.getKey());
            }
         }
      }

      this.u.sort(class01894::compareTo);
      this.B++;
   }

   private void z() {
      this.L.put(class06134.Z, class06276.field_61594);
      this.L.put(SodiumClientMod.SODIUM_FPS_PERCENTILES, class06276.field_61594);
   }

   public boolean u() {
      return this.i;
   }

   private void y(CallbackInfo var1) {
      this.Z();
   }

   public boolean y(class01894 var1) {
      return this.u.contains(var1);
   }

   public boolean y(class05679 var1) {
      return this.R == var1;
   }

   public Collection<class01894> y() {
      return this.u;
   }

   private void N(CallbackInfo var1) {
      if (!this.L.containsKey(class01894.N("iris", "iris"))) {
         this.L.put(class01894.N("iris", "iris"), class06276.field_61594);
      }

      if (PlatformRuntimeInformation.getInstance().isDevelopmentEnvironment() && !this.L.containsKey(class01894.N("iris", "debug"))) {
         this.L.put(class01894.N("iris", "debug"), class06276.field_61594);
      }
   }

   public void N(class01894 var1, class06276 var2) {
      this.R = null;
      this.L.put(var1, var2);
      this.i();
      this.M();
   }

   private void N(class05679 var1, CallbackInfo var2) {
      if (var1 == class05679.field_61600 && !PlatformRuntimeInformation.getInstance().isDevelopmentEnvironment()) {
         this.z();
      } else {
         this.Z();
      }
   }

   public class06276 N(class01894 var1) {
      class06276 class06276 = this.L.get(var1);
      return class06276 == null ? class06276.field_61595 : class06276;
   }

   public void N(boolean var1) {
      if (this.i != var1) {
         this.i = var1;
         this.i();
      }
   }

   public void N() {
      try {
         if (!this.M.isFile()) {
            this.B();
            this.i();
            return;
         }

         Dynamic dynamic = new Dynamic(JsonOps.INSTANCE, class08326.N(FileUtils.readFileToString(this.M, StandardCharsets.UTF_8)));
         class05335 class05335 = (class05335)this.Z.parse(dynamic).getOrThrow(var0 -> new IOException("Could not parse debug profile JSON: " + var0));
         if (class05335.N().isPresent()) {
            this.N(class05335.N().get());
         } else {
            this.L = new HashMap<>();
            if (class05335.y().isPresent()) {
               this.L.putAll(class05335.y().get());
            }

            this.R = null;
         }
      } catch (JsonSyntaxException | IOException ioexception) {
         N.error("Couldn't read debug profile file {}, resetting to default", this.M, ioexception);
         this.B();
         this.M();
      }

      this.i();
   }

   public void N(class05679 var1) {
      this.R = var1;
      Map<class01894, class06276> map = class06134.c.get(var1);
      this.L = new HashMap<>(map);
      this.N(var1, null);
      this.i();
   }

   public long R() {
      return this.B;
   }
}
