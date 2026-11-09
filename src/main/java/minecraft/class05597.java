package minecraft;

import com.google.common.collect.Sets;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class class05597 {
   private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("commands.tag.add.failed"));
   private static final SimpleCommandExceptionType y = new SimpleCommandExceptionType(class00392.L("commands.tag.remove.failed"));

   public class05597() {
      super();
   }

   private static int y(class07701 var0, Collection<? extends class07049> var1, String var2) throws CommandSyntaxException {
      int i = 0;
      Iterator iterator = var1.iterator();

      while (iterator.hasNext()) {
         if (((class07049)iterator.next()).method_5738(var2)) {
            i++;
         }
      }

      if (i == 0) {
         throw y.create();
      } else {
         if (var1.size() == 1) {
            var0.N(() -> class00392.N("commands.tag.remove.success.single", var2, ((class07049)var1.iterator().next()).method_5476()), true);
         } else {
            var0.N(() -> class00392.N("commands.tag.remove.success.multiple", var2, var1.size()), true);
         }

         return i;
      }
   }

   private static int N(class07701 var0, Collection<? extends class07049> var1) {
      HashSet hashset = Sets.newHashSet();

      for (class07049 class07049x : var1) {
         hashset.addAll(class07049x.method_5752());
      }

      if (var1.size() == 1) {
         class07049 class07049 = (class07049)var1.iterator().next();
         if (hashset.isEmpty()) {
            var0.N(() -> class00392.N("commands.tag.list.single.empty", class07049.method_5476()), false);
         } else {
            var0.N(() -> class00392.N("commands.tag.list.single.success", class07049.method_5476(), hashset.size(), class00390.N(hashset)), false);
         }
      } else if (hashset.isEmpty()) {
         var0.N(() -> class00392.N("commands.tag.list.multiple.empty", var1.size()), false);
      } else {
         var0.N(() -> class00392.N("commands.tag.list.multiple.success", var1.size(), hashset.size(), class00390.N(hashset)), false);
      }

      return hashset.size();
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("tag").requires(class07686.N(class07686.u)))
            .then(
               ((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N("targets", class07680.y())
                        .then(
                           class07686.y("add")
                              .then(
                                 class07686.N("name", StringArgumentType.word())
                                    .executes(
                                       var0x -> N((class07701)var0x.getSource(), class07680.y(var0x, "targets"), StringArgumentType.getString(var0x, "name"))
                                    )
                              )
                        ))
                     .then(
                        class07686.y("remove")
                           .then(
                              class07686.N("name", StringArgumentType.word())
                                 .suggests((var0x, var1) -> class07689.y(N(class07680.y(var0x, "targets")), var1))
                                 .executes(
                                    var0x -> y((class07701)var0x.getSource(), class07680.y(var0x, "targets"), StringArgumentType.getString(var0x, "name"))
                                 )
                           )
                     ))
                  .then(class07686.y("list").executes(var0x -> N((class07701)var0x.getSource(), class07680.y(var0x, "targets"))))
            )
      );
   }

   private static int N(class07701 var0, Collection<? extends class07049> var1, String var2) throws CommandSyntaxException {
      int i = 0;
      Iterator iterator = var1.iterator();

      while (iterator.hasNext()) {
         if (((class07049)iterator.next()).method_5780(var2)) {
            i++;
         }
      }

      if (i == 0) {
         throw N.create();
      } else {
         if (var1.size() == 1) {
            var0.N(() -> class00392.N("commands.tag.add.success.single", var2, ((class07049)var1.iterator().next()).method_5476()), true);
         } else {
            var0.N(() -> class00392.N("commands.tag.add.success.multiple", var2, var1.size()), true);
         }

         return i;
      }
   }

   private static Collection<String> N(Collection<? extends class07049> var0) {
      HashSet hashset = Sets.newHashSet();

      for (class07049 class07049 : var0) {
         hashset.addAll(class07049.method_5752());
      }

      return hashset;
   }
}
