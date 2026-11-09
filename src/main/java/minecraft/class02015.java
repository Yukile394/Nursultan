package minecraft;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.stream.IntStream;
import net.fabricmc.fabric.api.datagen.v1.loot.FabricBlockLootTableGenerator;
import net.fabricmc.fabric.mixin.datagen.loot.BlockLootSubProviderAccessor;

public abstract class class02015 implements class02013, FabricBlockLootTableGenerator, BlockLootSubProviderAccessor {
   protected final class01929 field_51845;
   protected final Set<class06581> field_40608;
   protected final class03767 field_40609;
   public final Map<class05946<class05074>, class05062> field_40610;
   private static final float[] field_40611 = new float[]{0.02F, 0.022222223F, 0.025F, 0.033333335F, 0.1F};
   protected static final float[] field_40605 = new float[]{0.05F, 0.0625F, 0.083333336F, 0.1F};

   protected class02015(Set<class06581> var1, class03767 var2, Map<class05946<class05074>, class05062> var3, class01929 var4) {
      super();
      this.field_40608 = var1;
      this.field_40609 = var2;
      this.field_40610 = var3;
      this.field_51845 = var4;
   }

   public class02015(Set<class06581> var1, class03767 var2, class01929 var3) {
      this(var1, var2, new HashMap<>(), var3);
   }

   public class05062 method_46016(class00891 var1) {
      return class05074.y().N(class05441.N().N(class03798.N(class06570.wy)).y(class00851.N(var1).N(class01408.N().N(class05568.x_, true))));
   }

   public <T extends Comparable<T> & class05033> class05062 method_45987(class00891 var1, class08092<T> var2, T var3) {
      return class05074.y()
         .N(this.method_45978(var1, class05441.N().N(class04711.N(1.0F)).N(class03798.N(var1).y(class00851.N(var1).N(class01408.N().N(var2, (T)var3))))));
   }

   public void method_46024(class00891 var1) {
      this.method_46007(var1, var1);
   }

   public class05062 method_46012(class00891 var1) {
      class01921 class01921 = this.field_51845.y(class04227.yR);
      return this.method_45989(
         var1,
         (class04111<?>)this.method_45977(
            var1, class03798.N(class06570.WY).N(class07621.N(class06345.N(4.0F, 5.0F))).N(class02349.y(class01921.y(class07314.l)))
         )
      );
   }

   public class05062 method_45997(class00891 var1, class06581 var2) {
      return class05074.y()
         .N(
            this.method_45977(
               var1,
               class05441.N()
                  .N(class04711.N(1.0F))
                  .N(
                     class03798.N(var2)
                        .N(
                           class07728.L.N(),
                           var1x -> class07621.N(class06142.N(3, (var1x + 1) / 15.0F))
                              .y(class00851.N(var1).N(class01408.N().N(class07728.L, var1x.intValue())))
                        )
                  )
            )
         );
   }

   public class05062 method_45995(class07310 var1) {
      return class05074.y().N(class05441.N().N(class04711.N(1.0F)).y(this.method_62727()).N(class03798.N(var1)));
   }

   public <T extends class08967<T>> T method_45977(class07310 var1, class08967<T> var2) {
      return (T)(!this.field_40608.contains(var1.B()) ? var2.N(class08828.L()) : var2.N());
   }

   public class05062 method_66554(class00891 var1) {
      return var1 instanceof class08614 class08614
         ? class05074.y()
            .N(
               class05441.N()
                  .N(class04711.N(1.0F))
                  .N(
                     (class04111<?>)this.method_45977(
                        var1,
                        class03798.N(var1)
                           .N(
                              IntStream.rangeClosed(1, 4).boxed().toList(),
                              var2x -> class07621.N(class04711.N(var2x.intValue())).y(class00851.N(var1).N(class01408.N().N(class08614.u(), var2x.intValue())))
                           )
                     )
                  )
            )
         : method_45975();
   }

   public class05062 method_45976(class07310 var1) {
      return class05074.y().N(this.method_45978(var1, class05441.N().N(class04711.N(1.0F)).N(class03798.N(var1))));
   }

   public class05062 method_45989(class00891 var1, class04111<?> var2) {
      return method_45991(var1, this.method_60390(), var2);
   }

   public class05062 method_46018(class00891 var1) {
      class01921 class01921 = this.field_51845.y(class04227.yR);
      return this.method_46008(
         var1,
         ((class03366)this.method_45977(class00869.NA, class03798.N(class06570.Tx).N(class07621.N(class06345.N(1.0F, 2.0F)))))
            .y(class06526.N(class01921.y(class07314.l), field_40611))
      );
   }

   public class05062 method_45998(class00891 var1, class07310 var2) {
      return this.method_45989(
         var1, (class04111<?>)this.method_45977(var1, class03798.N(var2).N(class07621.N(class06345.N(-6.0F, 2.0F))).N(class09004.N(class05338.y(0))))
      );
   }

   public class05062 method_46014(class00891 var1) {
      return class05074.y()
         .N(
            class05441.N()
               .y(this.method_60390())
               .N(class04711.N(1.0F))
               .N(class03798.N(var1).N(class02683.y(class06551.z).N(class02484.Nd)).N(class05501.N(var1).N(class04593.L)))
         );
   }

   public class05062 method_46000(class00891 var1, class00891 var2, float... var3) {
      class01921 class01921 = this.field_51845.y(class04227.yR);
      return this.method_45986(var1, var2, var3)
         .N(
            class05441.N()
               .N(class04711.N(1.0F))
               .y(this.method_60393())
               .N(
                  ((class03366)this.method_45978(var1, class03798.N(class06570.sS)))
                     .y(class06526.N(class01921.y(class07314.l), 0.005F, 0.0055555557F, 0.00625F, 0.008333334F, 0.025F))
               )
         );
   }

   public class05062 method_46011(class00891 var1) {
      class01921 class01921 = this.field_51845.y(class04227.yR);
      return this.method_45989(
         var1,
         (class04111<?>)this.method_45977(
            var1, class03798.N(class06570.TL).N(class07621.N(class06345.N(4.0F, 9.0F))).N(class02349.N(class01921.y(class07314.l)))
         )
      );
   }

   public class05062 method_45986(class00891 var1, class00891 var2, float... var3) {
      class01921 class01921 = this.field_51845.y(class04227.yR);
      return this.method_46008(var1, ((class03366)this.method_45978(var1, class03798.N(var2))).y(class06526.N(class01921.y(class07314.l), var3)))
         .N(
            class05441.N()
               .N(class04711.N(1.0F))
               .y(this.method_60393())
               .N(
                  ((class03366)this.method_45977(var1, class03798.N(class06570.Tx).N(class07621.N(class06345.N(1.0F, 2.0F)))))
                     .y(class06526.N(class01921.y(class07314.l), field_40611))
               )
         );
   }

   public class05062 method_46013(class00891 var1) {
      return class05074.y()
         .N(
            this.method_45978(
               var1,
               class05441.N()
                  .N(class04711.N(1.0F))
                  .N(class03798.N(var1).N(class02683.y(class06551.z).N(class02484.B).N(class02484.U).N(class02484.v).N(class02484.Nv).N(class02484.m)))
            )
         );
   }

   public void method_46025(class00891 var1) {
      this.method_46006(var1, var1);
   }

   public void method_46023(class00891 var1) {
      this.method_45994(var1, var1x -> this.method_46009(((class00757)var1x).y()));
   }

   public class05062 method_46004(class00891 var1) {
      return class05074.y()
         .N(
            this.method_45978(
               var1,
               class05441.N()
                  .N(class04711.N(1.0F))
                  .N(class03798.N(var1).N(class02683.y(class06551.z).N(class02484.B).N(class02484.NG).N(class02484.Nw).N(class02484.Nk)))
            )
         );
   }

   public void method_45994(class00891 var1, Function<class00891, class05062> var2) {
      this.method_45988(var1, (class05062)var2.apply(var1));
   }

   public void method_46006(class00891 var1, class07310 var2) {
      this.method_45988(var1, this.method_45976(var2));
   }

   public class05062 method_45982(class00891 var1, class06581 var2, class06581 var3, class05952 var4) {
      class01921 class01921 = this.field_51845.y(class04227.yR);
      return this.method_45977(
         var1,
         class05074.y()
            .N(class05441.N().N(class03798.N(var2).y(var4).N(class03798.N(var3))))
            .N(class05441.N().y(var4).N(class03798.N(var3).N(class02349.N(class01921.y(class07314.l), 0.5714286F, 3))))
      );
   }

   public static class05062 method_46021(class00891 var0) {
      return class05074.y().N(class05441.N().N(class04711.N(1.0F)).N(class03798.N(var0)));
   }

   public abstract void method_10379();

   public static class05062 method_45975() {
      return class05074.y();
   }

   public class05062 method_46019(class00891 var1) {
      return class05074.y().N(class05441.N().y(this.method_62727()).N(class03798.N(var1).N(class07621.N(class04711.N(2.0F)))));
   }

   public class05062 method_46017(class00891 var1) {
      class01921 class01921 = this.field_51845.y(class04227.yR);
      return this.method_46001(
         var1, (class04111<?>)this.method_45977(var1, class03798.N(class06570.by).y(class07657.N(0.125F)).N(class02349.N(class01921.y(class07314.l), 2)))
      );
   }

   public void method_45988(class00891 var1, class05062 var2) {
      this.field_40610.put(var1.d().orElseThrow(() -> new IllegalStateException("Block " + var1 + " does not have loot table")), var2);
   }

   public void method_46007(class00891 var1, class00891 var2) {
      this.method_45988(var1, this.method_46003(var2));
   }

   public class05952 method_60391() {
      return this.method_60390().y();
   }

   public class05062 method_46005(class00891 var1, class06581 var2) {
      return class05074.y()
         .N(this.method_45977(var1, class05441.N().N(class04711.N(1.0F)).N(class03798.N(var2).N(class07621.N(class06142.N(3, 0.53333336F))))));
   }

   public class05952 method_62727() {
      return class07795.N(class00837.N().N(this.field_51845.y(class04227.F), class06570.vr));
   }

   public class05062 method_45990(class00891 var1, class05952 var2) {
      return class05074.y()
         .N(
            class05441.N()
               .N(
                  (class04111<?>)this.method_45977(
                     var1,
                     class03798.N(var1)
                        .y(var2)
                        .N(
                           class07211.values(),
                           var1x -> class07621.N(class04711.N(1.0F), true).y(class00851.N(var1).N(class01408.N().N(class05543.y(var1x), true)))
                        )
                        .N(class07621.N(class04711.N(-1.0F), true))
                  )
               )
         );
   }

   public class05062 method_45985(class00891 var1, class00891 var2) {
      class01921 class01921 = this.field_51845.y(class04227.Z);
      class04546 class04546 = class03798.N(var2)
         .N(class07621.N(class04711.N(2.0F)))
         .y(this.method_62727())
         .N(((class03366)this.method_45978(var1, class03798.N(class06570.by))).y(class07657.N(0.125F)));
      return class05074.y()
         .N(
            class05441.N()
               .N(class04546)
               .y(class00851.N(var1).N(class01408.N().N(class06761.y, class08059.field_12607)))
               .y(
                  class00859.N(
                     class00818.N().N(class01427.N().N(class01921, var1).N(class01408.N().N(class06761.y, class08059.field_12609))), new class07209(0, 1, 0)
                  )
               )
         )
         .N(
            class05441.N()
               .N(class04546)
               .y(class00851.N(var1).N(class01408.N().N(class06761.y, class08059.field_12609)))
               .y(
                  class00859.N(
                     class00818.N().N(class01427.N().N(class01921, var1).N(class01408.N().N(class06761.y, class08059.field_12607))), new class07209(0, -1, 0)
                  )
               )
         );
   }

   public class05062 method_65053(class07310 var1) {
      return class05074.y().N(class05441.N().N(class04711.N(1.0F)).y(this.method_60392()).N(class03798.N(var1)));
   }

   public class05062 method_45979(class07310 var1, class06378 var2) {
      return class05074.y().N(class05441.N().N(class04711.N(1.0F)).N((class04111<?>)this.method_45977(var1, class03798.N(var1).N(class07621.N(var2)))));
   }

   public void method_45999(class00891 var1, class00891 var2) {
      class01921 class01921 = this.field_51845.y(class04227.yR);
      class05062 class05062 = this.method_46008(var1, class03798.N(var1).y(class06526.N(class01921.y(class07314.l), 0.33F, 0.55F, 0.77F, 1.0F)));
      this.method_45988(var1, class05062);
      this.method_45988(var2, class05062);
   }

   public class05062 method_46008(class00891 var1, class04111<?> var2) {
      return method_45991(var1, this.method_60392(), var2);
   }

   public class05062 method_45981(class00891 var1, class06581 var2) {
      class01921 class01921 = this.field_51845.y(class04227.yR);
      return this.method_45989(var1, (class04111<?>)this.method_45977(var1, class03798.N(var2).N(class02349.N(class01921.y(class07314.l)))));
   }

   public <T extends class07297<T>> T method_45978(class07310 var1, class07297<T> var2) {
      return (T)(!this.field_40608.contains(var1.B()) ? var2.y(class00788.L()) : var2.M());
   }

   public class05062 method_65261(class00891 var1) {
      return class05074.y()
         .N(
            class05441.N()
               .N(
                  (class04111<?>)this.method_45977(
                     var1,
                     class03798.N(var1)
                        .N(
                           class07211.values(),
                           var1x -> class07621.N(class04711.N(1.0F), true).y(class00851.N(var1).N(class01408.N().N(class05543.y(var1x), true)))
                        )
                        .N(class07621.N(class04711.N(-1.0F), true))
                  )
               )
         );
   }

   public class05062 method_46010(class00891 var1) {
      class01921 class01921 = this.field_51845.y(class04227.yR);
      return this.method_45989(
         var1,
         (class04111<?>)this.method_45977(
            var1, class03798.N(class06570.TB).N(class07621.N(class06345.N(2.0F, 5.0F))).N(class02349.N(class01921.y(class07314.l)))
         )
      );
   }

   public class05062 method_46015(class00891 var1) {
      return class05074.y()
         .N(
            class05441.N()
               .N(class04711.N(1.0F))
               .N(
                  class03798.N(var1)
                     .y(this.method_60390())
                     .N(class02683.y(class06551.z).N(class02484.Nd))
                     .N(class05501.N(var1).N(class04593.L))
                     .N(class03798.N(var1))
               )
         );
   }

   public class05062 method_46001(class00891 var1, class04111<?> var2) {
      return method_45991(var1, this.method_62727(), var2);
   }

   public class05062 method_45996(class00891 var1) {
      return class05074.y()
         .N(this.method_45978(var1, class05441.N().N(class04711.N(1.0F)).N(class03798.N(var1).N(class02683.y(class06551.z).N(class02484.B)))));
   }

   public class05062 method_46020(class00891 var1) {
      return class05074.y()
         .N(
            class05441.N()
               .N(class04711.N(1.0F))
               .N(
                  (class04111<?>)this.method_45977(
                     var1,
                     class03798.N(var1)
                        .N(
                           List.of(2, 3, 4),
                           var1x -> class07621.N(class04711.N(var1x.intValue())).y(class00851.N(var1).N(class01408.N().N(class05440.R, var1x.intValue())))
                        )
                  )
               )
         );
   }

   public static class05062 method_45991(class00891 var0, class05952 var1, class04111<?> var2) {
      return class05074.y().N(class05441.N().N(class04711.N(1.0F)).N(class03798.N(var0).y(var1).N(var2)));
   }

   public class05062 method_46022(class00891 var1) {
      return this.method_45987(var1, class07196.L, class08059.field_12607);
   }

   public class05062 method_45980(class00891 var1) {
      return class05074.y()
         .N(
            class05441.N()
               .N(class04711.N(1.0F))
               .N(
                  (class04111<?>)this.method_45977(
                     var1,
                     class03798.N(var1).N(class07621.N(class04711.N(2.0F)).y(class00851.N(var1).N(class01408.N().N(class07007.y, class08054.field_12682))))
                  )
               )
         );
   }

   public class05062 method_64930(class00891 var1) {
      return class05074.y()
         .N(class05441.N().N((class04111<?>)this.method_45977(var1, class03798.N(var1).y(class00851.N(var1).N(class01408.N().N(class00318.y, true))))));
   }

   public final class05062 method_46009(class07310 var1) {
      return class05074.y()
         .N(this.method_45978(class00869.MJ, class05441.N().N(class04711.N(1.0F)).N(class03798.N(class00869.MJ))))
         .N(this.method_45978(var1, class05441.N().N(class04711.N(1.0F)).N(class03798.N(var1))));
   }

   public final class05952 method_60392() {
      return this.method_62727().y(this.method_60390());
   }

   public final class05952 method_60393() {
      return this.method_60392().y();
   }

   public class05062 method_45983(class00891 var1, class07310 var2) {
      return this.method_45989(var1, (class04111<?>)this.method_45978(var1, class03798.N(var2)));
   }

   public class05952 method_60390() {
      return class07795.N(
         class00837.N()
            .N(class00159.N().N(class02482.y, class02474.N(List.of(new class00800(this.field_51845.y(class04227.yR).y(class07314.t), class00836.y(1))))).y())
      );
   }

   public class05062 method_45984(class00891 var1, class07310 var2, class06378 var3) {
      return this.method_45989(var1, (class04111<?>)this.method_45977(var1, class03798.N(var2).N(class07621.N(var3))));
   }

   public class05062 method_74433(class00891 var1) {
      return class05074.y()
         .N(
            this.method_45978(
               var1,
               class05441.N().N(class04711.N(1.0F)).N(class03798.N(var1).N(class02683.y(class06551.z).N(class02484.B)).N(class05501.N(var1).N(class08981.L)))
            )
         );
   }

   public final class05062 method_46003(class07310 var1) {
      return class05074.y().N(class05441.N().y(this.method_60390()).N(class04711.N(1.0F)).N(class03798.N(var1)));
   }

   @Override
   public void method_10399(BiConsumer<class05946<class05074>, class05062> var1) {
      this.method_10379();
      HashSet hashset = new HashSet();

      for (class00891 class00891 : class04206.i) {
         if (class00891.N(this.field_40609)) {
            class00891.d().ifPresent(var4x -> {
               if (hashset.add(var4x)) {
                  class05062 class05062 = this.field_40610.remove(var4x);
                  if (class05062 == null) {
                     throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", var4x.N(), class04206.i.y(class00891)));
                  }

                  var1.accept(var4x, class05062);
               }
            });
         }
      }

      if (!this.field_40610.isEmpty()) {
         throw new IllegalStateException("Created block loot tables for non-blocks: " + this.field_40610.keySet());
      }
   }
}
