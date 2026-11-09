package minecraft;

import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.datafixers.DataFixer;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.JsonOps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class class04895 extends class01205 {
   private static final Gson y = new GsonBuilder().setPrettyPrinting().create();
   private static final Logger L = LogUtils.getLogger();
   private static final Codec<Map<class04907<?>, Integer>> u = Codec.dispatchedMap(class04206.G.T(), class07536.y_4(class04895::N)).xmap(var0 -> {
      HashMap hashmap = new HashMap();
      var0.forEach((var1x, var2) -> hashmap.putAll(var2));
      return hashmap;
   }, var0 -> var0.entrySet().stream().collect(Collectors.groupingBy(var0x -> ((class04907)var0x.getKey()).i(), class07536.N())));
   private final Path i;
   private final Set<class04907<?>> R = Sets.newHashSet();

   public void L() {
      this.R.addAll(this.N.keySet());
   }

   public class04895(class02796 var1, Path var2) {
      super();
      this.i = var2;
      if (Files.isRegularFile(var2)) {
         try (BufferedReader bufferedreader = Files.newBufferedReader(var2, StandardCharsets.UTF_8)) {
            JsonElement jsonelement = class08326.N(bufferedreader);
            this.N(var1.ND(), jsonelement);
         } catch (IOException ioexception) {
            L.error("Couldn't read statistics file {}", var2, ioexception);
         } catch (JsonParseException jsonparseexception) {
            L.error("Couldn't parse statistics file {}", var2, jsonparseexception);
         }
      }
   }

   private Set<class04907<?>> u() {
      HashSet hashset = Sets.newHashSet(this.R);
      this.R.clear();
      return hashset;
   }

   protected JsonElement y() {
      JsonObject jsonobject = new JsonObject();
      jsonobject.add("stats", (JsonElement)u.encodeStart(JsonOps.INSTANCE, this.N).getOrThrow());
      jsonobject.addProperty("DataVersion", class07529.y().comp_4026().y());
      return jsonobject;
   }

   private static <T> Codec<Map<class04907<?>, Integer>> N(class04922<T> var0) {
      return Codec.unboundedMap(
         var0.y()
            .T()
            .flatComapMap(
               var0::y, var1 -> var1.i() == var0 ? DataResult.success(var1.R()) : DataResult.error(() -> "Expected type " + var0 + ", but got " + var1.i())
            ),
         Codec.INT
      );
   }

   public void N() {
      try {
         class06290.L(this.i.getParent());

         try (BufferedWriter bufferedwriter = Files.newBufferedWriter(this.i, StandardCharsets.UTF_8)) {
            y.toJson(this.y(), y.newJsonWriter(bufferedwriter));
         }
      } catch (JsonIOException | IOException ioexception) {
         L.error("Couldn't save stats to {}", this.i, ioexception);
      }
   }

   @Override
   public void N(class08036 var1, class04907<?> var2, int var3) {
      super.N(var1, var2, var3);
      this.R.add(var2);
   }

   public void N(DataFixer var1, JsonElement var2) {
      Dynamic dynamic = new Dynamic(JsonOps.INSTANCE, var2);
      dynamic = class05715.field_19218.N(var1, dynamic, class07717.y(dynamic, 1343));
      this.N
         .putAll(
            u.parse(dynamic.get("stats").orElseEmptyMap())
               .resultOrPartial(var1x -> L.error("Failed to parse statistics for {}: {}", this.i, var1x))
               .orElse(Map.of())
         );
   }

   public void N(class04770 var1) {
      Object2IntOpenHashMap object2intopenhashmap = new Object2IntOpenHashMap();

      for (class04907<?> class04907 : this.u()) {
         object2intopenhashmap.put(class04907, this.N(class04907));
      }

      var1.field_13987.method_14364(new class07245(object2intopenhashmap));
   }
}
