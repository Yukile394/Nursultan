package minecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.DynamicCommandExceptionType;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;

public class class03282 {
   private static final List<class05946<class03246>> N = List.of(
      class03247.N,
      class03247.y,
      class03247.L,
      class03247.u,
      class03247.i,
      class03247.R,
      class03247.M,
      class03247.B,
      class03247.Z,
      class03247.z,
      class03247.U,
      class03247.E,
      class03247.W,
      class03247.m,
      class03247.P,
      class03247.s,
      class03247.T,
      class03247.b
   );
   private static final List<class05946<class03252>> y = List.of(
      class03270.N, class03270.y, class03270.L, class03270.u, class03270.i, class03270.R, class03270.M, class03270.B, class03270.Z, class03270.z, class03270.U
   );
   private static final ToIntFunction<class05946<class03246>> L = class07536.R(N);
   private static final ToIntFunction<class05946<class03252>> u = class07536.R(y);
   private static final DynamicCommandExceptionType i = new DynamicCommandExceptionType(var0 -> class00392.y("Invalid pattern", var0));

   public class03282() {
      super();
   }

   private static int N(class07701 var0, class08036 var1) {
      return N(var0, var1, var0.W().yt().L(class04227.yk).z());
   }

   private static int N(class07701 var0, class08036 var1, class05946<class03246> var2) {
      return N(var0, var1, Stream.of(var0.W().yt().L(class04227.yk).N(var2).orElseThrow()));
   }

   private static int N(class07701 var0, class08036 var1, Stream<class03529<class03246>> var2) {
      class04782 class04782 = var0.R();
      List list = var2.sorted(Comparator.comparing(var0x -> L.applyAsInt(var0x.B()))).toList();
      List list1 = class04782.method_30349().L(class04227.yw).z().sorted(Comparator.comparing(var0x -> u.applyAsInt(var0x.B()))).toList();
      List<class03529<class06581>> list2 = N((class01905<class06581>)class04782.method_30349().L(class04227.F));
      class07209 class07209 = var1.method_24515().method_10079(var1.method_5735(), 5);
      double d0 = 3.0;

      for (int ix = 0; ix < list1.size(); ix++) {
         class03529 class03529xx = (class03529)list1.get(ix);

         for (int j = 0; j < list.size(); j++) {
            class03529 class03529x = (class03529)list.get(j);
            class03254 class03254 = new class03254(class03529xx, class03529x);

            for (int k = 0; k < list2.size(); k++) {
               class03529<class06581> class03529xx = list2.get(k);
               double d1 = class07209.method_10263() + 0.5 - k * 3.0;
               double d2 = class07209.method_10264() + 0.5 + ix * 3.0;
               double d3 = class07209.method_10260() + 0.5 + j * 10;
               class00681 class00681 = new class00681(class04782, d1, d2, d3);
               class00681.method_36456(180.0F);
               class00681.method_5875(true);
               class06584 class06584 = new class06584(class03529xx);
               class08725 class08725 = Objects.requireNonNull(class06584.method_58694(class02484.o));
               class06584.N(class02484.Nu, class03254);
               class00681.method_5673(class08725.y(), class06584);
               if (k == 0) {
                  class00681.method_5665(class03254.y().N().N(class03254.N()).L().i(" & ").y(class03254.N().N().y()));
                  class00681.method_5880(true);
               } else {
                  class00681.method_5648(true);
               }

               class04782.method_8649(class00681);
            }
         }
      }

      var0.N(() -> class00392.y("Armorstands with trimmed armor spawned around you"), true);
      return 1;
   }

   private static List<class03529<class06581>> N(class01905<class06581> var0) {
      ArrayList arraylist = new ArrayList();
      var0.z().forEach(var1x -> {
         class08725 class08725 = ((class06581)var1x.N()).R().method_58694(class02484.o);
         if (class08725 != null && class08725.y().N() == class07043.field_6178 && class08725.u().isPresent()) {
            arraylist.add(var1x);
         }
      });
      return arraylist;
   }

   public static void N(CommandDispatcher<class07701> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)class07686.y("spawn_armor_trims").requires(class07686.N(class07686.u)))
               .then(class07686.y("*_lag_my_game").executes(var0x -> N((class07701)var0x.getSource(), ((class07701)var0x.getSource()).Z()))))
            .then(
               class07686.N("pattern", class04403.N(class04227.yk))
                  .executes(var0x -> N((class07701)var0x.getSource(), ((class07701)var0x.getSource()).Z(), class04403.N(var0x, "pattern", class04227.yk, i)))
            )
      );
   }
}
