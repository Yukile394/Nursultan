package minecraft;

import com.mojang.authlib.minecraft.BanDetails;
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;
import java.net.URI;
import java.time.Duration;
import java.time.Instant;
import org.apache.commons.lang3.StringUtils;

public class class03051 {
   private static final class00392 y = class00392.L("gui.banned.title.temporary").N(class06541.field_1067);
   private static final class00392 L = class00392.L("gui.banned.title.permanent").N(class06541.field_1067);
   public static final class00392 N = class00392.L("gui.banned.name.title").N(class06541.field_1067);
   private static final class00392 u = class00392.L("gui.banned.skin.title").N(class06541.field_1067);
   private static final class00392 i = class00392.N("gui.banned.skin.description", class00392.N(class03597.m));

   private static class00392 L(BanDetails var0) {
      String s = var0.reason();
      String s1 = var0.reasonMessage();
      if (StringUtils.isNumeric(s)) {
         int ix = Integer.parseInt(s);
         class01980 class01980 = class01980.N(ix);
         Object object;
         if (class01980 != null) {
            object = class00390.N(class01980.N(), class00405.N.N(true));
         } else if (s1 != null) {
            object = class00392.N("gui.banned.description.reason_id_message", ix, s1).N(class06541.field_1067);
         } else {
            object = class00392.N("gui.banned.description.reason_id", ix).N(class06541.field_1067);
         }

         return class00392.N("gui.banned.description.reason", object);
      } else {
         return class00392.L("gui.banned.description.unknownreason");
      }
   }

   public class03051() {
      super();
   }

   private static class00392 i(BanDetails var0) {
      Duration duration = Duration.between(Instant.now(), var0.expires());
      long ix = duration.toHours();
      if (ix > 72L) {
         return class05220.N(duration.toDays());
      } else {
         return ix < 1L ? class05220.L(duration.toMinutes()) : class05220.y(duration.toHours());
      }
   }

   private static class00392 u(BanDetails var0) {
      if (R(var0)) {
         class00392 class00392 = i(var0);
         return class00392.N("gui.banned.description.temporary", class00392.N("gui.banned.description.temporary.duration", class00392).N(class06541.field_1067));
      } else {
         return class00392.L("gui.banned.description.permanent").N(class06541.field_1067);
      }
   }

   private static class00392 y(BanDetails var0) {
      return class00392.N("gui.banned.description", L(var0), u(var0), class00392.N(class03597.m));
   }

   public static class01321 N(Runnable var0) {
      URI uri = class03597.m;
      return new class01321(var2 -> {
         if (var2) {
            class07536.m().N(uri);
         }

         var0.run();
      }, u, i, uri, class05220.W, true);
   }

   public static class01321 N(BooleanConsumer var0, BanDetails var1) {
      return new class01321(var0, N(var1), y(var1), class03597.m, class05220.W, true);
   }

   private static class00392 N(BanDetails var0) {
      return R(var0) ? y : L;
   }

   public static class01321 N(String var0, Runnable var1) {
      URI uri = class03597.m;
      return new class01321(var2x -> {
         if (var2x) {
            class07536.m().N(uri);
         }

         var1.run();
      }, N, class00392.N("gui.banned.name.description", class00392.y(var0).N(class06541.field_1054), class00392.N(class03597.m)), uri, class05220.W, true);
   }

   private static boolean R(BanDetails var0) {
      return var0.expires() != null;
   }
}
