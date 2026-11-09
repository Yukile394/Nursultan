package minecraft;

import com.mojang.authlib.minecraft.TelemetryPropertyContainer;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.longs.LongList;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.UUID;
import java.util.function.Function;
import java.util.stream.Collectors;

public record class02117<T>(String id, String exportKey, Codec<T> codec, class02101<T> exporter) {
   private static final DateTimeFormatter K = DateTimeFormatter.ISO_OFFSET_DATE_TIME.withZone(ZoneId.from(ZoneOffset.UTC));
   public static final class02117<String> N = b("user_id", "userId");
   public static final class02117<String> y = b("client_id", "clientId");
   public static final class02117<UUID> L = i("minecraft_session_id", "deviceSessionId");
   public static final class02117<String> u = b("game_version", "buildDisplayName");
   public static final class02117<String> i = b("operating_system", "buildPlatform");
   public static final class02117<String> R = b("platform", "platform");
   public static final class02117<Boolean> M = M("client_modded", "clientModded");
   public static final class02117<String> B = b("launcher_name", "launcherName");
   public static final class02117<UUID> Z = i("world_session_id", "worldSessionId");
   public static final class02117<Boolean> z = M("server_modded", "serverModded");
   public static final class02117<class02087> U = N(
      "server_type", "serverType", class02087.field_41493, (var0, var1, var2) -> var0.addProperty(var1, var2.method_15434())
   );
   public static final class02117<Boolean> E = M("opt_in", "isOptional");
   public static final class02117<Instant> W = N(
      "event_timestamp_utc", "eventTimestampUtc", class06338.l, (var0, var1, var2) -> var0.addProperty(var1, K.format(var2))
   );
   public static final class02117<class02096> m = N(
      "game_mode", "playerGameMode", class02096.field_41486, (var0, var1, var2) -> var0.addProperty(var1, var2.N())
   );
   public static final class02117<String> P = b("realms_map_content", "realmsMapContent");
   public static final class02117<Integer> s = c("seconds_since_load", "secondsSinceLoad");
   public static final class02117<Integer> T = c("ticks_since_load", "ticksSinceLoad");
   public static final class02117<LongList> b = M("frame_rate_samples", "serializedFpsSamples");
   public static final class02117<LongList> j = M("render_time_samples", "serializedRenderTimeSamples");
   public static final class02117<LongList> v = M("used_memory_samples", "serializedUsedMemoryKbSamples");
   public static final class02117<Integer> n = c("number_of_samples", "numSamples");
   public static final class02117<Integer> t = c("render_distance", "renderDistance");
   public static final class02117<Integer> G = c("dedicated_memory_kb", "dedicatedMemoryKb");
   public static final class02117<Integer> l = c("world_load_time_ms", "worldLoadTimeMs");
   public static final class02117<Boolean> d = M("new_world", "newWorld");
   public static final class02117<class03497> w = R("load_time_total_time_ms", "loadTimeTotalTimeMs");
   public static final class02117<class03497> k = R("load_time_pre_window_ms", "loadTimePreWindowMs");
   public static final class02117<class03497> Y = R("load_time_bootstrap_ms", "loadTimeBootstrapMs");
   public static final class02117<class03497> Q = R("load_time_loading_overlay_ms", "loadTimeLoadingOverlayMs");
   public static final class02117<String> O = b("advancement_id", "advancementId");
   public static final class02117<Long> g = d("advancement_game_time", "advancementGameTime");

   public static class02117<Integer> L(String var0, String var1) {
      return N(var0, var1, Codec.INT, TelemetryPropertyContainer::addProperty);
   }

   public String L() {
      return this.exportKey;
   }

   public static class02117<LongList> M(String var0, String var1) {
      return N(
         var0,
         var1,
         Codec.LONG.listOf().xmap(LongArrayList::new, Function.identity()),
         (var0x, var1x, var2) -> var0x.addProperty(var1x, var2.longStream().mapToObj(String::valueOf).collect(Collectors.joining(";")))
      );
   }

   public class02117(String id, String exportKey, Codec<T> codec, class02101<T> exporter) {
      super();
      this.id = id;
      this.exportKey = exportKey;
      this.codec = codec;
      this.exporter = exporter;
   }

   @Override
   public String toString() {
      return "TelemetryProperty[" + this.id + "]";
   }

   public static class02117<UUID> i(String var0, String var1) {
      return N(var0, var1, class01487.u, (var0x, var1x, var2) -> var0x.addProperty(var1x, var2.toString()));
   }

   public class02101<T> i() {
      return this.exporter;
   }

   public static class02117<Long> u(String var0, String var1) {
      return N(var0, var1, Codec.LONG, TelemetryPropertyContainer::addProperty);
   }

   public Codec<T> u() {
      return this.codec;
   }

   public String y() {
      return this.id;
   }

   public static class02117<String> y(String var0, String var1) {
      return N(var0, var1, Codec.STRING, TelemetryPropertyContainer::addProperty);
   }

   public static <T> class02117<T> N(String var0, String var1, Codec<T> var2, class02101<T> var3) {
      return new class02117<>(var0, var1, var2, var3);
   }

   public static class02117<Boolean> N(String var0, String var1) {
      return N(var0, var1, Codec.BOOL, TelemetryPropertyContainer::addProperty);
   }

   public class05216 N() {
      return class00392.L("telemetry.property." + this.id + ".title");
   }

   public void N(class02108 var1, TelemetryPropertyContainer var2) {
      Object object = var1.N(this);
      if (object != null) {
         this.exporter.apply(var2, this.exportKey, (T)object);
      } else {
         var2.addNullProperty(this.exportKey);
      }
   }

   public static class02117<class03497> R(String var0, String var1) {
      return N(var0, var1, class03497.N, (var0x, var1x, var2) -> var0x.addProperty(var1x, var2.N()));
   }

   public static class02117<String> b(String var0, String var1) {
      return N(var0, var1, Codec.STRING, TelemetryPropertyContainer::addProperty);
   }

   public static class02117<Integer> c(String var0, String var1) {
      return N(var0, var1, Codec.INT, TelemetryPropertyContainer::addProperty);
   }

   public static class02117<Long> d(String var0, String var1) {
      return N(var0, var1, Codec.LONG, TelemetryPropertyContainer::addProperty);
   }
}
