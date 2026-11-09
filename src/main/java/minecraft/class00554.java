package minecraft;

import Nursultan.class09371;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import java.util.Objects;
import java.util.function.Predicate;
import net.caffeinemc.mods.lithium.common.block.BlockCountingSection;
import net.caffeinemc.mods.lithium.common.block.BlockListeningSection;
import net.caffeinemc.mods.lithium.common.block.BlockStateFlags;
import net.caffeinemc.mods.lithium.common.block.TrackedBlockStatePredicate;
import net.caffeinemc.mods.lithium.common.tracking.block.ChunkSectionChangeCallback;
import net.caffeinemc.mods.lithium.common.tracking.block.SectionedBlockChangeTracker;
import net.caffeinemc.mods.lithium.common.world.section.LithiumSectionData;
import net.caffeinemc.mods.lithium.common.world.section.RandomTickingSectionDataHelper;
import net.caffeinemc.mods.lithium.common.world.section.LithiumSectionData.SectionData;
import net.caffeinemc.mods.lithium.common.world.section.RandomTickingSectionDataHelper.LithiumBlockCounter;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class00554 implements BlockCountingSection, BlockListeningSection, LithiumSectionData {
   public static final int N = 16;
   public static final int y = 16;
   public static final int L = 4096;
   public static final int u = 2;
   private short i;
   private short R;
   private short M;
   private final class07348<class00500> B;
   private class03925<class03556<class00780>> Z;
   private SectionData z;

   public class03556<class00780> L(int var1, int var2, int var3) {
      return this.Z.N(var1, var2, var3);
   }

   public boolean L() {
      return this.i == 0;
   }

   public void L(class00667 var1) {
      var1.writeShort(this.i);
      this.B.y(var1);
      this.Z.y(var1);
   }

   public void M() {
      this.N(null);
      this.y(null);
      class09371 class09371 = new class09371(this);
      class07348 class07348 = this.B;
      class07350 class07350 = this.N(class09371);
      class07348<class00500> class07348x = class07348;
      this.N(class07348x, class07350, var0 -> {
         WrapOperationRuntime.checkArgumentCount(var0, 2, "[net.minecraft.class_2841, net.minecraft.class_2841$class_4464]");
         ((class07348)var0[0]).N((class07350)var0[1]);
         return (Void)null;
      });
      this.i = (short)class09371.N;
      this.R = (short)class09371.y;
      this.M = (short)class09371.L;
   }

   private class00554(class00554 var1) {
      super();
      this.i = var1.i;
      this.R = var1.R;
      this.M = var1.M;
      this.B = var1.B.sodium$copy();
      this.Z = var1.Z.sodium$copy();
   }

   public class00554(class07348<class00500> var1, class03925<class03556<class00780>> var2) {
      super();
      this.B = var1;
      this.Z = var2;
      this.M();
   }

   public class00554(class06614 var1) {
      super();
      this.B = var1.N();
      this.Z = var1.y();
      this.N(var1, null);
      this.y(var1, null);
   }

   public class07348<class00500> B() {
      return this.B;
   }

   public class03925<class03556<class00780>> Z() {
      return this.Z;
   }

   public boolean i() {
      return this.R > 0;
   }

   public class00554 U() {
      return new class00554(this);
   }

   public int z() {
      return 2 + this.B.y() + this.Z.y();
   }

   public boolean u() {
      return this.i() || this.R();
   }

   private void y(CallbackInfo var1) {
      this.lithium$getSectionData().setRandomTickableBlocksByY(new byte[RandomTickingSectionDataHelper.BYTE_COUNT]);
   }

   public void y(class00667 var1) {
      class07348<class03556<class00780>> class07348 = this.Z.i();
      class07348.N(var1);
      this.Z = class07348;
   }

   private void y(class06614 var1, CallbackInfo var2) {
      SectionData sectiondata = this.lithium$getSectionData();
      if (sectiondata.getRandomTickableBlocksByY() != null) {
         throw new IllegalStateException("RandomTickableBlocksByY already initialized!");
      } else {
         sectiondata.setRandomTickableBlocksByY(new byte[RandomTickingSectionDataHelper.BYTE_COUNT]);
         if (this.B.N(BlockStateFlags.RANDOM_TICKING)) {
            byte[] abyte = sectiondata.getRandomTickableBlocksByY();
            int ix = 0;

            for (short short1 = 4096; ix < abyte.length; ix++) {
               abyte[ix] = (byte)Math.min(248, short1);
               short1 -= abyte[ix];
            }
         }
      }
   }

   public class04688 y(int var1, int var2, int var3) {
      return this.B.N(var1, var2, var3).Y();
   }

   private void y(int var1, int var2, int var3, class00500 var4, boolean var5, CallbackInfoReturnable var6, class00500 var7) {
      int ix = var7.lithium$getAllFlags();
      int j = var4.lithium$getAllFlags();
      int k = 1 << BlockStateFlags.RANDOM_TICKING.getIndex();
      if ((ix & k) != (j & k)) {
         if ((ix & k) != 0) {
            RandomTickingSectionDataHelper.removeAt(var1, var2, var3, this.lithium$getSectionDataDirect().getRandomTickableBlocksByY());
         } else {
            RandomTickingSectionDataHelper.addAt(var1, var2, var3, this.lithium$getSectionDataDirect().getRandomTickableBlocksByY());
         }
      }
   }

   public void y() {
      this.B.M();
   }

   private void E() {
      SectionData sectiondata = this.lithium$getSectionData();
      sectiondata.setCountsByFlag(new short[BlockStateFlags.NUM_TRACKED_FLAGS]);
      int ix = BlockStateFlags.TRACKED_FLAGS.length;

      for (int j = 0; j < ix; j++) {
         TrackedBlockStatePredicate trackedblockstatepredicate = BlockStateFlags.TRACKED_FLAGS[j];
         if (this.B.N(trackedblockstatepredicate)) {
            sectiondata.getCountsByFlag()[trackedblockstatepredicate.getIndex()] = 4096;
         }
      }
   }

   private void N(int var1, int var2, int var3, class00500 var4, boolean var5, CallbackInfoReturnable var6, class00500 var7) {
      this.lithium$trackBlockStateChange(var4, var7);
      ChunkSectionChangeCallback chunksectionchangecallback = this.lithium$getSectionData().getChangeListener();
      if (chunksectionchangecallback != null) {
         chunksectionchangecallback.onBlockChange(this, var1, var2, var3, var7, var4);
      }
   }

   private void N(class00667 var1, CallbackInfo var2) {
      this.lithium$getSectionData().setCountsByFlag(null);
   }

   private void N(CallbackInfo var1) {
      this.lithium$getSectionData().setCountsByFlag(new short[BlockStateFlags.NUM_TRACKED_FLAGS]);
   }

   private class07350 N(class07350 var1) {
      short[] ashort = Objects.requireNonNull(this.lithium$getSectionData().getCountsByFlag());
      return (var2x, var3) -> {
         var1.accept(var2x, var3);
         N(ashort, var2x, (short)var3);
      };
   }

   private void N(class07348 var1, class07350 var2, Operation var3) {
      byte[] abyte = Objects.requireNonNull(this.lithium$getSectionData().getRandomTickableBlocksByY());
      LithiumBlockCounter lithiumblockcounter = new LithiumBlockCounter(abyte, var2);
      var3.call(new Object[]{var1, lithiumblockcounter});
      lithiumblockcounter.handleAfterCounting(this);
   }

   private static void N(short[] var0, class00500 var1, short var2) {
      int ix = var1.lithium$getAllFlags();

      int j;
      while ((j = Integer.numberOfTrailingZeros(ix)) < 32 && j < var0.length) {
         var0[j] += var2;
         ix &= ~(1 << j);
      }
   }

   public class00500 N(int var1, int var2, int var3, class00500 var4) {
      boolean flag = true;
      return this.N(this, var1, var2, var3, var4, flag);
   }

   public void N(class04330 var1, class03222 var2, int var3, int var4, int var5) {
      class07348<class03556<class00780>> class07348 = this.Z.i();
      byte b0 = 4;

      for (int ix = 0; ix < 4; ix++) {
         for (int j = 0; j < 4; j++) {
            for (int k = 0; k < 4; k++) {
               class07348.y(ix, j, k, var1.method_38109(var3 + ix, var4 + j, var5 + k, var2));
            }
         }
      }

      this.Z = class07348;
   }

   public void N(class00667 var1) {
      this.N(var1, null);
      this.i = var1.readShort();
      this.B.N(var1);
      class07348<class03556<class00780>> class07348 = this.Z.i();
      class07348.N(var1);
      this.Z = class07348;
   }

   public void N() {
      this.B.R();
   }

   public boolean N(Predicate<class00500> var1) {
      return this.B.N(var1);
   }

   private class00500 N(class00554 var1, int var2, int var3, int var4, class00500 var5, boolean var6) {
      return this.N(var2, var3, var4, var5, false);
   }

   private void N(class06614 var1, CallbackInfo var2) {
      SectionData sectiondata = this.lithium$getSectionData();
      if (sectiondata.getCountsByFlag() != null) {
         throw new IllegalStateException("CountsByFlag already initialized!");
      } else {
         sectiondata.setCountsByFlag(new short[BlockStateFlags.NUM_TRACKED_FLAGS]);
         int ix = BlockStateFlags.TRACKED_FLAGS.length;

         for (int j = 0; j < ix; j++) {
            TrackedBlockStatePredicate trackedblockstatepredicate = BlockStateFlags.TRACKED_FLAGS[j];
            if (this.B.N(trackedblockstatepredicate)) {
               sectiondata.getCountsByFlag()[trackedblockstatepredicate.getIndex()] = 4096;
            }
         }
      }
   }

   private boolean N(class00500 var1) {
      return var1.N(class00869.N) || var1.N(class00869.mr) || var1.N(class00869.mh);
   }

   public class00500 N(int var1, int var2, int var3) {
      return this.B.N(var1, var2, var3);
   }

   public class00500 N(int var1, int var2, int var3, class00500 var4, boolean var5) {
      class00500 class00500;
      if (var5) {
         class00500 = this.B.N(var1, var2, var3, var4);
      } else {
         class00500 = this.B.y(var1, var2, var3, var4);
      }

      this.N(var1, var2, var3, var4, var5, null, class00500);
      this.y(var1, var2, var3, var4, var5, null, class00500);
      class04688 class04688x = class00500.Y();
      class04688 class04688x = var4.Y();
      if (!this.N(class00500)) {
         this.i--;
         if (class00500.Q()) {
            this.R--;
         }
      }

      if (!class04688x.W()) {
         this.M--;
      }

      if (!this.N(var4)) {
         this.i++;
         if (var4.Q()) {
            this.R++;
         }
      }

      if (!class04688x.W()) {
         this.M++;
      }

      return class00500;
   }

   public void lithium$addToCallback(SectionedBlockChangeTracker var1, long var2, class07299 var4) {
      SectionData sectiondata = this.lithium$getSectionData();
      if (sectiondata.getChangeListener() == null) {
         if (var2 == Long.MIN_VALUE || var4 == null) {
            throw new IllegalArgumentException("Expected world and section pos during intialization!");
         }

         sectiondata.setChangeListener(ChunkSectionChangeCallback.create(var2, var4));
      }

      sectiondata.getChangeListener().addTracker(var1);
   }

   public void lithium$removeFromCallback(SectionedBlockChangeTracker var1) {
      ChunkSectionChangeCallback chunksectionchangecallback = this.lithium$getSectionData().getChangeListener();
      if (chunksectionchangecallback != null) {
         chunksectionchangecallback.removeTracker(var1);
      }
   }

   public boolean R() {
      return this.M > 0;
   }

   public boolean lithium$mayContainAny(TrackedBlockStatePredicate var1) {
      SectionData sectiondata = this.lithium$getSectionData();
      if (sectiondata.getCountsByFlag() == null) {
         this.E();
      }

      return sectiondata.getCountsByFlag()[var1.getIndex()] != 0;
   }

   public SectionData lithium$getSectionData() {
      if (this.z == null) {
         this.z = new SectionData(this);
      }

      return this.z;
   }

   public short lithium$getCount(int var1) {
      SectionData sectiondata = this.lithium$getSectionData();
      if (sectiondata.getCountsByFlag() == null) {
         this.E();
      }

      return sectiondata.getCountsByFlag()[var1];
   }

   public void lithium$trackBlockStateChange(class00500 var1, class00500 var2) {
      short[] ashort = this.lithium$getSectionData().getCountsByFlag();
      if (ashort != null) {
         int ix = var2.lithium$getAllFlags();
         int j = var1.lithium$getAllFlags();
         int k = ix ^ j;

         int l;
         while ((l = Integer.numberOfTrailingZeros(k)) < 32 && l < ashort.length) {
            int i1 = 1 << l;
            if ((k & i1) != 0) {
               ashort[l] += (short)(1 - ((ix >>> l & 1) << 1));
            }

            k &= ~i1;
         }
      }
   }

   public SectionData lithium$getSectionDataDirect() {
      if (this.z == null) {
         throw new NullPointerException("SectionData has not been created yet!");
      } else {
         return this.z;
      }
   }
}
