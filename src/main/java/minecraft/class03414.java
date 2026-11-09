package minecraft;

import com.mojang.authlib.minecraft.UserApiService;
import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.datafixers.util.Unit;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public interface class03414 {
   default AbuseReportLimits y() {
      return AbuseReportLimits.DEFAULTS;
   }

   static class03414 N(class03415 var0, UserApiService var1) {
      return new class03378(var0, var1);
   }

   boolean N();

   CompletableFuture<Unit> N(UUID var1, class03752 var2, AbuseReport var3);
}
