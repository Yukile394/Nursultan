package minecraft;

import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntSet;
import java.time.Instant;
import java.util.UUID;

public class class03406 extends class02065 {
   final IntSet N = new IntOpenHashSet();

   class03406(UUID var1, Instant var2, UUID var3) {
      super(var1, var2, var3);
   }

   public void N(int var1, AbuseReportLimits var2) {
      if (this.N.contains(var1)) {
         this.N.remove(var1);
      } else if (this.N.size() < var2.maxReportedMessageCount()) {
         this.N.add(var1);
      }
   }

   @Override
   public class05096 N(class05096 var1, class03409 var2) {
      return new class03948(var1, var2, this);
   }

   public class03406 y() {
      class03406 class03406 = new class03406(this.y, this.L, this.u);
      class03406.N.addAll(this.N);
      class03406.i = this.i;
      class03406.R = this.R;
      class03406.M = this.M;
      return class03406;
   }
}
