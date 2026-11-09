package minecraft;

import Nursultan.class10416;
import baritone.api.utils.accessor.ILootTable;
import com.google.common.collect.Lists;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.mojang.serialization.codecs.RecordCodecBuilder.Instance;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents.ModifyDrops;
import net.fabricmc.fabric.impl.loot.FabricLootTable;
import net.fabricmc.fabric.impl.loot.LootUtil;
import net.fabricmc.fabric.mixin.loot.LootTableAccessor;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05074 implements ILootTable, FabricLootTable, LootTableAccessor {
   private static final Logger B = LogUtils.getLogger();
   public static final Codec<class05946<class05074>> N = class05946.N(class04227.yJ);
   public static final class06929 y = class06925.b;
   public static final long L = 0L;
   public static final Codec<class05074> u = Codec.lazyInitialized(
      () -> RecordCodecBuilder.create(
         var0 -> var0.group(
               class06925.y.lenientOptionalFieldOf("type", y).forGetter(var0x -> var0x.Z),
               class01894.N.optionalFieldOf("random_sequence").forGetter(var0x -> var0x.z),
               class05441.N.listOf().optionalFieldOf("pools", List.of()).forGetter(var0x -> var0x.U),
               class07439.L.listOf().optionalFieldOf("functions", List.of()).forGetter(var0x -> var0x.E)
            )
            .apply(var0, class05074::new)
      )
   );
   public static final Codec<class03556<class05074>> i = class01281.N(class04227.yJ, u);
   public static final class05074 R = new class05074(class06925.L, Optional.empty(), List.of(), List.of());
   private final class06929 Z;
   private final Optional<class01894> z;
   private final List<class05441> U;
   private final List<class08122> E;
   private final BiFunction<class06584, class05908, class06584> W;
   @Nullable
   class03556 M = null;

   private void L(class05908 var1, Consumer var2) {
      class05925<class05074> class05925 = class05908.N(this);
      if (var1.y(class05925)) {
         Consumer<class06584> consumer = class08122.N(this.W, var2, var1);
         Iterator<class05441> iterator = this.U.iterator();

         while (iterator.hasNext()) {
            iterator.next().N(consumer, var1);
         }

         var1.L(class05925);
      } else {
         B.warn("Detected infinite loop in loot tables");
      }
   }

   class05074(class06929 var1, Optional<class01894> var2, List<class05441> var3, List<class08122> var4) {
      super();
      this.Z = var1;
      this.z = var2;
      this.U = var3;
      this.E = var4;
      this.W = class07439.N(var4);
   }

   public static class05062 y() {
      return new class05062();
   }

   public void y(class04162 var1, Consumer<class06584> var2) {
      this.N(var1, N(var1.N(), var2));
   }

   public void y(class05908 var1, Consumer<class06584> var2) {
      this.N(var1, N(var1.u(), var2));
   }

   public void N(class04162 var1, long var2, Consumer<class06584> var4) {
      this.N(new class05927(var1).N(var2).N(this.z), N(var1.N(), var4));
   }

   public static Consumer<class06584> N(class04782 var0, Consumer<class06584> var1) {
      return var2 -> {
         if (var2.N(var0.method_45162())) {
            if (var2.c() < var2.U()) {
               var1.accept(var2);
            } else {
               int ix = var2.c();

               while (ix > 0) {
                  class06584 class06584 = var2.L(Math.min(var2.U(), ix));
                  ix -= class06584.c();
                  var1.accept(class06584);
               }
            }
         }
      };
   }

   private void N(class05908 var1, Consumer var2, Operation var3) {
      if (this.M == null) {
         this.M = LootUtil.getEntryOrDirect(var1.u(), this);
      }

      ObjectArrayList objectarraylist = new ObjectArrayList();
      var3.call(new Object[]{var1, objectarraylist::add});
      ((ModifyDrops)LootTableEvents.MODIFY_DROPS.invoker()).modifyLootTableDrops(this.M, var1, objectarraylist);
      objectarraylist.forEach(var2);
   }

   public void N(class04162 var1, Consumer<class06584> var2) {
      this.N(new class05927(var1).N(this.z), var2);
   }

   public void N(class05908 var1, Consumer<class06584> var2) {
      this.N(var1, var2, var1x -> {
         WrapOperationRuntime.checkArgumentCount(var1x, 2, "[net.minecraft.class_47, java.util.function.Consumer]");
         this.L((class05908)var1x[0], (Consumer)var1x[1]);
         return (Void)null;
      });
   }

   public void N(class05561 var1) {
      for (int ix = 0; ix < this.U.size(); ix++) {
         this.U.get(ix).N(var1.N(new class10416("pools", ix)));
      }

      for (int j = 0; j < this.E.size(); j++) {
         this.E.get(j).N(var1.N(new class10416("functions", j)));
      }
   }

   public class06929 N() {
      return this.Z;
   }

   private ObjectArrayList<class06584> N(class05908 var1) {
      ObjectArrayList objectarraylist = new ObjectArrayList();
      this.y(var1, objectarraylist::add);
      return objectarraylist;
   }

   public ObjectArrayList<class06584> N(class04162 var1) {
      return this.N(new class05927(var1).N(this.z));
   }

   public ObjectArrayList<class06584> N(class04162 var1, long var2) {
      return this.N(new class05927(var1).N(var2).N(this.z));
   }

   public ObjectArrayList<class06584> N(class04162 var1, class06069 var2) {
      return this.N(new class05927(var1).N(var2).N(this.z));
   }

   private List<Integer> N(class06695 var1, class06069 var2) {
      ObjectArrayList objectarraylist = new ObjectArrayList();

      for (int ix = 0; ix < var1.method_5439(); ix++) {
         if (var1.method_5438(ix).R()) {
            objectarraylist.add(ix);
         }
      }

      class07536.L(objectarraylist, var2);
      return objectarraylist;
   }

   private void N(ObjectArrayList<class06584> var1, int var2, class06069 var3) {
      ArrayList arraylist = Lists.newArrayList();
      ObjectListIterator objectlistiterator = var1.iterator();

      while (objectlistiterator.hasNext()) {
         class06584 class06584xx = (class06584)objectlistiterator.next();
         if (class06584xx.R()) {
            objectlistiterator.remove();
         } else if (class06584xx.c() > 1) {
            arraylist.add(class06584xx);
            objectlistiterator.remove();
         }
      }

      while (var2 - var1.size() - arraylist.size() > 0 && !arraylist.isEmpty()) {
         class06584 class06584 = (class06584)arraylist.remove(class04995.N(var3, 0, arraylist.size() - 1));
         int ix = class04995.N(var3, 1, class06584.c() / 2);
         class06584 class06584x = class06584.N(ix);
         if (class06584.c() > 1 && var3.Z()) {
            arraylist.add(class06584);
         } else {
            var1.add(class06584);
         }

         if (class06584x.c() > 1 && var3.Z()) {
            arraylist.add(class06584x);
         } else {
            var1.add(class06584x);
         }
      }

      var1.addAll(arraylist);
      class07536.L(var1, var3);
   }

   public void N(class06695 var1, class04162 var2, long var3) {
      class05908 class05908 = new class05927(var2).N(var3).N(this.z);
      ObjectArrayList<class06584> objectarraylist = this.N(class05908);
      class06069 class06069 = class05908.y();
      List<Integer> list = this.N(var1, class06069);
      this.N(objectarraylist, list.size(), class06069);
      ObjectListIterator<class06584> objectlistiterator = objectarraylist.iterator();

      while (objectlistiterator.hasNext()) {
         class06584 class06584 = (class06584)objectlistiterator.next();
         if (list.isEmpty()) {
            B.warn("Tried to over-fill a container");
            return;
         }

         if (class06584.R()) {
            var1.method_5447(list.remove(list.size() - 1), class06584.E);
         } else {
            var1.method_5447(list.remove(list.size() - 1), class06584);
         }
      }
   }

   public void fabric$setRegistryEntry(class03556 var1) {
      this.M = var1;
   }
}
