package minecraft;

import com.google.common.collect.Maps;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import net.fabricmc.fabric.api.datagen.v1.loot.FabricEntityLootTableGenerator;
import net.fabricmc.fabric.mixin.datagen.loot.EntityLootSubProviderAccessor;

public abstract class class01995 implements class02013, FabricEntityLootTableGenerator, EntityLootSubProviderAccessor {
   protected final class01929 field_51846;
   private final class03767 field_42084;
   private final class03767 field_42085;
   public final Map<class07078<?>, Map<class05946<class05074>, class05062>> field_40615 = Maps.newHashMap();

   protected class01995(class03767 var1, class03767 var2, class01929 var3) {
      super();
      this.field_42084 = var1;
      this.field_42085 = var2;
      this.field_51846 = var3;
   }

   public class01995(class03767 var1, class01929 var2) {
      this(var1, var1, var2);
   }

   public static class05457 method_46031(Map<class06563, class05946<class05074>> var0) {
      class04546 class04546 = class04559.N();

      for (Entry entry : var0.entrySet()) {
         class04546 = class04546.N(
            class03367.N((class05946<class05074>)entry.getValue())
               .y(
                  class07700.N(
                     class05919.field_935, class00810.N().N(class00159.N().N(class02471.N(class02484.Nr, (class06563)entry.getKey())).y()).N(class08219.y())
                  )
               )
         );
      }

      return class05441.N().N(class04546);
   }

   protected final class03489 method_60394() {
      class01921 class01921 = this.field_51846.y(class04227.yR);
      return class03494.N(
         class07700.N(class05919.field_935, class00810.N().N(class00854.N().y(true))),
         class07700.N(
            class05919.field_939,
            class00810.N()
               .N(
                  class06124.N()
                     .R(class00837.N().N(class00159.N().N(class02482.y, class02474.N(List.of(new class00800(class01921.y(class02625.s), class00836.L)))).y()))
               )
         )
      );
   }

   public abstract void method_10400();

   protected class05952 method_46034(class02055<class07078<?>> var1) {
      return class07318.N(class00789.N().y(class00810.N().N(var1, class07078.NR)));
   }

   public void method_46028(class07078<?> var1, class05946<class05074> var2, class05062 var3) {
      this.field_40615.computeIfAbsent(var1, var0 -> new HashMap<>()).put(var2, var3);
   }

   protected class05952 method_46030(class02055<class07078<?>> var1, class02055<class04068> var2, class05946<class04068> var3) {
      return class07318.N(class00789.N().y(class00810.N().N(var1, class07078.NR).N(class00159.N().N(class02471.N(class02484.NA, var2.y(var3))).y())));
   }

   public void method_46029(class07078<?> var1, class05062 var2) {
      this.method_46028(var1, var1.Z().orElseThrow(() -> new IllegalStateException("Entity " + var1 + " has no loot table")), var2);
   }

   @Override
   public void method_10399(BiConsumer<class05946<class05074>, class05062> var1) {
      this.method_10400();
      HashSet hashset = new HashSet();
      class04206.M
         .z()
         .forEach(
            var3 -> {
               class07078 class07078 = var3.N();
               if (class07078.N(this.field_42084)) {
                  Optional<class05946<class05074>> optional = class07078.Z();
                  if (optional.isPresent()) {
                     Map<class05946<class05074>, class05062> map = this.field_40615.remove(class07078);
                     if (class07078.N(this.field_42085) && (map == null || !map.containsKey(optional.get()))) {
                        throw new IllegalStateException(String.format(Locale.ROOT, "Missing loottable '%s' for '%s'", optional.get(), var3.B().N()));
                     }

                     if (map != null) {
                        map.forEach((var3x, var4x) -> {
                           if (!hashset.add(var3x)) {
                              throw new IllegalStateException(String.format(Locale.ROOT, "Duplicate loottable '%s' for '%s'", var3x, var3.B().N()));
                           } else {
                              var1.accept(var3x, var4x);
                           }
                        });
                     }
                  } else {
                     Map map1 = this.field_40615.remove(class07078);
                     if (map1 != null) {
                        throw new IllegalStateException(
                           String.format(
                              Locale.ROOT,
                              "Weird loottables '%s' for '%s', not a LivingEntity so should not have loot",
                              map1.keySet().stream().map(var0 -> var0.N().toString()).collect(Collectors.joining(",")),
                              var3.B().N()
                           )
                        );
                     }
                  }
               }
            }
         );
      if (!this.field_40615.isEmpty()) {
         throw new IllegalStateException("Created loot tables for entities not supported by datapack: " + this.field_40615.keySet());
      }
   }
}
