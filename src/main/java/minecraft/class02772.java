package minecraft;

import com.google.common.collect.Sets;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.OptionalDynamic;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class class02772 extends DataFix {
   private static final Pattern N = Pattern.compile("\\[(\\d+)\\]");
   private static final Set<String> y = Sets.newHashSet(
      new String[]{"minecraft:jigsaw", "minecraft:nvi", "minecraft:pcp", "minecraft:bastionremnant", "minecraft:runtime"}
   );
   private static final Set<String> L = Sets.newHashSet(new String[]{"minecraft:tree", "minecraft:flower", "minecraft:block_pile", "minecraft:random_patch"});

   private static <T> Dynamic<T> L(Dynamic<T> var0) {
      return var0.asStreamOpt().map(class02772::N).map(var0::createList).result().orElse(var0);
   }

   public class02772(Schema var1) {
      super(var1, false);
   }

   private static <T> Dynamic<T> y(Dynamic<T> var0) {
      return var0.update("Children", class02772::L);
   }

   protected static Dynamic<?> N(Dynamic<?> var0) {
      Optional<String> optional = N(
         N(var0, "type").asString(""),
         N(var0, "name").asString(""),
         N(var0, "config", "state_provider", "type").asString(""),
         N(var0, "config", "state_provider", "state", "Name").asString(""),
         N(var0, "config", "state_provider", "entries", "[0]", "data", "Name").asString(""),
         N(var0, "config", "foliage_placer", "type").asString(""),
         N(var0, "config", "leaves_provider", "state", "Name").asString("")
      );
      return optional.isPresent() ? var0.createString(optional.get()) : var0;
   }

   private static Stream<? extends Dynamic<?>> N(Stream<? extends Dynamic<?>> var0) {
      return var0.map(
         var0x -> {
            String s = var0x.get("id").asString("");
            if (!y.contains(s)) {
               return var0x;
            } else {
               return !var0x.get("pool_element").get("element_type").asString("").equals("minecraft:feature_pool_element")
                  ? var0x
                  : var0x.update("pool_element", var0xx -> var0xx.update("feature", class02772::N));
            }
         }
      );
   }

   private static <T> OptionalDynamic<T> N(Dynamic<T> var0, String... var1) {
      if (var1.length == 0) {
         throw new IllegalArgumentException("Missing path");
      } else {
         OptionalDynamic optionaldynamic = var0.get(var1[0]);

         for (int i = 1; i < var1.length; i++) {
            String s = var1[i];
            Matcher matcher = N.matcher(s);
            if (matcher.matches()) {
               int j = Integer.parseInt(matcher.group(1));
               List list = optionaldynamic.asList(Function.identity());
               if (j >= 0 && j < list.size()) {
                  optionaldynamic = new OptionalDynamic(var0.getOps(), DataResult.success((Dynamic)list.get(j)));
               } else {
                  optionaldynamic = new OptionalDynamic(var0.getOps(), DataResult.error(() -> "Missing id:" + j));
               }
            } else {
               optionaldynamic = optionaldynamic.get(s);
            }
         }

         return optionaldynamic;
      }
   }

   private static Optional<String> N(String var0, String var1, String var2, String var3, String var4, String var5, String var6) {
      String s;
      if (!var0.isEmpty()) {
         s = var0;
      } else {
         if (var1.isEmpty()) {
            return Optional.empty();
         }

         if ("minecraft:normal_tree".equals(var1)) {
            s = "minecraft:tree";
         } else {
            s = var1;
         }
      }

      if (L.contains(s)) {
         if ("minecraft:random_patch".equals(s)) {
            if ("minecraft:simple_state_provider".equals(var2)) {
               if ("minecraft:sweet_berry_bush".equals(var3)) {
                  return Optional.of("minecraft:patch_berry_bush");
               }

               if ("minecraft:cactus".equals(var3)) {
                  return Optional.of("minecraft:patch_cactus");
               }
            } else if ("minecraft:weighted_state_provider".equals(var2) && ("minecraft:grass".equals(var4) || "minecraft:fern".equals(var4))) {
               return Optional.of("minecraft:patch_taiga_grass");
            }
         } else if ("minecraft:block_pile".equals(s)) {
            if (!"minecraft:simple_state_provider".equals(var2) && !"minecraft:rotated_block_provider".equals(var2)) {
               if ("minecraft:weighted_state_provider".equals(var2)) {
                  if ("minecraft:packed_ice".equals(var4) || "minecraft:blue_ice".equals(var4)) {
                     return Optional.of("minecraft:pile_ice");
                  }

                  if ("minecraft:jack_o_lantern".equals(var4) || "minecraft:pumpkin".equals(var4)) {
                     return Optional.of("minecraft:pile_pumpkin");
                  }
               }
            } else {
               if ("minecraft:hay_block".equals(var3)) {
                  return Optional.of("minecraft:pile_hay");
               }

               if ("minecraft:melon".equals(var3)) {
                  return Optional.of("minecraft:pile_melon");
               }

               if ("minecraft:snow".equals(var3)) {
                  return Optional.of("minecraft:pile_snow");
               }
            }
         } else {
            if ("minecraft:flower".equals(s)) {
               return Optional.of("minecraft:flower_plain");
            }

            if ("minecraft:tree".equals(s)) {
               if ("minecraft:acacia_foliage_placer".equals(var5)) {
                  return Optional.of("minecraft:acacia");
               }

               if ("minecraft:blob_foliage_placer".equals(var5) && "minecraft:oak_leaves".equals(var6)) {
                  return Optional.of("minecraft:oak");
               }

               if ("minecraft:pine_foliage_placer".equals(var5)) {
                  return Optional.of("minecraft:pine");
               }

               if ("minecraft:spruce_foliage_placer".equals(var5)) {
                  return Optional.of("minecraft:spruce");
               }
            }
         }
      }

      return Optional.empty();
   }

   public TypeRewriteRule makeRule() {
      return this.writeFixAndRead(
         "SavedDataFeaturePoolElementFix", this.getInputSchema().getType(class06962.H), this.getOutputSchema().getType(class06962.H), class02772::y
      );
   }
}
