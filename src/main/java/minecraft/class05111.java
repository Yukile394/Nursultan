package minecraft;

import com.google.gson.JsonArray;
import com.mojang.logging.LogUtils;
import com.mojang.util.UndashedUuid;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05111 {
   public static final class05104 N = Optional.ofNullable(System.getenv("realms.environment"))
      .or(() -> Optional.ofNullable(System.getProperty("realms.environment")))
      .flatMap(class05104::N)
      .orElse(class05104.field_19586);
   private static final Logger y = LogUtils.getLogger();
   @Nullable
   private static volatile class05111 L = null;
   private final CompletableFuture<Set<String>> u;
   private final String i;
   private final String R;
   private final class06202 M;
   private static final String B = "worlds";
   private static final String Z = "invites";
   private static final String z = "mco";
   private static final String U = "subscriptions";
   private static final String E = "activities";
   private static final String W = "ops";
   private static final String m = "regions/ping/stat";
   private static final String P = "regions/preferredRegions";
   private static final String s = "trial";
   private static final String T = "notifications";
   private static final String b = "feature/v1";
   private static final String j = "/listUserWorldsOfType/any";
   private static final String v = "/$PARENT_WORLD_ID/createPrereleaseRealm";
   private static final String n = "/listPrereleaseEligibleWorlds";
   private static final String t = "/$WORLD_ID/initialize";
   private static final String G = "/liveplayerlist";
   private static final String l = "/$WORLD_ID";
   private static final String d = "/$WORLD_ID/$PROFILE_UUID";
   private static final String w = "/minigames/$MINIGAME_ID/$WORLD_ID";
   private static final String k = "/available";
   private static final String Y = "/templates/$WORLD_TYPE";
   private static final String Q = "/v1/$ID/join/pc";
   private static final String O = "/$ID";
   private static final String g = "/$WORLD_ID";
   private static final String I = "/$WORLD_ID/invite/$UUID";
   private static final String J = "/pending";
   private static final String o = "/accept/$INVITATION_ID";
   private static final String q = "/reject/$INVITATION_ID";
   private static final String K = "/$WORLD_ID";
   private static final String V = "/$WORLD_ID/configuration";
   private static final String e = "/$WORLD_ID/slot/$SLOT_ID";
   private static final String H = "/$WORLD_ID/open";
   private static final String c = "/$WORLD_ID/close";
   private static final String X = "/$WORLD_ID/reset";
   private static final String a = "/$WORLD_ID";
   private static final String p = "/$WORLD_ID/backups";
   private static final String F = "/$WORLD_ID/slot/$SLOT_ID/download";
   private static final String A = "/$WORLD_ID/backups/upload";
   private static final String f = "/client/compatible";
   private static final String C = "/tos/agreed";
   private static final String S = "/v1/news";
   private static final String x = "/seen";
   private static final String D = "/dismiss";
   private static final class04968 h = new class04968();

   private String L(String var1) throws class05097 {
      return this.N(var1, null);
   }

   public class04967 L() throws class05097 {
      String sx = this.L("worlds");
      if (class05685.N()) {
         sx = sx + "/listUserWorldsOfType/any";
      }

      String s1 = this.N(class05134.N(sx));
      return class04967.N(h, s1);
   }

   public void L(long var1) throws class05097 {
      String sx = this.L("invites" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf(var1)));
      this.N(class05134.y(sx));
   }

   private static JsonArray L(List<UUID> var0) {
      JsonArray jsonarray = new JsonArray();

      for (UUID uuid : var0) {
         if (uuid != null) {
            jsonarray.add(uuid.toString());
         }
      }

      return jsonarray;
   }

   public class04964 L(long var1, UUID var3) throws class05097 {
      String sx = "/$WORLD_ID/$PROFILE_UUID".replace("$WORLD_ID", String.valueOf(var1)).replace("$PROFILE_UUID", UndashedUuid.toString(var3));
      String s1 = this.L("ops" + sx);
      return class04964.N(this.N(class05134.y(s1)));
   }

   public Boolean L(long var1, String var3) throws class05097 {
      String sx = "/minigames/$MINIGAME_ID/$WORLD_ID".replace("$MINIGAME_ID", var3).replace("$WORLD_ID", String.valueOf(var1));
      String s1 = this.L("worlds" + sx);
      return Boolean.valueOf(this.N(class05134.L(s1, "")));
   }

   public class04966 M() throws class05097 {
      String sx = this.L("activities/liveplayerlist");
      return class04966.N(this.N(class05134.N(sx)));
   }

   public class04944 M(long var1) throws class05097 {
      String sx = this.L("subscriptions" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf(var1)));
      return class04944.N(this.N(class05134.N(sx)));
   }

   private Set<String> P() {
      return Set.of();
   }

   private class05111(String var1, String var2, class06202 var3) {
      super();
      this.i = var1;
      this.R = var2;
      this.M = var3;
      class05133.N(var3.NJ());
      this.u = CompletableFuture.supplyAsync(this::P, class07536.z());
   }

   @Nullable
   public class04987 B(long var1) throws class05097 {
      String sx = this.L("worlds" + "/$WORLD_ID/backups/upload".replace("$WORLD_ID", String.valueOf(var1)));
      String s1 = class04609.N(var1);
      class04987 class04987 = class04987.N(this.N(class05134.L(sx, class04987.y(s1))));
      if (class04987 != null) {
         class04609.N(var1, class04987.y());
      }

      return class04987;
   }

   public boolean B() throws class05097 {
      String sx = this.L("mco/available");
      return Boolean.parseBoolean(this.N(class05134.N(sx)));
   }

   public class05127 Z() throws class05097 {
      String sx = this.L("mco/client/compatible");
      String s1 = this.N(class05134.N(sx));

      try {
         return class05127.valueOf(s1);
      } catch (IllegalArgumentException illegalargumentexception) {
         throw new class05097(class05124.N(s1));
      }
   }

   public void Z(long var1) throws class05097 {
      String sx = this.L("worlds" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf(var1)));
      this.N(class05134.y(sx));
   }

   public Boolean i(long var1) throws class05097 {
      String sx = this.L("worlds" + "/$WORLD_ID/open".replace("$WORLD_ID", String.valueOf(var1)));
      return Boolean.valueOf(this.N(class05134.L(sx, "")));
   }

   public List<class03576> i() throws class05097 {
      String sx = this.L("notifications");
      return class03576.N(this.N(class05134.N(sx)));
   }

   public Boolean m() throws class05097 {
      String sx = this.L("trial");
      return Boolean.valueOf(this.N(class05134.N(sx)));
   }

   public class04956 U() throws class05097 {
      String sx = this.L("invites/pending");
      class04956 class04956 = class04956.N(this.N(class05134.N(sx)));
      class04956.N().removeIf(this::N);
      return class04956;
   }

   public int z() throws class05097 {
      return this.U().N().size();
   }

   public class04976 u(long var1) throws class05097 {
      String sx = this.L("worlds" + "/$WORLD_ID/backups".replace("$WORLD_ID", String.valueOf(var1)));
      return class04976.N(this.N(class05134.N(sx)));
   }

   public Boolean u(long var1, String var3) throws class05097 {
      class04947 class04947 = new class04947(null, Long.valueOf(var3), -1, false, Set.of());
      String sx = this.L("worlds" + "/$WORLD_ID/reset".replace("$WORLD_ID", String.valueOf(var1)));
      return Boolean.valueOf(this.N(class05134.N(sx, h.N(class04947), 30000, 80000)));
   }

   public List<class04981> u() throws class05097 {
      String sx = this.L("worlds/listPrereleaseEligibleWorlds");
      String s1 = this.N(class05134.N(sx));
      return class04967.N(h, s1).N();
   }

   public class04964 y(long var1, UUID var3) throws class05097 {
      String sx = "/$WORLD_ID/$PROFILE_UUID".replace("$WORLD_ID", String.valueOf(var1)).replace("$PROFILE_UUID", UndashedUuid.toString(var3));
      String s1 = this.L("ops" + sx);
      return class04964.N(this.N(class05134.y(s1, "")));
   }

   public class04945 y(long var1, int var3) throws class05097 {
      String sx = this.L("worlds" + "/$WORLD_ID/slot/$SLOT_ID/download".replace("$WORLD_ID", String.valueOf(var1)).replace("$SLOT_ID", String.valueOf(var3)));
      return class04945.N(this.N(class05134.N(sx)));
   }

   public void y(String var1) throws class05097 {
      String sx = this.L("invites" + "/reject/$INVITATION_ID".replace("$INVITATION_ID", var1));
      this.N(class05134.L(sx, ""));
   }

   public Set<String> y() {
      return this.u.join();
   }

   public void y(List<UUID> var1) throws class05097 {
      String sx = this.L("notifications/dismiss");
      this.N(class05134.y(sx, h.N(L(var1))));
   }

   public void y(long var1, String var3) throws class05097 {
      String sx = this.N("worlds" + "/$WORLD_ID/backups".replace("$WORLD_ID", String.valueOf(var1)), "backupId=" + var3);
      this.N(class05134.y(sx, "", 40000, 600000));
   }

   public class00093 y(long var1) throws class05097 {
      String sx = this.L("worlds" + "/v1/$ID/join/pc".replace("$ID", var1 + ""));
      String s1 = this.N(class05134.N(sx, 5000, 30000));
      return class00093.N(h, s1);
   }

   public void E() throws class05097 {
      String sx = this.L("mco/tos/agreed");
      this.N(class05134.y(sx, ""));
   }

   public void N(List<UUID> var1) throws class05097 {
      String sx = this.L("notifications/seen");
      this.N(class05134.y(sx, h.N(L(var1))));
   }

   public void N(class04971 var1) throws class05097 {
      String sx = this.L("regions/ping/stat");
      this.N(class05134.y(sx, h.N(var1)));
   }

   public class04981 N(long var1) throws class05097 {
      String sx = this.L("worlds" + "/$ID".replace("$ID", String.valueOf(var1)));
      String s1 = this.N(class05134.N(sx));
      return class04981.N(h, s1);
   }

   public static class05111 N() {
      return N(class06202.Nq());
   }

   public static class05111 N(class06202 var0) {
      String sx = var0.Ny().L();
      String s1 = var0.Ny().N();
      class05111 class05111x = L;
      if (class05111x != null) {
         return class05111x;
      } else {
         synchronized (class05111.class) {
            class05111 class05111x = L;
            if (class05111x != null) {
               return class05111x;
            } else {
               class05111x = new class05111(s1, sx, var0);
               L = class05111x;
               return class05111x;
            }
         }
      }
   }

   private String N(class05134<?> var1) throws class05097 {
      var1.N("sid", this.i);
      var1.N("user", this.R);
      var1.N("version", class07529.y().comp_4025());
      var1.N(class05685.N());

      try {
         int ix = var1.y();
         if (ix != 503 && ix != 277) {
            String s1 = var1.L();
            if (ix >= 200 && ix < 300) {
               return s1;
            } else if (ix == 401) {
               String s2 = var1.L("WWW-Authenticate");
               y.info("Could not authorize you against Realms server: {}", s2);
               throw new class05097(new class05116(s2));
            } else {
               String sx = var1.N.getContentType();
               if (sx != null && sx.startsWith("text/html")) {
                  throw new class05097(class05124.y(ix, s1));
               } else {
                  class05108 class05108 = class05108.N(ix, s1);
                  throw new class05097(class05108);
               }
            }
         } else {
            int jx = var1.N();
            throw new class05098(jx, ix);
         }
      } catch (class05121 class05121) {
         throw new class05097(class05124.N(class05121));
      }
   }

   private static String N(String var0, @Nullable String var1, boolean var2) {
      try {
         return new URI(N.field_19590, var2 ? N.field_57919 : N.field_19589, "/" + var0, var1, null).toASCIIString();
      } catch (URISyntaxException urisyntaxexception) {
         throw new IllegalArgumentException(var0, urisyntaxexception);
      }
   }

   private String N(String var1, @Nullable String var2) {
      return N(var1, var2, this.y().contains("realms_in_aks"));
   }

   public class04981 N(Long var1) throws class05097 {
      String sx = String.valueOf(var1);
      String s1 = this.L("worlds" + "/$PARENT_WORLD_ID/createPrereleaseRealm".replace("$PARENT_WORLD_ID", sx));
      return class04981.N(h, this.N(class05134.y(s1, sx)));
   }

   public void N(long var1, UUID var3) throws class05097 {
      String sx = this.L("invites" + "/$WORLD_ID/invite/$UUID".replace("$WORLD_ID", String.valueOf(var1)).replace("$UUID", UndashedUuid.toString(var3)));
      this.N(class05134.y(sx));
   }

   public class05434 N(int var1, int var2, class04969 var3) throws class05097 {
      String sx = this.N(
         "worlds" + "/templates/$WORLD_TYPE".replace("$WORLD_TYPE", var3.toString()), String.format(Locale.ROOT, "page=%d&pageSize=%d", var1, var2)
      );
      return class05434.N(this.N(class05134.N(sx)));
   }

   public void N(long var1, String var3, String var4, @Nullable class00081 var5, int var6, class04980 var7, List<class00064> var8) throws class05097 {
      class00081 class00081 = var5 != null ? var5 : new class00081(class00050.field_60229, null);
      class04951 class04951 = new class04951(var3, var4);
      class00070 class00070 = new class00070(var6, var7, class00064.N(var8));
      class00080 class00080 = new class00080(class00070, var8, class00081, class04951);
      String sx = this.L("worlds" + "/$WORLD_ID/configuration".replace("$WORLD_ID", String.valueOf(var1)));
      this.N(class05134.y(sx, h.N(class00080)));
   }

   public void N(long var1, int var3, class04980 var4, List<class00064> var5) throws class05097 {
      String sx = this.L("worlds" + "/$WORLD_ID/slot/$SLOT_ID".replace("$WORLD_ID", String.valueOf(var1)).replace("$SLOT_ID", String.valueOf(var3)));
      String s1 = h.N(new class00070(var3, var4, class00064.N(var5)));
      this.N(class05134.y(sx, s1));
   }

   public boolean N(long var1, int var3) throws class05097 {
      String sx = this.L("worlds" + "/$WORLD_ID/slot/$SLOT_ID".replace("$WORLD_ID", String.valueOf(var1)).replace("$SLOT_ID", String.valueOf(var3)));
      return Boolean.valueOf(this.N(class05134.L(sx, "")));
   }

   public void N(String var1) throws class05097 {
      String sx = this.L("invites" + "/accept/$INVITATION_ID".replace("$INVITATION_ID", var1));
      this.N(class05134.L(sx, ""));
   }

   public List<class04950> N(long var1, String var3) throws class05097 {
      class06727 class06727 = new class06727();
      class06727.N = var3;
      String sx = this.L("invites" + "/$WORLD_ID".replace("$WORLD_ID", String.valueOf(var1)));
      String s1 = this.N(class05134.y(sx, h.N(class06727)));
      return class04981.N(h, s1).Z;
   }

   private boolean N(class04957 var1) {
      return this.M.yv().i(var1.u());
   }

   public void N(long var1, String var3, String var4) throws class05097 {
      class04951 class04951 = new class04951(var3, var4);
      String sx = this.L("worlds" + "/$WORLD_ID/initialize".replace("$WORLD_ID", String.valueOf(var1)));
      String s1 = h.N(class04951);
      this.N(class05134.N(sx, s1, 5000, 10000));
   }

   public class04979 W() throws class05097 {
      String sx = this.L("mco/v1/news");
      return class04979.N(this.N(class05134.N(sx, 5000, 10000)));
   }

   public Boolean R(long var1) throws class05097 {
      String sx = this.L("worlds" + "/$WORLD_ID/close".replace("$WORLD_ID", String.valueOf(var1)));
      return Boolean.valueOf(this.N(class05134.L(sx, "")));
   }

   public class00053 R() throws class05097 {
      String sx = this.L("regions/preferredRegions");
      String s1 = this.N(class05134.N(sx));

      try {
         class00053 class00053 = h.N(s1, class00053.class);
         if (class00053 == null) {
            return class00053.N();
         } else {
            Set set = class00053.y().stream().map(class00065::N).collect(Collectors.toSet());

            for (class00082 class00082 : class00082.values()) {
               if (class00082 != class00082.field_60199 && !set.contains(class00082)) {
                  y.debug("No realms region matching {} in server response", class00082);
               }
            }

            return class00053;
         }
      } catch (Exception exception) {
         y.error("Could not parse PreferredRegionSelections", exception);
         return class00053.N();
      }
   }
}
