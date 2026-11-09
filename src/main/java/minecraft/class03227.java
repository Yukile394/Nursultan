package minecraft;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.LongSerializationPolicy;
import com.mojang.datafixers.util.Pair;
import java.time.Duration;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class class03227 {
   private static final String y = "bytesPerSecond";
   private static final String L = "count";
   private static final String u = "durationNanosTotal";
   private static final String i = "totalBytes";
   private static final String R = "countPerSecond";
   final Gson N = new GsonBuilder().setPrettyPrinting().setLongSerializationPolicy(LongSerializationPolicy.DEFAULT).create();

   private JsonElement L(List<class03228> var1) {
      if (var1.isEmpty()) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject jsonobject = new JsonObject();
         double[] adouble = var1.stream().mapToDouble(var0 -> var0.y().toNanos() / 1000000.0).toArray();
         DoubleSummaryStatistics doublesummarystatistics = DoubleStream.of(adouble).summaryStatistics();
         jsonobject.addProperty("minMs", doublesummarystatistics.getMin());
         jsonobject.addProperty("averageMs", doublesummarystatistics.getAverage());
         jsonobject.addProperty("maxMs", doublesummarystatistics.getMax());
         class03213.N(adouble).forEach((var1x, var2x) -> jsonobject.addProperty("p" + var1x, var2x));
         return jsonobject;
      }
   }

   private JsonElement L(class03224 var1) {
      JsonObject jsonobject = new JsonObject();
      jsonobject.add("sent", this.N(var1.W(), class03227::N));
      jsonobject.add("received", this.N(var1.E(), class03227::N));
      return jsonobject;
   }

   public class03227() {
      super();
   }

   private JsonElement i(List<class03226> var1) {
      JsonObject jsonobject = new JsonObject();
      BiFunction bifunction = (var0, var1x) -> {
         JsonObject jsonobject1 = new JsonObject();
         DoubleSummaryStatistics doublesummarystatistics = var0.stream().mapToDouble(var1x).summaryStatistics();
         jsonobject1.addProperty("min", doublesummarystatistics.getMin());
         jsonobject1.addProperty("average", doublesummarystatistics.getAverage());
         jsonobject1.addProperty("max", doublesummarystatistics.getMax());
         return jsonobject1;
      };
      jsonobject.add("jvm", (JsonElement)bifunction.apply(var1, class03226::N));
      jsonobject.add("userJvm", (JsonElement)bifunction.apply(var1, class03226::y));
      jsonobject.add("system", (JsonElement)bifunction.apply(var1, class03226::L));
      return jsonobject;
   }

   private JsonElement u(List<class08175> var1) {
      if (var1.isEmpty()) {
         return JsonNull.INSTANCE;
      } else {
         JsonObject jsonobject = new JsonObject();
         int[] aint = var1.stream().mapToInt(class08175::N).toArray();
         IntSummaryStatistics intsummarystatistics = IntStream.of(aint).summaryStatistics();
         jsonobject.addProperty("minFPS", intsummarystatistics.getMin());
         jsonobject.addProperty("averageFPS", intsummarystatistics.getAverage());
         jsonobject.addProperty("maxFPS", intsummarystatistics.getMax());
         class03213.N(aint).forEach((var1x, var2x) -> jsonobject.addProperty("p" + var1x, var2x));
         return jsonobject;
      }
   }

   private JsonElement y(class03224 var1) {
      JsonObject jsonobject = new JsonObject();
      jsonobject.add("write", this.N(var1.s()));
      jsonobject.add("read", this.N(var1.T()));
      jsonobject.add("chunksRead", this.N(var1.P(), class03227::N));
      jsonobject.add("chunksWritten", this.N(var1.m(), class03227::N));
      return jsonobject;
   }

   private JsonElement y(List<Pair<class00549, class03205<class03201>>> var1) {
      JsonObject jsonobject = new JsonObject();
      if (var1.isEmpty()) {
         return jsonobject;
      } else {
         jsonobject.addProperty("durationNanosTotal", var1.stream().mapToDouble(var0 -> ((class03205)var0.getSecond()).R().toNanos()).sum());
         JsonArray jsonarray = class07536.N(new JsonArray(), var1x -> jsonobject.add("status", var1x));

         for (Pair pair : var1) {
            class03205 class03205 = (class03205)pair.getSecond();
            JsonObject jsonobject1 = class07536.N(new JsonObject(), jsonarray::add);
            jsonobject1.addProperty("state", ((class00549)pair.getFirst()).toString());
            jsonobject1.addProperty("count", class03205.u());
            jsonobject1.addProperty("durationNanosTotal", class03205.R().toNanos());
            jsonobject1.addProperty("durationNanosAvg", class03205.R().toNanos() / class03205.u());
            JsonObject jsonobject2 = class07536.N(new JsonObject(), var1x -> jsonobject1.add("durationNanosPercentiles", var1x));
            class03205.i().forEach((var1x, var2x) -> jsonobject2.addProperty("p" + var1x, var2x));
            Function function = var0 -> {
               JsonObject jsonobject3 = new JsonObject();
               jsonobject3.addProperty("durationNanos", var0.N().toNanos());
               jsonobject3.addProperty("level", var0.i());
               jsonobject3.addProperty("chunkPosX", var0.y().B);
               jsonobject3.addProperty("chunkPosZ", var0.y().Z);
               jsonobject3.addProperty("worldPosX", var0.L().L());
               jsonobject3.addProperty("worldPosZ", var0.L().u());
               return jsonobject3;
            };
            jsonobject1.add("fastest", (JsonElement)function.apply((class03201)class03205.N()));
            jsonobject1.add("slowest", (JsonElement)function.apply((class03201)class03205.y()));
            jsonobject1.add(
               "secondSlowest", (JsonElement)(class03205.L() != null ? (JsonElement)function.apply((class03201)class03205.L()) : JsonNull.INSTANCE)
            );
         }

         return jsonobject;
      }
   }

   private static void N(class02299 var0, JsonObject var1) {
      var1.addProperty("level", var0.N());
      var1.addProperty("dimension", var0.y());
      var1.addProperty("x", var0.L());
      var1.addProperty("z", var0.u());
   }

   private static void N(class04335 var0, JsonObject var1) {
      var1.addProperty("protocolId", var0.y());
      var1.addProperty("packetId", var0.L());
   }

   private JsonElement N(List<class00323> var1) {
      JsonObject jsonobject = new JsonObject();
      Optional optional = class03205.N(var1);
      if (optional.isEmpty()) {
         return jsonobject;
      } else {
         class03205 class03205 = (class03205)optional.get();
         JsonArray jsonarray = new JsonArray();
         jsonobject.add("structure", jsonarray);
         var1.stream()
            .collect(Collectors.groupingBy(class00323::L))
            .forEach(
               (var3x, var4x) -> {
                  Optional optionalx = class03205.N((List<class00323>)var4x);
                  if (!optionalx.isEmpty()) {
                     class03205 class03205x = (class03205)optionalx.get();
                     JsonObject jsonobjectx = new JsonObject();
                     jsonarray.add(jsonobjectx);
                     jsonobjectx.addProperty("name", var3x);
                     jsonobjectx.addProperty("count", class03205x.u());
                     jsonobjectx.addProperty("durationNanosTotal", class03205x.R().toNanos());
                     jsonobjectx.addProperty("durationNanosAvg", class03205x.R().toNanos() / class03205x.u());
                     JsonObject jsonobject1 = class07536.N(new JsonObject(), var1xx -> jsonobjectx.add("durationNanosPercentiles", var1xx));
                     class03205x.i().forEach((var1xx, var2xx) -> jsonobject1.addProperty("p" + var1xx, var2xx));
                     Function function = var0x -> {
                        JsonObject jsonobjectxx = new JsonObject();
                        jsonobjectxx.addProperty("durationNanos", var0x.N().toNanos());
                        jsonobjectxx.addProperty("chunkPosX", var0x.y().B);
                        jsonobjectxx.addProperty("chunkPosZ", var0x.y().Z);
                        jsonobjectxx.addProperty("structureName", var0x.L());
                        jsonobjectxx.addProperty("level", var0x.u());
                        jsonobjectxx.addProperty("success", var0x.i());
                        return jsonobjectxx;
                     };
                     jsonobject.add("fastest", (JsonElement)function.apply((class00323)class03205.N()));
                     jsonobject.add("slowest", (JsonElement)function.apply((class00323)class03205.y()));
                     jsonobject.add(
                        "secondSlowest", (JsonElement)(class03205.L() != null ? (JsonElement)function.apply((class00323)class03205.L()) : JsonNull.INSTANCE)
                     );
                  }
               }
            );
         return jsonobject;
      }
   }

   private <T> JsonElement N(class04326<T> var1, BiConsumer<T, JsonObject> var2) {
      JsonObject jsonobject = new JsonObject();
      jsonobject.addProperty("totalBytes", var1.u());
      jsonobject.addProperty("count", var1.L());
      jsonobject.addProperty("bytesPerSecond", var1.y());
      jsonobject.addProperty("countPerSecond", var1.N());
      JsonArray jsonarray = new JsonArray();
      jsonobject.add("topContributors", jsonarray);
      var1.i().forEach(var2x -> {
         JsonObject jsonobjectx = new JsonObject();
         jsonarray.add(jsonobjectx);
         Object object = var2x.getFirst();
         class04319 class04319 = (class04319)var2x.getSecond();
         var2.accept(object, jsonobjectx);
         jsonobjectx.addProperty("totalBytes", class04319.L());
         jsonobjectx.addProperty("count", class04319.y());
         jsonobjectx.addProperty("averageSize", class04319.N());
      });
      return jsonobject;
   }

   private JsonElement N(class03234 var1) {
      JsonObject jsonobject = new JsonObject();
      jsonobject.addProperty("totalBytes", var1.N());
      jsonobject.addProperty("count", var1.L());
      jsonobject.addProperty("bytesPerSecond", var1.y());
      jsonobject.addProperty("countPerSecond", var1.u());
      JsonArray jsonarray = new JsonArray();
      jsonobject.add("topContributors", jsonarray);
      var1.R().forEach(var1x -> {
         JsonObject jsonobject1 = new JsonObject();
         jsonarray.add(jsonobject1);
         jsonobject1.addProperty("path", (String)var1x.getFirst());
         jsonobject1.addProperty("totalBytes", (Number)var1x.getSecond());
      });
      return jsonobject;
   }

   private JsonElement N(class03204 var1) {
      JsonArray jsonarray = new JsonArray();
      var1.N().forEach((var1x, var2x) -> jsonarray.add(class07536.N(new JsonObject(), var2xx -> {
         var2xx.addProperty("thread", var1x);
         var2xx.addProperty("bytesPerSecond", var2x);
      })));
      return jsonarray;
   }

   public String N(class03224 var1) {
      JsonObject jsonobject = new JsonObject();
      jsonobject.addProperty("startedEpoch", var1.L().toEpochMilli());
      jsonobject.addProperty("endedEpoch", var1.u().toEpochMilli());
      jsonobject.addProperty("durationMs", var1.i().toMillis());
      Duration duration = var1.R();
      if (duration != null) {
         jsonobject.addProperty("worldGenDurationMs", duration.toMillis());
      }

      jsonobject.add("heap", this.N(var1.z()));
      jsonobject.add("cpuPercent", this.i(var1.Z()));
      jsonobject.add("network", this.L(var1));
      jsonobject.add("fileIO", this.y(var1));
      jsonobject.add("fps", this.u(var1.M()));
      jsonobject.add("serverTick", this.L(var1.B()));
      jsonobject.add("threadAllocation", this.N(var1.U()));
      jsonobject.add("chunkGen", this.y(var1.N()));
      jsonobject.add("structureGen", this.N(var1.j()));
      return this.N.toJson(jsonobject);
   }

   private JsonElement N(class03214 var1) {
      JsonObject jsonobject = new JsonObject();
      jsonobject.addProperty("allocationRateBytesPerSecond", var1.i());
      jsonobject.addProperty("gcCount", var1.u());
      jsonobject.addProperty("gcOverHeadPercent", var1.N());
      jsonobject.addProperty("gcTotalDurationMs", var1.L().toMillis());
      return jsonobject;
   }
}
