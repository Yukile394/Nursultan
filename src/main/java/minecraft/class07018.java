package minecraft;

import Nursultan.class10707;
import com.google.common.collect.ImmutableList;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.regex.Pattern;
import jerozgen.languagereload.access.ILanguage;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public abstract class class07018 implements ILanguage {
   private static final Logger N = LogUtils.getLogger();
   private static final Gson L = new Gson();
   private static final Pattern u = Pattern.compile("%(\\d+\\$)?[\\d.]*[df]");
   public static final String y = "en_us";
   private static volatile class07018 i = L();
   private class08429 R = null;
   private static class08429 M;

   private static class07018 L() {
      class08244 class08244 = class08244.N();
      HashMap hashmap = new HashMap();
      N(hashmap::put, "/assets/minecraft/lang/en_us.json");
      class08244.N(hashmap);
      Map map = Map.copyOf(hashmap);
      return new class10707(map);
   }

   public class07018() {
      super();
   }

   public String y(String var1) {
      return this.N(var1, var1);
   }

   public static class07018 y() {
      return i;
   }

   private static void y(class07018 var0, CallbackInfo var1) {
      var0.languagereload_setTranslationStorage(M);
      M = null;
   }

   public void languagereload_setTranslationStorage(class08429 var1) {
      this.R = var1;
   }

   public List<class01028> N(List<class05936> var1) {
      return var1.stream().map(this::N).collect(ImmutableList.toImmutableList());
   }

   public abstract class01028 N(class05936 var1);

   private static void N(class07018 var0, CallbackInfo var1) {
      if (var0 instanceof class08429) {
         M = (class08429)var0;
      }
   }

   private static void N(BiConsumer<String, String> var0, String var1) {
      try (InputStream inputstream = class07018.class.getResourceAsStream(var1)) {
         N(inputstream, var0);
      } catch (JsonParseException | IOException ioexception) {
         N.error("Couldn't read strings from {}", var1, ioexception);
      }
   }

   public static void N(InputStream var0, BiConsumer<String, String> var1) {
      for (Entry entry : ((JsonObject)L.fromJson(new InputStreamReader(var0, StandardCharsets.UTF_8), JsonObject.class)).entrySet()) {
         String s = u.matcher(class05001.N((JsonElement)entry.getValue(), (String)entry.getKey())).replaceAll("%$1s");
         var1.accept((String)entry.getKey(), s);
      }
   }

   public static void N(class07018 var0) {
      N(var0, null);
      i = var0;
      y(var0, null);
   }

   public abstract boolean N();

   public abstract boolean N(String var1);

   public abstract String N(String var1, String var2);

   public class08429 languagereload_getTranslationStorage() {
      return this.R;
   }
}
