package minecraft;

import Nursultan.class09108;
import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.mojang.logging.LogUtils;
import com.mojang.util.UUIDTypeAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.Map.Entry;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class04981 extends class05105 implements class04942 {
   private static final Logger w = LogUtils.getLogger();
   private static final int k = -1;
   public static final class00392 N = class00392.L("mco.play.button.realm.closed");
   @SerializedName("id")
   public long y = -1L;
   @SerializedName("remoteSubscriptionId")
   @Nullable
   public String L;
   @SerializedName("name")
   @Nullable
   public String u;
   @SerializedName("motd")
   public String i = "";
   @SerializedName("state")
   public class04961 R = class04961.field_19433;
   @SerializedName("owner")
   @Nullable
   public String M;
   @SerializedName("ownerUUID")
   @JsonAdapter(UUIDTypeAdapter.class)
   public UUID B = class07536.R;
   @SerializedName("players")
   public List<class04950> Z = Lists.newArrayList();
   @SerializedName("slots")
   private List<class00072> Y = U();
   @class09108
   public Map<Integer, class00072> z = new HashMap<>();
   @SerializedName("expired")
   public boolean U;
   @SerializedName("expiredTrial")
   public boolean E = false;
   @SerializedName("daysLeft")
   public int W;
   @SerializedName("worldType")
   public class04969 m = class04969.field_19437;
   @SerializedName("isHardcore")
   public boolean P = false;
   @SerializedName("gameMode")
   public int s = -1;
   @SerializedName("activeSlot")
   public int T = -1;
   @SerializedName("minigameName")
   @Nullable
   public String b;
   @SerializedName("minigameId")
   public int j = -1;
   @SerializedName("minigameImage")
   @Nullable
   public String v;
   @SerializedName("parentWorldId")
   public long n = -1L;
   @SerializedName("parentWorldName")
   @Nullable
   public String t;
   @SerializedName("activeVersion")
   public String G = "";
   @SerializedName("compatibility")
   public class04949 l = class04949.field_46697;
   @SerializedName("regionSelectionPreference")
   @Nullable
   public class00081 d;

   private static void L(class04981 var0) {
      var0.Y.forEach(var1x -> var0.z.put(var1x.N, var1x));

      for (int ix = 1; ix <= 3; ix++) {
         if (!var0.z.containsKey(ix)) {
            var0.z.put(ix, class00072.N(ix));
         }
      }
   }

   public class04568 L(String var1) {
      return new class04568(Objects.requireNonNullElse(this.u, "unknown server"), var1, class04585.field_45610);
   }

   @Nullable
   public String L() {
      return this.b;
   }

   public boolean M() {
      return !this.U && this.R == class04961.field_19434 && (this.u() || this.i() || this.E());
   }

   public class04981() {
      super();
   }

   @Override
   public boolean equals(Object var1) {
      if (var1 == null) {
         return false;
      } else if (var1 == this) {
         return true;
      } else if (var1.getClass() != this.getClass()) {
         return false;
      } else {
         class04981 class04981 = (class04981)var1;
         return new EqualsBuilder()
            .append(this.y, class04981.y)
            .append(this.u, class04981.u)
            .append(this.i, class04981.i)
            .append(this.R, class04981.R)
            .append(this.M, class04981.M)
            .append(this.U, class04981.U)
            .append(this.m, this.m)
            .isEquals();
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.y, this.u, this.i, this.R, this.M, this.U);
   }

   public class04981 B() {
      class04981 class04981 = new class04981();
      class04981.y = this.y;
      class04981.L = this.L;
      class04981.u = this.u;
      class04981.i = this.i;
      class04981.R = this.R;
      class04981.M = this.M;
      class04981.Z = this.Z;
      class04981.Y = this.Y.stream().map(class00072::N).toList();
      class04981.z = this.N(this.z);
      class04981.U = this.U;
      class04981.E = this.E;
      class04981.W = this.W;
      class04981.m = this.m;
      class04981.P = this.P;
      class04981.s = this.s;
      class04981.B = this.B;
      class04981.b = this.b;
      class04981.T = this.T;
      class04981.j = this.j;
      class04981.v = this.v;
      class04981.t = this.t;
      class04981.n = this.n;
      class04981.G = this.G;
      class04981.l = this.l;
      class04981.d = this.d != null ? this.d.N() : null;
      return class04981;
   }

   public boolean Z() {
      return this.n != -1L;
   }

   public boolean i() {
      return this.l.y();
   }

   private static List<class00072> U() {
      ArrayList arraylist = new ArrayList();
      arraylist.add(class00072.N(1));
      arraylist.add(class00072.N(2));
      arraylist.add(class00072.N(3));
      return arraylist;
   }

   public boolean z() {
      return this.m == class04969.field_19438;
   }

   public boolean u() {
      return this.l.N();
   }

   private static void y(class04981 var0) {
      var0.Z
         .sort(
            (var0x, var1) -> ComparisonChain.start()
               .compareFalseFirst(var1.u, var0x.u)
               .compare(var0x.N.toLowerCase(Locale.ROOT), var1.N.toLowerCase(Locale.ROOT))
               .result()
         );
   }

   @Nullable
   public String y() {
      return this.u;
   }

   public void y(String var1) {
      this.i = var1;
   }

   private boolean E() {
      return class06202.Nq().y(this.B);
   }

   public String N(int var1) {
      return this.u == null ? this.z.get(var1).y.N(var1) : this.u + " (" + this.z.get(var1).y.N(var1) + ")";
   }

   public String N() {
      return this.i;
   }

   public static void N(class04981 var0) {
      if (var0.Z == null) {
         var0.Z = Lists.newArrayList();
      }

      if (var0.Y == null) {
         var0.Y = U();
      }

      if (var0.z == null) {
         var0.z = new HashMap<>();
      }

      if (var0.m == null) {
         var0.m = class04969.field_19437;
      }

      if (var0.G == null) {
         var0.G = "";
      }

      if (var0.l == null) {
         var0.l = class04949.field_46697;
      }

      if (var0.d == null) {
         var0.d = class00081.N;
      }

      y(var0);
      L(var0);
   }

   public void N(String var1) {
      this.u = var1;
   }

   public static class04981 N(class04968 var0, String var1) {
      try {
         class04981 class04981 = var0.N(var1, class04981.class);
         if (class04981 == null) {
            w.error("Could not parse McoServer: {}", var1);
            return new class04981();
         } else {
            N(class04981);
            return class04981;
         }
      } catch (Exception exception) {
         w.error("Could not parse McoServer", exception);
         return new class04981();
      }
   }

   public Map<Integer, class00072> N(Map<Integer, class00072> var1) {
      HashMap hashmap = Maps.newHashMap();

      for (Entry entry : var1.entrySet()) {
         hashmap.put((Integer)entry.getKey(), new class00072((Integer)entry.getKey(), ((class00072)entry.getValue()).y.L(), ((class00072)entry.getValue()).L));
      }

      return hashmap;
   }

   public boolean R() {
      return this.l.L();
   }
}
