package minecraft;

import Nursultan.class10577;
import com.google.common.collect.Lists;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonWriter;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.DataResult.Error;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class06395 {
   private static final Logger N = LogUtils.getLogger();
   private static final DynamicCommandExceptionType y = new DynamicCommandExceptionType(var0 -> class00392.y("commands.datapack.unknown", var0));
   private static final DynamicCommandExceptionType L = new DynamicCommandExceptionType(var0 -> class00392.y("commands.datapack.enable.failed", var0));
   private static final DynamicCommandExceptionType u = new DynamicCommandExceptionType(var0 -> class00392.y("commands.datapack.disable.failed", var0));
   private static final DynamicCommandExceptionType i = new DynamicCommandExceptionType(var0 -> class00392.y("commands.datapack.disable.failed.feature", var0));
   private static final Dynamic2CommandExceptionType R = new Dynamic2CommandExceptionType(
      (var0, var1) -> class00392.y("commands.datapack.enable.failed.no_flags", var0, var1)
   );
   private static final DynamicCommandExceptionType M = new DynamicCommandExceptionType(var0 -> class00392.y("commands.datapack.create.invalid_name", var0));
   private static final DynamicCommandExceptionType B = new DynamicCommandExceptionType(
      var0 -> class00392.y("commands.datapack.create.invalid_full_name", var0)
   );
   private static final DynamicCommandExceptionType Z = new DynamicCommandExceptionType(var0 -> class00392.y("commands.datapack.create.already_exists", var0));
   private static final Dynamic2CommandExceptionType z = new Dynamic2CommandExceptionType(
      (var0, var1) -> class00392.y("commands.datapack.create.metadata_encode_failure", var0, var1)
   );
   private static final DynamicCommandExceptionType U = new DynamicCommandExceptionType(var0 -> class00392.y("commands.datapack.create.io_failure", var0));
   private static final SuggestionProvider<class07701> E = (var0, var1) -> class07689.y(
      N(((class07701)var0.getSource()).W().yy()).stream().map(StringArgumentType::escapeIfRequired), var1
   );
   private static final SuggestionProvider<class07701> W = (var0, var1) -> {
      class01623 class01623 = ((class07701)var0.getSource()).W().yy();
      Collection<String> collection = class01623.i();
      class03767 class03767 = ((class07701)var0.getSource()).G();
      return class07689.y(N(class01623.u().stream(), var1x -> var1x.i().N(class03767), var0x -> {
         WrapOperationRuntime.checkArgumentCount(var0x, 2, "[java.util.stream.Stream, java.util.function.Predicate]");
         return ((Stream)var0x[0]).filter((Predicate)var0x[1]);
      }).map(class01055::M).filter(var1x -> !collection.contains(var1x)).map(StringArgumentType::escapeIfRequired), var1);
   };
   private static final DynamicCommandExceptionType m = new DynamicCommandExceptionType(var0 -> class00392.y("commands.datapack.fabric.internal", var0));

   private static int L(class07701 var0) {
      class01623 class01623 = var0.W().yy();
      class01623.N();
      Collection<class01055> collection = class01623.M();
      if (collection.isEmpty()) {
         var0.N(() -> class00392.L("commands.datapack.list.enabled.none"), false);
      } else {
         var0.N(() -> class00392.N("commands.datapack.list.enabled.success", collection.size(), class00390.y(collection, var0xx -> var0xx.N(true))), false);
      }

      return collection.size();
   }

   public class06395() {
      super();
   }

   private static int y(class07701 var0) {
      class01623 class01623 = var0.W().yy();
      class01623.N();
      Collection<class01055> collection = class01623.M();
      Collection<class01055> collection1 = class01623.u();
      class03767 class03767 = var0.G();
      List<class01055> list = collection1.stream().filter(var2x -> !collection.contains(var2x) && var2x.i().N(class03767)).toList();
      if (list.isEmpty()) {
         var0.N(() -> class00392.L("commands.datapack.list.available.none"), false);
      } else {
         var0.N(() -> class00392.N("commands.datapack.list.available.success", list.size(), class00390.y(list, var0xx -> var0xx.N(false))), false);
      }

      return list.size();
   }

   private static int N(class07701 var0, class01055 var1) {
      ArrayList arraylist = Lists.newArrayList(var0.W().yy().M());
      arraylist.remove(var1);
      var0.N(() -> class00392.N("commands.datapack.modify.disable", var1.N(true)), true);
      class06200.N(arraylist.stream().map(class01055::M).collect(Collectors.toList()), var0);
      return arraylist.size();
   }

   private static Collection N(class01623 var0) {
      return var0.M().stream().filter(var0x -> !var0x.fabric$isHidden()).map(class01055::M).toList();
   }

   private static Stream N(Stream var0, Predicate var1, Operation var2) {
      return ((Stream)var2.call(new Object[]{var0, var1})).filter(var0x -> !var0x.fabric$isHidden());
   }

   private static void N(CommandContext var0, String var1, boolean var2, CallbackInfoReturnable var3, class01055 var4) throws CommandSyntaxException {
      if (var4.fabric$isHidden()) {
         throw m.create(var4.M());
      }
   }

   public static void N(CommandDispatcher<class07701> var0, class04348 var1) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("datapack")
                        .requires(class07686.N(class07686.u)))
                     .then(
                        class07686.y("enable")
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N(
                                                "name", StringArgumentType.string()
                                             )
                                             .suggests(W)
                                             .executes(
                                                var0x -> N(
                                                   (class07701)var0x.getSource(),
                                                   N(var0x, "name", true),
                                                   (var0xx, var1x) -> var1x.U().N(var0xx, var1x, class01055::B, false)
                                                )
                                             ))
                                          .then(
                                             class07686.y("after")
                                                .then(
                                                   class07686.N("existing", StringArgumentType.string())
                                                      .suggests(E)
                                                      .executes(
                                                         var0x -> N(
                                                            (class07701)var0x.getSource(),
                                                            N(var0x, "name", true),
                                                            (var1x, var2) -> var1x.add(var1x.indexOf(N(var0x, "existing", false)) + 1, var2)
                                                         )
                                                      )
                                                )
                                          ))
                                       .then(
                                          class07686.y("before")
                                             .then(
                                                class07686.N("existing", StringArgumentType.string())
                                                   .suggests(E)
                                                   .executes(
                                                      var0x -> N(
                                                         (class07701)var0x.getSource(),
                                                         N(var0x, "name", true),
                                                         (var1x, var2) -> var1x.add(var1x.indexOf(N(var0x, "existing", false)), var2)
                                                      )
                                                   )
                                             )
                                       ))
                                    .then(class07686.y("last").executes(var0x -> N((class07701)var0x.getSource(), N(var0x, "name", true), List::add))))
                                 .then(
                                    class07686.y("first")
                                       .executes(var0x -> N((class07701)var0x.getSource(), N(var0x, "name", true), (var0xx, var1x) -> var0xx.add(0, var1x)))
                                 )
                           )
                     ))
                  .then(
                     class07686.y("disable")
                        .then(
                           class07686.N("name", StringArgumentType.string())
                              .suggests(E)
                              .executes(var0x -> N((class07701)var0x.getSource(), N(var0x, "name", false)))
                        )
                  ))
               .then(
                  ((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("list").executes(var0x -> N((class07701)var0x.getSource())))
                        .then(class07686.y("available").executes(var0x -> y((class07701)var0x.getSource()))))
                     .then(class07686.y("enabled").executes(var0x -> L((class07701)var0x.getSource())))
               ))
            .then(
               ((LiteralArgumentBuilder)class07686.y("create").requires(class07686.N(class07686.R)))
                  .then(
                     class07686.N("id", StringArgumentType.string())
                        .then(
                           class07686.N("description", class07698.N(var1))
                              .executes(
                                 var0x -> N((class07701)var0x.getSource(), StringArgumentType.getString(var0x, "id"), class07698.y(var0x, "description"))
                              )
                        )
                  )
            )
      );
   }

   private static int N(class07701 var0, String var1, class00392 var2) throws CommandSyntaxException {
      Path path = var0.W().N(class05071.z);
      if (!class06290.R(var1)) {
         throw M.create(var1);
      } else if (!class06290.y(var1)) {
         throw B.create(var1);
      } else {
         Path path1 = path.resolve(var1);
         if (Files.exists(path1)) {
            throw Z.create(var1);
         } else {
            class01612 class01612 = new class01612(var2, class07529.y().method_70592(class01603.field_14190).N());
            DataResult dataresult = class01612.y.y().encodeStart(JsonOps.INSTANCE, class01612);
            Optional optional = dataresult.error();
            if (optional.isPresent()) {
               throw z.create(var1, ((Error)optional.get()).message());
            } else {
               JsonObject jsonobject = new JsonObject();
               jsonobject.add(class01612.y.N(), (JsonElement)dataresult.getOrThrow());

               try {
                  Files.createDirectory(path1);
                  Files.createDirectory(path1.resolve(class01603.field_14190.N()));

                  try (BufferedWriter bufferedwriter = Files.newBufferedWriter(path1.resolve("pack.mcmeta"), StandardCharsets.UTF_8)) {
                     JsonWriter jsonwriter = new JsonWriter(bufferedwriter);

                     try {
                        jsonwriter.setSerializeNulls(false);
                        jsonwriter.setIndent("  ");
                        class05001.N(jsonwriter, jsonobject, null);
                     } catch (Throwable throwable1) {
                        try {
                           jsonwriter.close();
                        } catch (Throwable throwable) {
                           throwable1.addSuppressed(throwable);
                        }

                        throw throwable1;
                     }

                     jsonwriter.close();
                  }
               } catch (IOException ioexception) {
                  N.warn("Failed to create pack at {}", path.toAbsolutePath(), ioexception);
                  throw U.create(var1);
               }

               var0.N(() -> class00392.N("commands.datapack.create.success", var1), true);
               return 1;
            }
         }
      }
   }

   private static int N(class07701 var0, class01055 var1, class10577 var2) throws CommandSyntaxException {
      ArrayList arraylist = Lists.newArrayList(var0.W().yy().M());
      var2.apply(arraylist, var1);
      var0.N(() -> class00392.N("commands.datapack.modify.enable", var1.N(true)), true);
      class06200.N(arraylist.stream().map(class01055::M).collect(Collectors.toList()), var0);
      return arraylist.size();
   }

   private static class01055 N(CommandContext<class07701> var0, String var1, boolean var2) throws CommandSyntaxException {
      String s = StringArgumentType.getString(var0, var1);
      class01623 class01623 = ((class07701)var0.getSource()).W().yy();
      class01055 class01055 = class01623.L(s);
      if (class01055 == null) {
         throw y.create(s);
      } else {
         Collection collection = class01623.M();
         N(var0, var1, var2, null, class01055);
         boolean flag = collection.contains(class01055);
         if (var2 && flag) {
            throw L.create(s);
         } else if (!var2 && !flag) {
            throw u.create(s);
         } else {
            class03767 class03767x = ((class07701)var0.getSource()).G();
            class03767 class03767x = class01055.i();
            if (!var2 && !class03767x.y() && class01055.E() == class01283.u) {
               throw i.create(s);
            } else if (!class03767x.N(class03767x)) {
               throw R.create(s, class03794.N(class03767x, class03767x));
            } else {
               return class01055;
            }
         }
      }
   }

   private static int N(class07701 var0) {
      return L(var0) + y(var0);
   }
}
