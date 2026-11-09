package minecraft;

import Nursultan.class10524;
import Nursultan.class10527;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Function;

public class class05616 {
   private static final SimpleCommandExceptionType u = new SimpleCommandExceptionType(class00392.L("commands.data.merge.failed"));
   private static final DynamicCommandExceptionType i = new DynamicCommandExceptionType(var0 -> class00392.y("commands.data.get.invalid", var0));
   private static final DynamicCommandExceptionType R = new DynamicCommandExceptionType(var0 -> class00392.y("commands.data.get.unknown", var0));
   private static final SimpleCommandExceptionType M = new SimpleCommandExceptionType(class00392.L("commands.data.get.multiple"));
   private static final DynamicCommandExceptionType B = new DynamicCommandExceptionType(var0 -> class00392.y("commands.data.modify.expected_object", var0));
   private static final DynamicCommandExceptionType Z = new DynamicCommandExceptionType(var0 -> class00392.y("commands.data.modify.expected_value", var0));
   private static final Dynamic2CommandExceptionType z = new Dynamic2CommandExceptionType(
      (var0, var1) -> class00392.y("commands.data.modify.invalid_substring", var0, var1)
   );
   public static final List<Function<String, class05622>> N = ImmutableList.of(class05605.N, class05608.y, class01413.y);
   public static final List<class05622> y = N.stream().map(var0 -> var0.apply("target")).collect(ImmutableList.toImmutableList());
   public static final List<class05622> L = N.stream().map(var0 -> var0.apply("source")).collect(ImmutableList.toImmutableList());

   public class05616() {
      super();
   }

   private static String y(String var0, int var1, int var2) throws CommandSyntaxException {
      int ix = var0.length();
      int j = N(var1, ix);
      int k = N(var2, ix);
      return N(var0, j, k);
   }

   private static int y(class07701 var0, class05598 var1, class07793 var2) throws CommandSyntaxException {
      Object object = N(var2, var1);

      int ix = switch (object) {
         case class07737 class07737 -> class04995.N(((class07737)object).U());
         case class07023 class07023 -> ((class07023)object).size();
         case class07001 class07001 -> ((class07001)object).Z();
         case class07707 class07707 -> {
            String s;
            try {
               s = class07707.U();
            } catch (Throwable throwable) {
               throw new MatchException(throwable.toString(), throwable);
            }

            yield s.length();
         }
         case class06997 class06997 -> throw R.create(var2.toString());
         default -> throw new MatchException(null, null);
      };
      var0.N(() -> var1.N(object), false);
      return ix;
   }

   private static List<class07709> y(CommandContext<class07701> var0, class05622 var1) throws CommandSyntaxException {
      class05598 class05598 = var1.N(var0);
      return class07759.N(var0, "sourcePath").N(class05598.N());
   }

   public static class07709 N(class07793 var0, class05598 var1) throws CommandSyntaxException {
      Iterator<class07709> iterator = var0.N(var1.N()).iterator();
      class07709 class07709 = iterator.next();
      if (iterator.hasNext()) {
         throw M.create();
      } else {
         return class07709;
      }
   }

   private static List<class07709> N(List<class07709> var0, class10527 var1) throws CommandSyntaxException {
      ArrayList arraylist = new ArrayList(var0.size());
      Iterator iterator = var0.iterator();

      while (iterator.hasNext()) {
         String s = N((class07709)iterator.next());
         arraylist.add(class07707.N(var1.process(s)));
      }

      return arraylist;
   }

   private static int N(class07701 var0, class05598 var1, class07001 var2) throws CommandSyntaxException {
      class07001 class07001x = var1.N();
      if (class07793.N(var2, 0)) {
         throw class07759.y.create();
      } else {
         class07001 class07001x = class07001x.N().N(var2);
         if (class07001x.equals(class07001x)) {
            throw u.create();
         } else {
            var1.N(class07001x);
            var0.N(() -> var1.y(), true);
            return 1;
         }
      }
   }

   private static int N(class07701 var0, class05598 var1) throws CommandSyntaxException {
      class07001 class07001 = var1.N();
      var0.N(() -> var1.N((class07709)class07001), false);
      return 1;
   }

   private static int N(class07701 var0, class05598 var1, class07793 var2, double var3) throws CommandSyntaxException {
      class07709 class07709 = N(var2, var1);
      if (!(class07709 instanceof class07737)) {
         throw i.create(var2.toString());
      } else {
         int ix = class04995.N(((class07737)class07709).U() * var3);
         var0.N(() -> var1.N(var2, var3, ix), false);
         return ix;
      }
   }

   public static void N(CommandDispatcher<class07701> var0) {
      LiteralArgumentBuilder<class07701> literalargumentbuilder = (LiteralArgumentBuilder<class07701>)class07686.y("data").requires(class07686.N(class07686.u));

      for (class05622 class05622 : y) {
         ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)literalargumentbuilder.then(
                     class05622.N(
                        class07686.y("merge"),
                        var1x -> var1x.then(
                           class07686.N("nbt", class07667.N())
                              .executes(var1xx -> N((class07701)var1xx.getSource(), class05622.N(var1xx), class07667.N(var1xx, "nbt")))
                        )
                     )
                  ))
                  .then(
                     class05622.N(
                        class07686.y("get"),
                        var1x -> var1x.executes(var1xx -> N((class07701)var1xx.getSource(), class05622.N(var1xx)))
                           .then(
                              ((RequiredArgumentBuilder)class07686.N("path", class07759.N())
                                    .executes(var1xx -> y((class07701)var1xx.getSource(), class05622.N(var1xx), class07759.N(var1xx, "path"))))
                                 .then(
                                    class07686.N("scale", DoubleArgumentType.doubleArg())
                                       .executes(
                                          var1xx -> N(
                                             (class07701)var1xx.getSource(),
                                             class05622.N(var1xx),
                                             class07759.N(var1xx, "path"),
                                             DoubleArgumentType.getDouble(var1xx, "scale")
                                          )
                                       )
                                 )
                           )
                     )
                  ))
               .then(
                  class05622.N(
                     class07686.y("remove"),
                     var1x -> var1x.then(
                        class07686.N("path", class07759.N())
                           .executes(var1xx -> N((class07701)var1xx.getSource(), class05622.N(var1xx), class07759.N(var1xx, "path")))
                     )
                  )
               ))
            .then(
               N(
                  (BiConsumer<ArgumentBuilder<class07701, ?>, class10524>)((var0x, var1x) -> var0x.then(
                        class07686.y("insert")
                           .then(
                              class07686.N("index", IntegerArgumentType.integer())
                                 .then(var1x.create((var0xx, var1xx, var2, var3x) -> var2.N(IntegerArgumentType.getInteger(var0xx, "index"), var1xx, var3x)))
                           )
                     )
                     .then(class07686.y("prepend").then(var1x.create((var0xx, var1xx, var2, var3x) -> var2.N(0, var1xx, var3x))))
                     .then(class07686.y("append").then(var1x.create((var0xx, var1xx, var2, var3x) -> var2.N(-1, var1xx, var3x))))
                     .then(class07686.y("set").then(var1x.create((var0xx, var1xx, var2, var3x) -> var2.N(var1xx, (class07709)Iterables.getLast(var3x)))))
                     .then(class07686.y("merge").then(var1x.create((var0xx, var1xx, var2, var3x) -> {
                        class07001 class07001xxx = new class07001();

                        for (class07709 class07709x : var3x) {
                           if (class07793.N(class07709x, 0)) {
                              throw class07759.y.create();
                           }

                           if (!(class07709x instanceof class07001 class07001x)) {
                              throw B.create(class07709x);
                           }

                           class07001xxx.N(class07001x);
                        }

                        List<class07709> list = var2.N(var1xx, class07001::new);
                        int ix = 0;

                        for (class07709 class07709 : list) {
                           if (!(class07709 instanceof class07001 class07001x)) {
                              throw B.create(class07709);
                           }

                           class07001 class07001x = class07001x.N();
                           class07001x.N(class07001xxx);
                           ix += class07001x.equals(class07001x) ? 0 : 1;
                        }

                        return ix;
                     }))))
               )
            );
      }

      var0.register(literalargumentbuilder);
   }

   private static List<class07709> N(CommandContext<class07701> var0, class05622 var1) throws CommandSyntaxException {
      return Collections.singletonList(var1.N(var0).N());
   }

   private static int N(int var0, int var1) {
      return var0 >= 0 ? var0 : var1 + var0;
   }

   private static String N(class07709 var0) throws CommandSyntaxException {
      return switch (var0) {
         case class07707 class07707 -> {
            String s1;
            try {
               s1 = class07707.U();
            } catch (Throwable throwable) {
               throw new MatchException(throwable.toString(), throwable);
            }

            String s = s1;
            yield s;
         }
         case class08884 class08884 -> class08884.toString();
         default -> throw Z.create(var0);
      };
   }

   private static int N(class07701 var0, class05598 var1, class07793 var2) throws CommandSyntaxException {
      class07001 class07001 = var1.N();
      int ix = var2.L(class07001);
      if (ix == 0) {
         throw u.create();
      } else {
         var1.N(class07001);
         var0.N(() -> var1.y(), true);
         return ix;
      }
   }

   private static int N(CommandContext<class07701> var0, class05622 var1, class05593 var2, List<class07709> var3) throws CommandSyntaxException {
      class05598 class05598 = var1.N(var0);
      class07793 class07793 = class07759.N(var0, "targetPath");
      class07001 class07001 = class05598.N();
      int ix = var2.modify(var0, class07001, class07793, var3);
      if (ix == 0) {
         throw u.create();
      } else {
         class05598.N(class07001);
         ((class07701)var0.getSource()).N(() -> class05598.y(), true);
         return ix;
      }
   }

   private static String N(String var0, int var1, int var2) throws CommandSyntaxException {
      if (var1 >= 0 && var2 <= var0.length() && var1 <= var2) {
         return var0.substring(var1, var2);
      } else {
         throw z.create(var1, var2);
      }
   }

   private static ArgumentBuilder<class07701, ?> N(BiConsumer<ArgumentBuilder<class07701, ?>, class10524> var0) {
      LiteralArgumentBuilder<class07701> literalargumentbuilder = class07686.y("modify");

      for (class05622 class05622 : y) {
         class05622.N(
            literalargumentbuilder,
            var2 -> {
               RequiredArgumentBuilder requiredargumentbuilder = class07686.N("targetPath", class07759.N());

               for (class05622 class05622x : L) {
                  var0.accept(
                     requiredargumentbuilder,
                     var2x -> class05622x.N(
                        class07686.y("from"),
                        var3x -> var3x.executes(var3xx -> N(var3xx, class05622, var2x, N(var3xx, class05622x)))
                           .then(class07686.N("sourcePath", class07759.N()).executes(var3xx -> N(var3xx, class05622, var2x, y(var3xx, class05622x))))
                     )
                  );
                  var0.accept(
                     requiredargumentbuilder,
                     var2x -> class05622x.N(
                        class07686.y("string"),
                        var3x -> var3x.executes(var3xx -> N(var3xx, class05622, var2x, N(N(var3xx, class05622x), var0xxxxx -> var0xxxxx)))
                           .then(
                              ((RequiredArgumentBuilder)class07686.N("sourcePath", class07759.N())
                                    .executes(var3xx -> N(var3xx, class05622, var2x, N(y(var3xx, class05622x), var0xxxxx -> var0xxxxx))))
                                 .then(
                                    ((RequiredArgumentBuilder)class07686.N("start", IntegerArgumentType.integer())
                                          .executes(
                                             var3xx -> N(
                                                var3xx,
                                                class05622,
                                                var2x,
                                                N(y(var3xx, class05622x), var1xxxxx -> N(var1xxxxx, IntegerArgumentType.getInteger(var3xx, "start")))
                                             )
                                          ))
                                       .then(
                                          class07686.N("end", IntegerArgumentType.integer())
                                             .executes(
                                                var3xx -> N(
                                                   var3xx,
                                                   class05622,
                                                   var2x,
                                                   N(
                                                      y(var3xx, class05622x),
                                                      var1xxxxx -> y(
                                                         var1xxxxx,
                                                         IntegerArgumentType.getInteger(var3xx, "start"),
                                                         IntegerArgumentType.getInteger(var3xx, "end")
                                                      )
                                                   )
                                                )
                                             )
                                       )
                                 )
                           )
                     )
                  );
               }

               var0.accept(requiredargumentbuilder, var1xx -> class07686.y("value").then(class07686.N("value", class07791.N()).executes(var2x -> {
                  List list = Collections.singletonList(class07791.N(var2x, "value"));
                  return N(var2x, class05622, var1xx, list);
               })));
               return var2.then(requiredargumentbuilder);
            }
         );
      }

      return literalargumentbuilder;
   }

   private static String N(String var0, int var1) throws CommandSyntaxException {
      int ix = var0.length();
      return N(var0, N(var1, ix), ix);
   }
}
