package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap;
import it.unimi.dsi.fastutil.objects.Object2BooleanMaps;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Object2BooleanMap.Entry;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.jspecify.annotations.Nullable;

public record class01406(
   class00836 level,
   class02227 gameType,
   List<class01419<?>> stats,
   Object2BooleanMap<class05946<class06521<?>>> recipes,
   Map<class01894, class01385> advancements,
   Optional<class00821> lookingAt,
   Optional<class08697> input
) implements class03622 {
   public static final int N = 100;
   public static final MapCodec<class01406> y = RecordCodecBuilder.mapCodec(
      var0 -> var0.group(
            class00836.u.optionalFieldOf("level", class00836.L).forGetter(class01406::y),
            class02227.L.optionalFieldOf("gamemode", class02227.N).forGetter(class01406::L),
            class01419.N.listOf().optionalFieldOf("stats", List.of()).forGetter(class01406::u),
            class06338.R(class06521.M).optionalFieldOf("recipes", Object2BooleanMaps.emptyMap()).forGetter(class01406::i),
            Codec.unboundedMap(class01894.N, class01385.y).optionalFieldOf("advancements", Map.of()).forGetter(class01406::R),
            class00821.N.optionalFieldOf("looking_at").forGetter(class01406::M),
            class08697.N.optionalFieldOf("input").forGetter(class01406::B)
         )
         .apply(var0, class01406::new)
   );

   public class02227 L() {
      return this.gameType;
   }

   public Optional<class00821> M() {
      return this.lookingAt;
   }

   public class01406(
      class00836 level,
      class02227 gameType,
      List<class01419<?>> stats,
      Object2BooleanMap<class05946<class06521<?>>> recipes,
      Map<class01894, class01385> advancements,
      Optional<class00821> lookingAt,
      Optional<class08697> input
   ) {
      super();
      this.level = level;
      this.gameType = gameType;
      this.stats = stats;
      this.recipes = recipes;
      this.advancements = advancements;
      this.lookingAt = lookingAt;
      this.input = input;
   }

   public Optional<class08697> B() {
      return this.input;
   }

   public Object2BooleanMap<class05946<class06521<?>>> i() {
      return this.recipes;
   }

   public List<class01419<?>> u() {
      return this.stats;
   }

   public class00836 y() {
      return this.level;
   }

   @Override
   public boolean N(class07049 var1, class04782 var2, @Nullable class06889 var3) {
      if (!(var1 instanceof class04770 class04770)) {
         return false;
      } else if (!this.level.u(class04770.fields_37fa3311b0e9d3e9b883d09222919bf5a_0)) {
         return false;
      } else if (!this.gameType.N(class04770.method_68876())) {
         return false;
      } else {
         class04895 class04895 = class04770.method_14248();

         for (class01419 class01419 : this.stats) {
            if (!class01419.N(class04895)) {
               return false;
            }
         }

         class04912 class04912 = class04770.method_14253();
         ObjectIterator objectiterator = this.recipes.object2BooleanEntrySet().iterator();

         while (objectiterator.hasNext()) {
            Entry entry = (Entry)objectiterator.next();
            if (class04912.y((class05946<class06521<?>>)entry.getKey()) != entry.getBooleanValue()) {
               return false;
            }
         }

         if (!this.advancements.isEmpty()) {
            class03704 class03704 = class04770.method_14236();
            class04478 class04478 = class04770.method_51469().method_8503().Nh();

            for (java.util.Map.Entry entry1 : this.advancements.entrySet()) {
               class03711 class03711 = class04478.N((class01894)entry1.getKey());
               if (class03711 == null || !((class01385)entry1.getValue()).test(class03704.y(class03711))) {
                  return false;
               }
            }
         }

         if (this.lookingAt.isPresent()) {
            class06889 class06889xx = class04770.method_33571();
            class06889 class06889x = class04770.method_5828(1.0F);
            class06889 class06889xx = class06889xx.y(class06889x.M * 100.0, class06889x.B * 100.0, class06889x.Z * 100.0);
            class06145 class06145 = class08038.N(
               class04770.method_51469(),
               class04770,
               class06889xx,
               class06889xx,
               new class00734(class06889xx, class06889xx).M(1.0),
               var0 -> !var0.method_7325(),
               0.0F
            );
            if (class06145 == null || class06145.N() != class07113.field_1331) {
               return false;
            }

            class07049 class07049 = class06145.L();
            if (!this.lookingAt.get().N(class04770, class07049) || !class04770.method_6057(class07049)) {
               return false;
            }
         }

         return !this.input.isPresent() || this.input.get().N(class04770.method_63562());
      }
   }

   @Override
   public MapCodec<class01406> N() {
      return class03631.L;
   }

   public Map<class01894, class01385> R() {
      return this.advancements;
   }
}
