package minecraft;

import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.JsonOps;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Properties;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import net.fabricmc.fabric.impl.resource.pack.ModPackResourcesUtil;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05270 extends class05269 {
   static final Logger N = LogUtils.getLogger();
   private static final Pattern Nm = Pattern.compile("^[a-fA-F0-9]{40}$");
   private static final Splitter NP = Splitter.on(',').trimResults();
   public static final String y = "management-server-tls-enabled";
   public static final String L = "management-server-tls-keystore";
   public static final String u = "management-server-tls-keystore-password";
   public final boolean i = this.N("online-mode", true);
   public final boolean R = this.N("prevent-proxy-connections", false);
   public final String M = this.N("server-ip", "");
   public final class05259 B = this.y("allow-flight", false);
   public final class05259 Z = this.y("motd", "A Minecraft Server");
   public final boolean z = this.N("enable-code-of-conduct", false);
   public final String U = this.N("bug-report-link", "");
   public final class05259 E = this.y("force-gamemode", false);
   public final class05259 W = this.y("enforce-whitelist", false);
   public final class05259 m = this.y("difficulty", N(class07086::N, class07086::N), class07086::u, class07086.field_5805);
   public final class05259 P = this.y("gamemode", N(class07282::N, class07282::N), class07282::y, class07282.field_9215);
   public final String s = this.N("level-name", "world");
   public final int T = this.N("server-port", 25565);
   public final boolean b = this.N("management-server-enabled", false);
   public final String j = this.N("management-server-host", "localhost");
   public final int v = this.N("management-server-port", 0);
   public final String n = this.N("management-server-secret", class00456.N());
   public final boolean t = this.N("management-server-tls-enabled", true);
   public final String G = this.N("management-server-tls-keystore", "");
   public final String l = this.N("management-server-tls-keystore-password", "");
   public final String d = this.N("management-server-allowed-origins", "");
   @Nullable
   public final Boolean w = this.L("announce-player-achievements");
   public final boolean k = this.N("enable-query", false);
   public final int Y = this.N("query.port", 25565);
   public final boolean Q = this.N("enable-rcon", false);
   public final int O = this.N("rcon.port", 25575);
   public final String g = this.N("rcon.password", "");
   public final boolean I = this.N("hardcore", false);
   public final boolean J = this.N("use-native-transport", true);
   public final class05259 o = this.y("spawn-protection", 16);
   public final class05259 q = this.y("op-permission-level", class05270::N, class05270::N, class06984.i);
   public final class06984 K = (class06984)this.N("function-permission-level", class05270::N, class05270::N, class06984.L);
   public final long V = this.N("max-tick-time", TimeUnit.MINUTES.toMillis(1L));
   public final int e = this.N("max-chained-neighbor-updates", 1000000);
   public final int H = this.N("rate-limit", 0);
   public final class05259 c = this.y("view-distance", 10);
   public final class05259 X = this.y("simulation-distance", 10);
   public final class05259 a = this.y("max-players", 20);
   public final int p = this.N("network-compression-threshold", 256);
   public final boolean F = this.N("broadcast-rcon-to-ops", true);
   public final boolean A = this.N("broadcast-console-to-ops", true);
   public final int f = this.N("max-world-size", var0 -> class04995.N(var0, 1, 29999984), 29999984);
   public final boolean C = this.N("sync-chunk-writes", true);
   public final String S = this.N("region-file-compression", "deflate");
   public final boolean x = this.N("enable-jmx-monitoring", false);
   public final class05259 D = this.y("enable-status", true);
   public final class05259 h = this.y("hide-online-players", false);
   public final class05259 r = this.y("entity-broadcast-range-percentage", var0 -> class04995.N(Integer.parseInt(var0), 10, 1000), 100);
   public final String NN = this.N("text-filtering-config", "");
   public final int Ny = this.N("text-filtering-version", 0);
   public final Optional NL;
   public final class01247 Nu;
   public final class05259 Ni = this.y("player-idle-timeout", 0);
   public final class05259 NR = this.y("status-heartbeat-interval", 0);
   public final class05259 NM = this.y("white-list", false);
   public final boolean NB = this.N("enforce-secure-profile", true);
   public final boolean NZ = this.N("log-ips", true);
   public final class05259 Nz = this.y("pause-when-empty-seconds", 60);
   private final class05264 Ns;
   public final class05934 NU;
   public class05259 NE = this.y("accepts-transfers", false);

   private static class01247 L(String var0, String var1) {
      List<String> list = NP.splitToList(var0);
      List<String> list1 = NP.splitToList(var1);
      return new class01247(list, list1);
   }

   public class05270(Properties var1) {
      super(var1);
      String sx = this.N("level-seed", "");
      boolean flag = this.N("generate-structures", true);
      long ix = class05934.N(sx).orElse(class05934.M());
      this.NU = new class05934(ix, flag, false);
      this.Ns = new class05264(
         (JsonObject)this.N("generator-settings", var0 -> class05001.N(!var0.isEmpty() ? var0 : "{}"), new JsonObject()),
         (String)this.N("level-type", var0 -> var0.toLowerCase(Locale.ROOT), class05964.N.N().toString())
      );
      this.NL = N(
         this.N("resource-pack-id", ""),
         this.N("resource-pack", ""),
         this.N("resource-pack-sha1", ""),
         this.y("resource-pack-hash"),
         this.N("require-resource-pack", false),
         this.N("resource-pack-prompt", "")
      );
      this.Nu = L(this.N("initial-enabled-packs", String.join(",", this.y().N().N())), this.N("initial-disabled-packs", String.join(",", this.y().N().y())));
   }

   @Nullable
   private static class00392 u(String var0) {
      if (!Strings.isNullOrEmpty(var0)) {
         try {
            JsonElement jsonelement = class08326.N(var0);
            return (class00392)class03748.N
               .parse(class01042.y.N(JsonOps.INSTANCE), jsonelement)
               .resultOrPartial(var1x -> N.warn("Failed to parse resource pack prompt '{}': {}", var0, var1x))
               .orElse(null);
         } catch (Exception exception) {
            N.warn("Failed to parse resource pack prompt '{}'", var0, exception);
         }
      }

      return null;
   }

   private class03776 y() {
      return ModPackResourcesUtil.createDefaultDataConfiguration();
   }

   protected class05270 y(class01042 var1, Properties var2) {
      return new class05270(var2);
   }

   public static class05270 N(Path var0) {
      return new class05270(y(var0));
   }

   public class03764 N(class01929 var1) {
      return this.Ns.N(var1);
   }

   public static String N(class06984 var0) {
      return Integer.toString(var0.N().N());
   }

   private static Optional N(String var0, String var1, String var2, @Nullable String var3, boolean var4, String var5) {
      if (var1.isEmpty()) {
         return Optional.empty();
      } else {
         String sx;
         if (!var2.isEmpty()) {
            sx = var2;
            if (!Strings.isNullOrEmpty(var3)) {
               N.warn("resource-pack-hash is deprecated and found along side resource-pack-sha1. resource-pack-hash will be ignored.");
            }
         } else if (!Strings.isNullOrEmpty(var3)) {
            N.warn("resource-pack-hash is deprecated. Please use resource-pack-sha1 instead.");
            sx = var3;
         } else {
            sx = "";
         }

         if (sx.isEmpty()) {
            N.warn("You specified a resource pack without providing a sha1 hash. Pack will be updated on the client only if you change the name of the pack.");
         } else if (!Nm.matcher(sx).matches()) {
            N.warn("Invalid sha1 for resource-pack-sha1");
         }

         class00392 class00392 = u(var5);
         UUID uuid;
         if (var0.isEmpty()) {
            uuid = UUID.nameUUIDFromBytes(var1.getBytes(StandardCharsets.UTF_8));
            N.warn("resource-pack-id missing, using default of {}", uuid);
         } else {
            try {
               uuid = UUID.fromString(var0);
            } catch (IllegalArgumentException illegalargumentexception) {
               N.warn("Failed to parse '{}' into UUID", var0);
               return Optional.empty();
            }
         }

         return Optional.of(new class02794(uuid, var1, sx, var4, class00392));
      }
   }

   @Nullable
   public static class06984 N(String var0) {
      try {
         return class06984.N(class08195.N(Integer.parseInt(var0)));
      } catch (NumberFormatException numberformatexception) {
         return null;
      }
   }
}
