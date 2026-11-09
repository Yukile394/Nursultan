package minecraft;

import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import org.jspecify.annotations.Nullable;

public class class04163 {
   public class04163() {
      super();
   }

   private static void N(class04176 var0) {
      var0.L();
   }

   public static void N(CommandDispatcher<class07701> var0, class04348 var1) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("debugconfig")
                     .requires(class07686.N(class07686.i)))
                  .then(
                     class07686.y("config")
                        .then(class07686.N("target", class07680.L()).executes(var0x -> N((class07701)var0x.getSource(), class07680.i(var0x, "target"))))
                  ))
               .then(
                  class07686.y("unconfig")
                     .then(
                        class07686.N("target", class05193.N())
                           .suggests((var0x, var1x) -> class07689.y(N(((class07701)var0x.getSource()).W()), var1x))
                           .executes(var0x -> N((class07701)var0x.getSource(), class05193.N(var0x, "target")))
                     )
               ))
            .then(
               class07686.y("dialog")
                  .then(
                     class07686.N("target", class05193.N())
                        .suggests((var0x, var1x) -> class07689.y(N(((class07701)var0x.getSource()).W()), var1x))
                        .then(
                           class07686.N("dialog", class02198.u(var1))
                              .executes(var0x -> N((class07701)var0x.getSource(), class05193.N(var0x, "target"), class02198.u(var0x, "dialog")))
                        )
                  )
            )
      );
   }

   private static Iterable<String> N(class02796 var0) {
      HashSet hashset = new HashSet();
      Iterator<class00642> iterator = var0.Na().i().iterator();

      while (iterator.hasNext()) {
         if (iterator.next().method_10744() instanceof class04176 class04176) {
            hashset.add(class04176.method_52404().id().toString());
         }
      }

      return hashset;
   }

   private static int N(class07701 var0, class04770 var1) {
      GameProfile gameprofile = var1.method_7334();
      var1.field_13987.method_52414();
      var0.N(() -> class00392.y("Switched player " + gameprofile.name() + "(" + gameprofile.id() + ") to config mode"), false);
      return 1;
   }

   @Nullable
   private static class04176 N(class02796 var0, UUID var1) {
      Iterator<class00642> iterator = var0.Na().i().iterator();

      while (iterator.hasNext()) {
         if (iterator.next().method_10744() instanceof class04176 class04176 && class04176.method_52404().id().equals(var1)) {
            return class04176;
         }
      }

      return null;
   }

   private static int N(class07701 var0, UUID var1) {
      class04176 class04176 = N(var0.W(), var1);
      if (class04176 != null) {
         N(class04176);
         return 1;
      } else {
         var0.y(class00392.y("Can't find player to unconfig"));
         return 0;
      }
   }

   private static int N(class07701 var0, UUID var1, class03556<class09037> var2) {
      class04176 class04176 = N(var0.W(), var1);
      if (class04176 != null) {
         class04176.method_14364(new class09030(var2));
         return 1;
      } else {
         var0.y(class00392.y("Can't find player to talk to"));
         return 0;
      }
   }
}
