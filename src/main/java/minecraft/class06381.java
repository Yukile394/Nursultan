package minecraft;

import Nursultan.class10576;
import com.google.common.collect.Lists;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

public class class06381 {
   private static final DynamicCommandExceptionType N = new DynamicCommandExceptionType(var0 -> class00392.y("commands.drop.no_held_items", var0));
   private static final DynamicCommandExceptionType y = new DynamicCommandExceptionType(var0 -> class00392.y("commands.drop.no_loot_table.entity", var0));
   private static final DynamicCommandExceptionType L = new DynamicCommandExceptionType(var0 -> class00392.y("commands.drop.no_loot_table.block", var0));

   public class06381() {
      super();
   }

   private static boolean N(class06695 var0, class06584 var1) {
      boolean flag = false;

      for (int i = 0; i < var0.method_5439() && !var1.R(); i++) {
         class06584 class06584 = var0.method_5438(i);
         if (var0.method_5437(i, var1)) {
            if (class06584.R()) {
               var0.method_5447(i, var1);
               flag = true;
               break;
            }

            if (N(class06584, var1)) {
               int j = var1.U() - class06584.c();
               int k = Math.min(var1.c(), j);
               var1.B(k);
               class06584.M(k);
               flag = true;
            }
         }
      }

      return flag;
   }

   private static int N(class07701 var0, class07209 var1, List<class06584> var2, class06411 var3) throws CommandSyntaxException {
      class06695 class06695 = N(var0, var1);
      ArrayList arraylist = Lists.newArrayListWithCapacity(var2.size());

      for (class06584 class06584 : var2) {
         if (N(class06695, class06584.t())) {
            class06695.method_5431();
            arraylist.add(class06584);
         }
      }

      var3.accept(arraylist);
      return arraylist.size();
   }

   private static class06695 N(class07701 var0, class07209 var1) throws CommandSyntaxException {
      class00394 class00394 = var0.R().method_8321(var1);
      if (!(class00394 instanceof class06695)) {
         throw class06352.N.create(var1.method_10263(), var1.method_10264(), var1.method_10260());
      } else {
         return (class06695)class00394;
      }
   }

   private static <T extends ArgumentBuilder<class07701, T>> T N(T var0, class10576 var1) {
      return (T)var0.then(
            ((LiteralArgumentBuilder)class07686.y("replace")
                  .then(
                     class07686.y("entity")
                        .then(
                           class07686.N("entities", class07680.y())
                              .then(
                                 var1.construct(
                                       class07686.N("slot", class07787.N()),
                                       (var0x, var1x, var2) -> N(class07680.y(var0x, "entities"), class07787.N(var0x, "slot"), var1x.size(), var1x, var2)
                                    )
                                    .then(
                                       var1.construct(
                                          class07686.N("count", IntegerArgumentType.integer(0)),
                                          (var0x, var1x, var2) -> N(
                                             class07680.y(var0x, "entities"),
                                             class07787.N(var0x, "slot"),
                                             IntegerArgumentType.getInteger(var0x, "count"),
                                             var1x,
                                             var2
                                          )
                                       )
                                    )
                              )
                        )
                  ))
               .then(
                  class07686.y("block")
                     .then(
                        class07686.N("targetPos", class00894.N())
                           .then(
                              var1.construct(
                                    class07686.N("slot", class07787.N()),
                                    (var0x, var1x, var2) -> N(
                                       (class07701)var0x.getSource(), class00894.N(var0x, "targetPos"), class07787.N(var0x, "slot"), var1x.size(), var1x, var2
                                    )
                                 )
                                 .then(
                                    var1.construct(
                                       class07686.N("count", IntegerArgumentType.integer(0)),
                                       (var0x, var1x, var2) -> N(
                                          (class07701)var0x.getSource(),
                                          class00894.N(var0x, "targetPos"),
                                          IntegerArgumentType.getInteger(var0x, "slot"),
                                          IntegerArgumentType.getInteger(var0x, "count"),
                                          var1x,
                                          var2
                                       )
                                    )
                                 )
                           )
                     )
               )
         )
         .then(
            class07686.y("insert")
               .then(
                  var1.construct(
                     class07686.N("targetPos", class00894.N()),
                     (var0x, var1x, var2) -> N((class07701)var0x.getSource(), class00894.N(var0x, "targetPos"), var1x, var2)
                  )
               )
         )
         .then(
            class07686.y("give")
               .then(var1.construct(class07686.N("players", class07680.u()), (var0x, var1x, var2) -> N(class07680.R(var0x, "players"), var1x, var2)))
         )
         .then(
            class07686.y("spawn")
               .then(
                  var1.construct(
                     class07686.N("targetPos", class00881.N()),
                     (var0x, var1x, var2) -> N((class07701)var0x.getSource(), class00881.N(var0x, "targetPos"), var1x, var2)
                  )
               )
         );
   }

   public static void N(CommandDispatcher<class07701> var0, class04348 var1) {
      var0.register(
         N(
            (LiteralArgumentBuilder & ArgumentBuilder)class07686.y("loot").requires(class07686.N(class07686.u)),
            (var1x, var2) -> var1x.then(
                  class07686.y("fish")
                     .then(
                        class07686.N("loot_table", class02198.N(var1))
                           .then(
                              ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N("pos", class00894.N())
                                          .executes(var1xx -> N(var1xx, class02198.N(var1xx, "loot_table"), class00894.N(var1xx, "pos"), class06584.E, var2)))
                                       .then(
                                          class07686.N("tool", class06770.N(var1))
                                             .executes(
                                                var1xx -> N(
                                                   var1xx,
                                                   class02198.N(var1xx, "loot_table"),
                                                   class00894.N(var1xx, "pos"),
                                                   class06770.N(var1xx, "tool").N(1, false),
                                                   var2
                                                )
                                             )
                                       ))
                                    .then(
                                       class07686.y("mainhand")
                                          .executes(
                                             var1xx -> N(
                                                var1xx,
                                                class02198.N(var1xx, "loot_table"),
                                                class00894.N(var1xx, "pos"),
                                                N((class07701)var1xx.getSource(), class07085.field_6173),
                                                var2
                                             )
                                          )
                                    ))
                                 .then(
                                    class07686.y("offhand")
                                       .executes(
                                          var1xx -> N(
                                             var1xx,
                                             class02198.N(var1xx, "loot_table"),
                                             class00894.N(var1xx, "pos"),
                                             N((class07701)var1xx.getSource(), class07085.field_6171),
                                             var2
                                          )
                                       )
                                 )
                           )
                     )
               )
               .then(
                  class07686.y("loot")
                     .then(class07686.N("loot_table", class02198.N(var1)).executes(var1xx -> N(var1xx, class02198.N(var1xx, "loot_table"), var2)))
               )
               .then(class07686.y("kill").then(class07686.N("target", class07680.N()).executes(var1xx -> N(var1xx, class07680.N(var1xx, "target"), var2))))
               .then(
                  class07686.y("mine")
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N("pos", class00894.N())
                                    .executes(var1xx -> N(var1xx, class00894.N(var1xx, "pos"), class06584.E, var2)))
                                 .then(
                                    class07686.N("tool", class06770.N(var1))
                                       .executes(var1xx -> N(var1xx, class00894.N(var1xx, "pos"), class06770.N(var1xx, "tool").N(1, false), var2))
                                 ))
                              .then(
                                 class07686.y("mainhand")
                                    .executes(var1xx -> N(var1xx, class00894.N(var1xx, "pos"), N((class07701)var1xx.getSource(), class07085.field_6173), var2))
                              ))
                           .then(
                              class07686.y("offhand")
                                 .executes(var1xx -> N(var1xx, class00894.N(var1xx, "pos"), N((class07701)var1xx.getSource(), class07085.field_6171), var2))
                           )
                     )
               )
         )
      );
   }

   private static void N(class07701 var0, List<class06584> var1) {
      if (var1.size() == 1) {
         class06584 class06584 = (class06584)var1.get(0);
         var0.N(() -> class00392.N("commands.drop.success.single", class06584.c(), class06584.V()), false);
      } else {
         var0.N(() -> class00392.N("commands.drop.success.multiple", var1.size()), false);
      }
   }

   private static void N(class07701 var0, List<class06584> var1, class05946<class05074> var2) {
      if (var1.size() == 1) {
         class06584 class06584 = (class06584)var1.get(0);
         var0.N(() -> class00392.N("commands.drop.success.single_with_table", class06584.c(), class06584.V(), class00392.N(var2.N())), false);
      } else {
         var0.N(() -> class00392.N("commands.drop.success.multiple_with_table", var1.size(), class00392.N(var2.N())), false);
      }
   }

   private static class06584 N(class07701 var0, class07085 var1) throws CommandSyntaxException {
      class07049 class07049 = var0.B();
      if (class07049 instanceof class07438) {
         return ((class07438)class07049).method_6118(var1);
      } else {
         throw N.create(class07049.method_5476());
      }
   }

   private static int N(CommandContext<class07701> var0, class07209 var1, class06584 var2, class06383 var3) throws CommandSyntaxException {
      class07701 class07701 = (class07701)var0.getSource();
      class04782 class04782 = class07701.R();
      class00500 class00500 = class04782.method_8320(var1);
      class00394 class00394 = class04782.method_8321(var1);
      Optional<class05946<class05074>> optional = class00500.i().d();
      if (optional.isEmpty()) {
         throw L.create(class00500.i().M());
      } else {
         class04160 class04160 = new class04160(class04782)
            .N(class06551.B, class06889.y(var1))
            .N(class06551.Z, class00500)
            .y(class06551.z, class00394)
            .y(class06551.N, class07701.M())
            .N(class06551.U, var2);
         List<class06584> list = class00500.N(class04160);
         return var3.accept(var0, list, var2x -> N(class07701, var2x, optional.get()));
      }
   }

   private static int N(CommandContext<class07701> var0, class07049 var1, class06383 var2) throws CommandSyntaxException {
      Optional<class05946<class05074>> optional = var1.method_5991();
      if (optional.isEmpty()) {
         throw y.create(var1.method_5476());
      } else {
         class07701 class07701 = (class07701)var0.getSource();
         class04160 class04160 = new class04160(class07701.R());
         class07049 class07049 = class07701.M();
         if (class07049 instanceof class08036 class08036) {
            class04160.N(class06551.u, class08036);
         }

         class04160.N(class06551.i, var1.method_48923().T());
         class04160.y(class06551.M, class07049);
         class04160.y(class06551.R, class07049);
         class04160.N(class06551.N, var1);
         class04160.N(class06551.B, class07701.i());
         class04162 class04162 = class04160.N(class06925.B);
         ObjectArrayList<class06584> objectarraylist = class07701.W().yd().N(optional.get()).N(class04162);
         return var2.accept(var0, objectarraylist, var2x -> N(class07701, var2x, optional.get()));
      }
   }

   private static boolean N(class06584 var0, class06584 var1) {
      return var0.c() <= var0.U() && class06584.L(var0, var1);
   }

   private static int N(Collection<class04770> var0, List<class06584> var1, class06411 var2) throws CommandSyntaxException {
      ArrayList arraylist = Lists.newArrayListWithCapacity(var1.size());

      for (class06584 class06584 : var1) {
         Iterator iterator = var0.iterator();

         while (iterator.hasNext()) {
            if (((class04770)iterator.next()).method_31548().M(class06584.t())) {
               arraylist.add(class06584);
            }
         }
      }

      var2.accept(arraylist);
      return arraylist.size();
   }

   private static void N(class07049 var0, List<class06584> var1, int var2, int var3, List<class06584> var4) {
      for (int i = 0; i < var3; i++) {
         class06584 class06584 = i < var1.size() ? (class06584)var1.get(i) : class06584.E;
         class04803 class04803 = var0.method_32318(var2 + i);
         if (class04803 != null && class04803.N(class06584.t())) {
            var4.add(class06584);
         }
      }
   }

   private static int N(Collection<? extends class07049> var0, int var1, int var2, List<class06584> var3, class06411 var4) throws CommandSyntaxException {
      ArrayList arraylist = Lists.newArrayListWithCapacity(var3.size());

      for (class07049 class07049 : var0) {
         if (class07049 instanceof class04770 class04770) {
            N(class07049, var3, var1, var2, arraylist);
            ((class07482)class04770.fields_07fa3311b0e9d3e9b883d09222919bf5a_3).u();
         } else {
            N(class07049, var3, var1, var2, arraylist);
         }
      }

      var4.accept(arraylist);
      return arraylist.size();
   }

   private static int N(class07701 var0, class06889 var1, List<class06584> var2, class06411 var3) throws CommandSyntaxException {
      class04782 class04782 = var0.R();
      var2.forEach(var2x -> {
         class00717 class00717 = new class00717(class04782, var1.M, var1.B, var1.Z, var2x.t());
         class00717.L();
         class04782.method_8649(class00717);
      });
      var3.accept(var2);
      return var2.size();
   }

   private static int N(class07701 var0, class07209 var1, int var2, int var3, List<class06584> var4, class06411 var5) throws CommandSyntaxException {
      class06695 class06695 = N(var0, var1);
      int i = class06695.method_5439();
      if (var2 >= 0 && var2 < i) {
         ArrayList arraylist = Lists.newArrayListWithCapacity(var4.size());

         for (int j = 0; j < var3; j++) {
            int k = var2 + j;
            class06584 class06584 = j < var4.size() ? (class06584)var4.get(j) : class06584.E;
            if (class06695.method_5437(k, class06584)) {
               class06695.method_5447(k, class06584);
               arraylist.add(class06584);
            }
         }

         var5.accept(arraylist);
         return arraylist.size();
      } else {
         throw class06352.L.create(var2);
      }
   }

   private static int N(CommandContext<class07701> var0, class03556<class05074> var1, class07209 var2, class06584 var3, class06383 var4) throws CommandSyntaxException {
      class07701 class07701 = (class07701)var0.getSource();
      class04162 class04162 = new class04160(class07701.R())
         .N(class06551.B, class06889.y(var2))
         .N(class06551.U, var3)
         .y(class06551.N, class07701.M())
         .N(class06925.M);
      return N(var0, var1, class04162, var4);
   }

   private static int N(CommandContext<class07701> var0, class03556<class05074> var1, class06383 var2) throws CommandSyntaxException {
      class07701 class07701 = (class07701)var0.getSource();
      class04162 class04162 = new class04160(class07701.R()).y(class06551.N, class07701.M()).N(class06551.B, class07701.i()).N(class06925.u);
      return N(var0, var1, class04162, var2);
   }

   private static int N(CommandContext<class07701> var0, class03556<class05074> var1, class04162 var2, class06383 var3) throws CommandSyntaxException {
      class07701 class07701 = (class07701)var0.getSource();
      ObjectArrayList<class06584> objectarraylist = ((class05074)var1.N()).N(var2);
      return var3.accept(var0, objectarraylist, var1x -> N(class07701, var1x));
   }
}
