package minecraft;

import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class class00189 {
   public static final class01631[] N = new class01631[]{
      N("entity/player/slim/alex", class04208.field_41122),
      N("entity/player/slim/ari", class04208.field_41122),
      N("entity/player/slim/efe", class04208.field_41122),
      N("entity/player/slim/kai", class04208.field_41122),
      N("entity/player/slim/makena", class04208.field_41122),
      N("entity/player/slim/noor", class04208.field_41122),
      N("entity/player/slim/steve", class04208.field_41122),
      N("entity/player/slim/sunny", class04208.field_41122),
      N("entity/player/slim/zuri", class04208.field_41122),
      N("entity/player/wide/alex", class04208.field_41123),
      N("entity/player/wide/ari", class04208.field_41123),
      N("entity/player/wide/efe", class04208.field_41123),
      N("entity/player/wide/kai", class04208.field_41123),
      N("entity/player/wide/makena", class04208.field_41123),
      N("entity/player/wide/noor", class04208.field_41123),
      N("entity/player/wide/steve", class04208.field_41123),
      N("entity/player/wide/sunny", class04208.field_41123),
      N("entity/player/wide/zuri", class04208.field_41123)
   };

   public class00189() {
      super();
   }

   public static class01631 y() {
      return N[6];
   }

   public static class01631 N(UUID var0) {
      return N[Math.floorMod(var0.hashCode(), N.length)];
   }

   private static class01631 N(String var0, class04208 var1) {
      return new class01631(new class06953(class01894.y(var0)), null, null, var1, true);
   }

   public static class01631 N(GameProfile var0) {
      return N(var0.id());
   }

   public static class01894 N() {
      return y().N().y();
   }
}
