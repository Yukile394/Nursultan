package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class class02094 {
   private static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(var0 -> class00392.y("commands.ride.not_riding", var0));
   private static final Dynamic2CommandExceptionType y = new Dynamic2CommandExceptionType(
      (var0, var1) -> class00392.y("commands.ride.already_riding", var0, var1)
   );
   private static final Dynamic2CommandExceptionType L = new Dynamic2CommandExceptionType(
      (var0, var1) -> class00392.y("commands.ride.mount.failure.generic", var0, var1)
   );
   private static final SimpleCommandExceptionType u = new SimpleCommandExceptionType(class00392.L("commands.ride.mount.failure.cant_ride_players"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(class00392.L("commands.ride.mount.failure.loop"));
   private static final SimpleCommandExceptionType R = new SimpleCommandExceptionType(class00392.L("commands.ride.mount.failure.wrong_dimension"));

   public class02094() {
      super();
   }

   private static int N(class07701 var0, class07049 var1, class07049 var2) throws CommandSyntaxException {
      class07049 class07049 = var1.method_5854();
      if (class07049 != null) {
         throw y.create(var1.method_5476(), class07049.method_5476());
      } else if (var2.method_5864() == class07078.Ly) {
         throw u.create();
      } else if (var1.method_24204().anyMatch(var1x -> var1x == var2)) {
         throw i.create();
      } else if (var1.method_73183() != var2.method_73183()) {
         throw R.create();
      } else if (!var1.method_5873(var2, true, true)) {
         throw L.create(var1.method_5476(), var2.method_5476());
      } else {
         var0.N(() -> class00392.N("commands.ride.mount.success", var1.method_5476(), var2.method_5476()), true);
         return 1;
      }
   }

   private static int N(class07701 var0, class07049 var1) throws CommandSyntaxException {
      class07049 class07049 = var1.method_5854();
      if (class07049 == null) {
         throw N.create(var1.method_5476());
      } else {
         var1.method_5848();
         var0.N(() -> class00392.N("commands.ride.dismount.success", var1.method_5476(), class07049.method_5476()), true);
         return 1;
      }
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("ride").requires(class07686.N(class07686.u)))
            .then(
               ((RequiredArgumentBuilder)class07686.N("target", class07680.N())
                     .then(
                        class07686.y("mount")
                           .then(
                              class07686.N("vehicle", class07680.N())
                                 .executes(var0x -> N((class07701)var0x.getSource(), class07680.N(var0x, "target"), class07680.N(var0x, "vehicle")))
                           )
                     ))
                  .then(class07686.y("dismount").executes(var0x -> N((class07701)var0x.getSource(), class07680.N(var0x, "target"))))
            )
      );
   }
}
