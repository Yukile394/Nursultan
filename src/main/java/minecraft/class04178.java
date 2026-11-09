package minecraft;

import com.google.common.collect.Comparators;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongSet;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import net.fabricmc.fabric.impl.attachment.sync.AttachmentChange;
import org.slf4j.Logger;

public class class04178 {
   private static final Logger L = LogUtils.getLogger();
   public static final float N = 0.01F;
   public static final float y = 64.0F;
   private static final float u = 9.0F;
   private static final int i = 10;
   private final LongSet R = new LongOpenHashSet();
   private final boolean M;
   private float B = 9.0F;
   private float Z;
   private int z;
   private int U = 1;

   public class04178(boolean var1) {
      super();
      this.M = var1;
   }

   public void N(float var1) {
      this.z--;
      this.B = Double.isNaN(var1) ? 0.01F : class04995.N(var1, 0.01F, 64.0F);
      if (this.z == 0) {
         this.Z = 1.0F;
      }

      this.U = 10;
   }

   public boolean N(long var1) {
      return this.R.contains(var1);
   }

   private void N(class01615 var1, class04782 var2, class00570 var3, Operation var4, class04770 var5) {
      var4.call(new Object[]{var1, var2, var3});
      ArrayList arraylist = new ArrayList();
      var3.fabric_computeInitialSyncChanges(var5, arraylist::add);
      if (!arraylist.isEmpty()) {
         AttachmentChange.partitionAndSendPackets(arraylist, var5);
      }
   }

   public void N(class00570 var1) {
      this.R.add(var1.R().y());
   }

   public void N(class04770 var1, class07321 var2) {
      if (!this.R.remove(var2.y()) && var1.method_5805()) {
         var1.field_13987.method_14364(new class00481(var2));
      }
   }

   public void N(class04770 var1) {
      if (this.z < this.U) {
         float f = Math.max(1.0F, this.B);
         this.Z = Math.min(this.Z + this.B, f);
         if (!(this.Z < 1.0F)) {
            if (!this.R.isEmpty()) {
               class04782 class04782 = var1.method_51469();
               class06265 class06265 = class04782.method_14178().L;
               List<class00570> list = this.N(class06265, var1.method_31476());
               if (!list.isEmpty()) {
                  class01615 class01615 = var1.field_13987;
                  this.z++;
                  class01615.method_14364(class01632.N);

                  for (class00570 class00570 : list) {
                     this.N(class01615, class04782, class00570, var0 -> {
                        WrapOperationRuntime.checkArgumentCount(var0, 3, "[net.minecraft.class_3244, net.minecraft.class_3218, net.minecraft.class_2818]");
                        N((class01615)var0[0], (class04782)var0[1], (class00570)var0[2]);
                        return (Void)null;
                     }, var1);
                  }

                  class01615.method_14364(new class01658(list.size()));
                  this.Z = this.Z - list.size();
               }
            }
         }
      }
   }

   private static void N(class01615 var0, class04782 var1, class00570 var2) {
      var0.method_14364(new class00514(var2, var1.method_22336(), null, null));
      class07321 class07321 = var2.R();
      if (class07529.H) {
         L.debug("SEN {}", class07321);
      }

      var1.method_74535().N(var0.field_14140, var2.R());
   }

   private List<class00570> N(class06265 var1, class07321 var2) {
      int ix = class04995.y(this.Z);
      List list;
      if (!this.M && this.R.size() > ix) {
         list = this.R
            .stream()
            .collect(Comparators.least(ix, Comparator.comparingInt(var2::L)))
            .stream()
            .mapToLong(Long::longValue)
            .mapToObj(var1::R)
            .filter(Objects::nonNull)
            .toList();
      } else {
         list = this.R.longStream().mapToObj(var1::R).filter(Objects::nonNull).sorted(Comparator.comparingInt(var1x -> var2.y(var1x.R()))).toList();
      }

      for (class00570 class00570 : list) {
         this.R.remove(class00570.R().y());
      }

      return list;
   }
}
