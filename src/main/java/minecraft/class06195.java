package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class06195 {
   private static final SimpleCommandExceptionType N = new SimpleCommandExceptionType(class00392.L("commands.playsound.failed"));

   public class06195() {
      super();
   }

   public static void N(CommandDispatcher<class07701> var0) {
      RequiredArgumentBuilder requiredargumentbuilder = (RequiredArgumentBuilder)class07686.N("sound", class07778.N())
         .suggests(class06791.N(class06791.y))
         .executes(
            var0x -> N(
               (class07701)var0x.getSource(),
               N(((class07701)var0x.getSource()).z()),
               class07778.N(var0x, "sound"),
               class04911.field_15250,
               ((class07701)var0x.getSource()).i(),
               1.0F,
               1.0F,
               0.0F
            )
         );

      for (class04911 class04911 : class04911.values()) {
         requiredargumentbuilder.then(N(class04911));
      }

      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("playsound").requires(class07686.N(class07686.u))).then(requiredargumentbuilder)
      );
   }

   private static int N(class07701 var0, Collection<class04770> var1, class01894 var2, class04911 var3, class06889 var4, float var5, float var6, float var7) throws CommandSyntaxException {
      class03556 class03556 = class03556.N(class04891.N(var2));
      double d0 = class04995.z(((class04891)class03556.N()).N(var5));
      class04782 class04782 = var0.R();
      long i = class04782.method_8409().B();
      ArrayList arraylist = new ArrayList();

      for (class04770 class04770 : var1) {
         if (class04770.method_51469() == class04782) {
            double d1 = var4.M - class04770.method_23317();
            double d2 = var4.B - class04770.method_23318();
            double d3 = var4.Z - class04770.method_23321();
            double d4 = d1 * d1 + d2 * d2 + d3 * d3;
            class06889 class06889 = var4;
            float f = var5;
            if (d4 > d0) {
               if (var7 <= 0.0F) {
                  continue;
               }

               double d5 = Math.sqrt(d4);
               class06889 = new class06889(
                  class04770.method_23317() + d1 / d5 * 2.0, class04770.method_23318() + d2 / d5 * 2.0, class04770.method_23321() + d3 / d5 * 2.0
               );
               f = var7;
            }

            class04770.field_13987.method_14364(new class08073(class03556, var3, class06889.N(), class06889.y(), class06889.L(), f, var6, i));
            arraylist.add(class04770);
         }
      }

      int j = arraylist.size();
      if (j == 0) {
         throw N.create();
      } else {
         if (j == 1) {
            var0.N(() -> class00392.N("commands.playsound.success.single", class00392.N(var2), ((class04770)arraylist.getFirst()).method_5476()), true);
         } else {
            var0.N(() -> class00392.N("commands.playsound.success.multiple", class00392.N(var2), j), true);
         }

         return j;
      }
   }

   private static Collection<class04770> N(@Nullable class04770 var0) {
      return var0 != null ? List.of(var0) : List.of();
   }

   private static LiteralArgumentBuilder<class07701> N(class04911 var0) {
      return (LiteralArgumentBuilder<class07701>)((LiteralArgumentBuilder)class07686.y(var0.N())
            .executes(
               var1 -> N(
                  (class07701)var1.getSource(),
                  N(((class07701)var1.getSource()).z()),
                  class07778.N(var1, "sound"),
                  var0,
                  ((class07701)var1.getSource()).i(),
                  1.0F,
                  1.0F,
                  0.0F
               )
            ))
         .then(
            ((RequiredArgumentBuilder)class07686.N("targets", class07680.u())
                  .executes(
                     var1 -> N(
                        (class07701)var1.getSource(),
                        class07680.R(var1, "targets"),
                        class07778.N(var1, "sound"),
                        var0,
                        ((class07701)var1.getSource()).i(),
                        1.0F,
                        1.0F,
                        0.0F
                     )
                  ))
               .then(
                  ((RequiredArgumentBuilder)class07686.N("pos", class00881.N())
                        .executes(
                           var1 -> N(
                              (class07701)var1.getSource(),
                              class07680.R(var1, "targets"),
                              class07778.N(var1, "sound"),
                              var0,
                              class00881.N(var1, "pos"),
                              1.0F,
                              1.0F,
                              0.0F
                           )
                        ))
                     .then(
                        ((RequiredArgumentBuilder)class07686.N("volume", FloatArgumentType.floatArg(0.0F))
                              .executes(
                                 var1 -> N(
                                    (class07701)var1.getSource(),
                                    class07680.R(var1, "targets"),
                                    class07778.N(var1, "sound"),
                                    var0,
                                    class00881.N(var1, "pos"),
                                    (Float)var1.getArgument("volume", Float.class),
                                    1.0F,
                                    0.0F
                                 )
                              ))
                           .then(
                              ((RequiredArgumentBuilder)class07686.N("pitch", FloatArgumentType.floatArg(0.0F, 2.0F))
                                    .executes(
                                       var1 -> N(
                                          (class07701)var1.getSource(),
                                          class07680.R(var1, "targets"),
                                          class07778.N(var1, "sound"),
                                          var0,
                                          class00881.N(var1, "pos"),
                                          (Float)var1.getArgument("volume", Float.class),
                                          (Float)var1.getArgument("pitch", Float.class),
                                          0.0F
                                       )
                                    ))
                                 .then(
                                    class07686.N("minVolume", FloatArgumentType.floatArg(0.0F, 1.0F))
                                       .executes(
                                          var1 -> N(
                                             (class07701)var1.getSource(),
                                             class07680.R(var1, "targets"),
                                             class07778.N(var1, "sound"),
                                             var0,
                                             class00881.N(var1, "pos"),
                                             (Float)var1.getArgument("volume", Float.class),
                                             (Float)var1.getArgument("pitch", Float.class),
                                             (Float)var1.getArgument("minVolume", Float.class)
                                          )
                                       )
                                 )
                           )
                     )
               )
         );
   }
}
