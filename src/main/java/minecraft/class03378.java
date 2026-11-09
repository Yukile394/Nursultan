package minecraft;

import Nursultan.class10197;
import com.mojang.authlib.exceptions.MinecraftClientException;
import com.mojang.authlib.exceptions.MinecraftClientHttpException;
import com.mojang.authlib.minecraft.UserApiService;
import com.mojang.authlib.minecraft.report.AbuseReport;
import com.mojang.authlib.minecraft.report.AbuseReportLimits;
import com.mojang.authlib.yggdrasil.request.AbuseReportRequest;
import com.mojang.datafixers.util.Unit;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public record class03378(class03415 environment, UserApiService userApiService) implements class03414 {
   private static final class00392 L = class00392.L("gui.abuseReport.send.service_unavailable");
   private static final class00392 u = class00392.L("gui.abuseReport.send.http_error");
   private static final class00392 i = class00392.L("gui.abuseReport.send.json_error");

   public class03415 L() {
      return this.environment;
   }

   public class03378(class03415 environment, UserApiService userApiService) {
      super();
      this.environment = environment;
      this.userApiService = userApiService;
   }

   public UserApiService u() {
      return this.userApiService;
   }

   @Override
   public AbuseReportLimits y() {
      return this.userApiService.getAbuseReportLimits();
   }

   private class00392 N(MinecraftClientHttpException var1) {
      return class00392.N("gui.abuseReport.send.error_message", var1.getMessage());
   }

   @Override
   public CompletableFuture<Unit> N(UUID var1, class03752 var2, AbuseReport var3) {
      return CompletableFuture.supplyAsync(
         () -> {
            AbuseReportRequest abusereportrequest = new AbuseReportRequest(
               1, var1, var3, this.environment.y(), this.environment.L(), this.environment.u(), var2.N()
            );

            try {
               this.userApiService.reportAbuse(abusereportrequest);
               return Unit.INSTANCE;
            } catch (MinecraftClientHttpException minecraftclienthttpexception) {
               class00392 class00392 = this.N(minecraftclienthttpexception);
               throw new CompletionException(new class10197(class00392, minecraftclienthttpexception));
            } catch (MinecraftClientException minecraftclientexception) {
               class00392 class00392x = this.N(minecraftclientexception);
               throw new CompletionException(new class10197(class00392x, minecraftclientexception));
            }
         },
         class07536.Z()
      );
   }

   private class00392 N(MinecraftClientException var1) {
      return switch (var1.getType()) {
         case SERVICE_UNAVAILABLE -> L;
         case HTTP_ERROR -> u;
         case JSON_ERROR -> i;
         default -> throw new MatchException(null, null);
      };
   }

   @Override
   public boolean N() {
      return this.userApiService.canSendReports();
   }
}
