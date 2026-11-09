package minecraft;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class class06675 {
   private static final Map<String, class06675> P = Maps.newHashMap();
   private static final Map<String, class06675> s = Maps.newHashMap();
   public static final Codec<class06675> N = Codec.STRING
      .comapFlatMap(
         var0 -> y(var0).<DataResult>map(DataResult::success).orElse(DataResult.error(() -> "No scoreboard criteria with name: " + var0)), class06675::y
      );
   public static final class06675 y = N("dummy");
   public static final class06675 L = N("trigger");
   public static final class06675 u = N("deathCount");
   public static final class06675 i = N("playerKillCount");
   public static final class06675 R = N("totalKillCount");
   public static final class06675 M = N("health", true, class06640.field_1471);
   public static final class06675 B = N("food", true, class06640.field_1472);
   public static final class06675 Z = N("air", true, class06640.field_1472);
   public static final class06675 z = N("armor", true, class06640.field_1472);
   public static final class06675 U = N("xp", true, class06640.field_1472);
   public static final class06675 E = N("level", true, class06640.field_1472);
   public static final class06675[] W = new class06675[]{
      N("teamkill." + class06541.field_1074.R()),
      N("teamkill." + class06541.field_1058.R()),
      N("teamkill." + class06541.field_1077.R()),
      N("teamkill." + class06541.field_1062.R()),
      N("teamkill." + class06541.field_1079.R()),
      N("teamkill." + class06541.field_1064.R()),
      N("teamkill." + class06541.field_1065.R()),
      N("teamkill." + class06541.field_1080.R()),
      N("teamkill." + class06541.field_1063.R()),
      N("teamkill." + class06541.field_1078.R()),
      N("teamkill." + class06541.field_1060.R()),
      N("teamkill." + class06541.field_1075.R()),
      N("teamkill." + class06541.field_1061.R()),
      N("teamkill." + class06541.field_1076.R()),
      N("teamkill." + class06541.field_1054.R()),
      N("teamkill." + class06541.field_1068.R())
   };
   public static final class06675[] m = new class06675[]{
      N("killedByTeam." + class06541.field_1074.R()),
      N("killedByTeam." + class06541.field_1058.R()),
      N("killedByTeam." + class06541.field_1077.R()),
      N("killedByTeam." + class06541.field_1062.R()),
      N("killedByTeam." + class06541.field_1079.R()),
      N("killedByTeam." + class06541.field_1064.R()),
      N("killedByTeam." + class06541.field_1065.R()),
      N("killedByTeam." + class06541.field_1080.R()),
      N("killedByTeam." + class06541.field_1063.R()),
      N("killedByTeam." + class06541.field_1078.R()),
      N("killedByTeam." + class06541.field_1060.R()),
      N("killedByTeam." + class06541.field_1075.R()),
      N("killedByTeam." + class06541.field_1061.R()),
      N("killedByTeam." + class06541.field_1076.R()),
      N("killedByTeam." + class06541.field_1054.R()),
      N("killedByTeam." + class06541.field_1068.R())
   };
   private final String T;
   private final boolean b;
   private final class06640 j;

   public boolean L() {
      return this.b;
   }

   protected class06675(String var1, boolean var2, class06640 var3) {
      super();
      this.T = var1;
      this.b = var2;
      this.j = var3;
      s.put(var1, this);
   }

   protected class06675(String var1) {
      this(var1, false, class06640.field_1472);
   }

   public class06640 u() {
      return this.j;
   }

   public String y() {
      return this.T;
   }

   public static Optional<class06675> y(String var0) {
      class06675 class06675 = s.get(var0);
      if (class06675 != null) {
         return Optional.of(class06675);
      } else {
         int ix = var0.indexOf(58);
         return ix < 0
            ? Optional.empty()
            : class04206.G.y(class01894.N(var0.substring(0, ix), '.')).flatMap(var2x -> N((class04922<?>)var2x, class01894.N(var0.substring(ix + 1), '.')));
      }
   }

   public static Set<String> N() {
      return ImmutableSet.copyOf(P.keySet());
   }

   public static class06675 N(String var0) {
      return N(var0, false, class06640.field_1472);
   }

   public static class06675 N(String var0, boolean var1, class06640 var2) {
      class06675 class06675 = new class06675(var0, var1, var2);
      P.put(var0, class06675);
      return class06675;
   }

   private static <T> Optional<class06675> N(class04922<T> var0, class01894 var1) {
      return var0.y().y(var1).map(var0::y);
   }
}
