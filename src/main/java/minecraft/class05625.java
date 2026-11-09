package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Locale;
import java.util.Set;
import org.jspecify.annotations.Nullable;

public class class05625 {
   private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("commands.teleport.invalidPosition"));

   public class05625() {
      super();
   }

   private static void N(
      class07701 var0,
      class07049 var1,
      class04782 var2,
      double var3,
      double var5,
      double var7,
      Set<class06681> var9,
      float var10,
      float var11,
      @Nullable class05617 var12
   ) throws CommandSyntaxException {
      if (!class07299.method_25953(class07209.method_49637(var3, var5, var7))) {
         throw N.create();
      } else {
         double d0 = var9.contains(class06681.field_12400) ? var3 - var1.method_23317() : var3;
         double d1 = var9.contains(class06681.field_12398) ? var5 - var1.method_23318() : var5;
         double d2 = var9.contains(class06681.field_12403) ? var7 - var1.method_23321() : var7;
         float f = var9.contains(class06681.field_12401) ? var10 - var1.method_36454() : var10;
         float f1 = var9.contains(class06681.field_12397) ? var11 - var1.method_36455() : var11;
         float f2 = class04995.R(f);
         float f3 = class04995.R(f1);
         if (var1.method_48105(var2, d0, d1, d2, var9, f2, f3, true)) {
            if (var12 != null) {
               var12.N(var0, var1);
            }

            if (!(var1 instanceof class07438 class07438 && class07438.method_6128())) {
               var1.method_18799(var1.method_18798().u(1.0, 0.0, 1.0));
               var1.method_24830(true);
            }

            if (var1 instanceof class07475 class07475) {
               class07475.f().W();
            }
         }
      }
   }

   private static String N(double var0) {
      return String.format(Locale.ROOT, "%f", var0);
   }

   public static void N(CommandDispatcher<class07701> var0) {
      LiteralCommandNode literalcommandnode = var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("teleport")
                     .requires(class07686.N(class07686.u)))
                  .then(
                     class07686.N("location", class00881.N())
                        .executes(
                           var0x -> N(
                              (class07701)var0x.getSource(),
                              Collections.singleton(((class07701)var0x.getSource()).B()),
                              ((class07701)var0x.getSource()).R(),
                              class00881.y(var0x, "location"),
                              null,
                              null
                           )
                        )
                  ))
               .then(
                  class07686.N("destination", class07680.N())
                     .executes(
                        var0x -> N(
                           (class07701)var0x.getSource(), Collections.singleton(((class07701)var0x.getSource()).B()), class07680.N(var0x, "destination")
                        )
                     )
               ))
            .then(
               ((RequiredArgumentBuilder)class07686.N("targets", class07680.y())
                     .then(
                        ((RequiredArgumentBuilder)((RequiredArgumentBuilder)class07686.N("location", class00881.N())
                                 .executes(
                                    var0x -> N(
                                       (class07701)var0x.getSource(),
                                       class07680.y(var0x, "targets"),
                                       ((class07701)var0x.getSource()).R(),
                                       class00881.y(var0x, "location"),
                                       null,
                                       null
                                    )
                                 ))
                              .then(
                                 class07686.N("rotation", class00897.N())
                                    .executes(
                                       var0x -> N(
                                          (class07701)var0x.getSource(),
                                          class07680.y(var0x, "targets"),
                                          ((class07701)var0x.getSource()).R(),
                                          class00881.y(var0x, "location"),
                                          class00897.N(var0x, "rotation"),
                                          null
                                       )
                                    )
                              ))
                           .then(
                              ((LiteralArgumentBuilder)class07686.y("facing")
                                    .then(
                                       class07686.y("entity")
                                          .then(
                                             ((RequiredArgumentBuilder)class07686.N("facingEntity", class07680.N())
                                                   .executes(
                                                      var0x -> N(
                                                         (class07701)var0x.getSource(),
                                                         class07680.y(var0x, "targets"),
                                                         ((class07701)var0x.getSource()).R(),
                                                         class00881.y(var0x, "location"),
                                                         null,
                                                         new class05601(class07680.N(var0x, "facingEntity"), class07664.field_9853)
                                                      )
                                                   ))
                                                .then(
                                                   class07686.N("facingAnchor", class07687.N())
                                                      .executes(
                                                         var0x -> N(
                                                            (class07701)var0x.getSource(),
                                                            class07680.y(var0x, "targets"),
                                                            ((class07701)var0x.getSource()).R(),
                                                            class00881.y(var0x, "location"),
                                                            null,
                                                            new class05601(class07680.N(var0x, "facingEntity"), class07687.N(var0x, "facingAnchor"))
                                                         )
                                                      )
                                                )
                                          )
                                    ))
                                 .then(
                                    class07686.N("facingLocation", class00881.N())
                                       .executes(
                                          var0x -> N(
                                             (class07701)var0x.getSource(),
                                             class07680.y(var0x, "targets"),
                                             ((class07701)var0x.getSource()).R(),
                                             class00881.y(var0x, "location"),
                                             null,
                                             new class05596(class00881.N(var0x, "facingLocation"))
                                          )
                                       )
                                 )
                           )
                     ))
                  .then(
                     class07686.N("destination", class07680.N())
                        .executes(var0x -> N((class07701)var0x.getSource(), class07680.y(var0x, "targets"), class07680.N(var0x, "destination")))
                  )
            )
      );
      var0.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("tp").requires(class07686.N(class07686.u))).redirect(literalcommandnode));
   }

   private static Set<class06681> N(class00874 var0, @Nullable class00874 var1, boolean var2) {
      Set<class06681> set = class06681.y(var0.N(), var0.y(), var0.L());
      Set set1 = var2 ? class06681.N(var0.N(), var0.y(), var0.L()) : Set.of();
      Set<class06681> set2 = var1 == null ? class06681.field_40711 : class06681.N(var1.y(), var1.N());
      return class06681.N(set, set1, set2);
   }

   private static int N(
      class07701 var0, Collection<? extends class07049> var1, class04782 var2, class00874 var3, @Nullable class00874 var4, @Nullable class05617 var5
   ) throws CommandSyntaxException {
      class06889 class06889 = var3.N(var0);
      class07109 class07109 = var4 == null ? null : var4.y(var0);

      for (class07049 class07049 : var1) {
         Set<class06681> set = N(var3, var4, class07049.method_73183().method_27983() == var2.method_27983());
         if (class07109 == null) {
            N(var0, class07049, var2, class06889.M, class06889.B, class06889.Z, set, class07049.method_36454(), class07049.method_36455(), var5);
         } else {
            N(var0, class07049, var2, class06889.M, class06889.B, class06889.Z, set, class07109.U, class07109.z, var5);
         }
      }

      if (var1.size() == 1) {
         var0.N(
            () -> class00392.N(
               "commands.teleport.success.location.single",
               ((class07049)var1.iterator().next()).method_5476(),
               N(class06889.M),
               N(class06889.B),
               N(class06889.Z)
            ),
            true
         );
      } else {
         var0.N(() -> class00392.N("commands.teleport.success.location.multiple", var1.size(), N(class06889.M), N(class06889.B), N(class06889.Z)), true);
      }

      return var1.size();
   }

   private static int N(class07701 var0, Collection<? extends class07049> var1, class07049 var2) throws CommandSyntaxException {
      for (class07049 class07049 : var1) {
         N(
            var0,
            class07049,
            (class04782)var2.method_73183(),
            var2.method_23317(),
            var2.method_23318(),
            var2.method_23321(),
            EnumSet.noneOf(class06681.class),
            var2.method_36454(),
            var2.method_36455(),
            null
         );
      }

      if (var1.size() == 1) {
         var0.N(() -> class00392.N("commands.teleport.success.entity.single", ((class07049)var1.iterator().next()).method_5476(), var2.method_5476()), true);
      } else {
         var0.N(() -> class00392.N("commands.teleport.success.entity.multiple", var1.size(), var2.method_5476()), true);
      }

      return var1.size();
   }
}
