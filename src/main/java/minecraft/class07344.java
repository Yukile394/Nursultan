package minecraft;

import Nursultan.class10740;
import com.google.common.collect.Maps;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import it.unimi.dsi.fastutil.shorts.ShortArrayList;
import it.unimi.dsi.fastutil.shorts.ShortList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public final class class07344 {
   private class06614 containerFactory;
   private class07321 chunkPos;
   private int minSectionY;
   private long lastUpdateTime;
   private long inhabitedTime;
   private class00549 chunkStatus;
   @Nullable
   private class04333 blendingData;
   @Nullable
   private class02999 belowZeroRetrogen;
   private class07371 upgradeData;
   @Nullable
   private long[] carvingMask;
   private Map<class07830, long[]> heightmaps;
   private class08094 packedTicks;
   private ShortList[] postProcessingSections;
   private boolean lightCorrect;
   private List<class07359> sectionData;
   private List<class07001> entities;
   private List<class07001> blockEntities;
   private class07001 structureData;
   private static final Codec<List<class04306<class00891>>> w = class04306.N(class04206.i.T()).listOf();
   private static final Codec<List<class04306<class04651>>> k = class04306.N(class04206.L.T()).listOf();
   private static final Logger Y = LogUtils.getLogger();
   private static final String Q = "UpgradeData";
   private static final String O = "block_ticks";
   private static final String g = "fluid_ticks";
   public static final String N = "xPos";
   public static final String y = "zPos";
   public static final String L = "Heightmaps";
   public static final String u = "isLightOn";
   public static final String i = "sections";
   public static final String R = "BlockLight";
   public static final String M = "SkyLight";
   private static final Logger I = LoggerFactory.getLogger("SerializableChunkDataMixin");
   @Nullable
   private class07001 J;

   public class07321 L() {
      return this.chunkPos;
   }

   public class00549 M() {
      return this.chunkStatus;
   }

   public boolean P() {
      return this.lightCorrect;
   }

   public List<class07001> T() {
      return this.entities;
   }

   public class07344(
      class06614 var1,
      class07321 var2,
      int var3,
      long var4,
      long var6,
      class00549 var8,
      @Nullable class04333 var9,
      @Nullable class02999 var10,
      class07371 var11,
      @Nullable long[] var12,
      Map<class07830, long[]> var13,
      class08094 var14,
      ShortList[] var15,
      boolean var16,
      List<class07359> var17,
      List<class07001> var18,
      List<class07001> var19,
      class07001 var20
   ) {
      super();
      this.containerFactory = var1;
      this.chunkPos = var2;
      this.minSectionY = var3;
      this.lastUpdateTime = var4;
      this.inhabitedTime = var6;
      this.chunkStatus = var8;
      this.blendingData = var9;
      this.belowZeroRetrogen = var10;
      this.upgradeData = var11;
      this.carvingMask = var12;
      this.heightmaps = var13;
      this.packedTicks = var14;
      this.postProcessingSections = var15;
      this.lightCorrect = var16;
      this.sectionData = var17;
      this.entities = var18;
      this.blockEntities = var19;
      this.structureData = var20;
   }

   @Override
   public final boolean equals(Object var1) {
      return this == var1
         ? true
         : var1 instanceof class07344
            && Objects.equals(this.containerFactory, ((class07344)var1).containerFactory)
            && Objects.equals(this.chunkPos, ((class07344)var1).chunkPos)
            && this.minSectionY == ((class07344)var1).minSectionY
            && this.lastUpdateTime == ((class07344)var1).lastUpdateTime
            && this.inhabitedTime == ((class07344)var1).inhabitedTime
            && Objects.equals(this.chunkStatus, ((class07344)var1).chunkStatus)
            && Objects.equals(this.blendingData, ((class07344)var1).blendingData)
            && Objects.equals(this.belowZeroRetrogen, ((class07344)var1).belowZeroRetrogen)
            && Objects.equals(this.upgradeData, ((class07344)var1).upgradeData)
            && Objects.equals(this.carvingMask, ((class07344)var1).carvingMask)
            && Objects.equals(this.heightmaps, ((class07344)var1).heightmaps)
            && Objects.equals(this.packedTicks, ((class07344)var1).packedTicks)
            && Objects.equals(this.postProcessingSections, ((class07344)var1).postProcessingSections)
            && this.lightCorrect == ((class07344)var1).lightCorrect
            && Objects.equals(this.sectionData, ((class07344)var1).sectionData)
            && Objects.equals(this.entities, ((class07344)var1).entities)
            && Objects.equals(this.blockEntities, ((class07344)var1).blockEntities)
            && Objects.equals(this.structureData, ((class07344)var1).structureData);
   }

   @Override
   public final String toString() {
      return "class07344[containerFactory="
         + Objects.toString(this.containerFactory)
         + ", chunkPos="
         + Objects.toString(this.chunkPos)
         + ", minSectionY="
         + Integer.toString(this.minSectionY)
         + ", lastUpdateTime="
         + Long.toString(this.lastUpdateTime)
         + ", inhabitedTime="
         + Long.toString(this.inhabitedTime)
         + ", chunkStatus="
         + Objects.toString(this.chunkStatus)
         + ", blendingData="
         + Objects.toString(this.blendingData)
         + ", belowZeroRetrogen="
         + Objects.toString(this.belowZeroRetrogen)
         + ", upgradeData="
         + Objects.toString(this.upgradeData)
         + ", carvingMask="
         + Objects.toString(this.carvingMask)
         + ", heightmaps="
         + Objects.toString(this.heightmaps)
         + ", packedTicks="
         + Objects.toString(this.packedTicks)
         + ", postProcessingSections="
         + Objects.toString(this.postProcessingSections)
         + ", lightCorrect="
         + Boolean.toString(this.lightCorrect)
         + ", sectionData="
         + Objects.toString(this.sectionData)
         + ", entities="
         + Objects.toString(this.entities)
         + ", blockEntities="
         + Objects.toString(this.blockEntities)
         + ", structureData="
         + Objects.toString(this.structureData)
         + "]";
   }

   @Override
   public final int hashCode() {
      return (
               (
                        (
                                 (
                                          (
                                                   (
                                                            (
                                                                     (
                                                                              (
                                                                                       (
                                                                                                (
                                                                                                         (
                                                                                                                  (
                                                                                                                           (
                                                                                                                                    (
                                                                                                                                             (
                                                                                                                                                      (
                                                                                                                                                               0
                                                                                                                                                                     * 31
                                                                                                                                                                  + Objects.hashCode(
                                                                                                                                                                     this.containerFactory
                                                                                                                                                                  )
                                                                                                                                                            )
                                                                                                                                                            * 31
                                                                                                                                                         + Objects.hashCode(
                                                                                                                                                            this.chunkPos
                                                                                                                                                         )
                                                                                                                                                   )
                                                                                                                                                   * 31
                                                                                                                                                + Integer.hashCode(
                                                                                                                                                   this.minSectionY
                                                                                                                                                )
                                                                                                                                          )
                                                                                                                                          * 31
                                                                                                                                       + Long.hashCode(
                                                                                                                                          this.lastUpdateTime
                                                                                                                                       )
                                                                                                                                 )
                                                                                                                                 * 31
                                                                                                                              + Long.hashCode(
                                                                                                                                 this.inhabitedTime
                                                                                                                              )
                                                                                                                        )
                                                                                                                        * 31
                                                                                                                     + Objects.hashCode(this.chunkStatus)
                                                                                                               )
                                                                                                               * 31
                                                                                                            + Objects.hashCode(this.blendingData)
                                                                                                      )
                                                                                                      * 31
                                                                                                   + Objects.hashCode(this.belowZeroRetrogen)
                                                                                             )
                                                                                             * 31
                                                                                          + Objects.hashCode(this.upgradeData)
                                                                                    )
                                                                                    * 31
                                                                                 + Objects.hashCode(this.carvingMask)
                                                                           )
                                                                           * 31
                                                                        + Objects.hashCode(this.heightmaps)
                                                                  )
                                                                  * 31
                                                               + Objects.hashCode(this.packedTicks)
                                                         )
                                                         * 31
                                                      + Objects.hashCode(this.postProcessingSections)
                                                )
                                                * 31
                                             + Boolean.hashCode(this.lightCorrect)
                                       )
                                       * 31
                                    + Objects.hashCode(this.sectionData)
                              )
                              * 31
                           + Objects.hashCode(this.entities)
                     )
                     * 31
                  + Objects.hashCode(this.blockEntities)
            )
            * 31
         + Objects.hashCode(this.structureData);
   }

   @Nullable
   public class04333 B() {
      return this.blendingData;
   }

   @Nullable
   public class02999 Z() {
      return this.belowZeroRetrogen;
   }

   public long i() {
      return this.lastUpdateTime;
   }

   public List<class07001> b() {
      return this.blockEntities;
   }

   public List<class07359> s() {
      return this.sectionData;
   }

   public ShortList[] m() {
      return this.postProcessingSections;
   }

   public class07001 j() {
      return this.structureData;
   }

   @Nullable
   public long[] U() {
      return this.carvingMask;
   }

   public class07371 z() {
      return this.upgradeData;
   }

   public int u() {
      return this.minSectionY;
   }

   public class06614 y() {
      return this.containerFactory;
   }

   public Map<class07830, long[]> E() {
      return this.heightmaps;
   }

   public static class07344 N(class04782 var0, class08050 var1) {
      if (!var1.T()) {
         throw new IllegalArgumentException("Chunk can't be serialized: " + var1);
      } else {
         class07321 class07321 = var1.R();
         ArrayList arraylist = new ArrayList();
         class00554[] aclass00554 = var1.u();
         class04775 class04775 = var0.method_14178().L();

         for (int ix = class04775.u(); ix < class04775.i(); ix++) {
            int var7 = var1.method_31603(ix);
            boolean flag = var7 >= 0 && var7 < aclass00554.length;
            class00536 class00536x = class04775.N(class00772.field_9282).N(class01296.N(class07321, ix));
            class00536 class00536x = class04775.N(class00772.field_9284).N(class01296.N(class07321, ix));
            class00536 class00536xx = class00536x != null && !class00536x.u() ? class00536x.y() : null;
            class00536 class00536xxx = class00536x != null && !class00536x.u() ? class00536x.y() : null;
            if (flag || class00536xx != null || class00536xxx != null) {
               class00554 class00554 = flag ? aclass00554[var7].U() : null;
               arraylist.add(new class07359(ix, class00554, class00536xx, class00536xxx));
            }
         }

         ArrayList arraylist1 = new ArrayList(var1.L().size());

         for (class07209 class07209 : var1.L()) {
            class07001 class07001x = var1.N(class07209, var0.method_30349());
            if (class07001x != null) {
               arraylist1.add(class07001x);
            }
         }

         ArrayList arraylist2 = new ArrayList();
         long[] along = null;
         if (var1.E().u() == class00544.field_12808) {
            class07361 class07361 = (class07361)var1;
            arraylist2.addAll(class07361.o());
            class03322 class03322 = class07361.O();
            if (class03322 != null) {
               along = class03322.N();
            }
         }

         EnumMap enummap = new EnumMap<>(class07830.class);

         for (Entry entry : var1.i()) {
            if (var1.E().i().contains(entry.getKey())) {
               long[] along1 = ((class07841)entry.getValue()).N();
               enummap.put((class07830)entry.getKey(), (long[])along1.clone());
            }
         }

         class08094 class08094 = var1.N(var0.N());
         ShortList[] ashortlist = Arrays.stream(var1.m())
            .map(var0x -> var0x != null && !var0x.isEmpty() ? new ShortArrayList(var0x) : null)
            .toArray(ShortList[]::new);
         class07001 class07001 = N(class03298.N(var0), class07321, var1.M(), var1.B());
         class07344 class07344;
         class07344 class07344x = class07344 = new class07344(
            var0.method_74142(),
            class07321,
            var1.method_32891(),
            var0.N(),
            var1.n(),
            var1.E(),
            class01962.N(var1.v(), class03032::N),
            var1.l(),
            var1.b().L(),
            along,
            enummap,
            class08094,
            ashortlist,
            var1.t(),
            arraylist,
            arraylist2,
            arraylist1,
            class07001
         );
         N(var0, var1, new CallbackInfoReturnable("", false, class07344));
         return class07344x;
      }
   }

   private static void N(class07321 var0, int var1, String var2) {
      Y.error("Recoverable errors when loading section [{}, {}, {}]: {}", new Object[]{var0.B, var1, var0.Z, var2});
   }

   public class07361 N(class04782 var1, class05368 var2, class02277 var3, class07321 var4) {
      if (!Objects.equals(var4, this.chunkPos)) {
         Y.error("Chunk file at {} is in the wrong location; relocating. (Expected {}, got {})", new Object[]{var4, var4, this.chunkPos});
         var1.method_8503().N(this.chunkPos, var4, var3);
      }

      class00554[] aclass00554 = new class00554[var1.method_32890()];
      boolean flag = var1.method_8597().i();
      class05795 class05795 = var1.method_14178().L();
      class06614 class06614 = var1.method_74142();
      boolean flag1 = false;

      for (class07359 class07359 : this.sectionData) {
         class01296 class01296 = class01296.N(var4, class07359.N());
         if (class07359.y() != null) {
            aclass00554[var1.method_31603(class07359.N())] = class07359.y();
            var2.N(class01296, class07359.y());
         }

         boolean flag2 = class07359.L() != null;
         boolean var16 = flag && class07359.u() != null;
         if (flag2 || var16) {
            if (!flag1) {
               class05795.y(var4, true);
               flag1 = true;
            }

            if (flag2) {
               class05795.N(class00772.field_9282, class01296, class07359.L());
            }

            if (var16) {
               class05795.N(class00772.field_9284, class01296, class07359.u());
            }
         }
      }

      class00544 class00544 = this.chunkStatus.u();
      Object object;
      if (class00544 == class00544.field_12807) {
         class04310 class04310x = new class04310<>(this.packedTicks.N());
         class04310 class04310x = new class04310<>(this.packedTicks.y());
         object = new class00570(
            var1.method_8410(),
            var4,
            this.upgradeData,
            class04310x,
            class04310x,
            this.inhabitedTime,
            aclass00554,
            N(var1, this.entities, this.blockEntities),
            class03032.N(this.blendingData)
         );
      } else {
         class05688 class05688 = class05688.N(this.packedTicks.N());
         class05688 class05688x = class05688.N(this.packedTicks.y());
         class07361 class07361x = new class07361(
            var4, this.upgradeData, aclass00554, class05688, class05688x, var1, class06614, class03032.N(this.blendingData)
         );
         object = class07361x;
         class07361x.L(this.inhabitedTime);
         if (this.belowZeroRetrogen != null) {
            class07361x.N(this.belowZeroRetrogen);
         }

         class07361x.N(this.chunkStatus);
         if (this.chunkStatus.N(class00549.U)) {
            class07361x.N(class05795);
         }
      }

      ((class08050)object).N(this.lightCorrect);
      EnumSet enumset = EnumSet.noneOf(class07830.class);

      for (class07830 class07830 : ((class08050)object).E().i()) {
         long[] along = this.heightmaps.get(class07830);
         if (along != null) {
            ((class08050)object).N(class07830, along);
         } else {
            enumset.add(class07830);
         }
      }

      class07841.N((class08050)object, enumset);
      ((class08050)object).N_86(N(class03298.N(var1), this.structureData, var1.method_8412()));
      ((class08050)object).y(N(var1.method_30349(), var4, this.structureData));

      for (int ix = 0; ix < this.postProcessingSections.length; ix++) {
         ShortList shortlist = this.postProcessingSections[ix];
         if (shortlist != null) {
            ((class08050)object).N(shortlist, ix);
         }
      }

      if (class00544 == class00544.field_12807) {
         class00548 class00548;
         class00548 class00548x = class00548 = new class00548((class00570)object, false);
         CallbackInfoReturnable callbackinforeturnable1 = new CallbackInfoReturnable("", false, class00548);
         this.N(var1, var2, var3, var4, callbackinforeturnable1);
         return class00548x;
      } else {
         class07361 class07361x = (class07361)object;

         for (class07001 class07001x : this.entities) {
            class07361x.y(class07001x);
         }

         for (class07001 class07001 : this.blockEntities) {
            class07361x.N(class07001);
         }

         if (this.carvingMask != null) {
            class07361x.N(new class03322(this.carvingMask, ((class08050)object).method_31607()));
         }

         CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", false, class07361x);
         this.N(var1, var2, var3, var4, callbackinforeturnable);
         return class07361x;
      }
   }

   private static void N(Logger var0, String var1, Object var2, Object var3) {
      var0.debug(var1, var2, var3);
   }

   private static void N(class05474 var0, class06614 var1, class07001 var2, CallbackInfoReturnable var3, LocalRef var4) {
      class07344 class07344 = (class07344)var3.getReturnValue();
      if (class07344 != null) {
         class07001 class07001 = var2.W("fabric:attachments").orElse(null);
         if (class07001 != null) {
            class07344.J = class07001;
         }
      }
   }

   private void N(class04782 var1, class05368 var2, class02277 var3, class07321 var4, CallbackInfoReturnable var5) {
      class07361 class07361 = (class07361)var5.getReturnValue();
      if (class07361 != null && this.J != null) {
         class07001 class07001 = new class07001();
         class07001.N("fabric:attachments", this.J);

         try (class04495 class04495 = new class04495(I)) {
            class08299 class08299 = class08308.N(class04495, var1.method_30349(), class07001);
            class07361.fabric_readAttachmentsFromNbt(class08299);
         }
      }
   }

   private static void N(class04782 var0, class08050 var1, CallbackInfoReturnable var2) {
      try (class04495 class04495 = new class04495(I)) {
         class08303 class08303 = class08303.N(class04495, var0.method_30349());
         var1.fabric_writeAttachmentsToNbt(class08303);
         class07001 class07001 = class08303.y().W("fabric:attachments").orElse(null);
         if (class07001 != null) {
            ((class07344)var2.getReturnValue()).J = class07001;
         }
      }
   }

   private void N(CallbackInfoReturnable var1) {
      if (this.J != null) {
         ((class07001)var1.getReturnValue()).N("fabric:attachments", this.J);
      }
   }

   @Nullable
   public static class07344 N(class05474 var0, class06614 var1, class07001 var2) {
      LocalRefImpl localrefimpl = new LocalRefImpl();
      localrefimpl.init(null);
      if (var2.Z("Status").isEmpty()) {
         Object object = null;
         object = new CallbackInfoReturnable("", false, object);
         N(var0, var1, var2, (CallbackInfoReturnable)object, localrefimpl);
         return null;
      } else {
         class07321 class07321 = new class07321(var2.y("xPos", 0), var2.y("zPos", 0));
         long ix = var2.y("LastUpdate", 0L);
         long j = var2.y("InhabitedTime", 0L);
         class00549 class00549 = var2.<class00549>N_15("Status", class00549.P).orElse(class00549.L);
         class07371 class07371 = var2.W("UpgradeData").map(var1x -> new class07371(var1x, var0)).orElse(class07371.N);
         boolean flag = var2.y("isLightOn", false);
         class04333 class04333 = var2.<class04333>N_15("blending_data", class04333.N).orElse(null);
         class02999 class02999 = var2.<class02999>N_15("below_zero_retrogen", class02999.N).orElse(null);
         long[] along = var2.E("carving_mask").orElse(null);
         EnumMap enummap = new EnumMap<>(class07830.class);
         var2.W("Heightmaps").ifPresent(var2x -> {
            for (class07830 class07830 : class00549.i()) {
               var2x.E(class07830.N()).ifPresent(var2xx -> enummap.put(class07830, var2xx));
            }
         });
         List<class04306<class00891>> list = class04306.N(var2.<List<class04306<class00891>>>N_15("block_ticks", w).orElse(List.of()), class07321);
         List<class04306<class04651>> list1 = class04306.N(var2.<List<class04306<class04651>>>N_15("fluid_ticks", k).orElse(List.of()), class07321);
         class08094 class08094 = new class08094(list, list1);
         class07741 class07741xx = var2.s("PostProcessing");
         ShortList[] ashortlist = new ShortList[class07741xx.size()];

         for (int kx = 0; kx < class07741xx.size(); kx++) {
            class07741 class07741x = class07741xx.i(kx).orElse(null);
            if (class07741x != null && !class07741x.isEmpty()) {
               ShortArrayList shortarraylist = new ShortArrayList(class07741x.size());

               for (int l = 0; l < class07741x.size(); l++) {
                  shortarraylist.add(class07741x.N(l, (short)0));
               }

               ashortlist[kx] = shortarraylist;
            }
         }

         List list2 = var2.P("entities").stream().flatMap(class07741::z).toList();
         List list3 = var2.P("block_entities").stream().flatMap(class07741::z).toList();
         class07001 class07001x = var2.m("structures");
         class07741 class07741x = var2.s("sections");
         ArrayList arraylist = new ArrayList(class07741x.size());
         Codec<class03925<class03556<class00780>>> codec = var1.B();
         Codec<class07348<class00500>> codec1 = var1.i();

         for (int i1 = 0; i1 < class07741x.size(); i1++) {
            Optional<class07001> optional = class07741x.N(i1);
            if (!optional.isEmpty()) {
               class07001 class07001x = optional.get();
               byte b0 = class07001x.y("Y", (byte)0);
               class00554 class00554;
               if (b0 >= var0.method_32891() && b0 <= var0.method_31597()) {
                  class07348 class07348 = class07001x.W("block_states")
                     .map(
                        var3x -> (class07348)codec1.parse(class07713.N, var3x).promotePartial(var2xx -> N(class07321, b0, var2xx)).getOrThrow(class10740::new)
                     )
                     .orElseGet(var1::N);
                  class03925 class03925 = class07001x.W("biomes")
                     .map(var3x -> (class03925)codec.parse(class07713.N, var3x).promotePartial(var2xx -> N(class07321, b0, var2xx)).getOrThrow(class10740::new))
                     .orElseGet(var1::y);
                  class00554 = new class00554(class07348, class03925);
               } else {
                  class00554 = null;
               }

               class00536 class00536x = class07001x.z("BlockLight").map(class00536::new).orElse(null);
               class00536 class00536x = class07001x.z("SkyLight").map(class00536::new).orElse(null);
               arraylist.add(new class07359(b0, class00554, class00536x, class00536x));
            }
         }

         class07344 class07344x;
         class07344 class07344x = class07344x = new class07344(
            var1,
            class07321,
            var0.method_32891(),
            ix,
            j,
            class00549,
            class04333,
            class02999,
            class07371,
            along,
            enummap,
            class08094,
            ashortlist,
            flag,
            arraylist,
            list2,
            list3,
            class07001x
         );
         CallbackInfoReturnable callbackinforeturnable = new CallbackInfoReturnable("", false, class07344x);
         N(var0, var1, var2, callbackinforeturnable, localrefimpl);
         return class07344x;
      }
   }

   private static Map<class04748, class04932> N(class03298 var0, class07001 var1, long var2) {
      HashMap hashmap = Maps.newHashMap();
      class00751 class00751 = var0.y().L(class04227.yj);
      class07001 class07001 = var1.m("starts");

      for (String s : class07001.i()) {
         class01894 class01894 = class01894.L(s);
         class04748 class04748 = (class04748)class00751.N(class01894);
         if (class04748 == null) {
            Y.error("Unknown structure start: {}", class01894);
         } else {
            class04932 class04932 = class04932.N(var0, class07001.m(s), var2);
            if (class04932 != null) {
               hashmap.put(class04748, class04932);
            }
         }
      }

      return hashmap;
   }

   private static class07001 N(class03298 var0, class07321 var1, Map<class04748, class04932> var2, Map<class04748, LongSet> var3) {
      class07001 class07001xx = new class07001();
      class07001 class07001x = new class07001();
      class00751 class00751 = var0.y().L(class04227.yj);

      for (Entry entry : var2.entrySet()) {
         class01894 class01894x = class00751.y((class04748)entry.getKey());
         class07001x.N(class01894x.toString(), ((class04932)entry.getValue()).N(var0, var1));
      }

      class07001xx.N("starts", class07001x);
      class07001 class07001xx = new class07001();

      for (Entry entry1 : var3.entrySet()) {
         if (!((LongSet)entry1.getValue()).isEmpty()) {
            class01894 class01894 = class00751.y((class04748)entry1.getKey());
            class07001xx.N(class01894.toString(), ((LongSet)entry1.getValue()).toLongArray());
         }
      }

      class07001xx.N("References", class07001xx);
      return class07001xx;
   }

   @Nullable
   private static class00571 N(class04782 var0, List<class07001> var1, List<class07001> var2) {
      return var1.isEmpty() && var2.isEmpty() ? null : var3 -> {
         if (!var1.isEmpty()) {
            try (class04495 class04495 = new class04495(var3.Q(), Y)) {
               var0.method_31423(class07078.N(class08308.N(class04495, var0.method_30349(), var1), var0, class06113.field_52444));
            }
         }

         for (class07001 class07001 : var2) {
            boolean flag = class07001.y("keepPacked", false);
            if (flag) {
               var3.N(class07001);
            } else {
               class07209 class07209 = class00394.N(var3.R(), class07001);
               class00394 class00394 = class00394.N(class07209, var3.method_8320(class07209), class07001, var0.method_30349());
               if (class00394 != null) {
                  var3.N(class00394);
               }
            }
         }
      };
   }

   public static class00549 N(@Nullable class07001 var0) {
      return var0 != null ? var0.<class00549>N_15("Status", class00549.P).orElse(class00549.L) : class00549.L;
   }

   private static Map<class04748, LongSet> N(class01042 var0, class07321 var1, class07001 var2) {
      HashMap hashmap = Maps.newHashMap();
      class00751 class00751 = var0.L(class04227.yj);
      var2.m("References").N((BiConsumer<String, class07709>)((var3x, var4x) -> {
         class01894 class01894 = class01894.L(var3x);
         class04748 class04748 = (class04748)class00751.N(class01894);
         if (class04748 == null) {
            N(Y, "Found reference to unknown structure '{}' in chunk {}, discarding", class01894, var1);
         } else {
            Optional<long[]> optional = var4x.aj_();
            if (!optional.isEmpty()) {
               hashmap.put(class04748, new LongOpenHashSet(Arrays.stream(optional.get()).filter(var2xx -> {
                  class07321 class07321 = new class07321(var2xx);
                  if (class07321.N(var1) > 8) {
                     Y.warn("Found invalid structure reference [ {} @ {} ] for chunk {}.", new Object[]{class01894, class07321, var1});
                     return false;
                  } else {
                     return true;
                  }
               }).toArray()));
            }
         }
      }));
      return hashmap;
   }

   private static class07741 N(ShortList[] var0) {
      class07741 class07741x = new class07741();

      for (ShortList shortlist : var0) {
         class07741 class07741x = new class07741();
         if (shortlist != null) {
            for (int ix = 0; ix < shortlist.size(); ix++) {
               class07741x.add(class07730.N(shortlist.getShort(ix)));
            }
         }

         class07741x.add(class07741x);
      }

      return class07741x;
   }

   public class07001 N() {
      class07001 class07001xx = class07717.i(new class07001());
      class07001xx.N("xPos", this.chunkPos.B);
      class07001xx.N("yPos", this.minSectionY);
      class07001xx.N("zPos", this.chunkPos.Z);
      class07001xx.N("LastUpdate", this.lastUpdateTime);
      class07001xx.N("InhabitedTime", this.inhabitedTime);
      class07001xx.N_67("Status", class04206.W.y(this.chunkStatus).toString());
      class07001xx.y("blending_data", class04333.N, this.blendingData);
      class07001xx.y("below_zero_retrogen", class02999.N, this.belowZeroRetrogen);
      if (!this.upgradeData.N()) {
         class07001xx.N("UpgradeData", this.upgradeData.y());
      }

      class07741 class07741xx = new class07741();
      Codec<class07348<class00500>> codec = this.containerFactory.i();
      Codec<class03925<class03556<class00780>>> codec1 = this.containerFactory.B();

      for (class07359 class07359 : this.sectionData) {
         class07001 class07001x = new class07001();
         class00554 class00554 = class07359.y();
         if (class00554 != null) {
            class07001x.N("block_states", codec, class00554.B());
            class07001x.N("biomes", codec1, class00554.Z());
         }

         if (class07359.L() != null) {
            class07001x.N("BlockLight", class07359.L().N());
         }

         if (class07359.u() != null) {
            class07001x.N("SkyLight", class07359.u().N());
         }

         if (!class07001x.z()) {
            class07001x.N("Y", (byte)class07359.N());
            class07741xx.add(class07001x);
         }
      }

      class07001xx.N("sections", class07741xx);
      if (this.lightCorrect) {
         class07001xx.N("isLightOn", true);
      }

      class07741 class07741x = new class07741();
      class07741x.addAll(this.blockEntities);
      class07001xx.N("block_entities", class07741x);
      if (this.chunkStatus.u() == class00544.field_12808) {
         class07741 class07741xx = new class07741();
         class07741xx.addAll(this.entities);
         class07001xx.N("entities", class07741xx);
         if (this.carvingMask != null) {
            class07001xx.N("carving_mask", this.carvingMask);
         }
      }

      N(class07001xx, this.packedTicks);
      class07001xx.N("PostProcessing", N(this.postProcessingSections));
      class07001 class07001xx = new class07001();
      this.heightmaps.forEach((var1x, var2x) -> class07001.N(var1x.N(), new class07757(var2x)));
      class07001xx.N("Heightmaps", class07001xx);
      class07001xx.N("structures", this.structureData);
      this.N(new CallbackInfoReturnable("", false, class07001xx));
      return class07001xx;
   }

   private static void N(class07001 var0, class08094 var1) {
      var0.N("block_ticks", w, var1.N());
      var0.N("fluid_ticks", k, var1.y());
   }

   public class08094 W() {
      return this.packedTicks;
   }

   public long R() {
      return this.inhabitedTime;
   }
}
