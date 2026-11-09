package minecraft;

import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Stream;
import net.caffeinemc.mods.lithium.common.entity.PositionedEntityTrackingSection;
import net.caffeinemc.mods.lithium.common.entity.pushable.EntityPushablePredicate;
import net.caffeinemc.mods.lithium.common.entity.pushable.FeetBlockCachingEntity;
import net.caffeinemc.mods.lithium.common.entity.pushable.PushableEntityClassGroup;
import net.caffeinemc.mods.lithium.common.tracking.entity.EntityMovementTrackerSection;
import net.caffeinemc.mods.lithium.common.tracking.entity.MovementTrackerHelper;
import net.caffeinemc.mods.lithium.common.tracking.entity.SectionedEntityMovementTracker;
import net.caffeinemc.mods.lithium.common.util.collections.ReferenceMaskedList;
import net.caffeinemc.mods.lithium.common.world.ClimbingMobCachingSection;
import net.caffeinemc.mods.lithium.mixin.block.hopper.EntitySectionAccessor;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class01101<T extends class01135>
   implements PositionedEntityTrackingSection,
   EntityMovementTrackerSection,
   ClimbingMobCachingSection,
   EntitySectionAccessor,
   net.caffeinemc.mods.lithium.mixin.minimal_nonvanilla.spawning.EntitySectionAccessor,
   net.caffeinemc.mods.lithium.mixin.util.accessors.EntitySectionAccessor {
   private static final Logger N = LogUtils.getLogger();
   private final class01234<T> y;
   private class01102 L;
   private ReferenceMaskedList u;
   private final ReferenceOpenHashSet i = new ReferenceOpenHashSet(0);
   private final ArrayList[] R = new ArrayList[MovementTrackerHelper.NUM_MOVEMENT_NOTIFYING_CLASSES];
   private final long[] M = new long[MovementTrackerHelper.NUM_MOVEMENT_NOTIFYING_CLASSES];
   private long B;

   public class01102 L() {
      return this.L;
   }

   public class01101(Class<T> var1, class01102 var2) {
      super();
      this.L = var2;
      this.y = new class01234<>(var1);
   }

   private void i() {
      this.u = new ReferenceMaskedList();

      for (class01135 class01135 : this.y) {
         this.N((class07049)class01135);
      }
   }

   public int u() {
      return this.y.size();
   }

   public boolean y(T var1) {
      boolean flag = this.y.remove(var1);
      this.N(var1, null);
      return flag;
   }

   public class01102 y(class01102 var1) {
      if (this.L.y() != var1.y()) {
         if (!var1.y()) {
            if (!this.i.isEmpty()) {
               ObjectIterator objectiterator = this.i.iterator();

               while (objectiterator.hasNext()) {
                  SectionedEntityMovementTracker sectionedentitymovementtracker = (SectionedEntityMovementTracker)objectiterator.next();
                  sectionedentitymovementtracker.onSectionLeftRange(this);
               }
            }
         } else if (!this.i.isEmpty()) {
            ObjectIterator objectiterator1 = this.i.iterator();

            while (objectiterator1.hasNext()) {
               SectionedEntityMovementTracker sectionedentitymovementtracker1 = (SectionedEntityMovementTracker)objectiterator1.next();
               sectionedentitymovementtracker1.onSectionEnteredRange(this);
            }
         }
      }

      return var1;
   }

   public Stream<T> y() {
      return this.y.stream();
   }

   private void N(class07049 var1) {
      if (PushableEntityClassGroup.MAYBE_PUSHABLE.contains(var1)) {
         this.u.add(var1);
         if (PushableEntityClassGroup.CACHABLE_UNPUSHABILITY.contains(var1)) {
            FeetBlockCachingEntity feetblockcachingentity = var1;
            this.N(feetblockcachingentity, feetblockcachingentity.lithium$getCachedFeetBlockState());
            feetblockcachingentity.lithium$SetClimbingMobCachingSectionUpdateBehavior(true);
         }
      }
   }

   private void N(FeetBlockCachingEntity var1, class00500 var2) {
      boolean flag = N(var2);
      this.u.setVisible((class07049)var1, flag);
   }

   private void N(class01135 var1, CallbackInfo var2) {
      if (this.u != null) {
         if (!this.L.y()) {
            this.R();
         } else {
            this.N((class07049)var1);
            if (this.u.totalSize() > this.y.size()) {
               this.R();
            }
         }
      }
   }

   public boolean N(boolean var1) {
      return var1 && this.i.isEmpty();
   }

   private static boolean N(class00500 var0) {
      return var0 == null || !var0.N(class01210.yu);
   }

   private void N(class01135 var1, CallbackInfoReturnable var2) {
      if (this.u != null) {
         if (!this.L.y()) {
            this.R();
         } else {
            this.u.remove((class07049)var1);
         }
      }
   }

   private Iterator N(class01234 var1) {
      return var1.getAllInstances().iterator();
   }

   public class01102 N(class01102 var1) {
      var1 = this.y(var1);
      class01102 class01102 = this.L;
      this.L = var1;
      return class01102;
   }

   public <U extends T> class04218 N(class01128<T, U> var1, class00734 var2, class04197<? super U> var3) {
      Collection collection = this.y.N(var1.s());
      if (collection.isEmpty()) {
         return class04218.field_41283;
      } else {
         for (class01135 class01135x : collection) {
            class01135 class01135x = (class01135)var1.N(class01135x);
            if (class01135x != null && class01135x.method_5829().L(var2) && var3.accept(class01135x).N()) {
               return class04218.field_41284;
            }
         }

         return class04218.field_41283;
      }
   }

   public class04218 N(class00734 var1, class04197<T> var2) {
      class01234 class01234 = this.y;
      Iterator iterator = this.N(class01234);

      while (iterator.hasNext()) {
         class01135 class01135 = (class01135)iterator.next();
         if (class01135.method_5829().L(var1) && var2.accept(class01135).N()) {
            return class04218.field_41284;
         }
      }

      return class04218.field_41283;
   }

   public boolean N() {
      return this.N(this.y.isEmpty());
   }

   public void N(T var1) {
      this.y.add((T)var1);
      this.N(var1, null);
   }

   public long lithium$getPos() {
      return this.B;
   }

   public void lithium$removeListener(class01129 var1, SectionedEntityMovementTracker var2) {
      boolean flag = this.i.remove(var2);
      if (this.L.y() && flag) {
         var2.onSectionLeftRange(this);
      }

      if (this.N()) {
         var1.i(this.lithium$getPos());
      }
   }

   public void lithium$addListener(SectionedEntityMovementTracker var1) {
      this.i.add(var1);
      if (this.L.y()) {
         var1.onSectionEnteredRange(this);
      }
   }

   public long lithium$getChangeTime(int var1) {
      return this.M[var1];
   }

   private void R() {
      this.u = null;
   }

   public void lithium$setPos(long var1) {
      this.B = var1;
   }

   public class04218 lithium$collectPushableEntities(class07299 var1, class07049 var2, class00734 var3, EntityPushablePredicate var4, ArrayList var5) {
      Iterator iterator;
      if (this.u != null) {
         iterator = this.u.iterator();
      } else {
         iterator = this.y.iterator();
      }

      int ix = 0;
      int j = 0;

      while (iterator.hasNext()) {
         class07049 class07049 = (class07049)iterator.next();
         if (class07049.method_5829().L(var3) && !class07049.method_7325() && class07049 != var2 && !(class07049 instanceof class00690)) {
            ix++;
            if (var4.test(class07049)) {
               j++;
               var5.add(class07049);
            }
         }
      }

      if (this.u == null && ix >= 25 && ix >= j * 2) {
         this.i();
      }

      return class04218.field_41283;
   }

   public void lithium$removeListenToMovementOnce(SectionedEntityMovementTracker var1, int var2) {
      if (this.R[var2] != null) {
         this.R[var2].remove(var1);
      }
   }

   public void lithium$trackEntityMovement(int var1, long var2) {
      long[] along = this.M;
      int ix = along.length;
      int k = Integer.numberOfTrailingZeros(var1);

      while (k < ix) {
         along[k] = var2;
         ArrayList arraylist = this.R[k];
         if (arraylist != null) {
            for (int l = arraylist.size() - 1; l >= 0; l--) {
               ((SectionedEntityMovementTracker)arraylist.remove(l)).emitEntityMovement(var1, this);
            }
         }

         int j = -2 << k;
         k = Integer.numberOfTrailingZeros(var1 & j);
      }
   }

   public void lithium$listenToMovementOnce(SectionedEntityMovementTracker var1, int var2) {
      if (this.R[var2] == null) {
         this.R[var2] = new ArrayList();
      }

      this.R[var2].add(var1);
   }

   public void lithium$onEntityModifiedCachedBlock(FeetBlockCachingEntity var1, class00500 var2) {
      if (this.u == null) {
         var1.lithium$SetClimbingMobCachingSectionUpdateBehavior(false);
      } else {
         this.N(var1, var2);
      }
   }
}
