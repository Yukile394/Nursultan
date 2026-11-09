package minecraft;

import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.concurrent.ExecutionException;
import net.irisshaders.iris.platform.IrisPlatformHelpers;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class class03330 {
   private static final Logger y = LogUtils.getLogger();
   public static final class00392 N = class00392.L("quickplay.error.title");
   private static final class00392 L = class00392.L("quickplay.error.invalid_identifier");
   private static final class00392 u = class00392.L("quickplay.error.realm_connect");
   private static final class00392 i = class00392.L("quickplay.error.realm_permission");
   private static final class00392 R = class00392.L("gui.toTitle");
   private static final class00392 M = class00392.L("gui.toWorld");
   private static final class00392 B = class00392.L("gui.toRealms");

   public class03330() {
      super();
   }

   private static void y(class06202 var0, String var1) {
      class04563 class04563 = new class04563(var0);
      class04563.N();
      class04568 class04568 = class04563.N(var1);
      if (class04568 == null) {
         class04568 = new class04568(class08392.N("selectServer.defaultName"), var1, class04585.field_45611);
         class04563.N(class04568, true);
         class04563.y();
      }

      class03420 class03420 = class03420.N(var1);
      class05763.N(new class05304(new class04705()), var0, class03420, class04568, true, null);
   }

   public static void N(class06202 var0, class01276 var1, class05111 var2) {
      if (!((class01276)var1).N()) {
         y.error("Quick play disabled");
         var0.N(new class04705());
      } else {
         switch (var1) {
            case class01282 class01282:
               y(var0, class01282.y());
               break;
            case class01240 class01240:
               N(var0, var2, class01240.y());
               break;
            case class01268 class01268:
               String s = ((class01268)var1).y();
               if (class05018.B(s)) {
                  s = N(var0.NL());
               }

               N(var0, s);
               break;
            case class01253 class01253:
               y.error("Quick play disabled");
               var0.N(new class04705());
               break;
            default:
               throw new MatchException(null, null);
         }
      }
   }

   private static void N(class06202 var0, String var1, CallbackInfo var2) {
      if (IrisPlatformHelpers.getInstance().isDevelopmentEnvironment()) {
         var2.cancel();
         if (!var0.NL().y(var1)) {
            var0.S()
               .N(
                  var1,
                  new class07312(
                     var1, class07282.field_9220, false, class07086.field_5807, true, new class07305(class03767.N(class03794.u, class03794.L)), class03776.u
                  ),
                  class05934.N(),
                  class05964::N,
                  (class05096)class06202.Nq().v_3
               );
         } else {
            var0.S().N(var1, () -> var0.N(new class04705()));
         }
      }
   }

   private static void N(class06202 var0, class05111 var1, String var2) {
      long ix;
      class04967 class04967;
      try {
         ix = Long.parseLong(var2);
         class04967 = var1.L();
      } catch (NumberFormatException numberformatexception) {
         class05685 class05685x = new class05685(new class04705());
         var0.N(new class05364(class05685x, N, L, B));
         return;
      } catch (class05097 class05097) {
         class04705 class04705x = new class04705();
         var0.N(new class05364(class04705x, N, u, R));
         return;
      }

      class04981 class04981 = class04967.N().stream().filter(var2x -> var2x.y == ix).findFirst().orElse(null);
      if (class04981 == null) {
         class05685 class05685 = new class05685(new class04705());
         var0.N(new class05364(class05685, N, i, B));
      } else {
         class04705 class04705 = new class04705();
         var0.N(new class04708(class04705, new class04693(class04705, class04981)));
      }
   }

   @Nullable
   private static String N(class04777 var0) {
      try {
         List<class06434> list = var0.N(var0.y()).get();
         if (list.isEmpty()) {
            y.warn("no latest singleplayer world found");
            return null;
         } else {
            return list.getFirst().N();
         }
      } catch (ExecutionException | InterruptedException interruptedexception) {
         y.error("failed to load singleplayer world summaries", interruptedexception);
         return null;
      }
   }

   private static void N(class06202 var0, @Nullable String var1) {
      CallbackInfo callbackinfo = new CallbackInfo("", true);
      N(var0, var1, callbackinfo);
      if (!callbackinfo.isCancelled()) {
         if (!class05018.B(var1) && var0.NL().y(var1)) {
            var0.S().N(var1, () -> var0.N(new class04705()));
         } else {
            class05205 class05205 = new class05205(new class04705());
            var0.N(new class05364(class05205, N, L, M));
         }
      }
   }
}
