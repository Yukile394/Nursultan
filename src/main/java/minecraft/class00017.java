package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.function.Consumer;

public class class00017 {
   private static final class00392 N = class00392.L("commands.version.header");
   private static final class00392 y = class00392.L("commands.version.stable.yes");
   private static final class00392 L = class00392.L("commands.version.stable.no");

   public class00017() {
      super();
   }

   public static void N(CommandDispatcher<class07701> var0, boolean var1) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("version").requires(class07686.N(var1 ? class07686.u : class07686.y)))
            .executes(var0x -> {
               class07701 class07701 = (class07701)var0x.getSource();
               class07701.N(N);
               N(class07701::N);
               return 1;
            })
      );
   }

   public static void N(Consumer<class00392> var0) {
      class04551 class04551 = class07529.y();
      var0.accept(class00392.N("commands.version.id", class04551.comp_4024()));
      var0.accept(class00392.N("commands.version.name", class04551.comp_4025()));
      var0.accept(class00392.N("commands.version.data", class04551.comp_4026().y()));
      var0.accept(class00392.N("commands.version.series", class04551.comp_4026().L()));
      var0.accept(class00392.N("commands.version.protocol", class04551.comp_4027(), "0x" + Integer.toHexString(class04551.comp_4027())));
      var0.accept(class00392.N("commands.version.build_time", class00392.N(class04551.comp_4030())));
      var0.accept(class00392.N("commands.version.pack.resource", class04551.method_70592(class01603.field_14188).toString()));
      var0.accept(class00392.N("commands.version.pack.data", class04551.method_70592(class01603.field_14190).toString()));
      var0.accept(class04551.comp_4031() ? y : L);
   }
}
