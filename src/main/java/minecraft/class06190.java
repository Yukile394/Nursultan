package minecraft;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic2CommandExceptionType;
import com.mojang.brigadier.exceptions.Dynamic4CommandExceptionType;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

public class class06190 {
   private static final int N = 10000;
   private static final Dynamic4CommandExceptionType y = new Dynamic4CommandExceptionType(
      (var0, var1, var2, var3) -> class00392.y("commands.spreadplayers.failed.teams", var0, var1, var2, var3)
   );
   private static final Dynamic4CommandExceptionType L = new Dynamic4CommandExceptionType(
      (var0, var1, var2, var3) -> class00392.y("commands.spreadplayers.failed.entities", var0, var1, var2, var3)
   );
   private static final Dynamic2CommandExceptionType u = new Dynamic2CommandExceptionType(
      (var0, var1) -> class00392.y("commands.spreadplayers.failed.invalid.height", var0, var1)
   );

   public class06190() {
      super();
   }

   private static int N(class07701 var0, class07109 var1, float var2, float var3, int var4, boolean var5, Collection<? extends class07049> var6) throws CommandSyntaxException {
      class04782 class04782 = var0.R();
      int i = class04782.method_31607();
      if (var4 < i) {
         throw u.create(var4, i);
      } else {
         class06069 class06069 = class06069.u();
         double d0 = var1.z - var3;
         double d1 = var1.U - var3;
         double d2 = var1.z + var3;
         double d3 = var1.U + var3;
         class06186[] aclass06186 = N(class06069, var5 ? N(var6) : var6.size(), d0, d1, d2, d3);
         N(var1, var2, class04782, class06069, d0, d1, d2, d3, var4, aclass06186, var5);
         double d4 = N(var6, class04782, aclass06186, var4, var5);
         var0.N(
            () -> class00392.N(
               "commands.spreadplayers.success." + (var5 ? "teams" : "entities"), aclass06186.length, var1.z, var1.U, String.format(Locale.ROOT, "%.2f", d4)
            ),
            true
         );
         return aclass06186.length;
      }
   }

   private static int N(Collection<? extends class07049> var0) {
      HashSet hashset = Sets.newHashSet();

      for (class07049 class07049 : var0) {
         if (class07049 instanceof class08036) {
            hashset.add(class07049.method_5781());
         } else {
            hashset.add(null);
         }
      }

      return hashset.size();
   }

   private static void N(
      class07109 var0,
      double var1,
      class04782 var3,
      class06069 var4,
      double var5,
      double var7,
      double var9,
      double var11,
      int var13,
      class06186[] var14,
      boolean var15
   ) throws CommandSyntaxException {
      boolean flag = true;
      double d0 = Float.MAX_VALUE;

      int i;
      for (i = 0; i < 10000 && flag; i++) {
         flag = false;
         d0 = Float.MAX_VALUE;

         for (int j = 0; j < var14.length; j++) {
            class06186 class06186xxx = var14[j];
            int k = 0;
            class06186 class06186x = new class06186();

            for (int l = 0; l < var14.length; l++) {
               if (j != l) {
                  class06186 class06186xx = var14[l];
                  double d1 = class06186xxx.N(class06186xx);
                  d0 = Math.min(d1, d0);
                  if (d1 < var1) {
                     k++;
                     class06186x.N = class06186x.N + (class06186xx.N - class06186xxx.N);
                     class06186x.y = class06186x.y + (class06186xx.y - class06186xxx.y);
                  }
               }
            }

            if (k > 0) {
               class06186x.N /= k;
               class06186x.y /= k;
               double d2 = class06186x.y();
               if (d2 > 0.0) {
                  class06186x.N();
                  class06186xxx.y(class06186x);
               } else {
                  class06186xxx.N(var4, var5, var7, var9, var11);
               }

               flag = true;
            }

            if (class06186xxx.N(var5, var7, var9, var11)) {
               flag = true;
            }
         }

         if (!flag) {
            for (class06186 class06186 : var14) {
               if (!class06186.y(var3, var13)) {
                  class06186.N(var4, var5, var7, var9, var11);
                  flag = true;
               }
            }
         }
      }

      if (d0 == Float.MAX_VALUE) {
         d0 = 0.0;
      }

      if (i >= 10000) {
         if (var15) {
            throw y.create(var14.length, var0.z, var0.U, String.format(Locale.ROOT, "%.2f", d0));
         } else {
            throw L.create(var14.length, var0.z, var0.U, String.format(Locale.ROOT, "%.2f", d0));
         }
      }
   }

   private static double N(Collection<? extends class07049> var0, class04782 var1, class06186[] var2, int var3, boolean var4) {
      double d0 = 0.0;
      int i = 0;
      HashMap hashmap = Maps.newHashMap();

      for (class07049 class07049 : var0) {
         class06186 class06186x;
         if (var4) {
            class00502 class00502 = class07049 instanceof class08036 ? class07049.method_5781() : null;
            if (!hashmap.containsKey(class00502)) {
               hashmap.put(class00502, var2[i++]);
            }

            class06186x = (class06186)hashmap.get(class00502);
         } else {
            class06186x = var2[i++];
         }

         class07049.method_48105(
            var1,
            class04995.N(class06186x.N) + 0.5,
            class06186x.N(var1, var3),
            class04995.N(class06186x.y) + 0.5,
            Set.of(),
            class07049.method_36454(),
            class07049.method_36455(),
            true
         );
         double d1 = Double.MAX_VALUE;

         for (class06186 class06186x : var2) {
            if (class06186x != class06186x) {
               d1 = Math.min(class06186x.N(class06186x), d1);
            }
         }

         d0 += d1;
      }

      return var0.size() < 2 ? 0.0 : d0 / var0.size();
   }

   private static class06186[] N(class06069 var0, int var1, double var2, double var4, double var6, double var8) {
      class06186[] aclass06186 = new class06186[var1];

      for (int i = 0; i < aclass06186.length; i++) {
         class06186 class06186 = new class06186();
         class06186.N(var0, var2, var4, var6, var8);
         aclass06186[i] = class06186;
      }

      return aclass06186;
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("spreadplayers").requires(class07686.N(class07686.u)))
            .then(
               class07686.N("center", class00887.N())
                  .then(
                     class07686.N("spreadDistance", FloatArgumentType.floatArg(0.0F))
                        .then(
                           ((RequiredArgumentBuilder)class07686.N("maxRange", FloatArgumentType.floatArg(1.0F))
                                 .then(
                                    class07686.N("respectTeams", BoolArgumentType.bool())
                                       .then(
                                          class07686.N("targets", class07680.y())
                                             .executes(
                                                var0x -> N(
                                                   (class07701)var0x.getSource(),
                                                   class00887.N(var0x, "center"),
                                                   FloatArgumentType.getFloat(var0x, "spreadDistance"),
                                                   FloatArgumentType.getFloat(var0x, "maxRange"),
                                                   ((class07701)var0x.getSource()).R().method_31600() + 1,
                                                   BoolArgumentType.getBool(var0x, "respectTeams"),
                                                   class07680.y(var0x, "targets")
                                                )
                                             )
                                       )
                                 ))
                              .then(
                                 class07686.y("under")
                                    .then(
                                       class07686.N("maxHeight", IntegerArgumentType.integer())
                                          .then(
                                             class07686.N("respectTeams", BoolArgumentType.bool())
                                                .then(
                                                   class07686.N("targets", class07680.y())
                                                      .executes(
                                                         var0x -> N(
                                                            (class07701)var0x.getSource(),
                                                            class00887.N(var0x, "center"),
                                                            FloatArgumentType.getFloat(var0x, "spreadDistance"),
                                                            FloatArgumentType.getFloat(var0x, "maxRange"),
                                                            IntegerArgumentType.getInteger(var0x, "maxHeight"),
                                                            BoolArgumentType.getBool(var0x, "respectTeams"),
                                                            class07680.y(var0x, "targets")
                                                         )
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
}
