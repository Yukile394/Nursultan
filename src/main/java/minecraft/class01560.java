package minecraft;

import com.google.common.base.Joiner;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import it.unimi.dsi.fastutil.longs.LongSet;

public class class01560 {
   private static final int N = 256;
   private static final Dynamic2CommandExceptionType y = new Dynamic2CommandExceptionType((var0, var1) -> class00392.y("commands.forceload.toobig", var0, var1));
   private static final Dynamic2CommandExceptionType L = new Dynamic2CommandExceptionType(
      (var0, var1) -> class00392.y("commands.forceload.query.failure", var0, var1)
   );
   private static final SimpleCommandExceptionType u = new SimpleCommandExceptionType(class00392.L("commands.forceload.added.failure"));
   private static final SimpleCommandExceptionType i = new SimpleCommandExceptionType(class00392.L("commands.forceload.removed.failure"));

   public class01560() {
      super();
   }

   private static int y(class07701 var0) {
      class04782 class04782 = var0.R();
      class05946<class07299> class05946 = class04782.method_27983();
      class04782.method_17984().forEach(var1x -> class04782.method_17988(class07321.N(var1x), class07321.y(var1x), false));
      var0.N(() -> class00392.N("commands.forceload.removed.all", class00392.N(class05946.N())), true);
      return 0;
   }

   private static int N(class07701 var0, class00893 var1) throws CommandSyntaxException {
      class07321 class07321 = var1.N();
      class04782 class04782 = var0.R();
      class05946<class07299> class05946 = class04782.method_27983();
      if (class04782.method_17984().contains(class07321.y())) {
         var0.N(() -> class00392.N("commands.forceload.query.success", class00392.N(class07321), class00392.N(class05946.N())), false);
         return 1;
      } else {
         throw L.create(class07321, class05946.N());
      }
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("forceload")
                     .requires(class07686.N(class07686.u)))
                  .then(
                     class07686.y("add")
                        .then(
                           ((RequiredArgumentBuilder)class07686.N("from", class00905.N())
                                 .executes(var0x -> N((class07701)var0x.getSource(), class00905.N(var0x, "from"), class00905.N(var0x, "from"), true)))
                              .then(
                                 class07686.N("to", class00905.N())
                                    .executes(var0x -> N((class07701)var0x.getSource(), class00905.N(var0x, "from"), class00905.N(var0x, "to"), true))
                              )
                        )
                  ))
               .then(
                  ((LiteralArgumentBuilder)class07686.y("remove")
                        .then(
                           ((RequiredArgumentBuilder)class07686.N("from", class00905.N())
                                 .executes(var0x -> N((class07701)var0x.getSource(), class00905.N(var0x, "from"), class00905.N(var0x, "from"), false)))
                              .then(
                                 class07686.N("to", class00905.N())
                                    .executes(var0x -> N((class07701)var0x.getSource(), class00905.N(var0x, "from"), class00905.N(var0x, "to"), false))
                              )
                        ))
                     .then(class07686.y("all").executes(var0x -> y((class07701)var0x.getSource())))
               ))
            .then(
               ((LiteralArgumentBuilder)class07686.y("query").executes(var0x -> N((class07701)var0x.getSource())))
                  .then(class07686.N("pos", class00905.N()).executes(var0x -> N((class07701)var0x.getSource(), class00905.N(var0x, "pos"))))
            )
      );
   }

   private static int N(class07701 var0, class00893 var1, class00893 var2, boolean var3) throws CommandSyntaxException {
      int ix = Math.min(var1.L(), var2.L());
      int j = Math.min(var1.u(), var2.u());
      int k = Math.max(var1.L(), var2.L());
      int l = Math.max(var1.u(), var2.u());
      if (ix >= -30000000 && j >= -30000000 && k < 30000000 && l < 30000000) {
         int i1 = class01296.N(ix);
         int j1 = class01296.N(j);
         int k1 = class01296.N(k);
         int l1 = class01296.N(l);
         long i2 = (k1 - i1 + 1L) * (l1 - j1 + 1L);
         if (i2 > 256L) {
            throw y.create(256, i2);
         } else {
            class04782 class04782 = var0.R();
            class05946<class07299> class05946 = class04782.method_27983();
            class07321 class07321xxx = null;
            int j2 = 0;

            for (int k2 = i1; k2 <= k1; k2++) {
               for (int l2 = j1; l2 <= l1; l2++) {
                  boolean flag = class04782.method_17988(k2, l2, var3);
                  if (flag) {
                     j2++;
                     if (class07321xxx == null) {
                        class07321xxx = new class07321(k2, l2);
                     }
                  }
               }
            }

            class07321 class07321x = class07321xxx;
            int i3 = j2;
            if (i3 == 0) {
               throw (var3 ? u : i).create();
            } else {
               if (i3 == 1) {
                  var0.N(
                     () -> class00392.N(
                        "commands.forceload." + (var3 ? "added" : "removed") + ".single", class00392.N(class07321x), class00392.N(class05946.N())
                     ),
                     true
                  );
               } else {
                  class07321 class07321xx = new class07321(i1, j1);
                  class07321 class07321xxx = new class07321(k1, l1);
                  var0.N(
                     () -> class00392.N(
                        "commands.forceload." + (var3 ? "added" : "removed") + ".multiple",
                        i3,
                        class00392.N(class05946.N()),
                        class00392.N(class07321),
                        class00392.N(class07321xx)
                     ),
                     true
                  );
               }

               return i3;
            }
         }
      } else {
         throw class00894.y.create();
      }
   }

   private static int N(class07701 var0) {
      class04782 class04782 = var0.R();
      class05946<class07299> class05946 = class04782.method_27983();
      LongSet longset = class04782.method_17984();
      int ix = longset.size();
      if (ix > 0) {
         String s = Joiner.on(", ").join(longset.stream().sorted().map(class07321::new).map(class07321::toString).iterator());
         if (ix == 1) {
            var0.N(() -> class00392.N("commands.forceload.list.single", class00392.N(class05946.N()), s), false);
         } else {
            var0.N(() -> class00392.N("commands.forceload.list.multiple", ix, class00392.N(class05946.N()), s), false);
         }
      } else {
         var0.y(class00392.N("commands.forceload.added.none", class00392.N(class05946.N())));
      }

      return ix;
   }
}
