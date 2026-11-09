package minecraft;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFixer;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import org.jspecify.annotations.Nullable;

public class class05176 implements class06820 {
   public static final int y = 1493;
   private static final Map<String, String> L = class07536.N(Maps.newHashMap(), var0 -> {
      var0.put("Village", "Village");
      var0.put("Mineshaft", "Mineshaft");
      var0.put("Mansion", "Mansion");
      var0.put("Igloo", "Temple");
      var0.put("Desert_Pyramid", "Temple");
      var0.put("Jungle_Pyramid", "Temple");
      var0.put("Swamp_Hut", "Temple");
      var0.put("Stronghold", "Stronghold");
      var0.put("Monument", "Monument");
      var0.put("Fortress", "Fortress");
      var0.put("EndCity", "EndCity");
   });
   private static final Map<String, String> u = class07536.N(Maps.newHashMap(), var0 -> {
      var0.put("Iglu", "Igloo");
      var0.put("TeDP", "Desert_Pyramid");
      var0.put("TeJP", "Jungle_Pyramid");
      var0.put("TeSH", "Swamp_Hut");
   });
   private static final Set<String> i = Set.of(
      "pillager_outpost",
      "mineshaft",
      "mansion",
      "jungle_pyramid",
      "desert_pyramid",
      "igloo",
      "ruined_portal",
      "shipwreck",
      "swamp_hut",
      "stronghold",
      "monument",
      "ocean_ruin",
      "fortress",
      "endcity",
      "buried_treasure",
      "village",
      "nether_fossil",
      "bastion_remnant"
   );
   private final boolean R;
   private final Map<String, Long2ObjectMap<class07001>> M = Maps.newHashMap();
   private final Map<String, class04917> B = Maps.newHashMap();
   @Nullable
   private final class00408 Z;
   private final List<String> z;
   private final List<String> U;
   private final DataFixer E;
   private boolean W;

   public class05176(@Nullable class00408 var1, List<String> var2, List<String> var3, DataFixer var4) {
      super();
      this.Z = var1;
      this.z = var2;
      this.U = var3;
      this.E = var4;
      boolean flag = false;

      for (String s : this.U) {
         flag |= this.M.get(s) != null;
      }

      this.R = flag;
   }

   @Override
   public void N(class07321 var1) {
      long ix = var1.y();

      for (String s : this.z) {
         class04917 class04917 = this.B.get(s);
         if (class04917 != null && class04917.L(ix)) {
            class04917.u(ix);
         }
      }
   }

   private synchronized void N(class00408 var1) {
      if (!this.W) {
         for (String s : this.z) {
            class07001 class07001 = new class07001();

            try {
               class07001 = var1.N(s, class05715.field_45084, 1493).m("data").m("Features");
               if (class07001.z()) {
                  continue;
               }
            } catch (IOException ioexception) {
            }

            class07001.N((BiConsumer<String, class07709>)((var1x, var2) -> {
               if (var2 instanceof class07001 class07001x) {
                  long ix = class07321.u(class07001x.y("ChunkX", 0), class07001x.y("ChunkZ", 0));
                  class07741 class07741 = class07001x.s("Children");
                  if (!class07741.isEmpty()) {
                     class07741.N(0).flatMap(var0 -> var0.Z("id")).map(u::get).ifPresent(var1xx -> class07001x.N_67("id", var1xx));
                  }

                  class07001x.Z("id").ifPresent(var4x -> this.M.computeIfAbsent(var4x, var0 -> new Long2ObjectOpenHashMap()).put(ix, class07001x));
               }
            }));
            String s1 = s + "_index";
            class04917 class04917x = var1.N(class04917.N(s1));
            if (class04917x.N().isEmpty()) {
               class04917 class04917x = new class04917();
               this.B.put(s, class04917x);
               class07001.N((BiConsumer<String, class07709>)((var1x, var2) -> {
                  if (var2 instanceof class07001 class07001x) {
                     class04917.N(class07321.u(class07001x.y("ChunkX", 0), class07001x.y("ChunkZ", 0)));
                  }
               }));
            } else {
               this.B.put(s, class04917x);
            }
         }

         this.W = true;
      }
   }

   private class07001 N(class07001 var1, class07321 var2) {
      class07001 class07001xxx = var1.m("Level");
      class07001 class07001x = class07001xxx.m("Structures");
      class07001 class07001xx = class07001x.m("Starts");

      for (String s : this.U) {
         Long2ObjectMap<class07001> long2objectmap = this.M.get(s);
         if (long2objectmap != null) {
            long ix = var2.y();
            if (this.B.get(L.get(s)).L(ix)) {
               class07001 class07001xxx = (class07001)long2objectmap.get(ix);
               if (class07001xxx != null) {
                  class07001xx.N(s, class07001xxx);
               }
            }
         }
      }

      class07001x.N("Starts", class07001xx);
      class07001xxx.N("Structures", class07001x);
      var1.N("Level", class07001xxx);
      return var1;
   }

   private boolean N(int var1, int var2) {
      if (!this.R) {
         return false;
      } else {
         for (String s : this.U) {
            if (this.M.get(s) != null && this.B.get(L.get(s)).L(class07321.u(var1, var2))) {
               return true;
            }
         }

         return false;
      }
   }

   private boolean N(int var1, int var2, String var3) {
      return !this.R ? false : this.M.get(var3) != null && this.B.get(L.get(var3)).y(class07321.u(var1, var2));
   }

   private class07001 N(class07001 var1) {
      class07001 class07001xx = var1.m("Level");
      class07321 class07321 = new class07321(class07001xx.y("xPos", 0), class07001xx.y("zPos", 0));
      if (this.N(class07321.B, class07321.Z)) {
         var1 = this.N(var1, class07321);
      }

      class07001 class07001x = class07001xx.m("Structures");
      class07001 class07001xx = class07001x.m("References");

      for (String s : this.U) {
         boolean flag = i.contains(s.toLowerCase(Locale.ROOT));
         if (!class07001xx.E(s).isPresent() && flag) {
            byte b0 = 8;
            LongArrayList longarraylist = new LongArrayList();

            for (int ix = class07321.B - 8; ix <= class07321.B + 8; ix++) {
               for (int j = class07321.Z - 8; j <= class07321.Z + 8; j++) {
                  if (this.N(ix, j, s)) {
                     longarraylist.add(class07321.u(ix, j));
                  }
               }
            }

            class07001xx.N(s, longarraylist.toLongArray());
         }
      }

      class07001x.N("References", class07001xx);
      class07001xx.N("Structures", class07001x);
      var1.N("Level", class07001xx);
      return var1;
   }

   @Override
   public int N() {
      return 1493;
   }

   public static Supplier<class06820> N(class05946<class07299> var0, Supplier<class00408> var1, DataFixer var2) {
      if (var0 == class07299.field_25179) {
         return () -> new class05176(
            (class00408)var1.get(),
            ImmutableList.of("Monument", "Stronghold", "Village", "Mineshaft", "Temple", "Mansion"),
            ImmutableList.of("Village", "Mineshaft", "Mansion", "Igloo", "Desert_Pyramid", "Jungle_Pyramid", "Swamp_Hut", "Stronghold", "Monument"),
            var2
         );
      } else if (var0 == class07299.field_25180) {
         ImmutableList immutablelist1 = ImmutableList.of("Fortress");
         return () -> new class05176((class00408)var1.get(), immutablelist1, immutablelist1, var2);
      } else if (var0 == class07299.field_25181) {
         ImmutableList immutablelist = ImmutableList.of("EndCity");
         return () -> new class05176((class00408)var1.get(), immutablelist, immutablelist, var2);
      } else {
         return class06820.N;
      }
   }

   @Override
   public class07001 applyFix(class07001 var1) {
      if (!this.W && this.Z != null) {
         this.N(this.Z);
      }

      int ix = class07717.R(var1);
      if (ix < 1493) {
         var1 = class05715.field_19214.N(this.E, var1, ix, 1493);
         if (var1.W("Level").flatMap(var0 -> var0.T("hasLegacyStructureData")).orElse(false)) {
            var1 = this.N(var1);
         }
      }

      return var1;
   }
}
