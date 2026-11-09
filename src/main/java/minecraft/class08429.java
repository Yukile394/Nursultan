package minecraft;

import com.google.common.collect.Maps;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.BiConsumer;
import jerozgen.languagereload.access.ITranslationStorage;
import jerozgen.languagereload.config.Config;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.shaderpack.LanguageMap;
import net.irisshaders.iris.shaderpack.ShaderPack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class08429 extends class07018 implements ITranslationStorage {
   private static Logger L = LoggerFactory.getLogger("minecraft.class08429");
   public final Map<String, String> N;
   private final boolean u;
   private static final String i = "Lnet/minecraft/client/resources/language/ClientLanguage;loadFrom(Lnet/minecraft/server/packs/resources/ResourceManager;Ljava/util/List;)Lnet/minecraft/client/resources/language/ClientLanguage;";
   private static final List R = new ArrayList();
   private final Map M = Maps.newConcurrentMap();
   private static Map B;
   private Map Z;

   private String L(String var1) {
      ShaderPack shaderpack = (ShaderPack)Iris.getCurrentPack().orElse(null);
      if (shaderpack == null) {
         return null;
      } else {
         LanguageMap languagemap = shaderpack.getLanguageMap();
         if (this.N.containsKey(var1)) {
            return null;
         } else {
            for (String s : R) {
               Map map = languagemap.getTranslations(s);
               if (map != null) {
                  String s1 = (String)map.get(var1);
                  if (s1 != null) {
                     return s1;
                  }
               }
            }

            return null;
         }
      }
   }

   private class08429(Map<String, String> var1, boolean var2) {
      super();
      this.N = var1;
      this.u = var2;
      this.N(var1, var2, null);
   }

   private static void y(class01089 var0, List var1, boolean var2, CallbackInfoReturnable var3) {
      B = Maps.newHashMap();
   }

   private void N(String var1, CallbackInfoReturnable var2) {
      if (this.L(var1) != null) {
         var2.setReturnValue(true);
      }
   }

   void N(Map var1, boolean var2, CallbackInfo var3) {
      this.Z = B;
      B = null;
   }

   private static void N(class08244 var0, Map var1, Operation var2) {
      var2.call(new Object[]{var0, var1});

      for (Map map : B.values()) {
         var2.call(new Object[]{var0, map});
      }
   }

   private static void N(InputStream var0, BiConsumer var1, String var2) {
      if (Config.getInstance().multilingualItemSearch) {
         class07018.N(var0, var1.andThen((var1x, var2x) -> B.computeIfAbsent(var2, var0xx -> Maps.newHashMap()).put(var1x, var2x)));
      } else {
         class07018.N(var0, var1);
      }
   }

   @Override
   public boolean N() {
      return this.u;
   }

   @Override
   public boolean N(String var1) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? callbackinforeturnable.getReturnValueZ() : this.N.containsKey(var1);
   }

   public static class08429 N(class01089 var0, List<String> var1, boolean var2) {
      N(var0, var1, var2, null);
      y(var0, var1, var2, null);
      HashMap hashmap = new HashMap();

      for (String s : var1) {
         String s1 = String.format(Locale.ROOT, "lang/%s.json", s);

         for (String s2 : var0.N()) {
            try {
               class01894 class01894 = class01894.N(s2, s1);
               N(s, var0.N(class01894), hashmap);
            } catch (Exception exception) {
               L.warn("Skipped language file: {}:{} ({})", new Object[]{s2, s1, exception.toString()});
            }
         }
      }

      N(class08244.N(), hashmap, var0x -> {
         WrapOperationRuntime.checkArgumentCount(var0x, 2, "[net.minecraft.class_10117, java.util.Map]");
         ((class08244)var0x[0]).N((Map<String, String>)var0x[1]);
         return (Void)null;
      });
      return new class08429(Map.copyOf(hashmap), var2);
   }

   @Override
   public String N(String var1, String var2) {
      CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", true);
      this.N(var1, var2, callbackinforeturnable);
      return callbackinforeturnable.isCancelled() ? (String)callbackinforeturnable.getReturnValue() : this.N.getOrDefault(var1, var2);
   }

   private static void N(String var0, List<class01079> var1, Map<String, String> var2) {
      N(var0, var1, var2, null);

      for (class01079 class01079 : var1) {
         try (InputStream inputstream = class01079.method_14482()) {
            N(inputstream, var2::put, var0);
         } catch (IOException ioexception) {
            L.warn("Failed to load translations for {} from pack {}", new Object[]{var0, class01079.method_14480(), ioexception});
         }
      }
   }

   private void N(String var1, String var2, CallbackInfoReturnable var3) {
      String s = this.L(var1);
      if (s != null) {
         var3.setReturnValue(s);
      }
   }

   private static void N(class01089 var0, List var1, boolean var2, CallbackInfoReturnable var3) {
      R.clear();
      new LinkedList(var1).descendingIterator().forEachRemaining(R::add);
   }

   private static void N(String var0, List var1, Map var2, CallbackInfo var3) {
      String s = String.format(Locale.ROOT, "lang/%s.json", var0);
      if (Iris.class.getResource("/assets/iris/" + s) != null) {
         class07018.N(Iris.class.getResourceAsStream("/assets/iris/" + s), var2::put);
      }
   }

   @Override
   public class01028 N(class05936 var1) {
      return class05447.N(var1, this.u);
   }

   public String languagereload_getTargetLanguage() {
      return (String)this.M.get(Thread.currentThread().threadId());
   }

   public String languagereload_get(String var1) {
      String s = this.languagereload_getTargetLanguage();
      if (s != null) {
         Map map = (Map)this.Z.get(s);
         return map == null ? "" : map.getOrDefault(var1, "");
      } else {
         return this.y(var1);
      }
   }

   public void languagereload_setTargetLanguage(String var1) {
      long ix = Thread.currentThread().threadId();
      if (var1 == null) {
         this.M.remove(ix);
      } else {
         this.M.put(ix, var1);
      }
   }
}
