package minecraft;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic3CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Optional;
import java.util.Map.Entry;

public class class06352 {
   static final Dynamic3CommandExceptionType N = new Dynamic3CommandExceptionType(
      (var0, var1, var2) -> class00392.y("commands.item.target.not_a_container", var0, var1, var2)
   );
   static final Dynamic3CommandExceptionType y = new Dynamic3CommandExceptionType(
      (var0, var1, var2) -> class00392.y("commands.item.source.not_a_container", var0, var1, var2)
   );
   static final DynamicCommandExceptionType L = new DynamicCommandExceptionType(var0 -> class00392.y("commands.item.target.no_such_slot", var0));
   private static final DynamicCommandExceptionType u = new DynamicCommandExceptionType(var0 -> class00392.y("commands.item.source.no_such_slot", var0));
   private static final DynamicCommandExceptionType i = new DynamicCommandExceptionType(var0 -> class00392.y("commands.item.target.no_changes", var0));
   private static final Dynamic2CommandExceptionType R = new Dynamic2CommandExceptionType(
      (var0, var1) -> class00392.y("commands.item.target.no_changed.known_item", var0, var1)
   );

   public class06352() {
      super();
   }

   static class06695 N(class07701 var0, class07209 var1, Dynamic3CommandExceptionType var2) throws CommandSyntaxException {
      class00394 class00394 = var0.R().method_8321(var1);
      if (class00394 instanceof class06695) {
         return (class06695)class00394;
      } else {
         throw var2.create(var1.method_10263(), var1.method_10264(), var1.method_10260());
      }
   }

   private static int N(class07701 var0, Collection<? extends class07049> var1, int var2, class03556<class08122> var3) throws CommandSyntaxException {
      HashMap hashmap = Maps.newHashMapWithExpectedSize(var1.size());

      for (class07049 class07049 : var1) {
         class04803 class04803 = class07049.method_32318(var2);
         if (class04803 != null) {
            class06584 class06584 = N(var0, var3, class04803.N().t());
            if (class04803.N(class06584)) {
               hashmap.put(class07049, class06584);
               if (class07049 instanceof class04770) {
                  ((class07482)((class04770)class07049).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).u();
               }
            }
         }
      }

      if (hashmap.isEmpty()) {
         throw i.create(var2);
      } else {
         if (hashmap.size() == 1) {
            Entry entry = (Entry)hashmap.entrySet().iterator().next();
            var0.N(
               () -> class00392.N("commands.item.entity.set.success.single", ((class07049)entry.getKey()).method_5476(), ((class06584)entry.getValue()).V()),
               true
            );
         } else {
            var0.N(() -> class00392.N("commands.item.entity.set.success.multiple", hashmap.size()), true);
         }

         return hashmap.size();
      }
   }

   public static void N(CommandDispatcher<class07701> var0, class04348 var1) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("item").requires(class07686.N(class07686.u)))
               .then(
                  ((LiteralArgumentBuilder)class07686.y("replace")
                        .then(
                           class07686.y("block")
                              .then(
                                 class07686.N("pos", class00894.N())
                                    .then(
                                       ((RequiredArgumentBuilder)class07686.N("slot", class07787.N())
                                             .then(
                                                class07686.y("with")
                                                   .then(
                                                      ((RequiredArgumentBuilder)class07686.N("item", class06770.N(var1))
                                                            .executes(
                                                               var0x -> N(
                                                                  (class07701)var0x.getSource(),
                                                                  class00894.N(var0x, "pos"),
                                                                  class07787.N(var0x, "slot"),
                                                                  class06770.N(var0x, "item").N(1, false)
                                                               )
                                                            ))
                                                         .then(
                                                            class07686.N("count", IntegerArgumentType.integer(1, 99))
                                                               .executes(
                                                                  var0x -> N(
                                                                     (class07701)var0x.getSource(),
                                                                     class00894.N(var0x, "pos"),
                                                                     class07787.N(var0x, "slot"),
                                                                     class06770.N(var0x, "item").N(IntegerArgumentType.getInteger(var0x, "count"), true)
                                                                  )
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)class07686.y("from")
                                                   .then(
                                                      class07686.y("block")
                                                         .then(
                                                            class07686.N("source", class00894.N())
                                                               .then(
                                                                  ((RequiredArgumentBuilder)class07686.N("sourceSlot", class07787.N())
                                                                        .executes(
                                                                           var0x -> N(
                                                                              (class07701)var0x.getSource(),
                                                                              class00894.N(var0x, "source"),
                                                                              class07787.N(var0x, "sourceSlot"),
                                                                              class00894.N(var0x, "pos"),
                                                                              class07787.N(var0x, "slot")
                                                                           )
                                                                        ))
                                                                     .then(
                                                                        class07686.N("modifier", class02198.y(var1))
                                                                           .executes(
                                                                              var0x -> N(
                                                                                 (class07701)var0x.getSource(),
                                                                                 class00894.N(var0x, "source"),
                                                                                 class07787.N(var0x, "sourceSlot"),
                                                                                 class00894.N(var0x, "pos"),
                                                                                 class07787.N(var0x, "slot"),
                                                                                 class02198.y(var0x, "modifier")
                                                                              )
                                                                           )
                                                                     )
                                                               )
                                                         )
                                                   ))
                                                .then(
                                                   class07686.y("entity")
                                                      .then(
                                                         class07686.N("source", class07680.N())
                                                            .then(
                                                               ((RequiredArgumentBuilder)class07686.N("sourceSlot", class07787.N())
                                                                     .executes(
                                                                        var0x -> N(
                                                                           (class07701)var0x.getSource(),
                                                                           class07680.N(var0x, "source"),
                                                                           class07787.N(var0x, "sourceSlot"),
                                                                           class00894.N(var0x, "pos"),
                                                                           class07787.N(var0x, "slot")
                                                                        )
                                                                     ))
                                                                  .then(
                                                                     class07686.N("modifier", class02198.y(var1))
                                                                        .executes(
                                                                           var0x -> N(
                                                                              (class07701)var0x.getSource(),
                                                                              class07680.N(var0x, "source"),
                                                                              class07787.N(var0x, "sourceSlot"),
                                                                              class00894.N(var0x, "pos"),
                                                                              class07787.N(var0x, "slot"),
                                                                              class02198.y(var0x, "modifier")
                                                                           )
                                                                        )
                                                                  )
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              )
                        ))
                     .then(
                        class07686.y("entity")
                           .then(
                              class07686.N("targets", class07680.y())
                                 .then(
                                    ((RequiredArgumentBuilder)class07686.N("slot", class07787.N())
                                          .then(
                                             class07686.y("with")
                                                .then(
                                                   ((RequiredArgumentBuilder)class07686.N("item", class06770.N(var1))
                                                         .executes(
                                                            var0x -> N(
                                                               (class07701)var0x.getSource(),
                                                               class07680.y(var0x, "targets"),
                                                               class07787.N(var0x, "slot"),
                                                               class06770.N(var0x, "item").N(1, false)
                                                            )
                                                         ))
                                                      .then(
                                                         class07686.N("count", IntegerArgumentType.integer(1, 99))
                                                            .executes(
                                                               var0x -> N(
                                                                  (class07701)var0x.getSource(),
                                                                  class07680.y(var0x, "targets"),
                                                                  class07787.N(var0x, "slot"),
                                                                  class06770.N(var0x, "item").N(IntegerArgumentType.getInteger(var0x, "count"), true)
                                                               )
                                                            )
                                                      )
                                                )
                                          ))
                                       .then(
                                          ((LiteralArgumentBuilder)class07686.y("from")
                                                .then(
                                                   class07686.y("block")
                                                      .then(
                                                         class07686.N("source", class00894.N())
                                                            .then(
                                                               ((RequiredArgumentBuilder)class07686.N("sourceSlot", class07787.N())
                                                                     .executes(
                                                                        var0x -> N(
                                                                           (class07701)var0x.getSource(),
                                                                           class00894.N(var0x, "source"),
                                                                           class07787.N(var0x, "sourceSlot"),
                                                                           class07680.y(var0x, "targets"),
                                                                           class07787.N(var0x, "slot")
                                                                        )
                                                                     ))
                                                                  .then(
                                                                     class07686.N("modifier", class02198.y(var1))
                                                                        .executes(
                                                                           var0x -> N(
                                                                              (class07701)var0x.getSource(),
                                                                              class00894.N(var0x, "source"),
                                                                              class07787.N(var0x, "sourceSlot"),
                                                                              class07680.y(var0x, "targets"),
                                                                              class07787.N(var0x, "slot"),
                                                                              class02198.y(var0x, "modifier")
                                                                           )
                                                                        )
                                                                  )
                                                            )
                                                      )
                                                ))
                                             .then(
                                                class07686.y("entity")
                                                   .then(
                                                      class07686.N("source", class07680.N())
                                                         .then(
                                                            ((RequiredArgumentBuilder)class07686.N("sourceSlot", class07787.N())
                                                                  .executes(
                                                                     var0x -> N(
                                                                        (class07701)var0x.getSource(),
                                                                        class07680.N(var0x, "source"),
                                                                        class07787.N(var0x, "sourceSlot"),
                                                                        class07680.y(var0x, "targets"),
                                                                        class07787.N(var0x, "slot")
                                                                     )
                                                                  ))
                                                               .then(
                                                                  class07686.N("modifier", class02198.y(var1))
                                                                     .executes(
                                                                        var0x -> N(
                                                                           (class07701)var0x.getSource(),
                                                                           class07680.N(var0x, "source"),
                                                                           class07787.N(var0x, "sourceSlot"),
                                                                           class07680.y(var0x, "targets"),
                                                                           class07787.N(var0x, "slot"),
                                                                           class02198.y(var0x, "modifier")
                                                                        )
                                                                     )
                                                               )
                                                         )
                                                   )
                                             )
                                       )
                                 )
                           )
                     )
               ))
            .then(
               ((LiteralArgumentBuilder)class07686.y("modify")
                     .then(
                        class07686.y("block")
                           .then(
                              class07686.N("pos", class00894.N())
                                 .then(
                                    class07686.N("slot", class07787.N())
                                       .then(
                                          class07686.N("modifier", class02198.y(var1))
                                             .executes(
                                                var0x -> N(
                                                   (class07701)var0x.getSource(),
                                                   class00894.N(var0x, "pos"),
                                                   class07787.N(var0x, "slot"),
                                                   class02198.y(var0x, "modifier")
                                                )
                                             )
                                       )
                                 )
                           )
                     ))
                  .then(
                     class07686.y("entity")
                        .then(
                           class07686.N("targets", class07680.y())
                              .then(
                                 class07686.N("slot", class07787.N())
                                    .then(
                                       class07686.N("modifier", class02198.y(var1))
                                          .executes(
                                             var0x -> N(
                                                (class07701)var0x.getSource(),
                                                class07680.y(var0x, "targets"),
                                                class07787.N(var0x, "slot"),
                                                class02198.y(var0x, "modifier")
                                             )
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int N(class07701 var0, class07209 var1, int var2, class03556<class08122> var3) throws CommandSyntaxException {
      class06695 class06695 = N(var0, var1, N);
      if (var2 >= 0 && var2 < class06695.method_5439()) {
         class06584 class06584 = N(var0, var3, class06695.method_5438(var2));
         class06695.method_5447(var2, class06584);
         var0.N(() -> class00392.N("commands.item.block.set.success", var1.method_10263(), var1.method_10264(), var1.method_10260(), class06584.V()), true);
         return 1;
      } else {
         throw L.create(var2);
      }
   }

   private static int N(class07701 var0, class07209 var1, int var2, class07209 var3, int var4, class03556<class08122> var5) throws CommandSyntaxException {
      return N(var0, var3, var4, N(var0, var5, N(var0, var1, var2)));
   }

   private static int N(class07701 var0, class07049 var1, int var2, class07209 var3, int var4) throws CommandSyntaxException {
      return N(var0, var3, var4, N(var1, var2));
   }

   private static int N(class07701 var0, class07049 var1, int var2, class07209 var3, int var4, class03556<class08122> var5) throws CommandSyntaxException {
      return N(var0, var3, var4, N(var0, var5, N(var1, var2)));
   }

   private static int N(class07701 var0, class07049 var1, int var2, Collection<? extends class07049> var3, int var4) throws CommandSyntaxException {
      return N(var0, var3, var4, N(var1, var2));
   }

   private static int N(class07701 var0, class07049 var1, int var2, Collection<? extends class07049> var3, int var4, class03556<class08122> var5) throws CommandSyntaxException {
      return N(var0, var3, var4, N(var0, var5, N(var1, var2)));
   }

   private static int N(class07701 var0, Collection<? extends class07049> var1, int var2, class06584 var3) throws CommandSyntaxException {
      ArrayList arraylist = Lists.newArrayListWithCapacity(var1.size());

      for (class07049 class07049 : var1) {
         class04803 class04803 = class07049.method_32318(var2);
         if (class04803 != null && class04803.N(var3.t())) {
            arraylist.add(class07049);
            if (class07049 instanceof class04770) {
               ((class07482)((class04770)class07049).fields_07fa3311b0e9d3e9b883d09222919bf5a_3).u();
            }
         }
      }

      if (arraylist.isEmpty()) {
         throw R.create(var3.V(), var2);
      } else {
         if (arraylist.size() == 1) {
            var0.N(() -> class00392.N("commands.item.entity.set.success.single", ((class07049)arraylist.getFirst()).method_5476(), var3.V()), true);
         } else {
            var0.N(() -> class00392.N("commands.item.entity.set.success.multiple", arraylist.size(), var3.V()), true);
         }

         return arraylist.size();
      }
   }

   private static int N(class07701 var0, class07209 var1, int var2, Collection<? extends class07049> var3, int var4) throws CommandSyntaxException {
      return N(var0, var3, var4, N(var0, var1, var2));
   }

   private static int N(class07701 var0, class07209 var1, int var2, Collection<? extends class07049> var3, int var4, class03556<class08122> var5) throws CommandSyntaxException {
      return N(var0, var3, var4, N(var0, var5, N(var0, var1, var2)));
   }

   private static int N(class07701 var0, class07209 var1, int var2, class07209 var3, int var4) throws CommandSyntaxException {
      return N(var0, var3, var4, N(var0, var1, var2));
   }

   private static int N(class07701 var0, class07209 var1, int var2, class06584 var3) throws CommandSyntaxException {
      class06695 class06695 = N(var0, var1, N);
      if (var2 >= 0 && var2 < class06695.method_5439()) {
         class06695.method_5447(var2, var3);
         var0.N(() -> class00392.N("commands.item.block.set.success", var1.method_10263(), var1.method_10264(), var1.method_10260(), var3.V()), true);
         return 1;
      } else {
         throw L.create(var2);
      }
   }

   private static class06584 N(class07701 var0, class03556<class08122> var1, class06584 var2) {
      class04782 class04782 = var0.R();
      class04162 class04162 = new class04160(class04782).N(class06551.B, var0.i()).y(class06551.N, var0.M()).N(class06925.i);
      class05908 class05908 = new class05927(class04162).N(Optional.empty());
      class05908.y(class05908.N((class08122)var1.N()));
      class06584 class06584 = ((class08122)var1.N()).apply(var2, class05908);
      class06584.R(class06584.U());
      return class06584;
   }

   private static class06584 N(class06843 var0, int var1) throws CommandSyntaxException {
      class04803 class04803 = var0.method_32318(var1);
      if (class04803 == null) {
         throw u.create(var1);
      } else {
         return class04803.N().t();
      }
   }

   private static class06584 N(class07701 var0, class07209 var1, int var2) throws CommandSyntaxException {
      return N(N(var0, var1, y), var2);
   }
}
